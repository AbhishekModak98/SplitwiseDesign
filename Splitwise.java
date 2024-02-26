package SplitwiseDesign;

import SplitwiseDesign.Expense.ExpenseSplitType;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.Group.Group;
import SplitwiseDesign.Group.GroupController;
import SplitwiseDesign.User.User;
import SplitwiseDesign.User.UserController;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {
    UserController userController;
    GroupController groupController;
    BalanchSheetController balanchSheetController;

    Splitwise () {
        userController = new UserController();
        groupController = new GroupController();
        balanchSheetController = new BalanchSheetController();
    }

    public void demo () {
        setupUserAndGroup();

        // Step 1: add members to the group
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

        // Step 2: creeate an expense inside a group
        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"), 300);
        Split split2 = new Split(userController.getUser("U2001"), 300);
        Split split3 = new Split(userController.getUser("U3001"), 300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001", "Breakfast", 900, splits, ExpenseSplitType.EQUAL, userController.getUser("U1001"));

    }

    public void setupUserAndGroup () {
        // Onboard users to splitwise app
        addUsersToSplitwiseApp();

        // creating a group by user1
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001", "Outing with friends", user1);
    }

    private void addUsersToSplitwiseApp () {
        // adding User1
        User user1 = new User("U1001", "User1");

        // adding User2
        User user2 = new User("U2001", "User2");

        // adding User3
        User user3 = new User("U3001", "User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
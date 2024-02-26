package SplitwiseDesign.Expense;

import SplitwiseDesign.BalanchSheetController;
import SplitwiseDesign.Expense.Split.ExpenseSplit;
import SplitwiseDesign.Expense.Split.Split;
import SplitwiseDesign.User.User;

import java.util.List;

public class ExpenseController {
    BalanchSheetController balanchSheetController;
    public ExpenseController () {
        balanchSheetController = new BalanchSheetController();
    }

    public Expense createExpense (String expenseId, String description, double expenseAmount, List<Split> splitDetails, ExpenseSplitType splitType, User paidbyUser) {
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidbyUser, splitType, splitDetails);

        balanchSheetController.updateUserExpenseBalanceSheet(paidbyUser, splitDetails, expenseAmount);

        return expense;
    }
}

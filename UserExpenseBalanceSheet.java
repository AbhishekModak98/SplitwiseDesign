package SplitwiseDesign;

import java.util.Map;
import java.util.HashMap;

public class UserExpenseBalanceSheet {
    HashMap<String, Balance> userVsBalance;
    double totalYourExpense;
    double totalYouGetBack;
    double totalYouOwe;
    double totalPayment;

    public UserExpenseBalanceSheet () {
        userVsBalance = new HashMap<>();
        totalYourExpense = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserVsBalance () {
        return userVsBalance;
    }

    public double getTotalYourExpense () {
        return totalYourExpense;
    }

    public void setTotalYourExpense (double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalYouOwe () {
        return totalYouOwe;
    }

    public void setTotalYouOwe (double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack () {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack (double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }

    public double getTotalPayment () {
        return totalPayment;
    }

    public void setTotalPayment (double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
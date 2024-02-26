package SplitwiseDesign.Expense;

import SplitwiseDesign.Expense.Split.EqualExpenseSplit;
import SplitwiseDesign.Expense.Split.ExpenseSplit;
import SplitwiseDesign.Expense.Split.PercentageExpenseSplit;
import SplitwiseDesign.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject (ExpenseSplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}

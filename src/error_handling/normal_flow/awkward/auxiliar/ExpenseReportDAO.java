package error_handling.normal_flow.awkward.auxiliar;

public class ExpenseReportDAO {

    public MealExpenses getMeals (int employeeID) {
        //dummy condition
        if (employeeID < 0) {
            throw new MealExpensesNotFound();
        } else {
            return new MealExpenses();
        }
    }
}

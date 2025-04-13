package error_handling.normal_flow.special_case_pattern.auxiliar;

public class ExpenseReportDAO {

    public MealExpenses getMeals(int employeeID) {
        //dummy condition
        if (employeeID < 0) {
            return new PerDiemMealExpenses();
        } else {
            return new MealExpensesImpl();
        }
    }
}

package error_handling.normal_flow.awkward;

import error_handling.normal_flow.awkward.auxiliar.Employee;
import error_handling.normal_flow.awkward.auxiliar.ExpenseReportDAO;
import error_handling.normal_flow.awkward.auxiliar.MealExpenses;
import error_handling.normal_flow.awkward.auxiliar.MealExpensesNotFound;

public class ExpensesCalculator {
    private final ExpenseReportDAO expenseReportDAO = new ExpenseReportDAO();
    private final Employee employee = new Employee();
    private int m_total = 0;
    private final int mealPerDiem = 100;


    public void calculateExpenses() {
        try {
            MealExpenses expenses = expenseReportDAO.getMeals(employee.getEmployeeID());
            m_total += expenses.getTotal();
        } catch (MealExpensesNotFound e) {
            m_total += getMealPerDiem();
        }
    }

    public int getMealPerDiem() {
        return mealPerDiem;
    }
}

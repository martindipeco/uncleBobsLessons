package error_handling.normal_flow.special_case_pattern;

import error_handling.normal_flow.awkward.auxiliar.Employee;
import error_handling.normal_flow.special_case_pattern.auxiliar.ExpenseReportDAO;
import error_handling.normal_flow.special_case_pattern.auxiliar.MealExpenses;

public class ExpensesCalculator {
    private ExpenseReportDAO expenseReportDAO = new ExpenseReportDAO();
    private Employee employee = new Employee();
    private int m_total = 0;

    public void calculateExpenses() {
        MealExpenses expenses = expenseReportDAO.getMeals(employee.getEmployeeID());
        m_total += expenses.getTotal();
    }
}

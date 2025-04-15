package error_handling.dont_return_null.calculate_payment.null_check;


import error_handling.dont_return_null.calculate_payment.auxiliar.Employee;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentCalculator {
    private double totalPay = 0;

    public void calculatePayment() {
        List<Employee> employees = getEmployees();
        if (employees != null) {
            for (Employee emplo : employees) {
                totalPay += emplo.getPay();
            }
        }
    }


    private List<Employee> getEmployees() {
        //dummy condition
        if (LocalDate.now().getDayOfWeek() != DayOfWeek.SUNDAY) {
            return new ArrayList<Employee>();
        }
        return null;

    }
}

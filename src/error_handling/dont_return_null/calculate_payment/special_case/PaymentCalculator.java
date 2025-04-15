package error_handling.dont_return_null.calculate_payment.special_case;

import error_handling.dont_return_null.calculate_payment.auxiliar.Employee;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCalculator {
    private double totalPay = 0;

    public void calculatePay() {
        List<Employee> employees = getEmployees();
        for (Employee emplo : employees) {
            totalPay += emplo.getPay();
        }
    }

    private List<Employee> getEmployees() {
        //dummy condition
        if (LocalDate.now().getDayOfWeek() != DayOfWeek.SUNDAY) {
            return new ArrayList<Employee>();
        }
        return Collections.emptyList();
    }
}

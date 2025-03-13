package functions.switchcase.unclebob.bobsolution;

import functions.switchcase.unclebob.auxiliar.Money;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return new Money();
    }

    @Override
    public void deliverPay(Money pay) {

    }
}

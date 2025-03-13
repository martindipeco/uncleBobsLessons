package functions.switchcase.unclebob.bobsolution;

import functions.switchcase.unclebob.auxiliar.Money;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeRecord r) {
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

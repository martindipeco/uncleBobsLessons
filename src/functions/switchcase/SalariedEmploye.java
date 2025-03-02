package functions.switchcase;

import functions.switchcase.auxiliar.Money;

public class SalariedEmploye extends Employee {
    public SalariedEmploye(EmployeeRecord r) {
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

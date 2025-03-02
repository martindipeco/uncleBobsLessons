package functions.switchcase;

import functions.switchcase.auxiliar.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}

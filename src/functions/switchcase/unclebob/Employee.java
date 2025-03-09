package functions.switchcase.unclebob;

import functions.switchcase.unclebob.auxiliar.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}

package functions.switchcase;

import functions.switchcase.auxiliar.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

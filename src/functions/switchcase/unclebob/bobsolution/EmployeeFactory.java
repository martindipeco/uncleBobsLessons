package functions.switchcase.unclebob.bobsolution;

import functions.switchcase.unclebob.auxiliar.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

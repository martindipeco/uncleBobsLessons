package functions.switchcase.unclebob.mysolution;

import functions.switchcase.unclebob.auxiliar.EmployeeType;

public interface EmployeeFactory {
    Employee makeEmployee(EmployeeType employeeType) throws InvalidEmployeeTypeException;
}

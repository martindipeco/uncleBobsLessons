package functions.switchcase.unclebob.mysolution;

import functions.switchcase.unclebob.auxiliar.EmployeeType;

public class InvalidEmployeeTypeException extends Exception {
    public InvalidEmployeeTypeException(EmployeeType employeeType) {

        super("Invalid employee type: " + employeeType);
    }
}

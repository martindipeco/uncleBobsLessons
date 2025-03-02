package functions.switchcase;

import functions.switchcase.auxiliar.EmployeeType;

public class EmployeeRecord {
    // The type of employee (used in the factory switch statement)
    public final EmployeeType type;

    public EmployeeRecord(EmployeeType type) {
        this.type = type;
    }
}

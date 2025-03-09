package functions.switchcase.unclebob;

import functions.switchcase.unclebob.auxiliar.EmployeeType;

public class EmployeeRecord {
    // The type of employee (used in the factory switch statement)
    public final EmployeeType type;

    public EmployeeRecord(EmployeeType type) {
        this.type = type;
    }
}

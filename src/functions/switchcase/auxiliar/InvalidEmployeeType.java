package functions.switchcase.auxiliar;

public class InvalidEmployeeType extends Exception {
    public InvalidEmployeeType(EmployeeType type) {
        super("Invalid employee type: " + type +
                ". Valid types are: COMMISSIONED, HOURLY, SALARIED");
    }
}

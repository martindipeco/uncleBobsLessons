package functions.switchcase.unclebob.mysolution;

import functions.switchcase.unclebob.auxiliar.EmployeeType;

public class EmployeeFactoryImpl implements EmployeeFactory{
    @Override
    public Employee makeEmployee(EmployeeType employeeType) throws InvalidEmployeeTypeException {
        switch (employeeType){
            case COMMISSIONED:
                return new EmployeeCommissioned();
            case HOURLY:
                return new EmployeeHourly();
            case SALARIED:
                return new EmployeeSalaried();
            default:
                throw new InvalidEmployeeTypeException(employeeType);
        }
    }
}

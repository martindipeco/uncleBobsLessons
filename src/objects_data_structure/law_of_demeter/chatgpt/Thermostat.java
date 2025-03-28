package objects_data_structure.law_of_demeter.chatgpt;

public class Thermostat {

    private double temperature;
    private static final double COLD = 13;
    private FaultDetector faultDetector = new FaultDetector();

    //FIRST CASE: method start() calls a method from its own class
    public void start(){
        if (isCold()) {
            turnOnHeater();
        }
    }

    //SECOND CASE: call to a method of an object created by the isCold() method
    public boolean isCold() {
        RoomTemperatureSensor roomTemperatureSensor = new RoomTemperatureSensor();
        return roomTemperatureSensor.readTemperature() <= COLD;
    }

    //THIRD CASE: call to a method of an object passed as argument
    public void protectFromMelting(WaterTemperature waterTemperature) {
        if(waterTemperature.readTemperature() > 95){
            turnOffHeater();
        }
    }

    //FOURTH CASE: call to a method of an object held in an instance variable of the class
    public void checkEquipment() {
        if (faultDetector.checkFaults() > 0) {
            warnForMaintenance();
        }
    }

    public void turnOnHeater() {
        System.out.println("Turning on heater");
    }

    public void turnOffHeater() {
        System.out.println("Turning off heater");
    }

    public void warnForMaintenance() {
        System.out.println("Your equipment needs maintenance. Call a technician");
    }
}

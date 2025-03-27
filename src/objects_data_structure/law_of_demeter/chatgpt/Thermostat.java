package objects_data_structure.law_of_demeter.chatgpt;

public class Thermostat {

    private double temperature;
    private static final double COLD = 13;


    public void start(){
        if (isCold()) {
            turnOnHeater(); //FIRST CASE: method start() calls a method from its own class
        }
    }

    public boolean isCold() {
        Sensor sensor = new Sensor();
        return sensor.readTemperature() <= COLD; //SECOND CASE: call to a method of an object created by the method
    }

    public void turnOnHeater() {
        System.out.println("Turning on heater");
    }
}

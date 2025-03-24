package objects_data_structure.data_abstraction.claudefactory;

public class TemperatureImpl implements AbstractTemperatureFactory{
    private final double celsius; //could be either farenheit or kelvin

    TemperatureImpl(double temperature) {
        if (temperature < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15°C)");
        }
        this.celsius = temperature;
    }

    @Override
    public double getKelvin() {
        return celsius + 273.15;
    }

    @Override
    public double getCelsius() {
        return celsius;
    }

    @Override
    public double getFarenheit() {
        return (celsius * 9/5) + 32;
    }
}

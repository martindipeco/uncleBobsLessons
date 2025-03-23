package objects_data_structure.data_abstraction.claudefactory;

public interface AbstractTemperatureFactory {
    double getKelvin();
    double getCelsius();
    double getFarenheit();

    static AbstractTemperatureFactory fromKelvin(double kelvin) {
        return new TemperatureImpl(kelvin);
    }

    static AbstractTemperatureFactory fromCelsius(double celsius) {
        return new TemperatureImpl(celsius);
    }

    static AbstractTemperatureFactory fromFarenheit(double farenheit) {
        return new TemperatureImpl(farenheit);
    }
}

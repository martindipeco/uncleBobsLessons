package objects_data_structure.data_abstraction.claude;

public class CelsiusTemperature implements AbstractTemperature{
    private double celsius;

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
        return (celsius*9/5) + 32;
    }

    @Override
    public void setKelvin(double kelvin) {
        this.celsius = kelvin - 273.15;
    }

    @Override
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public void setFarenheit(double farenheit) {
        this.celsius = (farenheit - 32)*5/9;
    }
}

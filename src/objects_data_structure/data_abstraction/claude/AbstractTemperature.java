package objects_data_structure.data_abstraction.claude;

public interface AbstractTemperature {
    double getKelvin();
    double getCelsius();
    double getFarenheit();
    void setKelvin(double kelvin);
    void setCelsius(double celsius);
    void setFarenheit(double farenheit);
}

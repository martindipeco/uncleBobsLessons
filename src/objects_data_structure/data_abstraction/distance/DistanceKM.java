package objects_data_structure.data_abstraction.distance;

public class DistanceKM implements AbstractDistance{
    private double km;

    public DistanceKM(double distance) {
        this.km = distance;
    }

    @Override
    public double getKM() {
        return km;
    }

    @Override
    public double getMiles() {
        return km*0.621371;
    }
}

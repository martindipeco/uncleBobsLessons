package objects_data_structure.data_abstraction.distance;

public class DistanceMiles implements AbstractDistance {
    private double miles;

    public DistanceMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getKM() {
        return miles*1.60934;
    }

    @Override
    public double getMiles() {
        return miles;
    }
}

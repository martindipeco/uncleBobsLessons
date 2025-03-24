package objects_data_structure.data_abstraction.distance;

//package private. Can only be instantiated via DistanceFactory
class DistanceMiles implements AbstractDistance {
    private double miles;

    DistanceMiles(double miles) {
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

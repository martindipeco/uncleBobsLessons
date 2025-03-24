package objects_data_structure.data_abstraction.distance;

//package private. Can only be instantiated via DistanceFactory
class DistanceKM implements AbstractDistance{
    private double km;

    DistanceKM(double distance) {
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

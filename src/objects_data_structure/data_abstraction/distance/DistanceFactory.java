package objects_data_structure.data_abstraction.distance;

public class DistanceFactory {
    public static AbstractDistance fromKM(double km) {
        return new DistanceKM(km);
    }

    public static AbstractDistance fromMiles(double miles) {
        return new DistanceMiles(miles);
    }
}

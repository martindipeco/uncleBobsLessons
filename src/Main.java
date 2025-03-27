import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;
import functions.switchcase.claude.mysolution.InvalidTypeNotificationExeption;
import objects_data_structure.data_abstraction.distance.AbstractDistance;
import objects_data_structure.data_abstraction.distance.DistanceFactory;
import objects_data_structure.law_of_demeter.own_example.Demeter;

public class Main {
    public static void main(String[] args) throws InvalidNotificationTypeException, InvalidTypeNotificationExeption {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");

        AbstractDistance distanceKM = DistanceFactory.fromKM(23);

        Demeter demeter = new Demeter();
        demeter.doYourThing();
    }
}
import functions.switchcase.chatgpt.Product;
import functions.switchcase.chatgpt.ProductCategory;
import functions.switchcase.chatgpt.SwitchDiscountCalculator;
import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;
import functions.switchcase.claude.auxiliar.Message;
import functions.switchcase.claude.claudesolution.NotificationFactory;
import functions.switchcase.claude.claudesolution.NotificationType;
import functions.switchcase.claude.mysolution.InvalidTypeNotificationExeption;
import functions.switchcase.claude.mysolution.NotificationFactoryImpl;
import functions.switchcase.claude.original.NotificationService;
import objects_data_structure.data_abstraction.distance.AbstractDistance;
import objects_data_structure.data_abstraction.distance.DistanceFactory;
import objects_data_structure.data_abstraction.distance.DistanceKM;

public class Main {
    public static void main(String[] args) throws InvalidNotificationTypeException, InvalidTypeNotificationExeption {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");

        AbstractDistance distanceKM = DistanceFactory.fromKM(23);

    }
}
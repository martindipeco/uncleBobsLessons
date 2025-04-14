package error_handling.dont_return_null.invite_error.auxiliar;

public class ItemRegistry {
    public Item getItem(int itemID) {
        //dummy return
        return new Item();
    }
}

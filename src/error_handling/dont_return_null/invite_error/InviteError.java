package error_handling.dont_return_null.invite_error;

import error_handling.dont_return_null.invite_error.auxiliar.Item;
import error_handling.dont_return_null.invite_error.auxiliar.ItemRegistry;
import error_handling.dont_return_null.invite_error.auxiliar.PersistentStore;

public class InviteError {
    private PersistentStore persistentStore;

    public void registerItem(Item item) {
        if (item != null) {
            ItemRegistry registry = persistentStore.getItemRegistry(); //MISSING NULL CHECK
            if (registry != null) {
                Item existing = registry.getItem(item.getID());
                if (existing.getBillingPeriod().hasRetailOwner()) {
                    existing.register(item);
                }
            }
        }
    }
}

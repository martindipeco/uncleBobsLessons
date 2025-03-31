package objects_data_structure.data_abstraction.simple_example;

import java.util.ArrayList;
import java.util.List;

public class Invitation {
    private final List<Guest> guestList = new ArrayList<>();

    public void invite(Guest guest) {
        guestList.add(guest);
    }
}

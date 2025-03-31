package objects_data_structure.data_abstraction.simple_example;

public class Guest {
    private final String name;

    public Guest() {
        this.name = "Default";
    }

    public Guest(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

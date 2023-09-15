package pets;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        // Default speak method for generic pets
        System.out.println(name + " makes a sound.");
    }
}


package pets;

public class Wolf extends Pet {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Howl!");
    }
}

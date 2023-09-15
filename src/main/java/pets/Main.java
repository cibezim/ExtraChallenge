package pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have? ");
        int numPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<Pet> pets = new ArrayList<>();

        for (int i = 0; i < numPets; i++) {
            System.out.println("\nEnter details for pet #" + (i + 1));
            System.out.print("Kind of pet (Dog, Cat, Wolf): ");
            String kind = scanner.nextLine();

            System.out.print("Name of pet: ");
            String name = scanner.nextLine();

            switch (kind.toLowerCase()) {
                case "dog":
                    pets.add(new Dog(name));
                    break;
                case "cat":
                    pets.add(new Cat(name));
                    break;
                case "wolf":
                    pets.add(new Wolf(name));
                    break;
                default:
                    System.out.println("Sorry, we don't support that kind of pet.");
            }
        }

        System.out.println("\nList of your pets and what they say:");
        for (Pet pet : pets) {
            System.out.println("Name: " + pet.getName());
            pet.speak();
        }

        scanner.close();
    }
}

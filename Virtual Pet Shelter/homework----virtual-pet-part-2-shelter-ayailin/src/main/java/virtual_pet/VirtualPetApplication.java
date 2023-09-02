package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter pets = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("Athena", "Loves to play, scared of loud noises.", 40, 50, 70);
        VirtualPet pet2 = new VirtualPet("Loki", "Looks tough, but super sweet and scared of everything...", 50, 40,
                50);
        VirtualPet pet3 = new VirtualPet("Yuki", "Only cares about her next meal....", 60, 60, 60);
        VirtualPet pet4 = new VirtualPet("Chocolate", "Dog of the Aztecs. Protective, yet gentle.", 80, 80, 70);

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);

        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {

            System.out.println("Thank you for visiting your local shelter that houses all kinds of animals.\n");

            System.out.println("This is the status of the Shelter Pet's: \n");

            System.out.println("Name\t|Hunger\t|Thirst\t|Attention");
            System.out.println("--------|-------|-------|-------");
            System.out.println();
            System.out.println(pets.petStatus());
            System.out.println("\nWhat would you like to do next?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet.");
            System.out.println("5. Quit");

            String optionEntered = input.nextLine();
            // OPTION 1 comida
            if (optionEntered.equals("1")) {
                pets.feedAll();
                System.out.println("You fed all the pets in the Shelter food.\n");

            }
            // OPTION 2, agua
            else if (optionEntered.equals("2")) {
                pets.waterAll();
                System.out.println("You gave all the pets in the Shelter water.\n");

            }
            // OPTION 3, jugar
            else if (optionEntered.equals("3")) {
                System.out.println("Choose the pet you would like to play with:");
                System.out.println("Which pet would you like to play with today?");
                System.out.println(pets.option4Display());
                String petName = input.nextLine();

                pets.play(petName);
                System.out.println("You took " + petName + " for a walk, or to play.\n");

            }
            // OPTION 4, adoptar a alguna de las mascotas
            else if (optionEntered.equals("4")) {
                System.out.println("You've chosen to adopt a pet.");
                System.out.println("Which pet would you like to adopt?\n");
                System.out.println(pets.option4Display());
                String petName = input.nextLine();

                if (!pets.doesPetRemain(petName)) {
                    System.out.println("This pet does not exist.");
                } else {
                    pets.adopt(petName);
                    System.out.println("Congrats on adopting your new pet \n" + petName + "!");
                }

            }
            // OPTION 5, dejar la consola
            else if (optionEntered.equals("5")) {
                System.out.println("Are you sure you wish to quit the game?");
                System.out.println("Enter Yes or No");
                decision = input.nextLine();

                if (decision.equalsIgnoreCase("Yes")) {
                    System.out.println("You have quit the game... see you next time!");

                } else {
                    decision.equalsIgnoreCase("No");
                    System.out.println("Glad you are still with us.");
                    System.out.println("The pets will be pleased that you stayed for a while longer.\n");
                }

            }
            pets.tickAll();
        }
        // end while loop

        input.close();
    }

}

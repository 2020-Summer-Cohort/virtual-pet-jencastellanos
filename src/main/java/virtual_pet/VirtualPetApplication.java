package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userChoice;

        VirtualPet myPet = new VirtualPet("Blue Bear", 25, 20, 20, 25,
                15, 10, 1);

        System.out.println("What do you want to do with " + myPet.getName() + "?");
        System.out.println("1. Feed " + myPet.getName());
        System.out.println("2. Give " + myPet.getName() + " something to drink?");
        System.out.println("3. Let " + myPet.getName() + " get some beauty sleep?");
        System.out.println("4. Let " + myPet.getName() + " use the bathroom?");
        System.out.println("5. Play with " + myPet.getName() + " ?");
        System.out.println("6. " + myPet.getName() + " needs to go to the vet?");
        System.out.println("7. Let " + myPet.getName() + " be?");
        userChoice = input.nextLine();

        while (!userChoice.equals("7")) {

            if (userChoice.equals("1")) {
                System.out.println("Let's feed " + myPet.getName());
                myPet.feed();
                System.out.println(myPet.getName() + "'s hunger level is now at " + myPet.getHungerLevel());
            } else if
            (userChoice.equals("2")) {
                System.out.println("Let's give " + myPet.getName() + " something to drink");
                myPet.drink();
                System.out.println(myPet.getName() + "'s thirst level is now at " + myPet.getThirstLevel());
            } else if (userChoice.equals("3")) {
                System.out.println("Let's get " + myPet.getName() + "to bed");
                myPet.sleeping();
                System.out.println(myPet.getName() + "'s sleep level is now at " + myPet.getSleepLevel());
            } else if (userChoice.equals("4")) {
                System.out.println("Uh oh! " + myPet.getName() + " needs to go potty");
                myPet.bathroomBreak();
                System.out.println(myPet.getName() + "'s waste level is now at " + myPet.getWasteLevel());
            } else if (userChoice.equals("5")) {
                System.out.println("Grab " + myPet.getName() + "'s favorite toy");
                myPet.play();
                System.out.println(myPet.getName() + "'s bored level is now at " + myPet.getBoredLevel());
            } else if (userChoice.equals("6")) {
                System.out.println("Oh no!!!! " + myPet.getName() + "'s not feeling too good, let's take him to the Vet!");
                myPet.goToVet();
                System.out.println(myPet.getName() + "'s feeling much better");
            } else {
                System.out.println("hmmm... that's not part of our selection. try again");
            }
            System.out.println("What do you want to do with " + myPet.getName() + "?");
            System.out.println("1. Feed " + myPet.getName());
            System.out.println("2. Give " + myPet.getName() + " something to drink?");
            System.out.println("3. Let " + myPet.getName() + " get some beauty sleep?");
            System.out.println("4. Let " + myPet.getName() + " use the bathroom?");
            System.out.println("5. Play with " + myPet.getName() + " ?");
            System.out.println("6. " + myPet.getName() + " needs to go to the vet?");
            System.out.println("7. Let " + myPet.getName() + " be?");
            userChoice = input.nextLine();
        }
        System.out.println(myPet.getName() + " says Goodbye and hope to see you soon");
    }
}

//todo
//build public void tick() that impacts pet properties in an opposite way
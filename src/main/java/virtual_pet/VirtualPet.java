package virtual_pet;

public class VirtualPet {


    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int sleepLevel;
    private int wasteLevel;
    private int boredLevel;
    private int sickLevel;
    private int bye;

    //getter methods retrieve data on our pet properties
    public String getName() {

        return name;
    }

    public int getHungerLevel() {

        return hungerLevel;
    }

    public int getThirstLevel() {

        return thirstLevel;
    }

    public int getSleepLevel() {

        return sleepLevel;
    }

    public int getWasteLevel() {

        return wasteLevel;

    }

    public int getBoredLevel() {

        return boredLevel;

    }

    public int getSickLevel() {

        return sickLevel;
    }

    //constructor: builds the object
    public VirtualPet(String name, int hungerLevel, int thirstLevel, int sleepLevel, int wasteLevel, int boredLevel, int sickLevel, int goodbye) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sleepLevel = sleepLevel;
        this.wasteLevel = wasteLevel;
        this.boredLevel = boredLevel;
        this.sickLevel = sickLevel;
    }

    public void feed() {

        hungerLevel -= 5;
    }

    public void drink() {

        thirstLevel -= 4;
    }

    public void sleeping() {

        sleepLevel -= 2;
    }

    public void bathroomBreak() {

        wasteLevel -= 5;
    }

    public void play() {

        boredLevel -= 5;
    }

    public void goToVet() {

        sickLevel -= 10;
    }

    public void bye() {
        bye -= 0;

    }

}

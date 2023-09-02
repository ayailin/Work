package virtual_pet;

public class VirtualPet {
    private String petName;
    private String description;
    private int water;
    private int hunger;
    private int attention;

    public VirtualPet(String name, String description) {
        this(name, description, 40, 60, 50);
    }

    public VirtualPet(String name, String description, int hunger, int water, int attention) {
        this.petName = name;
        this.description = description;
        this.hunger = hunger;
        this.water = water;
        this.attention = attention;
    }

    public String getName() {
        return petName;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getWater() {
        return water;
    }

    public int getAttention() {
        return attention;
    }

    public void feedPet() {
        this.hunger += 2;
        this.water -= 2;
    }

    public void waterPet() {
        this.water += 3;
    }

    public void playPet() {
        this.attention += 4;
    }

    public void tick() {
        this.hunger--;
        this.water--;
        this.attention--;
    }

}
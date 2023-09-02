package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
    public Map<String, VirtualPet> pets = new HashMap<>();

    // Return Collection of Pets within Shelter

    public Collection<VirtualPet> pets() {
        return pets.values();

    }

    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    // Return specific Virtual Pet given its name

    public void intake(VirtualPet virtualPet) {
        String newName = virtualPet.getName();
        pets.put(newName, virtualPet);
    }

    // feeding
    public void feedAll() {
        for (VirtualPet pet : pets.values()) {
            pet.feedPet();
        }
    }

    // water
    public void waterAll() {
        for (VirtualPet pet : pets.values()) {
            pet.waterPet();
        }
    }

    public void play(String petName) {
        pets.get(petName).playPet();

    }

    public void tickAll() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }

    }

    public boolean adopt(String petName) {
        pets.remove(petName);
        return false;
    }

    public boolean doesPetRemain(String petName) {
        return pets.containsKey(petName);
    }

    public String petStatus() {
        String petStatus = "";
        for (Entry<String, VirtualPet> eachPet : pets.entrySet()) {
            petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getHunger() + "\t   "
                    + eachPet.getValue().getWater() + "\t   " + eachPet.getValue().getAttention() + "\n";
        }
        return petStatus;
    }

    public String option4Display() {
        String option4Display = "";
        for (Entry<String, VirtualPet> eachPet : pets.entrySet()) {
            option4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
                    + "\n";
        }
        return option4Display;
    }

}

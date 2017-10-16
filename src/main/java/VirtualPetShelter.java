import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> shelteredPetsValues() {
		Collection<VirtualPet> shelteredPetsValue = shelteredPets.values();
		return shelteredPetsValue;
	}

	public VirtualPet accessShelteredPet(VirtualPet name) {
		return name;
	}

	public void addPet(VirtualPet shelteredPet) {
		shelteredPets.put(shelteredPet.getName(), shelteredPet);
	}

	public void removePet(String name) {
		shelteredPets.remove(name);
	}

	public void feedPets() {
		for (VirtualPet pet : shelteredPets.values()) {
			pet.feeding();
		}
	}

	public void waterPets() {
		for (VirtualPet pets : shelteredPets.values()) {
			pets.drinking();
		}
	}

	public void playWithPet(String name) {
		VirtualPet pets = shelteredPets.get(name);
		pets.playing();
	}

	public void petUpdate() {
		for (VirtualPet pet : shelteredPets.values()) {
		pet.getTick();
		}

	}

}

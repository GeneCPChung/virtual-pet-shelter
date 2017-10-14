import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelteredPets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> shelteredPetsValues() {
		Collection<VirtualPet> petRoster = shelteredPets.values();
		return petRoster;
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
			pets.feeding();
		}
	}

	public void playWithPet(String name) {
		for (VirtualPet pets : shelteredPets.values()) {
			if (shelteredPets.containsKey(name)) {
				pets.playing();
			}
		}
	}

}

import java.util.Map.Entry;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		VirtualPetShelter petFace = new VirtualPetShelter();
		VirtualPet petBrain = new VirtualPet(null, null, 0, 0, 0, 0, 0);
		petBrain.addAttributes();
		VirtualPet curly = new VirtualPet("Curley ", "The Cat");
		VirtualPet larry = new VirtualPet("Larry ", "The Lamma");
		VirtualPet moe = new VirtualPet("Moe ", "The Mole");
		VirtualPet shemp = new VirtualPet("Shemp ", "The Sheep");
		
		petFace.addPet(curly);
		petFace.addPet(larry);
		petFace.addPet(moe);
		petFace.addPet(shemp);
		System.out.println("Welcome, here are the animals at our shelter:");
		for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}

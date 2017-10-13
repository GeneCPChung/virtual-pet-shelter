import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userOpt;
		VirtualPetShelter petFace = new VirtualPetShelter();
		VirtualPet petBrain = new VirtualPet(null, null, 0, 0, 0, 0, 0);
		petBrain.addAttributes();
		VirtualPet curly = new VirtualPet("Curley ", "The Cat", 45, 55, 65, 75, 86);
		VirtualPet larry = new VirtualPet("Larry ", "The Lamma", 78, 34, 78, 54, 83);
		VirtualPet moe = new VirtualPet("Moe ", "The Mole", 87, 34, 65, 64, 22);
		VirtualPet shemp = new VirtualPet("Shemp ", "The Sheep", 23, 45, 78, 25, 9);
		
		petFace.addPet(curly);
		petFace.addPet(larry);
		petFace.addPet(moe);
		petFace.addPet(shemp);
		
		
		System.out.println("Welcome, here are the animals at our shelter:");
		for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
		System.out.println(entry.getValue());
		}
		menuOptions();
		userOpt = input.nextLine();
		
		do {
			if (userOpt.equals("1")) {
				petFace.feedPets();
				System.out.println("You fed all of your pets");
				menuOptions();
				userOpt = input.nextLine();
			}
		}while (!userOpt.equals("6"));
		
	}
	public static void menuOptions() {
		System.out.println("\nWhat would you like to do next?");
		System.out.println("\n1 Feed all of your pets");
		System.out.println("2 Give all of your pets some water");
		System.out.println("3 Play with one of your pets");
		System.out.println("4 Adopt a pet");
		System.out.println("5 Admit a pet");
		System.out.println("6 Quit");
	}
}

import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petFace = new VirtualPetShelter();
		VirtualPet petBrain = new VirtualPet(null, null, 0, 0, 0, 0, 0);
		VirtualPet curly = new VirtualPet("Curly ", "The Cat");
		VirtualPet larry = new VirtualPet("Larry ", "The Lamma");
		VirtualPet moe = new VirtualPet("Moe ", "The Mole");
		VirtualPet shemp = new VirtualPet("Shemp ", "The Sheep");

		petFace.addPet(curly);
		petFace.addPet(larry);
		petFace.addPet(moe);
		petFace.addPet(shemp);

		System.out.println("Welcome to our animal shelter! Here is a list of the animals staying with us: \n");
		for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
			System.out.println(entry.getValue());
		}
		menuOptions();
		String userOpt;
		userOpt = input.nextLine();

		do {
			if (userOpt.equals("1")) {
				petFace.feedPets();
				System.out.println("You fed all of your pets");
				menuOptions();
				userOpt = input.nextLine();
			}
			if (userOpt.equals("2")) {
				petFace.waterPets();
				System.out.println("You watered all of your pets");
				menuOptions();
				userOpt = input.nextLine();
			}
			if (userOpt.equals("3")) {
				System.out.println("Awesome! You want to play with one of the pets! Please choose one to play with: ");
							
				userOpt = input.nextLine().toLowerCase();
				petFace.playWithPet(userOpt);
				System.out.println("You played with " + userOpt);
				menuOptions();
				userOpt = input.nextLine();
			}
			if (userOpt.equals("3")) {
				System.out.println("Thank you so much for adopting a pet!\nWhich pet would you like to adopt?");
			}

		} while (!userOpt.equals("6"));

	}

	public static void menuOptions() {
		System.out.println("\nWhat would you like to help with?");
		System.out.println("\n1 Feed all of the pets");
		System.out.println("2 Give all of the pets some water");
		System.out.println("3 Play with one of the pets");
		System.out.println("4 Adopt a pet");
		System.out.println("5 Admit a pet");
		System.out.println("6 Quit");
	}
}

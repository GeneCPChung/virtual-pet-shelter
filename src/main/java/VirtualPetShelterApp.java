import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petFace = new VirtualPetShelter();
		VirtualPet petStats = new VirtualPet(null, null);
		VirtualPet curly = new VirtualPet("shemp", " The Sheep");
		VirtualPet larry = new VirtualPet("larry", " The Lamma");
		VirtualPet moe = new VirtualPet("moe", " The Mole");
		VirtualPet shemp = new VirtualPet("curly", " The Cat");

		petFace.addPet(curly);
		petFace.addPet(larry);
		petFace.addPet(moe);
		petFace.addPet(shemp);

		System.out.println("Welcome to our animal shelter! Here is a list of the animals staying with us: \n");
		System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
		System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
		for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
			System.out.println(entry.getValue());
		}
		menuOptions();
		String userOpt;

		do {
			petFace.petUpdate();
			userOpt = input.nextLine();
			if (userOpt.equals("1")) {
				petFace.feedPets();
				System.out.println("You fed all of your pets\n");
				System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
				System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
				for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("2")) {
				petFace.waterPets();
				System.out.println("You watered all of your pets");
				System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
				System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
				for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}
			if (userOpt.equals("3")) {
				System.out.println("Awesome! You want to play with one of the pets! Please choose one to play with: ");
				for (VirtualPet i : petFace.shelteredPetsValues()) {
					System.out.print(i.getName());
					System.out.println("" + i.getDescription());
				}
				userOpt = input.nextLine().toLowerCase();

				petFace.playWithPet(userOpt);

				System.out.println("You played with " + userOpt);

				menuOptions();
			}
			if (userOpt.equals("4")) {
				System.out.println("Thank you so much for adopting a pet!\nWhich pet would you like to adopt?\n");
				for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
					System.out.println(entry.getKey());
				}
				userOpt = input.nextLine().toLowerCase();
				petFace.removePet(userOpt);
				System.out.println("You adopted " + userOpt + "\nThanks again for adopting a pet!");
				menuOptions();
			}
			if (userOpt.equals("5")) {
				System.out.println("We will be happy to look after a pet for you.\nWhat is the name of the pet?\n");
				String admitPetName = input.nextLine().toLowerCase();
				System.out.println("Please give a description of what the pet looks like: \n");
				String admitPetDesc = input.nextLine().toLowerCase();
				VirtualPet newPet = new VirtualPet(admitPetName, admitPetDesc);
				petFace.addPet(newPet);
				System.out.println("You adopted " + userOpt + "\nThanks again for adopting a pet!");
				menuOptions();
			}
			if (userOpt.equals("6")) {
				System.out.println("Here are the updated stats for all of the pets: ");
				System.out.println("Name\t\t|Hunger\t|Bored\t|Potty\t|tired\t|thirst");
				System.out.println("-------\t\t|------\t|------\t|------\t|------\t|-------");
				for (Entry<String, VirtualPet> entry : petFace.shelteredPets.entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
			}

		} while (!userOpt.equals("7"));

	}

	public static void menuOptions() {

		System.out.println("\nWhat would you like to help with?");
		System.out.println("\n1 Feed all of the pets");
		System.out.println("2 Give all of the pets some water");
		System.out.println("3 Play with one of the pets");
		System.out.println("4 Adopt a pet");
		System.out.println("5 Admit a pet");
		System.out.println("6 Check on the pets stats");
		System.out.println("7 Quit");
	}
}

import java.util.ArrayList;
import java.util.Random;

public class VirtualPet {
	Random rand = new Random();
	int tickUpdt = rand.nextInt(5) + 1;
	int rngNum1 = rand.nextInt(5) + 1;
	int rngNum2 = rand.nextInt(5) + 1;
	int rngNum3 = rand.nextInt(5) + 1;
	int rngNum4 = rand.nextInt(5) + 1;
	int rngNum5 = rand.nextInt(100) + 1;

	// Instance Data
	private String petName;
	private String name;
	private String description;
	private int hunger;
	private int boredom;
	private int needToPotty;
	private int tiredness;
	private int thirst;
	String PetType;

	// Constructor
	public VirtualPet(String petName, String description, int hunger, int boredom, int needToPotty, int tiredness, int thirst) {
		this.name = petName;
		this.description = description;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
		this.thirst	= thirst;
	}
	
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// Accessors
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getNeedToPotty() {
		return needToPotty;
	}

	public int getTiredness() {
		return tiredness;
	}
//Tick method
	ArrayList<Integer> tick = new ArrayList<Integer>();
	public void addAttributes() {
		tick.add(hunger);
		tick.add(boredom);
		tick.add(needToPotty);
		tick.add(tiredness);
		tick.add(thirst);		
		
	}
	
	public int getTick() {
		
	}

	public int getDead() {
		System.exit(0);
		return 0;
	}

	// Name method
	public boolean enteredName(String enteredName) {
		return petName.equals(enteredName);
	}

	// Actions
	void feeding() {
		int eating = rngNum5;
		hunger += eating;
		needToPotty += eating;

	}

	void playing() {
		int play = rngNum5;
		boredom += play;
		tiredness += play;

	}

	void pooping() {
		int pooping = rngNum5;
		needToPotty -= pooping;
		boredom += pooping;
	}

	void sleeping() {
		int sleeping = rngNum5;
		tiredness -= sleeping;
		hunger += sleeping;
	}

	// Pet Actions
	public int getFood() {
		return hunger += rngNum5;
	}

	public int getPuke() {
		return hunger -= rngNum5;
	}

	public int getExcercise() {
		return boredom += rngNum5;
	}

	public int getCrazy() {
		return boredom -= rngNum5;
	}

	public int getPooper() {
		return needToPotty -= rngNum5;
	}
	public int waterPets() {
		return thirst -= rngNum5;
	}
	@Override
	public String toString() {
		return "" + this.name + "\t" + this.description + "\t" + this.hunger;
	}

}

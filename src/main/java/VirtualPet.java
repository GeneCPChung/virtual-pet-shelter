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
	String PetType;

	// Constructor
	public VirtualPet(String name, String description, int hunger, int boredom, int needToPotty, int tiredness) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
	}
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public VirtualPet(String petName, int hunger, int boredom, int needToPotty, int tiredness) {

		this.petName = petName;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
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

	public int getTick() {

		int tickStat = rngNum5;

		if (tickStat < 25) {
			hunger *= rngNum1;
			boredom *= rngNum2;
			needToPotty *= rngNum3;
			tiredness *= rngNum4;
			return tickStat;
		}
		if (tickStat >= 21 && rngNum5 <= 49) {
			hunger += rngNum1;
			boredom -= rngNum2;
			needToPotty += rngNum3;
			tiredness -= rngNum4;
			return tickStat;
		}
		if (tickStat >= 50 && rngNum5 <= 74) {
			hunger -= rngNum1;
			boredom += rngNum2;
			needToPotty -= rngNum3;
			tiredness += rngNum4;
			return tickStat;
		}
		if (tickStat >= 75 && rngNum5 <= 100) {
			hunger /= rngNum1;
			boredom /= rngNum2;
			needToPotty /= rngNum3;
			tiredness /= rngNum4;
			return tickStat;
		} else {
			return 0;
		}

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

}

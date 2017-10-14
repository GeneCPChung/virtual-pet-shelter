import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPet {
	Random rand = new Random();
	int tickUpdt = rand.nextInt(5) + 1;
	int rngNum1 = rand.nextInt(25) + 1;
	int rngNum2 = rand.nextInt(25) + 1;
	int rngNum3 = rand.nextInt(25) + 1;
	int rngNum4 = rand.nextInt(25) + 1;
	int rngNum5 = rand.nextInt(25) + 1;

	// Instance Data

	private String name;
	private String description;
	private int hunger = rngNum1;
	private int boredom = rngNum2;
	private int needToPotty = rngNum3;
	private int tiredness = rngNum4;
	private int thirst = rngNum5;

	// Stat array
	/*
	 * ArrayList<Integer> stats = new ArrayList<Integer>();
	 * 
	 * public void addStats() { stats.add(hunger); stats.add(boredom);
	 * stats.add(needToPotty); stats.add(tiredness); stats.add(thirst); for (Integer
	 * stat : stats) { stat += this.rngNum5; } }
	 */

	// Constructor
	public VirtualPet(String name, String description, int hunger, int boredom, int needToPotty, int tiredness,
			int thirst) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
		this.thirst = thirst;
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

	// Tick method
	ArrayList<Integer> tick = new ArrayList<Integer>();

	public ArrayList<Integer> getTick() {
		return this.tick;
	}

	public int getDead() {
		System.exit(0);
		return 0;
	}

	// Name method
	public boolean enteredName(String enteredName) {
		return name.equals(enteredName);
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

	@Override
	public String toString() {
		return "" + this.name + this.description + "\t|" + this.hunger + "\t|" + this.boredom + "\t|" + this.needToPotty
				+ "\t|" + this.tiredness + "\t|" + this.thirst;
	}

}

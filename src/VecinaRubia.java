
public class VecinaRubia {
	private String name;
	private String surname;
	private int lvlB;
	private double hairLength;
	private int nHaters;
	private int nFollowers;

	public VecinaRubia() {
	}

	public VecinaRubia(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public VecinaRubia(String name, String surname, int lvlB, double hairLength, int nHaters, int nFollowers) {
		this.name = name;
		this.surname = surname;
		this.lvlB = lvlB;
		this.hairLength = hairLength;
		this.nHaters = nHaters;
		this.nFollowers = nFollowers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getLvlB() {
		return lvlB;
	}

	public void setLvlB(int lvlB) {
		this.lvlB = lvlB;
	}

	public double getHairLength() {
		return hairLength;
	}

	public void setHairLength(double hairLength) {
		this.hairLength = hairLength;
	}

	public int getnHaters() {
		return nHaters;
	}

	public void setnHaters(int nHaters) {
		this.nHaters = nHaters;
	}

	public int getnFollowers() {
		return nFollowers;
	}

	public void setnFollowers(int nFollowers) {
		this.nFollowers = nFollowers;
	}

}

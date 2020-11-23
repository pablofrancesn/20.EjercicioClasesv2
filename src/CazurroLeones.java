
public class CazurroLeones {
	private String name;
	private String surname;
	private int lvlC;
	private double height;
	private double weight;
	private int alcoholCap;
	private int nHaters;

	public CazurroLeones() {

	}

	public CazurroLeones(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public CazurroLeones(String name, String surname, int lvlC, double height, double weight, int alcoholCap,
			int nHaters) {
		this.name = name;
		this.surname = surname;
		this.lvlC = lvlC;
		this.height = height;
		this.weight = weight;
		this.alcoholCap = alcoholCap;
		this.nHaters = nHaters;
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

	public int getLvlC() {
		return lvlC;
	}

	public void setLvlC(int lvlC) {
		this.lvlC = lvlC;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAlcoholCap() {
		return alcoholCap;
	}

	public void setAlcoholCap(int alcoholCap) {
		this.alcoholCap = alcoholCap;
	}

	public int getnHaters() {
		return nHaters;
	}

	public void setnHaters(int nHaters) {
		this.nHaters = nHaters;
	}

}

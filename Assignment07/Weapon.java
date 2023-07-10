
public class Weapon {

	private String name;
	private int maxDamage;
	
	//Default Constructor
	public Weapon() {
		name = "Pointy Stick";
		maxDamage = 1;
	}
	
	//Overloaded Constructor 
	public Weapon(String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
	}
	
	//Get Weapon Name
	public String getName() {
		return name;
	}
	
	//Get Max Damage of the weapon
	public int getMaxDamage() {
		return maxDamage;
	}
	
	//Set Weapon name
	public void setName(String name) {
		this.name = name;
	}
	
	//Set Max Damage of the weapon
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
}

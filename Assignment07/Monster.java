
public class Monster {

	private String name;
	private int healthScore;
	private Weapon weapon;
	
	//Overloaded Constructor
	public Monster(String name, int healthScore, Weapon weapon) {
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
	}
	
	//Get name of monster 
	public String getName() {
		return name;
	}
	
	//Get health of monster
	public int getHealthScore() {
		return healthScore;
	}
	
	//Get Weapon name 
	public String getWeaponName() {
		return this.weapon.getName();
	}
	
	//Method of how the fight works
	public int attack(Monster monster) {
		int randomAttack = (int) (Math.random() * weapon.getMaxDamage());
		monster.healthScore -= randomAttack;
		return randomAttack;
		
	}
}

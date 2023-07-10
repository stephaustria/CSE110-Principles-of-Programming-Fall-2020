// CSE 110: Class 76370 / Tuesday 12-12:50
// Assignment : Assignment 8
// Author : Stephen Austria 1220159551
// Description : Volleyball Menu Program

public class Player {
	//Variables Relevant to Player Statistics
	private String name;
	private double attackStat;
	private double blockStat;
	
	//Overloaded Constructor
	public Player(String name, double attackStat, double blockStat) {
		this.name = name;
		this.attackStat = attackStat;
		this.blockStat = blockStat;
	}
	
	//Get Name Method
	public String getName() {
		return name;
	}
	
	//Get Attack Stat Mehtod
	public double getAttackStat() {
		return attackStat;
	}
	
	//Set Attack Stat Method
	public void setAttackStat(double attackStat) {
		this.attackStat = attackStat;
	}
	
	//Get Block Stat Method
	public double getBlockStat() {
		return blockStat;
	}
	
	//Set Block Stat Method
	public void setBlockStat(double blockStat) {
		this.blockStat = blockStat;
	}
	
	//Print Player Info
	public void printPlayerInfo() {
		String playerInfo = name + " (attack = " + attackStat + ", block = " + blockStat + ")";
		System.out.println(playerInfo);
	}
}

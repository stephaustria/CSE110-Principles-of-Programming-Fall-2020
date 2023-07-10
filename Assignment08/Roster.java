// CSE 110: Class 76370 / Tuesday 12-12:50
// Assignment : Assignment 8
// Author : Stephen Austria 1220159551
// Description : Volleyball Menu Program

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Roster {
	//Storing Player References
	private ArrayList<Player> players;
	
	//Default Constructor
	public Roster() {
		players = new ArrayList<Player>();
	}
	
	//Overloaded Constructor
	public Roster(String fileName) {
		players = new ArrayList<Player>();
		
		//Reader, Reads File and Stores
		readRosterFile(fileName);
	}
	//Reader for the Roster Files
	private void readRosterFile(String fileName) {
		try {
			String[] lines = Files.readAllLines(new File(fileName).toPath()).toArray(new String[0]);
			for (String line : lines) {
				String[] arr = line.split(" ");
				String name = arr[0] + " " + arr[1];
				double attackStat = Double.parseDouble(arr[2]);
				double blockStat = Double.parseDouble(arr[3]);
				players.add(new Player(name, attackStat, blockStat));
			}
		} catch (Exception e) { //Printed when the reader cannot identify and read the file
			System.out.println("Error while reading roster file.");
		}
	}
	
	//Add a player method
	public void addPlayer(String name, double attackStat, double blockStat) {
		players.add(new Player(name, attackStat, blockStat));
	}
	
	//Count players method
	public int countPlayers() {
		return players.size();
	}
	
	public Player getPlayerByName(String name) {
		for (Player p : players) {
			if(p.getName().contains(name)) {
				return p;
			}
		}
		return null;
	}
	//Printing the Top Attackers from the Roster based on Statistics
	public void printTopAttackers() {
		ArrayList<Player> tmpList = players;
		tmpList = (ArrayList<Player>)tmpList.stream().sorted(Comparator.comparingDouble(Player::getAttackStat).reversed()).collect(Collectors.toList());
		tmpList.get(0).printPlayerInfo();
		tmpList.get(1).printPlayerInfo();
	}
	//Printing the Top Blockers from the Roster based on Statistics
	public void printTopBlockers() {
		ArrayList<Player> tmpList = players;
		tmpList = (ArrayList<Player>)tmpList.stream().sorted(Comparator.comparingDouble(Player::getBlockStat).reversed()).collect(Collectors.toList());
		tmpList.get(0).printPlayerInfo();
		tmpList.get(1).printPlayerInfo();
	}
	//Printing All Players from Roster
	public void printAllPlayers() {
		for (Player p : players) {
			p.printPlayerInfo();
		}
	}
}

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double roadLength = 0;
		int lanes = 0;
		int asphalt = 0;
		int projectDays = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Length of road (miles): ");
		roadLength = scan.nextDouble();
		
		System.out.print("Number of lanes: ");
		lanes = scan.nextInt();
		
		System.out.print("Depth of asphalt (inches): ");
		asphalt = scan.nextInt();
		
		System.out.print("Days to complete project: ");
		projectDays = scan.nextInt();
		
		
		System.out.println("=== Amount of materials needed ===" );
		double roadLengthfeet = roadLength * 5280;
		double volumeRoad = (roadLengthfeet * 12 * lanes * ((double)(asphalt))/12);
		double weightAsphalt = volumeRoad * 150;
		double asphaltTrucks = weightAsphalt / 10000;
		int numberAsphaltTrucks = (int)(asphaltTrucks);
		if(asphaltTrucks % 1 != 0 ) {
			numberAsphaltTrucks ++;
		}
		System.out.println("Truckloads of Asphalt: " + numberAsphaltTrucks);
		
		int stoplights;
		int intersections = (int)(roadLength);
		stoplights = 2 * intersections + (lanes * intersections);
		System.out.println("Stoplights: " + stoplights);
		
		double conduitPipes = roadLengthfeet / 24;
		int numberConduitPipes = (int)(conduitPipes);
		if(conduitPipes % 1 !=0) {
			numberConduitPipes ++;
		}
		System.out.println("Conduit pipes: " + numberConduitPipes);
		
		double crewMembers = (50 * roadLength * lanes) / projectDays;
		int numberCrewMembers = (int)(crewMembers);
		if(crewMembers %1 !=0) {
			numberCrewMembers ++;
		}
		System.out.println("Crew members needed: " + numberCrewMembers);
		
		System.out.println("=== Cost of Materials ============");
		double asphaltCost = numberAsphaltTrucks * 1000;
		System.out.println("Cost of Asphalt: $" + asphaltCost);
		double stopLightsCost = stoplights * 25000;
		System.out.println("Cost of Stoplights: $" + stopLightsCost);
		double conduitPipesCost = numberConduitPipes * 500;
		System.out.println("Cost of Conduit pipes: $" + conduitPipesCost);
		double laborCost = numberCrewMembers * projectDays * 8 * 25;
		System.out.println("Cost of Labor: $" + laborCost);
		System.out.println("=== Total Cost of Project ========");
		double totalCost = asphaltCost + stopLightsCost + conduitPipesCost + laborCost;
		System.out.println("Total cost of project: $" + totalCost);
		
				
		
		

	}

}

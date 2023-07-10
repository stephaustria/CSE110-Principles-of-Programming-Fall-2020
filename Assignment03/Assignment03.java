import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declared Values
		int shares = 0;
		int purchasePrice = 0;
		int marketPrice = 0;
		int availableFunds = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//Inputs for the stocks
		System.out.print("Current Shares: ");
		shares = scan.nextInt();
		
		System.out.print("Purchase Price: ");
		purchasePrice = scan.nextInt();
		 
		System.out.print("Market Price: ");
		marketPrice = scan.nextInt();
		
		System.out.print("Available Funds: ");
		availableFunds = scan.nextInt();
		
		//Equations to calculate to buy, sell, or hold stocks
		
		int numberOfSharesToBuy = Math.floorDiv(availableFunds - 10 , marketPrice); 
		int totalBuyCost = 10 + marketPrice * numberOfSharesToBuy;
		int perShareBuyValue = purchasePrice - marketPrice;
		int totalBuyValue = perShareBuyValue * numberOfSharesToBuy;
		
		//Variables that determine to buy stocks
		int perShareSellValue = marketPrice - purchasePrice;
		int totalSellValue = perShareSellValue * shares;
		
		//The declared outputs whether to buy, sell, or hold 
		if (totalBuyValue == 0) {
			System.out.print("Hold shares");
		} else if (totalBuyCost <= availableFunds && perShareBuyValue > 0) {
				System.out.print("Buy " + numberOfSharesToBuy + " shares");
		
		} else if (perShareSellValue < 0 || totalSellValue < 10) {
				System.out.print("Hold shares");
		
		} else if (perShareSellValue > 0 && totalSellValue > 10) {
				System.out.print("Sell " + shares + " shares");
		
		} else {
			System.out.print("Hold shares");
				
				
			}
			
				
		

	}

}

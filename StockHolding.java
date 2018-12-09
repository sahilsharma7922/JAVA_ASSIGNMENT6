
public class StockHolding {
	
	//instance variables
	String companyName;
	int numberOfShares;
	float purchaseSharePrice, currentSharePrice;
	
	//constructor to initialize instances
	public StockHolding(String companyName, float purchaseSharePrice, float currentSharePrice, int numberOfShares){
		this.companyName = companyName;
		this.purchaseSharePrice = purchaseSharePrice;
		this.currentSharePrice = currentSharePrice;
		this.numberOfShares = numberOfShares;
	}
	
	//other methods
	float costInDollars(){
		return purchaseSharePrice * numberOfShares;
	}
	
	float valueInDollars(){
		return currentSharePrice * numberOfShares;
	}
}

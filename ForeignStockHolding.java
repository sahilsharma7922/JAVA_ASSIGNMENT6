
public class ForeignStockHolding extends StockHolding {
	
	float conversionRate;
	//constructor for initialization
	public ForeignStockHolding(String companyName, float purchaseSharePrice, float currentSharePrice, int numberOfShares, float conversionRate){
		super(companyName,purchaseSharePrice,currentSharePrice,numberOfShares);
		this.conversionRate = conversionRate;
	}
	
	//overriding required methods
	float costInDollars(){
		return conversionRate * purchaseSharePrice * numberOfShares;
	}
	
	float valueInDollars(){
		return conversionRate * currentSharePrice * numberOfShares;
	}
}

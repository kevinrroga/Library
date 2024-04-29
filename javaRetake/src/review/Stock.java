package review;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String symbol,String name){
		this.symbol=symbol;
		this.name=name;
	}
	public double getChangePercent() {
		double percentage=0;
		percentage = ( currentPrice/ previousClosingPrice) * 100;
		return percentage;
	}

}

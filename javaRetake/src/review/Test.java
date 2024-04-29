package review;

public class Test {

	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		System.out.printf("%.2f", stock.getChangePercent());
	}
}

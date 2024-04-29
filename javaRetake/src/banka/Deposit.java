package banka;

public class Deposit extends Account {
	private double depositAmount;
	
	public Deposit(String name,String surname, int id, double depositAmount) {
		super(name,surname,id);
		this.depositAmount = depositAmount;
	}
	
	public String toString() {
		return super.toString() + "Deposit Amount: "+depositAmount;
	}
}

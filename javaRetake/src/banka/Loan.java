package banka;

public class Loan extends Account{
	private double loanAmount;
	
	public Loan(String name, String surname, int id, double loanAmount) {
		super(name,surname,id);
		this.loanAmount=loanAmount;
	}
	public String toString() {
		return super.toString() + "Loan Amount: "+loanAmount;
	}

}

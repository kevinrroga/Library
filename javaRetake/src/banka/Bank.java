package banka;

public class Bank {
	Account[] account;
	int index;
	
	public Bank() {
		account = new Account[500];
		index=0;
	}
	public Bank(int value) {
		account = new Account[value];
		index=0;
	}
	public void addAccount(Account a) {
		if (index==account.length) {
			Account[] a2 = new Account[index*2];
			for (int i=0; i<index; i++) {
				a2[i] = account[i];
			}
			account=a2;
			account[index] = a;
			index++;
		}else {
			account[index]=a;
			index++;
		}
	
	}
}

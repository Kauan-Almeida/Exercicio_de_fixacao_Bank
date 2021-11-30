package entities;

public class Bank {

	private int number;
	public String holder;
	public double deposito;
	
	
	
	public Bank(int number, String holder, double deposito) {
		this.number = number;
		this.holder = holder;
		this.deposito = deposito;
	}
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void deposito2(double deposito2) {
		deposito += deposito2;
	}
	public void saque(double deposito) {
		deposito -= deposito + 5 ;
	}
	public String toString() {
		return  number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+  String.format("%.2f", deposito);
	}
}
	
	



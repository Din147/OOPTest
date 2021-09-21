package Test3;
public class Payment {

public enum Payments {
	 household, houseCommitte, electric, water
}

private double amount;
private Payments type;
public Payment(double amount,Payments type) throws Exception {
	this.amount=amount;
	if (this.amount<0) {
		throw new Exception("amount must be positive");
	}
}
public double getAmount() {
	return amount;
}

}//end
package Test3;

import java.util.Random;

import Test3.Payment.Payments;

public class Apartment {
	private int aptNumber;
	private Tenant[] tenants;
	private Payment[] lastPayments;
	private Furniture[] furnitures;
	private int floorNumber;
	
	private static int sumhousecommit; 
	private static int sumhtenants;

	public Apartment(int aptNumber, int floorNumber) throws Exception {
		this.aptNumber = aptNumber;
		if (this.aptNumber > 80 || this.aptNumber < 1) {
			throw new Exception("aptnum should be : Values: 1-80 ");
		}
		this.floorNumber = floorNumber;

		Random r1 = new Random();
		tenants = new Tenant[r1.nextInt(9)];
		for (int i = 0; i < tenants.length; i++) {
			tenants[i] = new Tenant();
			sumhtenants++;
		}

		lastPayments = new Payment[5];
		Payments[] Temp = { Payments.electric, Payments.electric, Payments.household, Payments.water,
				Payments.houseCommitte };
		for (int i = 0; i < lastPayments.length - 1; i++) {

			lastPayments[i] = new Payment(r1.nextInt(100) + 1, Temp[i]);
		}
		lastPayments[4] = new Payment(houseCommitteCalc(), Payments.houseCommitte); // go back;

		furnitures = new Furniture[10];
		for (int i = 0; i < furnitures.length; i++) {
			int a = r1.nextInt(3) + 1;
			if (a == 1) {
				furnitures[i] = new Chair(r1.nextInt(100), r1.nextInt(100), r1.nextInt(10) + 3);
			}
			if (a == 2) {
				furnitures[i] = new Closet(r1.nextInt(100), r1.nextInt(100), r1.nextInt(91) + 10);
			}
			if (a == 3) {
				Random r2 = new Random();
				int b = r2.nextInt(3) + 1;
				if (b == 1) {
					furnitures[i] = new Table(r1.nextInt(100), r1.nextInt(100), r1.nextInt(10) + 3,
							r1.nextInt(100) + 30, "circle");
				}
				if (b == 2) {
					furnitures[i] = new Table(r1.nextInt(100), r1.nextInt(100), r1.nextInt(10) + 3,
							r1.nextInt(100) + 30, "square");
				}
				if (b == 3) {
					furnitures[i] = new Table(r1.nextInt(100), r1.nextInt(100), r1.nextInt(10) + 3,
							r1.nextInt(100) + 30, "rectangle");
				}

			}
		}

	}

	public int getAptNumber() {
		return aptNumber;
	}

	public int getFloorNum() {
		return floorNumber;
	}

	public Tenant[] getTenants() {
		return tenants;
	}

	public Payment[] getLastPayments() {
		return lastPayments;
	}

	public Furniture[] getFurnitures() {
		return furnitures;
	}

	public int houseCommitteCalc() {
		int ammount = 100;
		if (1 < getTenants().length) {
			ammount += (getTenants().length - 1) * 20;
		}
		if (0 < getFloorNum()) {
			ammount += (getFloorNum() - 1) * 10;
		}
		sumhousecommit+=ammount;
		return ammount;
	}
	
	public int getSumHousecommit() {
		return sumhousecommit; 
	}
	
	public int getSumhTenants() {
		return sumhtenants;
	}

	public String toString() {
		String str;
		int CounterChair = 0;
		int CounterTable = 0;
		int counterCloset = 0;

		str = getTenants().length + " tenants and " + getFurnitures().length + " furnitures \nfurnitures are: ";
		for (int i = 0; i < getFurnitures().length; i++) {
			if (getFurnitures()[i] instanceof Chair) {
				CounterChair++;
			}
			if (getFurnitures()[i] instanceof Table) {
				CounterTable++;
			}
			if (getFurnitures()[i] instanceof Closet) {
				counterCloset++;
			}
		}
		str += CounterChair + " Chair " + CounterTable + " Tables " + counterCloset + " Closet \n";
		str += "appartment " + getAptNumber() + " houe committe payments is " + getLastPayments()[4].getAmount() + "\n";
		return str;
	}

}

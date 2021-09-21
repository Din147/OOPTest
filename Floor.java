package Test3;

public class Floor {
	private int floorNumber;
	private Apartment[] apartments; 
	
	private static int AccounterApartments=0;
	
	public Floor(int floorNumber ) throws Exception {
	this.floorNumber=floorNumber;
	if (this.floorNumber<1 || 20<this.floorNumber) {
		throw new Exception("floor number must be between 1-20");
	}
	apartments=new Apartment[4];
	
	for(int i=0; i<this.apartments.length; i++) {
		apartments[i]=new Apartment(i+1, this.floorNumber);
		 AccounterApartments++;
	}
	
		
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public Apartment[] getApartments() {
		return apartments;
	}
	
	public int  getAccounterApartments() {
		return  AccounterApartments;
	}
	
	public String toString() {
		String str; 
		str= getApartments().length + "\n";
		
		for (int i=0; i<getApartments().length; i++) {
			str+= "apparement " + (i+1) +" conatin " +getApartments()[i].toString();
		}
		return str;
	}
}

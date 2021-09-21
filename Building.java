package Test3;

public class Building {
private int buildingNumber; 
private Floor[] floors; 

public Building(int buildingNumber) throws Exception {
	this.buildingNumber=buildingNumber; 
	floors = new Floor[20]; 
	for (int i=0; i<floors.length;i++) {
		floors[i]=new Floor(i+1);
			}
	
}

public int getBuildingNumber() {
	return buildingNumber;
}

public Floor[] getFloors() {
	return floors;
}
public String ToString() {
	String str; 
	str="building number "+ getBuildingNumber()+ " contains " + getFloors().length + "floors \n";
	for (int i=0; i<getFloors().length; i++) {
		str+= "floor " + i+ " contain appartments 1-" +getFloors()[i].toString() +"\n";
	}
	return str; 
}
}

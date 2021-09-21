package Test3;

public class BuildingStatistics {
	public static void main(String[] args) {
		try {
			Building a = new Building(1);
			// System.out.println(a.ToString());
			// houseCommitStatics(a);
			// SumOfFurenitures(a);
			// rentsTange30_50(a);
			// rents_40andmore(a);
			// MostOfChair(a);
//			biggestCloset(a);
//			mostOfLegs(a); 
			rentsTange70Pluse(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void houseCommitStatics(Building a) {
		System.out.println(a.getFloors()[0].getApartments()[0].getSumHousecommit());
		System.out.println(
				a.getFloors()[0].getApartments()[0].getSumHousecommit() / a.getFloors()[0].getAccounterApartments());
		System.out.println(a.getFloors()[0].getApartments()[0].getSumhTenants());
		System.out.println(a.getFloors()[0].getApartments()[0].getSumHousecommit()
				/ a.getFloors()[0].getApartments()[0].getSumhTenants());
	}

	public static void SumOfFurenitures(Building a) {
		int chairCaounter = 0;
		int tableCaounter = 0;
		int closetCaounter = 0;

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						chairCaounter++;
					}
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Table) {
						tableCaounter++;
					}
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Closet) {
						closetCaounter++;
					}
				}
			}
		}
		System.out.println("sum of chair: " + chairCaounter + " sum of tables: " + tableCaounter + " sum of closet: "
				+ closetCaounter);
	}

	public static void rentsTange30_50(Building a) {
		int rents = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					if (30 <= a.getFloors()[i].getApartments()[j].getTenants()[k].getAge()
							&& a.getFloors()[i].getApartments()[j].getTenants()[k].getAge() <= 50) {
						rents++;
					}
				}
			}
		}
		System.out.println("sum of 30-50 rents are " + rents);
	}

	public static void rents_40andmore(Building a) {

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					if (40 <= a.getFloors()[i].getApartments()[j].getTenants()[k].getAge()) {
						double relative = a.getFloors()[i].getApartments()[j].getLastPayments()[4].getAmount()
								/ (a.getFloors()[i].getApartments()[j].getSumHousecommit());
						System.out.println("apparements is: " + a.getFloors()[i].getApartments()[j].getAptNumber()
								+ " relative paymets is: " + relative + "\n");
						break;
					}
				}
			}
		}
	}

	public static void MostOfChair(Building a) {
		int max = 0;
		int chairs = 0;
		int aptnum = 0;
		int floornum = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				chairs = 0;
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						chairs++;
					}
				}
				if (max < chairs) {
					max = chairs;
					floornum = a.getFloors()[i].getFloorNumber();
					aptnum = a.getFloors()[i].getApartments()[j].getAptNumber();
				}
			}
		}
		System.out.println("max chairs: " + max + " " + "at appartmetns " + aptnum + " on floor " + floornum);
	}

	public static void biggestCloset(Building a) {
		int depth = 0;
		int width = 0;
		int height = 0;
		int aptNum = 0;
		int floorNum = 0;
		int max = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Closet) {
						depth = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getDepdth();
						width = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getWidth();
						height = ((Closet) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getHeight();
					}
					if (max < depth * width * height) {
						max = depth * width * height;
						aptNum = a.getFloors()[i].getApartments()[j].getAptNumber();
						floorNum = a.getFloors()[i].getFloorNumber();
					}
				}
			}
		}
		System.out.println("biggest closet diamension is: " + max +  " on aptnumber " + aptNum + " at floor " + floorNum);
	}
	
	public static void mostOfLegs(Building a) {
		int legs = 0;
		int aptNum = 0;
		int floorNum = 0;
		int max = 0;
		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getFurnitures().length; k++) {
					if (a.getFloors()[i].getApartments()[j].getFurnitures()[k] instanceof Chair) {
						legs = ((Chair) (a.getFloors()[i].getApartments()[j].getFurnitures()[k])).getLegs();
					}
					if (max < legs) {
						max = legs;
						aptNum = a.getFloors()[i].getApartments()[j].getAptNumber();
						floorNum = a.getFloors()[i].getFloorNumber();
					}
				}
			}
		}
		System.out.println("chair's most legs is : " + max +  " on aptnumber " + aptNum + " at floor " + floorNum);
	}
	
	public static void rentsTange70Pluse(Building a) {
		int rents = 0;
		int max = 0;
		int aptNum = 0;
		int floorNum = 0;

		for (int i = 0; i < a.getFloors().length; i++) {
			for (int j = 0; j < a.getFloors()[i].getApartments().length; j++) {
				rents = 0;
				for (int k = 0; k < a.getFloors()[i].getApartments()[j].getTenants().length; k++) {
					
					if (70 <= a.getFloors()[i].getApartments()[j].getTenants()[k].getAge()) {
						rents++;
					}
				}
				if (max < rents) {
					max = rents;
					aptNum = a.getFloors()[i].getApartments()[j].getAptNumber();
					floorNum = a.getFloors()[i].getFloorNumber();
				}
			}
		}
		System.out.println("there is 70+ : " + max +  " on aptnumber " + aptNum + " at floor " + floorNum);
	}
}

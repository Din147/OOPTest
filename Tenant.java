package Test3;

import java.util.Random;

public class Tenant {
	private String name;
	private int age;
	private String[] names = { "Din", "Maya", "Levi", "Idan" };

	public Tenant() {
		Random r1 = new Random();
		age = r1.nextInt(121) + 20;
		name = names[r1.nextInt(4)];

	}

	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}

	

}//end

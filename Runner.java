package Test3;

import java.util.Random;

public class Runner {
public static void main(String[] args) {
	Random r1=new Random();
	
for  (int i=0; i<100; i++){
	int a=r1.nextInt(3)+1;
	System.out.print(a);

	}

}
}

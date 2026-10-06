package objectCreation;

public class FanApp {
public static void main(String[] args) {
	Fan f1= new Fan();
	f1.rotate();
	f1.blowsAir();
	
	f1.colour="white";
	f1.no_of_blades=3;
	f1.price=3000;
	
	System.out.println(f1.colour);
	System.out.println(f1.no_of_blades);
	System.out.println(f1.price);
}
}

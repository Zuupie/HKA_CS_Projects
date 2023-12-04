import java.util.Scanner;


public class BrakingDistance{
	public static void main(String[] args ){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Geschwindigkeit (in km/h): ");
	double geschwindigkeit = scanner.nextDouble();
	
	double bremsweg = Math.pow((geschwindigkeit/10), 2);
		//( geschwindigkeit / 10 ) * ( geschwindigkeit / 10);
	System.out.println("Der Bremsweg liegt bei " + bremsweg + " Metern");
	}
}
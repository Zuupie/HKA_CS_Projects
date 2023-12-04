import java.util.Scanner;

public class HeronFixpoint {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl an, von welcher die Wurzel gezogen werden soll: ");
		double zahl = scanner.nextDouble();
		calculate(zahl);
	}
	
	public static void calculate(double a){

		//Nur positive Zahlen (z.B. geht 0 oder -3 nicht)
		
		double x = a;
		double y = 0;
		int i = 0;
		
		while(true){
			i++;
			y = 0.5 * (x + (a / x));
			System.out.println("x" + i +" =" + y);
			
			if(x == y){
				break;
			}
			else{
				x = y;
			}
		}
		System.out.println("ENDE");
	}
}
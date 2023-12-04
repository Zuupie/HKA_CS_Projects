import java.util.Scanner;

public class Quersumme {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl an, von der du die Quersumme haben willst: ");
		int zahl = scanner.nextInt();
		System.out.println("Quersumme in Dez.: " + quersumme(zahl));
		System.out.println("Quersumme in Hex.: " + quersummeHex(zahl));
	}
	
	public static int quersumme(int x) {
		int temp = 0;
		while (x != 0) {
		  temp += x % 10; // Extrahiere die letzte Ziffer und addiere sie zur Quersumme
		  x /= 10; // Entferne die letzte Ziffer von der Zahl
		}
		return temp;
	}
	
	public static int quersummeHex(int zahl) { //kein Plan wie das gehen soll
		int temp = 0;
		while (zahl != 0) {
		  temp += zahl % 16; // Extrahiere die letzte Ziffer und addiere sie zur Quersumme
		  zahl /= 10; // Entferne die letzte Ziffer von der Zahl
		}
		return temp;
	}
}



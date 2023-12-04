import java.util.Scanner;

public class FormatDemo{
	public static void main(String[] args){
		
		System.out.print("Gib eine (Komma-)zahl ein: ");
		Scanner scannerD = new Scanner(System.in);
		double d = scannerD.nextDouble();

		System.out.print("Gib eine Ganzezahl ein: ");
		Scanner scannerI = new Scanner(System.in);
		int i = scannerI.nextInt();

		intFormatDemo(i);
		doubleFormatDemo(d);
		/*
		intFormatDemo(100);
		intFormatDemo(1023);
		intFormatDemo(0xFFF1234);
		intFormatDemo(-3);
		
		doubleFormatDemo(2.5);
		doubleFormatDemo(3.141592653);
		doubleFormatDemo(1e12);
		doubleFormatDemo(-0.0001234);
		 */
	}
	
	public static void intFormatDemo(int x){

		System.out.println(x); //normale Ausgabe für die Zahl
		
		System.out.printf("%+d%n", x); //"+" für die Vorzeichen, "%n" für neue Zeile
		
		System.out.printf("0x%08X%n", x); //"0x" für das Praefix, "08" für Hexadezimalzahl 8-stellig (mit auffuellenden Nullen), "X" damit Großbuchstaben verwendet werden
		
		String binaryString = toBinaryString(x); //Ganzahl zu Binaerdarstellung 
		System.out.printf("0b%s%n", binaryString.replace(" ", "0")); //"0b" ist der Praefix, "%s" ist Platzhalter für String, Methode ersetzt die Leerzeichen durch Nullen
		
		System.out.printf("[%-10d]%n", x); //Linksbuendig in eckigen Klammern
		
		System.out.printf("[%10d]%n", x);//Rechtsbuendig in eckigen Klammern
	}
	
	public static String toBinaryString(int number){
		String binary = Integer.toBinaryString(number); //Zahl in Binaer zu String
		int paddingLength = 32 - binary.length(); //Herausfinden wie viele Nullen vor der Zahl stehen
		String padding = " ".repeat(paddingLength); // "Anzahl 0" durch Leerzeichen hinzufügen
		return padding + binary;
	}
	
	public static void doubleFormatDemo(double d){
		
		System.out.println(d);
		
		System.out.printf("%25.2f%n", d); //"%25" für die Breite, ".2f" für die Nachkommastellen
		
		System.out.printf("%25.2E%n", d); //".2E" für zwei Nachkommastelle und E als Exponenten
		
		System.out.printf("%25a%n", d);
		
	}
	
}
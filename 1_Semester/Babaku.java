import java.util.Scanner;

public class Babaku{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //Input durch Kommandozeile
	
	System.out.println("Durchmesser Grill (in cm): ");
	double d = scanner.nextDouble();
	
	System.out.println("Halloumi Länge:" );
	double l = scanner.nextDouble();
	
	System.out.println("Halloumi Breite:" );
	double b = scanner.nextDouble();
	
	System.out.println("Anzahl Kinder:" ); //Isst immer 1x Halloumi
	int anzahlKinder = scanner.nextInt();
	
	System.out.println("Anzahl Erwachsene:" ); // Isst immer 2x Halloumi
	int anzahlErwachsene = scanner.nextInt();
	
	double flaecheGrill = Math.PI * Math.pow((d/2), 2); //Fläche vom Grill berechnen
	System.out.println("Die Fläche vom Grill: " + flaecheGrill);
	
	double flaecheHalloumi = b * l; //Fläche vom Halloumi berechnen
	System.out.println("Die Fläche vom Halloumi: " + flaecheHalloumi);
	
	double maxHalloumi = flaecheGrill / flaecheHalloumi;
	System.out.println("Es passen maximal " + maxHalloumi + " Halloumi auf den Grill.");
	
	int anzahlGrillPlatten = (int) Math.ceil((anzahlKinder + anzahlErwachsene * 2) / maxHalloumi);
	System.out.println("Der Grill muss " + anzahlGrillPlatten + " mal befüllt werden, damit alle Personen ihre Halloumis bekommen.");
	}
}
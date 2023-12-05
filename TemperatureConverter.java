import java.util.Scanner;

class TemperatureConverter{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); //Input durch Kommandozeile
		System.out.print("Gib eine Temperatur in Celsius ein: ");
		double temperatureInCelsius = scanner.nextDouble();
		double temperatureInFahrenheit = temperatureInCelsius * 9/5 + 32;
		System.out.println("Die Temperatur ist in Fahrenheit: " + temperatureInFahrenheit);
	}
}
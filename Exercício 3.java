import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double temperatura_fahrenheit, temperatura_centigrados;
		System.out.print("Informe a temperatura em Fahrenheit: ");
		  temperatura_fahrenheit = read.nextDouble();
		  temperatura_centigrados = (temperatura_fahrenheit - 32)/1.8;	
		System.out.printf("A temperatura informada convertida em graus centígrados é igual a %.2f°C.", temperatura_centigrados);
	}
}

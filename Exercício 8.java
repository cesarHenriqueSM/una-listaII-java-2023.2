import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    System.out.print("Informe a quantidade de veículos presentes no estacionamento: ");
		    int quantidade_veiculos = read.nextInt();
		  System.out.print("Informe a quantidade de rodas no estacionamento: ");
		    int quantidade_rodas = read.nextInt();
		  int carros = (quantidade_rodas - 2 * quantidade_veiculos)/2;
		  int motos = quantidade_veiculos - carros;
		  System.out.printf("Há %d carros e %d motos no estacionamento.", carros, motos);
	}
}

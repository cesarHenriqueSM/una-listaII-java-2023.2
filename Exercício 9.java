import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
		System.out.print("Digite os segundos: ");
		    int segundos = read.nextInt();
		double horas = segundos/3600;
		double minutos = segundos/60;
		System.out.printf("A quantidade de segundos informado equivale(m) a %.1f hora(s) e a %.1f minuto(s).", horas, minutos);
	}
}

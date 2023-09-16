import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner read = new Scanner(System.in);
		System.out.print("Informe os 3 valores: ");
		    double n1 = read.nextDouble();
	      double n2 = read.nextDouble();
	      double n3 = read.nextDouble();
	        
	   double media_aritmetica = (n1 + n2 + n3)/3;
	   double media_harmonica = 3 / ((1/n1)+(1/n2)+(1/n3));
	   double media_geometrica = Math.cbrt(n1 + n2 + n3);
	   
	   System.out.printf("a. Média aritmética: %.1f\n", media_aritmetica);
	   System.out.printf("b. Média harmônica: %.1f\n", media_harmonica);
	   System.out.printf("c. Média geométrica: %.1f\n", media_geometrica);
	}
}

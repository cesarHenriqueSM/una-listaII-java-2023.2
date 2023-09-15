import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner read = new Scanner(System.in);
	    float media, n1, n2;
		  System.out.print("Informe o primeiro número: ");
		    n1 = read.nextFloat();
		  System.out.print("Informe o segundo número: ");
		    n2 = read.nextFloat();
		  media = (n1 + n2)/2;
		  System.out.printf("A média aritmétrica dos números informados é igual a %.1f", media);
	}
}

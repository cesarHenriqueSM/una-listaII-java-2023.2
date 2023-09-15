import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	double numero, numero1;
	System.out.print("Digite os 2 números para cálculo do logaritmo do primeiro número informado na base pelo segundo: ");
		numero = read.nextDouble();
		numero1 = read.nextDouble();
	double resultado = Math.log(numero) / Math.log(numero1);
	System.out.printf("O logaritmo de %.1f na base %.1f é: %.1f", numero, numero1, resultado);
    }
}  

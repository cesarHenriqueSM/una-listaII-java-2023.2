import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		float valor_produto;
		System.out.print("Informe o valor do produto: R$");
		  valor_produto = read.nextFloat();
		float acrescimo = (valor_produto/100)*10;
		float valor_final = valor_produto + acrescimo;
		System.out.printf("O valor informado acrescido é igual a R$%.2f", valor_final);
	}
}

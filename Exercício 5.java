import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
		System.out.print("Informe quantas horas foram trabalhadas durante o mês: ");
		    float horas_trabalhadas = read.nextFloat();
		System.out.print("Informe o valor/hora trabalhada: R$");
		    float valor_hora = read.nextFloat();
		System.out.print("Informe o valor do salário família por dependente: R$");
		    float salario_familia = read.nextFloat();
		System.out.print("Informe quantos dependentes menores de 14 anos você possui: ");
		    float dependentes = read.nextFloat();
		    
		float salario_bruto = (horas_trabalhadas*valor_hora) + (salario_familia*dependentes);
		System.out.printf("Seu salário bruto será de R$%.2f.", salario_bruto);
	}
}

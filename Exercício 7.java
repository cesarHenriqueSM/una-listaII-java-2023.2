import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
		System.out.print("Informe seu salário bruto fixo: R$");
		    double salario = read.nextDouble();
		System.out.print("Informe qual o valor total de suas vendas durante o mês: R$");
		    double total_vendas = read.nextDouble();
		System.out.print("Informe o percentual do ganho sobre as vendas: ");
		    double comissao = read.nextDouble();
		double salario_liquido = salario + (total_vendas*(comissao/100));
		System.out.printf("Salário + comissão = R$%.2f", salario_liquido);
	}
}

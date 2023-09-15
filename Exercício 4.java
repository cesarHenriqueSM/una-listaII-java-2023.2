import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    		double capital_aplicado;
		System.out.print("Informe o valor a ser aplicado: R$");
			capital_aplicado = read.nextDouble();
		System.out.print("Informe o prazo de aplicação do capital em meses: ");
			int prazo = read.nextInt();
		System.out.print("Informe a taxa de juros mensal da aplicação: ");
			double taxa = read.nextDouble();
			double montante = capital_aplicado * Math.pow(1 + taxa, prazo);
		System.out.printf("O montante final será de R$%.2f.", montante);
  }
}

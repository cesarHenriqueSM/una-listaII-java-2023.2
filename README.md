# César Henrique Soares Marques - RA 622120352
## Lista de Atividades II - Java

### 1. Escreva um algoritmo que leia 3 números a partir do teclado. O algoritmo deve apresentar:
a. O maior número.
b. O menor número.
c. A média aritmética dos três números.

```
package lista3;
import java.util.Scanner;
public class exercicio1 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
	
		System.out.print("Informe os 3 números: ");
			int n1 = read.nextInt();
			int n2 = read.nextInt();
			int n3 = read.nextInt();
		
			int maior = n1;
			int menor = n1;
	
			if(n2 > maior) {
				maior = n2;
			}
			else if (n2 < menor) {
				menor = n2;
			}
	
			if (n3 > maior) {
				maior = n3;
			}
			else if (n3 < menor){
				menor = n3;
			}
	
			double media_aritmetica = (n1 + n2 + n3) / 3;
	
			System.out.printf("O maior número informado é %d, o menor é %d e a média entre os 3 números é igual a %.1f", maior, menor, media_aritmetica);
	}
}

```

### 2. Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve ser dado de troco para um pagamento efetuado. O algoritmo deve ler o valor da compra e o valor pago. 
Se o valor pago for menor que o valor da compra, a máquina deve apresentar uma
mensagem, informando que a quantia paga é insuficiente para realizar a compra.
A máquina aceita apenas notas de R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$1,00.
Exemplo:
Valor pago: R$ 100,00
Valor da compra: R$ 23,00
Troco: R$ 77,00
Notas de R$ 50,00: 1
Notas de R$ 20,00: 1
Notas de R$ 10,00: 0
Notas de R$ 5,00: 1
Notas de R$ 2,00: 1
Notas de R$ 1,00: 0

```

package lista3;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o valor da compra: R$");
			float valor_compra = read.nextFloat();
		System.out.print("Informe o valor do pagamento: R$");
			float valor_pago = read.nextFloat();
			
		float troco = valor_pago - valor_compra;
			
		if (valor_pago < valor_compra) {
			System.out.print("ERRO! O valor pago é insuficiente para finalização da compra.");
		}
		else {
		
			float troco1 = troco;
			int nota50 = (int) (troco1 / 50);
	            troco1 %= 50;

	        int nota20 = (int) (troco1 / 20);
	            troco1 %= 20;

	        int nota10 = (int) (troco1 / 10);
	            troco1 %= 10;

	        int nota5 = (int) (troco1 / 5);
	            troco1 %= 5;

	        int nota2 = (int) (troco1 / 2);
	            troco1 %= 2;

	        int moeda1 = (int) (troco1);
	        
	        System.out.println("Troco: R$" + troco);
	        System.out.println("Notas de R$50,00: " + nota50);
            System.out.println("Notas de R$20,00: " + nota20);
            System.out.println("Notas de R$10,00: " + nota10);
            System.out.println("Notas de R$5,00: " + nota5);
            System.out.println("Notas de R$2,00: " + nota2);
            System.out.println("Moedas de R$1,00: " + moeda1);
		}
	}
}

```

### 3. Escreva um algoritmo que resolva uma equação de segundo grau, realizando a verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do discriminante (delta).
a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de zero, apresentar a mensagem "Coeficientes informados incorretamente.".

b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero, deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá ser informado o valor da raiz real da equação.

c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta equação não possui raízes reais".

d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas raízes reais iguais. " e informar o valor das raízes da equação.

e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação possui duas raízes reais diferentes. " e informar o valor das raízes da equação.

```

package lista3;
import java.util.Scanner;
public class exercicio3 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o coeficiente a: ");
			int a = read.nextInt();
		System.out.print("Informe o coeficiente b: ");
			int b = read.nextInt();
		System.out.print("Informe o coeficiente c: ");
			int c = read.nextInt();
			
		double delta = Math.pow(b, 2) - (4 * a * c);
			
		if (a == 0 && b == 0 && c!= 0) {
			System.out.print("Coeficientes informados incorretamente.");
		}
		else if (a == 0 && b != 0) {
			System.out.println("Essa é uma equação de 1° grau.");
			
			float raiz_real = -(c)/b;
			
			System.out.printf("A raíz real desta equação é igual a %f.", raiz_real);
		}
		else if(delta < 0) {
			System.out.print("Esta equação não possui raízes reais.");
		}
		else if (delta == 0) {
			System.out.println("Esta equação possui duas raízes reais iguais.");
			double x = -(b)/(2*a);
			System.out.printf("A raíz real desta equação é igual a %f.", x);
		}
		else {
			System.out.println("Esta equação possui duas raízes reais diferentes.");
			double x1 = (-(b) + Math.sqrt(delta))/(2*a);
			double x2 = (-(b) - Math.sqrt(delta))/(2*a);
			System.out.printf("As raízes reais desta equação são %f e %f.", x1, x2);
		}
	}

}

```

### 4. Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o primeiro valor lido seja:
a. 1: calcular e imprimir o perímetro do círculo.

b. 2: calcular e imprimir a área do círculo.

c. 3: calcular e imprimir o volume da esfera.

Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma mensagem de erro, informando que o código da operação é inválido.

```

package lista3;
import java.util.Scanner;
public class exercicio4 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Selecione uma opção, sendo elas: ");
		System.out.println("1. Calcular o perímetro do círculo");
		System.out.println("2. Calcular a área do círculo");
		System.out.println("3. Calcular o volume da esfera");
			int opcao = read.nextInt();
		
			switch (opcao) {
			case 1:
				System.out.print("Informe o raio do círculo: ");
				int raio = read.nextInt();
				double perimetro = 2 * Math.PI * raio;
				System.out.printf("O perímetro do círuclo equivale a %.2f.", perimetro);
				break;
			case 2:
				System.out.print("Informe o raio do círculo: ");
				int raio1 = read.nextInt();
				double area = Math.PI * Math.pow(raio1, 2);
				System.out.printf("A área do círuclo equivale a %.2f.", area);
				break;
			case 3:
				System.out.print("Informe o raio do círculo: ");
				int raio2 = read.nextInt();	
				double volume = (4 * Math.PI * Math.pow(raio2, 3))/3;
				System.out.printf("O volume da esfera equivale a %.2f.", volume);
				break;
			default:
				System.out.print("CÓDIGO DA OPERAÇÃO INVÁLIDO!");
		}
	}

}

```

### 5. Escrever um algoritmo que leia a partir do teclado dois números reais e um dos símbolos de operação: + , - , * , / ou ^ . O algoritmo deve retornar o resultado da operação. Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo deve apresentar uma mensagem de erro, informando que o símbolo da operação é inválido.

```

package lista3;
import java.util.Scanner;
public class exercicio5 {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o 1° número: ");
			double n1 = read.nextDouble();
		System.out.print("Informe o 2° número: ");
			double n2 = read.nextDouble();
		System.out.print("Selecione a natureza da operação, sendo + (soma), - (substração), * (multiplicação), / (divisão) e ^ (potenciação): ");
			String opcao = read.next();
		
		if (opcao.equals("+")) {
			double resultado_soma = n1 + n2;
			System.out.printf("%f + %f = %.1f", n1, n2, resultado_soma);
		}
		else if (opcao.equals("-")) {
				double resultado_substracao = n1 - n2;
				System.out.printf("%f - %f = %.1f", n1, n2, resultado_substracao);
		}
		else if (opcao.equals("*")) {
			double resultado_multiplicacao = n1 * n2;
			System.out.printf("%f x %f = %.1f", n1, n2, resultado_multiplicacao);
		}
		else if (opcao.equals("/")) {
			double resultado_divisao = n1 / n2;
			System.out.printf("%f / %f = %.1f", n1, n2, resultado_divisao);
		}
		else if (opcao.equals("^")) {
			double resultado_pow = Math.pow(n1, n2);
			System.out.printf("%f ^ %f = %.1f", n1, n2, resultado_pow);
		}
		else {
			System.out.print("Operação inválida!");
		}
	}
}

```

### 6. Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo teclado, para que independente da ordem que o usuário digite os números, consiga
realizar o sorteio. Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e que ele é um número ímpar.

```

package lista3;
import java.util.Scanner;
import java.util.Random;
public class exercicio6 {
	
	public static void main(String[] args) {
	    Random aleatorio = new Random();
	    Scanner read = new Scanner(System.in);
		    System.out.print("Digite o primeiro número: ");
		        int n1 = read.nextInt();
		    System.out.print("Digite o segundo número: ");
		        int n2 = read.nextInt();
		
		    int maiorNum = Math.max(n1, n2);
		    int menorNum = Math.min(n1, n2);
		
		    int numAleatorio = aleatorio.nextInt(menorNum, maiorNum + 1);
		    System.out.println("Número gerado aleatoriamente: " + numAleatorio);
		    
		    if (numAleatorio % 2 == 0){
		        System.out.print("O número gerado é par!");
		    }
		    else {
		        System.out.print("O número gerado é ímpar!");
		    }
	}
}

```

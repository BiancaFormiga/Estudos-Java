package Lista1;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Iterator;

public class Questoes {


	public static void q1() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o ano que vc nasceu? ");
		int anoNascimento = teclado.nextInt();
		
		LocalDate agora = LocalDate.now();
		int idade = agora.getYear() - anoNascimento;
		
		System.out.println("Voce tem " + idade + " anos");	
	}
	
	public static void q2() {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = teclado.nextInt();
		int resul = num1 + num2;
		System.out.println("A soma dos numeros eh: " + resul);
	}
	
	public static void q3 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite sua primeira nota: ");
		float nota1 = teclado.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		float nota2 = teclado.nextFloat();
		System.out.println("Digite sua terceita nota: ");
		float nota3 = teclado.nextFloat();
		System.out.println("Digite sua quarta nota: ");
		float nota4 = teclado.nextFloat();
		float media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua media eh: " + media);
		
	}
	
	public static void q4 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o valor em centimetros: ");
		float x = teclado.nextFloat();
		float y = x/100;
		System.out.println("O valor em metros eh: " + y);
		
	}
	
	public static void q5 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qual o valor do raio do circulo? ");
		float raio = teclado.nextFloat();
		double area = Math.PI * (raio*raio);
		area = Math.round(area);
		System.out.println("A area do circulo eh aproximadamente: " + area);
	}
		
	public static void q6 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qual o valor da altura do quadrado? ");
		float altura = teclado.nextFloat();
		float area = altura*altura;
		float dobroArea = 2 * area;
		System.out.println("O valor do area do quadrado eh: " + area + ". E o dobro da area eh: " + dobroArea);
	}
		
	public static void q7 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Quanto voce ganha por hora? digite o valor em reais. ");
		float valorHora = teclado.nextFloat();
		System.out.println("Agora digite a quantidade de horas trabalhadas no mes: ");
		int valorTrabalho = teclado.nextInt();
		float salario = valorHora * valorTrabalho;
		System.out.println("Seu salario esse mes será: " + salario + " reais.");
		
	}
	
	public static void q8 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		int F = teclado.nextInt();
		int C = 5 * ((F-32)/9);
		System.out.println("A temperatura em Celsius eh: " + C);
	}
		
	public static void q9 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		int C = teclado.nextInt();
		double F =  (C*1.8) + 32;
		System.out.println("A temperatura em Fahrenheit eh: " + F);
	}
	
	public static void q10 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o primeiro numero inteiro: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int num2 = teclado.nextInt();
		System.out.println("Digite um numero real: ");
		float numReal = teclado.nextFloat();
		int result1 = (num1*2) * (num2/2);
		float result2 = (num1*3) + numReal;
		double result3 = Math.pow (numReal,3);
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + result1);
		System.out.println("a soma do triplo do primeiro com o terceiro: " + result2);
		System.out.println("o terceiro elevado ao cubo: " + result3);
		
	}
	
	public static void q11 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite sua altura: ");
		float altura = teclado.nextFloat();
		float pesoIdeal = (float)(72.7 * altura)- 58;
		pesoIdeal = Math.round(pesoIdeal);
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		
	}

	public static void q12() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite 'M' se voce for Mulher ou 'H'se voce for homem: ");
		char sexo = teclado.next().charAt(0);
		
		if (sexo == 'M' || sexo == 'm') {
			System.out.println("Digite sua altura: ");
			double altura = teclado.nextDouble();
			double pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		}
		
		else if (sexo == 'H' || sexo == 'h') {
			System.out.println("Digite sua altura: ");
			double altura = teclado.nextDouble();
			double pesoIdeal = ((72.7 * altura) - 58);
			System.out.println("Seu peso ideal é: " + pesoIdeal);
			
		}
		else {
			System.out.println("Opcao invalida");
			
		}
		
		teclado.close();
		
	}
	
	public static void q13 () {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Quantos quilos de peixes voce vai cadastrar? ");
		int quantidade = teclado.nextInt();
		if (quantidade > 50) {
			int excesso = quantidade - 50;
			int multa = excesso * 4;
			System.out.println("Voce passou " + excesso + " quilos. E precisa pagar " + multa + " reais em multa." );
			
		}
		else {
			System.out.println("Voce esta dentro do permitido e nao vai precisar pagar execsso.");
		}
	}
	
	public static void q14() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ïnsira a quantidade de metros quadrados: ");
		int mtQ = sc.nextInt();
		int qntLitros = mtQ / 3;
		double qntLatas = Math.ceil(qntLitros/18.0);
		System.out.println("Voce precisa comprar " + qntLatas + " latas de tinta.");
		System.out.println("O preco total eh: R$ " + (qntLatas*89));
	
	}
	
	public static void q15() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Qual o tamanho do arquivo para download? ");
		int tamanho = teclado.nextInt();
		System.out.println("Qual a velocidade de download? em Mbps: ");
		int velocidade = teclado.nextInt();
		int downl = tamanho/velocidade;
		System.out.println("Seu arquivo sera baixado em aproximadamente " + downl + " minutos.");
	}
}




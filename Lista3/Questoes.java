package Lista3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questoes {
	
	public static void q1 () {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantas notas serão utilizadas para calcular a media: ");
		int qtdNotas = teclado.nextInt();
		
		float [] notas = new float [qtdNotas];
		
		for(int i = 0; i<notas.length; i++) {
			System.out.printf ("Digite sua %d nota: ", i+1);
			notas [i] = teclado.nextFloat();
		}
		
		float somaNotas = 0;
		for (int i = 0; i< notas.length; i++) {
			somaNotas += notas [i];
		}
		
		float media = somaNotas/(notas.length);
		
		System.out.println("A sua média é: " + media);
		
		teclado.close();
		
		
	}
	
	public static void q2() {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] numero = new int [5];
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0 ; i < numero.length; i++) {
			
			System.out.printf ("Digite o %d numero: ", i+1);
			numero [i] = teclado.nextInt();
						
			if (numero [i] < menor) {
				menor = numero [i];
			}
			
			if (numero [i] > maior) {
				maior = numero [i];
			}
			
			
		}
		
		System.out.printf ("O maior numero foi %d e o menor numero foi %d.", maior, menor);
		
	}
	
	public static void q3 () {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] numero = new int [5];
		
		for (int i = 0 ; i < numero.length; i++) {
			
			System.out.printf ("Digite o %d numero: ", i+1);
			numero [i] = teclado.nextInt();
			
		}
		
		Arrays.sort(numero); // array em ordem crescente
		
		int segundoMaior = numero[numero.length -2];
		
		System.out.print (segundoMaior);
		
	}
	
	public static void q4 () {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] x = new int [5];
		int [] y = new int [5];
		
		for (int i = 0; i < x.length; i++) {
			System.out.printf("Digite o %d elemento do array x: ", i+1);
			x [i] = teclado.nextInt();
			y [i] = x[i];
			
		}
		
		System.out.println("Os valores do array Y são: ");
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
			
	}
	

	
	public static void q5 () {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] x = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Digite o valor que deseja pesquisar: ");
		int elemento = teclado.nextInt();
		
		boolean encontrado = false;
		
		
		for (int z : x) {
			
			if(elemento == z) {
				
				encontrado = true;
				break;
				}
					
			}
		
		if (encontrado) {
			System.out.println("Esse valor está no array.");
				
		}
		
		else {
			System.out.println("Esse valor não está no array.");
		}

	}
	
	public static void q6 () {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] x = new int [5];
		int [] y = new int [5];
		
		for (int i = 0; i < x.length; i++) {
			System.out.printf("Digite o %d elemento do array x: ", i+1);
			x [i] = teclado.nextInt();
			
		}
		
		int j = 0;
		
		for (int i = x.length-1; i >= 0; i--) {
			y[j] = x [i];
			j++;
		}
		
		System.out.println("Os valores do array Y são: ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
			
	}
	
	public static void q7() {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] x = new int [5];
		
		for (int i = 0; i < x.length; i++) {
			System.out.printf("Digite o %d elemento do array x: ", i+1);
			x [i] = teclado.nextInt();
			
		}
		
		int duplicado = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j< x.length; j++) {
				if (x[i] == x[j]) {
					duplicado++;
				}
			}
		}
		
		System.out.println("O numero de elementos duplicados é: " + duplicado);
		
	}

		
	public static void q8 () {
		
		int [][] matriz = new int [2][2];
		int [][] segundaMatriz = new int [2][2];
		
		Scanner teclado = new Scanner (System.in);
		
		for(int i = 0; i<2; i++) {    
			for(int j=0; j<2; j++) {   
				
				System.out.printf("Insira o valor para a linha %d e coluna %d da primeira matriz: ", i, j);
				matriz [i][j] = teclado.nextInt();
				}
		}
		
		for(int i = 0; i<2; i++) {    
			for(int j=0; j<2; j++) {   
				
				System.out.printf("Insira o valor para a linha %d e coluna %d da segunda matriz: ", i, j);
				segundaMatriz [i][j] = teclado.nextInt();
				}
			}
		
		boolean matrizIgual = false;
		
		if (matriz.length == segundaMatriz.length ) {
			 for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 2; j++) {
	                	
	                    if (matriz[i][j] == segundaMatriz[i][j]) {
	                    	matrizIgual = true;
	                        break; 
	                    }
	               }
	          }
		}

		
		if (matrizIgual) {
			System.out.println("Matrizes Iguais");
		}
		else {
			System.out.println("Matrizes diferentes");
		}
	}
		
	public static void q9() {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite o tamanho da primeira matriz: ");
		int a = teclado.nextInt();	
		int b = teclado.nextInt();
		
		System.out.println("Digite o tamanho da segunda matriz: ");
		int c = teclado.nextInt();	
		int d = teclado.nextInt();
		
		int [][] matriz = new int[a][b]; 
		int [][] segundaMatriz = new int [c][d];
		
		if (a == d) {
			System.out.println("As duas matrizes podem multiplicar");
			
			for(int i = 0; i<a; i++) {    
				for(int j=0; j<b; j++) {   
					
					System.out.printf("Insira o valor para a linha %d e coluna %d da primeira matriz: ", i, j);
					matriz [i][j] = teclado.nextInt();
					}
			}
			
			for(int i = 0; i<c; i++) {    
				for(int j=0; j<d; j++) {   
					
					System.out.printf("Insira o valor para a linha %d e coluna %d da segunda matriz: ", i, j);
					segundaMatriz [i][j] = teclado.nextInt();
					}
				}
		
			int [][] matrizResultado = new int [a][d];
			
			for (int i = 0; i < a ; i++) {
				for (int j = 0; j < d; j++) {
					for (int k = 0; k < b; k++) {
		                matrizResultado[i][j] += matriz[i][k] * segundaMatriz[k][j];
		            }
				}
			}
			
			System.out.println("Matriz Resultado:");
		    for (int i = 0; i < a; i++) {
		        for (int j = 0; j < d; j++) {
		            System.out.print(matrizResultado[i][j] + " ");
		        }
		        System.out.println();
			
		    }
		   
		}
		
		else {
			System.out.println("As duas matrizes não podem multiplicar");
		}
		
		
	
		
	}	
		
		public static void q10() {
			
			ArrayList <String> nomes = new ArrayList <String> ();
			nomes.add("ana");
			nomes.add("bianca");
			nomes.add("carol");
			
			ArrayList <String> novosNomes = new ArrayList <String> ();
			novosNomes.addAll(nomes);
			
			System.out.println(novosNomes);
			
		}
		
		
		public static void q11() {
			
			Scanner teclado = new Scanner (System.in);
			
			ArrayList <String> nomes = new ArrayList <String> ();
			nomes.add("ana");
			nomes.add("bianca");
			nomes.add("carol");
			
			System.out.println("Digite um nome: ");
			String elemento = teclado.next();
			
			boolean encontrado = nomes.contains(elemento);

			
			if (encontrado) {
				System.out.println("Esse nome está no arrayList.");
					
			}
			
			else {
				System.out.println("Esse nome não está no arrayList.");
			}
		}
		
		public static void q12 () {
			
			ArrayList <Integer> numeros = new ArrayList <Integer> ();
			numeros.add(1);
			numeros.add(2);
			numeros.add(3);
			numeros.add(4);
			numeros.add(5);
			
			Collections.reverse(numeros);
			
			System.out.println("Valores invertidos: ");
			System.out.println(numeros);
			
		}
		
		public static void q13() {

			Scanner teclado = new Scanner(System.in);
			
			ArrayList <String> nomes = new ArrayList <String> ();
			nomes.add("ana");
			nomes.add("bianca");
			nomes.add("carol");
			
			System.out.println("Digite o nome para saber o index: ");
			String elemento = teclado.next();
			
			int indice = nomes.indexOf(elemento);
			
			if (indice != -1) {
	            System.out.println("O índice do nome \"" + elemento + "\" é: " + indice);
	        } else {
	            System.out.println("O nome \"" + elemento + "\" não está presente na lista de nomes.");
	        }
			
		}
		
		public static void q14() {
			
			ArrayList <String> nomes = new ArrayList <String> ();
			nomes.add("ana");
			nomes.add("bianca");
			nomes.add("carol");
			
			nomes.clear();
			
			System.out.println("ArrayList com todos os elementos removidos: " + nomes);
			
		}
		
		public static void q15() {
			
			Scanner teclado = new Scanner (System.in);
			
			ArrayList <String> nomes = new ArrayList <String> ();
			nomes.add("ana");
			nomes.add("bianca");
			nomes.add("carol");
			nomes.add("daniela");
			nomes.add("bianca");
			nomes.add("erica");
			nomes.add("ana");
			nomes.add("bianca");
			
			System.out.println("Digite um nome do ArrayList: ");
			String elemento = teclado.next();
			
			int indice = nomes.indexOf(elemento);
			
			int contador = 0;
			
			for(String nome : nomes) {
				if(elemento.equals(nome)) {
					contador++;
				}
			}
			
			System.out.println("Número de ocorrências do nome " + elemento + ": " + contador);
			
		}
}

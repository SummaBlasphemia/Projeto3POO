import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		final int TAM = 5;
		int[] numeros = new int [TAM];
		int soma = 0, maiorNum = 0, menorNum = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = leitor.nextInt();
			soma += numeros[i];
			
			if(i == 0) {
				maiorNum = numeros[i];
				menorNum = numeros[i];
			}
			
			else if(numeros[i] <= maiorNum) {
				maiorNum = numeros[i];
			}
			
			else if(numeros[i] >= menorNum) {
				menorNum = numeros[i];
			}
		}
		
		double media = soma / (float)TAM;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Menor Numero: " + maiorNum);
		System.out.println("Maior Numero: " + menorNum);
		
		leitor.close();
	}
}

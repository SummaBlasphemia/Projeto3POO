import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int[][] matriz = new int [2][2];
		
		int soma = 0;
		int maior = 0;
		int menor = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Digite um numero para a matriz: ");
				
				matriz[i][j] = leitor.nextInt();
				
				soma += matriz[i][j];
				
				if(i == 0 && j == 0) {
					maior = matriz[i][j];
					menor = matriz[i][j];
				}
				else if(matriz[i][j] >= maior) {
					maior = matriz[i][j];
				}
				
				else if(matriz[i][j] <= menor) {
					menor = matriz[i][j];
				}
				
				System.out.println("Menor: " + menor);
				System.out.println("Maior: " + maior);
			}
		}
		
	}
}

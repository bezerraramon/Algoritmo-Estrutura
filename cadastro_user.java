

import java.util.Scanner;

//insertion sort
public class cadastro_user {

	public static void main(String[] args) {
		
		int n = 0;
		int aux = 0;
		int s = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o tamanho do vetor?");
		n = input.nextInt();

		int Vetor[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Qual o número da posição " + i + "?");
			Vetor[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Numeros Vetor antes:" + Vetor[i]);
		}
		
		for(int i=1; i < n; i++){
			int eleito = Vetor[i];
			int j=i;
			while(j > 0 && eleito > Vetor[j-1]) {
				Vetor[j] = Vetor [j-1];
				j--;
			}
		Vetor[j] = eleito;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Numeros Vetor depois:" + Vetor[i]);
		}
	}
}

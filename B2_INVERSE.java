import java.util.Scanner;

public class B2_INVERSE {

	public static void main(String[] args) {

		Scanner armazenarInteiros = new Scanner(System.in);

		System.out.println("Digite o número de posições do vetor: ");
		int numDePos = armazenarInteiros.nextInt();
		int numDaPos[] = new int[numDePos];

		for (int i = 0; i <= numDePos - 1; i++) {
			System.out.println("Digite o número para a posição: " + i);
			numDaPos[i] = armazenarInteiros.nextInt();
		}
		for (int j = 0; j <= numDePos - 1; j++) {
			for (int k = 0; k < numDePos - 1; k++) {
				if (numDaPos[k] < numDaPos[k + 1]) { //alterar de > para < para a a ordem decrescente
					int posTemp = numDaPos[k];
					numDaPos[k] = numDaPos[k + 1];
					numDaPos[k + 1] = posTemp;
				}
			}
		}

		for (int i = 0; i <= numDePos - 1; i++) {
			System.out.println("O valor da posição " + i + " é igual a: " + numDaPos[i]);
		}
	}

}

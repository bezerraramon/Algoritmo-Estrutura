import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {

		Scanner armazenarInteiros = new Scanner(System.in);

		System.out.println("Digite o n�mero de posi��es do vetor: ");
		int numDePos = armazenarInteiros.nextInt();
		int numDaPos[] = new int[numDePos];

		for (int i = 0; i <= numDePos - 1; i++) {
			System.out.println("Digite o n�mero para a posi��o: " + i);
			numDaPos[i] = armazenarInteiros.nextInt();
		}
		for (int j = numDePos-1; j >= 0; j--) {
			for (int k = numDePos-1; k > 0; k--) {
				if (numDaPos[k] > numDaPos[k - 1]) {
					int posTemp = numDaPos[k];
					numDaPos[k] = numDaPos[k - 1];
					numDaPos[k - 1] = posTemp;
				}
			}
		}

		for (int i = 0; i <= numDePos - 1; i++) {
			System.out.println("O valor da posi��o " + i + " � igual a: " + numDaPos[i]);
		}
	}

}

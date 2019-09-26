import java.util.Scanner;

public class cadastro_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cadastro_funcionario = new Scanner(System.in);

		System.out.println("Digite o número de funcionarios: ");
		int num_func = cadastro_funcionario.nextInt();
		int numDaPos[] = new int[num_func];

		for (int i = 0; i <= num_func - 1; i++) {
			System.out.println("Digite o número para a posição: " + i);
			numDaPos[i] = cadastro_funcionario.nextInt();

		}

	}
}
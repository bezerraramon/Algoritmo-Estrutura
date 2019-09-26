import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y[] = new int[5];
		int n, i, aux, posTemp;
		Scanner insert = new Scanner(System.in);

		for (i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			y[i] = insert.nextInt();
		}
		n = 1;
		posTemp = 1;
		while (n <= 5 && posTemp == 1) {
			posTemp = 0;
			for (i = 0; i <= 3; i++) {
				if (y[i] < y[i + 1]) {
					posTemp = 1;
					aux = y[i];
					y[i] = y[i + 1];
					y[i + 1] = aux;
				}
			}

			n = n + 1;
		}
		for (i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "° número: " + y[i]);
		}
	}
}

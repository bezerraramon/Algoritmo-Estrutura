
public class Merge_Sort_Inverse {

	public static void main(String[] args) {
		int v[] = { 6, 8, 4, 5, 3, 2 };

		separa(v, 0, v.length-1);

		for (int a : v)
			System.out.println(a);

	}

	public static void separa(int[] vetor, int i, int f) {
		if (f > i) {
			int meio = (i + f) / 2;
			separa(vetor, i,meio);
			separa(vetor, meio+1, f);
			junta(vetor, i, meio, f);
		}
	};

	public static void junta(int [] v, int i, int m, int f) {
		int PL, P1, P2;
		int[] copia = new int[f+1];
		PL=i;
		P1=i;
		P2=m+1;
		while(P1 <= m && P2 <= f) {
			if(v[P1] <= v[P2]) {
				copia[PL] = v[P1];
				P1++;
			} else {
				copia[PL] = v[P2];
				P2++;
			}
			PL++;
		}
		
		while(P2 <= f) {
			copia[PL] = v[P2];
			P2++;
			PL++;
		}
		
		while(P1 <= m) {
			copia[PL] = v[P1];
			P1++;
			PL++;
		}
		
		for(int k = i; k<=f; k++) {
			v[k] = copia[k];
		}
	};

}
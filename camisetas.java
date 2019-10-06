import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTeste = sc.nextInt();
		while (numTeste >0) {
			ArrayList<String> brancoP = new ArrayList<>();
			ArrayList<String> brancoM = new ArrayList<>();
			ArrayList<String> brancoG = new ArrayList<>();
			ArrayList<String> vermelhoP = new ArrayList<>();
			ArrayList<String> vermelhoM = new ArrayList<>();
			ArrayList<String> vermelhoG = new ArrayList<>();
			sc.nextLine();
			for (int i = 0; i < numTeste; i++) {
				String nome = sc.nextLine();
				String cor = sc.next();
				String tam = sc.next();
				sc.nextLine();
				if (cor.equals("branco") && tam.equals("P")) {
					brancoP.add(nome);
				} else if (cor.equals("branco") && tam.equals("M")) {
					brancoM.add(nome);
				} else if (cor.equals("branco") && tam.equals("G")) {
					brancoG.add(nome);
				} else if (cor.equals("vermelho") && tam.equals("P")) {
					vermelhoP.add(nome);
				} else if (cor.equals("vermelho") && tam.equals("M")) {
					vermelhoM.add(nome);
				} else if (cor.equals("vermelho") && tam.equals("G")) {
					vermelhoG.add(nome);
				}
			}

			print("branco P", brancoP);
			print("branco M", brancoM);
			print("branco G", brancoG);
			print("vermelho P", vermelhoP);
			print("vermelho M", vermelhoM);
			print("vermelho G", vermelhoG);
			
			numTeste = sc.nextInt();
			if(numTeste >0)
					System.out.println();
		}
	}

	public static void print(String corTam, ArrayList<String> lista) {
		if (!lista.isEmpty()) {
			Collections.sort(lista);
			for (String nome : lista) {
				System.out.println(corTam + " " + nome);
			}
		}
	}
}

package exercice57;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nbFin = 0;
		int nbActuel = 0;

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		do {
			System.out.println("Saisissez un chiffre, pour finir tapez 0");
			nbActuel = sc.nextInt();
			if (nbActuel == 0)
				break;
			if (nbFin != nbActuel) {
				l1.add(nbActuel);
			}
			nbFin = nbActuel;
		} while (true);
		do {
			System.out.println("Saisissez un chiffre, pour finir tapez 0");
			nbActuel = sc.nextInt();
			if (nbActuel == 0)
				break;
			if (nbFin != nbActuel) {
				l2.add(nbActuel);
			}
			nbFin = nbActuel;
		} while (true);
		if (l1.size() != 0) {
			for (int i : l1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		if (l2.size() != 0) {
			for (int i : l2) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		if (l1.size() == 0 && l2.size() == 0) {
			System.out.println("vide");
			System.exit(0);
		} else {
			for (int i : l2)
				if (!l1.contains(i))
					l1.add(i);
		}
		for (int i : l1) {
			System.out.print(i + " ");
		}
	}

}

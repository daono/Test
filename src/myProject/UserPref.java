package myProject;

import java.util.Scanner;

public class UserPref {


	private boolean est_droit = false;
	private String position;
	private int nb_livre;
	Scanner sc = new Scanner(System.in);

	public void position_livre(Livre livre) {
		do {
			System.out.println("Position du livre ?");
			System.out.println("*******************Choix********************");
			System.out.println("d: droit           o: incliné");
			System.out.println("Entrez le caractère d/o pour enregistrer votre choix");
			position = sc.nextLine();
		}while (position !="d" || position !="o");

		if(position == "d") { 
			est_droit = true;
		}
		System.out.println("Vous avez saisi : " + position);
	}
	
	public void nb_livre() {
		System.out.println("Combien de livres désirez-vous par étagère?");
		nb_livre = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " + nb_livre);
	}
	
	
}

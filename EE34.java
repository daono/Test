import java.util.Scanner;

public class EE34 {
	public static void main (String[] args) {
		Scanner phrase;
		phrase = new Scanner (System.in);
		System.out.println("Veuillez saisir votre phrase");	
		String st= phrase.nextLine();
		String [] sentence= st.split("\\W+");
		phrase.close();
		for (int i = 0; i < sentence.length; i++ ) {
			System.out.println(sentence[i]);
		}
		
	}

}

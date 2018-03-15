package myExo4.three;
public class EE43 {
	public static void main (String [] args) {
		int numberOfRolls; 
	    numberOfRolls = rollFor (2);
		System.out.println("Il a fallu " + numberOfRolls + " pour obtenir des yeux de serpent.");
}
	public static int rollFor (int N) {
	    if (N <2 || N> 12)
	       throw new IllegalArgumentException ("Total impossible pour une paire de dés.");
	    int d1, d2;
	    int roll; 
	    int Ctroll; 
	    Ctroll = 0;
	    do {
	       d1 = (int) (Math.random () * 6) + 1;
	       d2 = (int) (Math.random () * 6) + 1;
	       roll = d1 + d2;
	       Ctroll ++;
	    } while (roll!= N);
	    return Ctroll;
	}
}
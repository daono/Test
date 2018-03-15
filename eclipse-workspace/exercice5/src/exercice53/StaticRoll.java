package exercice53;

/**
 * dice: une paire des d�s
 * 
 * @author Julia
 *
 */
public class StaticRoll {
	static final int NbExperiments = 10000; // nombre total d'exp�riences
	private static PairOfDice dice = new PairOfDice();


	static int rollFor(int N) {
		int roller = 0; //Nombre de fois qu'on roule les d�s
		do {
			dice.roll();
			roller++;
		} while (dice.getTotal() !=N);//Lancer tant que c'est diff�rent du total
		return roller;
	}
	
	public static void main(String[] args) {

		System.out.println("Total des d�s   Moyenne des lancers  L'�cart-type  Le maximum de lancer");
		for (int total = 2; total <= 12; total++) {
			StatCalc stats= new StatCalc();
			for (int i = 0; i < NbExperiments; i++) {
				stats.enter(rollFor(total));
			}
			System.out.printf("%6d", total);
			System.out.printf("%18.3f", stats.getMean());
			System.out.printf("%19.3f", stats.getStandardDeviation());
			System.out.printf("%14.3f", stats.getMax());
			System.out.println();
		}
	}


}
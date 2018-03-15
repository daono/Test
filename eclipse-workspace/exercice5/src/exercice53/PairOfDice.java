package exercice53;
/**
 * die1: le premier dé
 * die2: le 2ème dé
 * @author Julia
 *
 */
/**
 * @author Julia
 *
 */
public class PairOfDice {
	private int die1; 
	private int die2;
	
	public int getDie1() {
		return die1;
	}
	public void setDie1(int die1) {
		this.die1 = die1;
	}
	public int getDie2() {
		return die2;
	}
	public void setDie2(int die2) {
		this.die2 = die2;
	}
	public void roll () {
		die1 = (int)(1+ 6*Math.random());
		die2 = (int)(1+ 6*Math.random());
	}
	public int getTotal () {
		return die1 + die2;
	}
}

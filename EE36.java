import java.util.ArrayList;

public class EE36 {
	public static void main (String [] args) {
		ArrayList<Integer> max= new ArrayList<Integer>();
		int count=nbdiv(1);
		for (int i=1 ; i <= 10000; i++) {
			if (nbdiv(i)>count) {
				count=nbdiv(i);
			}
		}
		for (int i= 1; i <= 10000; i++) {
			if (nbdiv (i)==count ) max.add(i);
		}
		System.out.println ("Among integers between 1 and 10000,\n" + "The maximum number of divisors was " + count + "\nNumbers with that many divisors include:" + max);
	}
	
	public static int nbdiv(int n) {
		int count=0;
		for (int i = 1 ; i <= 10000; i++) 
			if (n%i==0) count++;
		
		return count;
	}
}
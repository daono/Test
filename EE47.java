import java.util.Scanner;

public class EE47 {
	 private static int[] nbre1;
     private static int[] nbre2;
     private static int[] result;
     
     public static void main(String[] args) {
             int size = 10;
             nbre1 = new int[size];
             nbre2 = new int[size];
             result = new int[size];
             generateQuizz(size);
             quizz(size);
             grade(size);
     }
     
     public static void generateQuizz(int size)
     {
                     for(int i = 0; i<size; i++)
                     {
                             nbre1[i] = (int)(Math.random()*50+1);
                             nbre2[i] = (int)(Math.random()*50+1);
                             result[i] = 0;
                     }
     
     }
     
     public static void quizz(int size)
     {
             Scanner r = new Scanner(System.in);
             System.out.println("Bienvenue à l'évaluation");
             for(int i = 0; i<size; i++)
             {
                     System.out.println("Question " +(i+1) + " : "+nbre1[i]+" + "+nbre2[i]+ " = ?");
                     result[i] = Integer.parseInt(r.nextLine());
                     
                     if(result[i] == nbre1[i] + nbre2[i])
                     {
                             System.out.println("Bonne réponse!");
                     }
                     else
                     {
                             System.out.println("Mauvaise réponse! La bonne réponse était : " +(nbre1[i]+nbre2[i]));
                     }
             }
             r.close();
     }
     
     public static void grade(int size)
     {
             int score = 0;
             for(int i = 0; i<size;i++)
             {
                     if(result[i] == nbre1[i] + nbre2[i])
                     {
                             score+=2;
                     }
             }
             
             System.out.println("Vous voilà à la fin de l'évaluation.\n" + "Votre note est de " + score+"/20");
     }
}
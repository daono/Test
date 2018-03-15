package exercice57;

import java.util.Scanner;

/**
 * a et b sont les nombres aléatoires utilisés dans le quiz
 * 
 * @author Julia
 *
 */
public class GeneralQuiz {

	interface IntQuestion {
		public String getQuestion();

		public int getCorrectAnswer();
	}

	static class AdditionQuestion implements IntQuestion {
		private int a, b;

		public AdditionQuestion() { // constructor
			a = (int) (Math.random() * 50 + 1);
			b = (int) (Math.random() * 50);
		}

		public String getQuestion() {
			return "Que donne " + a + " + " + b + " ?";
		}

		public int getCorrectAnswer() {
			return a + b;
		}
	}

	static class SubtractionQuestion implements IntQuestion {
		private int a, b;

		public SubtractionQuestion() {
			a = (int) (Math.random() * 50 + 1);
			b = (int) (Math.random() * 50);
			if (b > a) { // pour ne pas avoir des valeurs négatives
				int temp = a;
				a = b;
				b = temp;
			}
		}

		public String getQuestion() {
			return "What is " + a + " - " + b + " ?";
		}

		public int getCorrectAnswer() {
			return a - b;
		}
	}

	private static IntQuestion[] questions; // les questions du Quiz

	private static int[] answers; // les réponses de l'utilisateur

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to the quiz");
		System.out.println();
		System.out.println("There are some math questions and a few non-math");
		System.out.println("questions, but the answer to every question is");
		System.out.println("an integer.");
		System.out.println();
		createQuiz();
		administerQuiz();
		gradeQuiz();
	}

	private static void createQuiz() {
		questions = new IntQuestion[10];
		for (int i = 0; i < 7; i++) {
			if (Math.random() < 0.5)
				questions[i] = new AdditionQuestion();
			else
				questions[i] = new SubtractionQuestion();
		}
		questions[7] = new IntQuestion() {
			public String getQuestion() {
				return "Combien y a-t-il des lignes de métro?";
			}

			public int getCorrectAnswer() {
				return 15;
			}
		};
		questions[8] = new IntQuestion() {
			public String getQuestion() {
				return "Combien y a-t-il des régions en Ile de France?";
			}

			public int getCorrectAnswer() {
				return 1914;
			}
		};
		questions[9] = new IntQuestion() {
			public String getQuestion() {
				return "What is the answer to the ultimate question " + "of life, the universe, and everything?";
			}

			public int getCorrectAnswer() {
				return 42;
			}
		};
	}

	private static void administerQuiz() {
		answers = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int questionNum = i + 1;
			System.out.printf("Question %2d:  %s ", questionNum, questions[i].getQuestion());
			answers[i] = sc.nextInt();
		}
	}

	private static void gradeQuiz() {
        System.out.println();
        System.out.println("Here are the correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i+1) + ":");
            System.out.println("    " + questions[i].getQuestion());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if ( answers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("    Réponse correcte.");
                numberCorrect++;
            }
            else {
                System.out.println("    Ta réponse: " + answers[i] + ", est incorrecte.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("T'as obtenu " + numberCorrect + " questions correctes");
        System.out.println("Ta note est " + grade);
        System.out.println();
    }

}
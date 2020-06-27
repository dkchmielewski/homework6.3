import java.sql.SQLOutput;
import java.util.Scanner;

public class MathQuiz {
    Scanner scanner = new Scanner(System.in);

    int correctAnswers;
    public boolean question1() {
        System.out.println("3 x 5 = ");
        int i = scanner.nextInt();
        if (i == 15) {
            correctAnswers = 1;
        }
        return i == 15;
    }

    public boolean question2() {
        System.out.println("Podaj pole kwadratu o boku 12: ");
        int i = scanner.nextInt();
        if (i == 144) {
            correctAnswers++;
        }
        return i == 144;
    }

    public boolean question3() {
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        int i = scanner.nextInt();
        if (i == 123) {
            correctAnswers++;
        }
        return i == 123;
    }

    public void showResults(boolean a, boolean b, boolean c) {
        System.out.println("Odpowiedz 1: " + a);
        System.out.println("Odpowiedz 2: " + b);
        System.out.println("Odpowiedz 3: " + c);
    }


    public void correctAnswers() {
        if (correctAnswers == 0) {
            System.out.println("Quiz score: 0/0");
        } else (correctAnswers == 1) {
            System.out.println("Quiz score: " + correctAnswers + " /3");
        }
    }
}


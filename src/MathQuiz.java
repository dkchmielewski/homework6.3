import java.sql.SQLOutput;
import java.util.Scanner;

public class MathQuiz {
    Scanner scanner = new Scanner(System.in);

    public boolean question1() {
        System.out.println("3 x 5 = ");
        int i = scanner.nextInt();
        return i == 15;
    }

    public boolean question2() {
        System.out.println("Podaj pole kwadratu o boku 12: ");
        int i = scanner.nextInt();
        return i == 144;
    }

    public boolean question3() {
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        int i = scanner.nextInt();
        return i == 123;

    }

    public void result(boolean a, boolean b, boolean c) {
        System.out.println("Odpowiedz 1: " + a);
        System.out.println("Odpowiedz 2: " + b);
        System.out.println("Odpowiedz 3: " + c);
    }

}

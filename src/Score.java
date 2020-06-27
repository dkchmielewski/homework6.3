public class Score {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        mathQuiz.showResults(mathQuiz.question1(), mathQuiz.question2(), mathQuiz.question3());

        mathQuiz.correctAnswers();
    }
}

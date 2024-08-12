import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void createQuiz(Scanner scanner) {
        System.out.print("Enter the number of questions you want to add: ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numQuestions; i++) {
            System.out.print("Enter the question: ");
            String questionText = scanner.nextLine();

            System.out.print("Enter the number of options: ");
            int numOptions = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String[] options = new String[numOptions];
            for (int j = 0; j < numOptions; j++) {
                System.out.print("Option " + (j + 1) + ": ");
                options[j] = scanner.nextLine();
            }

            System.out.print("Enter the correct option number: ");
            int correctOption = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            questions.add(new Question(questionText, options, correctOption));
        }
    }

    public void takeQuiz(Scanner scanner) {
        int score = 0;
        for (Question question : questions) {
            question.display();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (question.isCorrect(answer)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong! The correct answer was: " + question.getCorrectOption() + "\n");
            }
        }

        System.out.println("You scored " + score + " out of " + questions.size());
    }
}

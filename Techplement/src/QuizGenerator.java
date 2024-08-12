import java.util.Scanner;
public class QuizGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Quiz Generator!");
            System.out.println("1. Create a quiz");
            System.out.println("2. Take a quiz");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    quiz.createQuiz(scanner);
                    break;
                case 2:
                    quiz.takeQuiz(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}


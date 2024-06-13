package hexlet.code;
import java.util.Scanner;

public class EvenGame {
    public static void main(String userName) {

        int score = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        playGame(userName, score);
    }

    public static int playGame(String userName, int score) {

        Scanner scanner = new Scanner(System.in);

        int minValue = 1;
        int maxValue = 30;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println("Question: " + randomValue);

        // CHECK THE ANSWER
        String correctAnswer = "";
        if (randomValue % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            score++;
            checkScore(userName, score);

        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                    "                     Let's try again, " + userName + "!");
            score = 4;
            checkScore(userName, score);
        }
        return score;
    }

    public static int checkScore(String userName, int score) {

            switch (score) {
                case 1, 2:
                    playGame(userName, score);
                    break;
                case 3:
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                case 4:
                    break;
            }
            return score;
    }
}
package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            Cli.greetings();
        } else if (choice.equals("2")) {
            EvenGame.main(Cli.greetings());
        } else if (choice.equals("0")) {
            System.out.println("Bye!");
        } else {
            System.out.println("Wrong input");
        }
    }
}

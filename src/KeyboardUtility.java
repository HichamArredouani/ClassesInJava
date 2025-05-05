import java.util.Scanner;

public class KeyboardUtility {
        public static int askForInt(String question) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(question);
            int result = scanner.nextInt();
            scanner.nextLine(); // om \n te verwerken
            return result;
        }
}

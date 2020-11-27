import utils.Colors;
import utils.Logger;
import utils.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        promptPassword();

    }

    public static void promptPassword() {
        Scanner scanner = new Scanner(System.in);
        Logger.print(Colors.BLACK_BOLD, "Enter your password >> ");
        String password = new String(scanner.next());
        try {
            Password.validate(password);
        } catch (Exception e) {
            Logger.println(Colors.RED_BOLD, e.getMessage());
            promptPassword();
        }
    }
}
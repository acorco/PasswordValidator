package utils;

public class Logger {
    public static void println(Colors color, String password) {
        System.out.print(color);
        System.out.println(password);
        System.out.print(Colors.RESET);

    }

    public static void print(Colors color, String password) {
        System.out.print(color);
        System.out.print(password);
        System.out.print(Colors.RESET);
    }
}

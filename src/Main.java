import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.print("type something: ");
        String message = scanner.nextLine();
        System.out.printf("you typed %s", message);

    }
}
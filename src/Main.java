
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("usage: myapp <arg1> <arg2>");
            System.exit(1);
        }
// Run the application
        System.out.println("It worked: " + args[0] + ", " + args[1]);
    }
}
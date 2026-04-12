public class HelloApp {
    public static void main(String[] args) {
        // 1. Check for no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // 2. Use String.join() to combine the array with a ", " delimiter
        String joinedNames = String.join(", ", args);

        // 3. Print the final result
        System.out.println("Hello, " + joinedNames + "!");
    }
}
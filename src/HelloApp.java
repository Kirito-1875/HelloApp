public class HelloApp {
	public static void main(String[] args) {
		// Step 1: Check if no arguments are provided
		if (args.length == 0) {
			System.out.println("Hello, World!");
			return; // Exit the program early
		}

		// Step 2: Initialize a StringBuilder for efficient string construction
		StringBuilder nameBuilder = new StringBuilder();

		// Step 3: Use an enhanced for-loop to append names and delimiters
		for (String name : args) {
			nameBuilder.append(name).append(", ");
		}

		// Step 4: Remove the trailing ", " using substring
		// Ensure the builder is not empty to avoid StringIndexOutOfBoundsException
		String finalNames = "";
		if (!nameBuilder.isEmpty()) {
			finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
		}

		// Step 5: Print the final constructed greeting
		System.out.println("Hello, " + finalNames + "!");
	}
}
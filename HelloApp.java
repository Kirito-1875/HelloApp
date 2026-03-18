public class HelloApp{
	public static void main(String[] args){
		String name = "World";
		if (args.length > 0) {
			name = args.join(", ");
		}
		System.out.println("Hello, " + name + "!");
	}
}
import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		// show input field to input a number
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");

		// nextInt() reads the next integer from the keyboard
        	int name = reader.nextShort();		
		
		System.out.println("Hello " + name);
		reader.close();
	}
}

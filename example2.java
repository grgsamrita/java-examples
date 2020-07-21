import java.util.*;

class PrintDifferentScanners {
    int data = 12; // instance variable
    static int data2 = 12; // static variable
    void getInt() {
        int data3 = 45; // local variable - defined inside method only
        System.out.println(data3);
        
    }
    public static void main(String[] args) {
        int data3 = 45; // local variable - defined inside method only
        System.out.println(data3);
        String result3 = data3 > data2 ? "yes" : "no";
        String string = "Hi! Welcome to JAVA code.";
        // create scanner object
        Scanner scan = new Scanner(string);
        System.out.println("Ternary result: " + result3);

        // check if the scanner has a token
        System.out.println("Boolean result: " + scan.hasNext());

        // print the string
        System.out.println("result: " + scan.nextLine());

        scan.close();

        Scanner in = new Scanner (System.in);
        // ask to enter your name
        System.out.print("Enter your name:");

        String name = in.next();

        // ask to enter age
        System.out.print("Enter your age:");

        int age = in.nextInt();

        // ask to enter salary
        System.out.print("Enter your salary:");

        double salary = in.nextDouble();

        // print all the details
        System.out.println("Your name is: " + name);
        System.out.println("Your age is:" + age);
        System.out.println("Your salary is: " + salary);
        in.close();
    }
}
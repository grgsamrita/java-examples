import java.util.Scanner;

class SwitchExample {
    public static void main (String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        
        // switch statement
        switch(number) {
            case 23: System.out.println("it is 23");
            break;

            case 40: System.out.println("it is 40");
            break;
            case 5: System.out.println("it is 5");
            break;

            default:System.out.println("Not 23, 40 or 5. It is " + number);
        }

        // while loop

        int newNum = 1;
        while(newNum <= number) {
            System.out.println("The loop number is less than or equal to " + number);
            newNum++;
        }

         
    }
}
package Day_15;

import java.util.Scanner;

public class OperatorTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        
        
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        
        
        System.out.println("\nRelational Operations:");
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + ": " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + ": " + (num1 <= num2));
        System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));

        
        
        System.out.println("\nLogical Operations:");
        
        System.out.println("(" + num1 + " > 10 AND " + num2 + " < 50): " + (num1 > 10 && num2 < 50));
        System.out.println("(" + num1 + " < 5 OR " + num2 + " > 100): " + (num1 < 5 || num2 > 100));

        
        
        int assignVal = 10;
        System.out.println("\nAssignment Operations:");
        
        System.out.println("Initial value: " + assignVal);
        
        assignVal += num1;
        System.out.println("After += : " + assignVal);
        
        assignVal -= num1;
        System.out.println("After -= : " + assignVal);
        
        assignVal *= num1;
        System.out.println("After *= : " + assignVal);
        
        assignVal /= num1;
        System.out.println("After /= : " + assignVal);
        
        assignVal %= num1;
        System.out.println("After %= : " + assignVal);

        
        
        System.out.println("\nUnary Operations:");
        int unaryVal = num1;
        System.out.println("Initial value: " + unaryVal);
        
        ++unaryVal;
        System.out.println("After increment: " + unaryVal);
        
        --unaryVal;
        --unaryVal;
        System.out.println("After decrement: " + unaryVal);
        
        
        
        System.out.println("\nConditional Operation:");
        
        String result = (num1 % 2 == 0) ? (num1 + " is Even") : (num1 + " is Odd");
        System.out.println(result);

      
    }
}
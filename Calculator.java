import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        char op;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter Operation: ");
        op = sc.next().charAt(0);
        
        if (op=='+'){
            System.out.println("The Addition is: "+(a+b));
        } 
        else if (op=='-'){
            System.out.println("The Subtraction is: "+(a-b));
        } 
        else if (op=='*'){
            System.out.println("The Multiplication is: "+(a*b));
        } 
        else if (op=='/'){
            System.out.println("The division is: "+((float)a/b));
        } 
        else {
            System.out.println("Invalid Operation");
        }
    }
}
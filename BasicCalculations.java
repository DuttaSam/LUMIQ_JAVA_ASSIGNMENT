import java.util.*;
public class BasicCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int sum, average, product;
        int smallest, largest;
    
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();
    
        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;
        smallest = Math.min(Math.min(num1, num2), num3);
        largest = Math.max(Math.max(num1, num2), num3);
    
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
        System.out.println("Product is: " + product);
        System.out.println("Smallest is: " + smallest);
        System.out.println("Largest is: " + largest);
    
      }
    
    
}

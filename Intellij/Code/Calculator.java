import java.util.Scanner;
class Calculator {

    // Method to calculate the sum of two numbers
    public int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    // Method to calculate the difference between two numbers
    public int calculateDifference(int number1, int number2) {
        return number1 - number2;
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner obj = new Scanner(System.in);
        int number1 = obj.nextInt();
        int number2 = obj.nextInt();
        int sum = c.calculateSum(number1,number2);

        System.out.println("Sum: " + sum);
        int difference = c.calculateDifference(number1,number2);

        System.out.println("Difference: " + difference);
    }
}
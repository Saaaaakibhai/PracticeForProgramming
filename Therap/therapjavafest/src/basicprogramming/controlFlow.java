package basicprogramming;

import java.util.Scanner;

public class controlFlow {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double age = input.nextDouble();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x>30){
            System.out.println("Yah it's more than 30 ");
        }else {
            System.out.println("Its less than 30");
        }

    }
}
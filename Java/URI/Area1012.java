import java.io.IOException;
import java.util.Scanner;

public class Area1012 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double A,B,C;
         A =input.nextDouble();
         B =input.nextDouble();
         C =input.nextDouble();
      /*  double TRIANGULO = (double) ((.5) * A * C);
        double CIRCULO = (double) (3.14159 * C * C);
        double TRAPEZIO = (C/2)*(A+B);
        double QUADRADO = B*B;
        double RETANGULO = A * B;*/
        System.out.printf("TRIANGULO: %.3f\n",(A*C)/2);
        System.out.printf("CIRCULO: %.3f\n",C*C*3.14159);
        System.out.printf("TRAPEZIO: %.3f\n",((A+B)/2)*C);
        System.out.printf("QUADRADO: %.3f\n",B*B);
        System.out.printf("RETANGULO: %.3f\n",A*B);
       input.close();
    }
 
}
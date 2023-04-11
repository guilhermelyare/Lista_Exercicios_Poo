import java.util.Scanner;

public class Questão_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, raiz1, raiz2;
        
        System.out.print("Coeficiente a: ");
        a = input.nextDouble();
        
        System.out.print("Coeficiente b: ");
        b = input.nextDouble();
        
        System.out.print("Coeficiente c: ");
        c = input.nextDouble();
        
        delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("A equação não possui raízes.");
        } else if (delta == 0) {
            raiz1 = -b / (2 * a);
            System.out.printf("A equação possui uma raiz: %.2f", raiz1);
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes: %.2f e %.2f", raiz1, raiz2);
        }
    }
}

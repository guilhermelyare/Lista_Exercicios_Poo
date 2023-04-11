import java.util.Scanner;

public class Questão_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDegraus;

        System.out.print("Digite a quantidade de degraus: ");
        numDegraus = input.nextInt();

        for (int i = 1; i <= numDegraus; i++) {
            for (int j = 1; j <= numDegraus - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

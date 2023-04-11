import java.util.Scanner;

public class Questão_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano: ");
        ano = input.nextInt();

        if (ano < 0) {
            System.out.println(ano + " não é um ano válido");
        } else if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
        	System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}

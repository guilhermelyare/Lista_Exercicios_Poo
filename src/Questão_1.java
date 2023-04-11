import java.util.Random;
import java.util.Scanner;

public class Questão_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//O objeto scanner serve para ler os dados digitados pelo usuário
        int num1, num2, num3, menor, qntPares = 0;
        
        System.out.print("Digite um número: ");
        num1 = input.nextInt();
        
        System.out.print("Digite um número: ");
        num2 = input.nextInt();
        
        System.out.print("Digite um número: ");
        num3 = input.nextInt();
        
        if (num1 % 2 == 0) {
        	qntPares++;
            menor = num1;
        } else {
            menor = num1;
        }
        
        if (num2 % 2 == 0) {
        	qntPares++;
            if (num2 < menor) {
                menor = num2;
            }
        } else {
            if (num2 < menor) {
                menor = num2;
            }
        }
        
        if (num3 % 2 == 0) {
        	qntPares++;
            if (num3 < menor) {
                menor = num3;
            }
        } else {
            if (num3 < menor) {
                menor = num3;
            }
        }
        
        Random random = new Random();
        int aleatorio = random.nextInt(11);
        System.out.println(qntPares + " números pares");
        System.out.println("Menor número: " + menor);
        System.out.println("Número aleatório gerado: " + aleatorio);
        
        if (menor % aleatorio == 0) {
            System.out.println("O número aleatório divide " + menor);
        } else {
            System.out.println("O número aleatório não divide " + menor);
        }
    }
}

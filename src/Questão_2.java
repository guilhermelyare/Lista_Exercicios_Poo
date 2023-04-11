import java.util.Scanner;

public class Questão_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.print("Digite a idade: ");
        idade = input.nextInt();
        
        if (idade >= 14 && idade <= 15) {
            System.out.println("Infantil");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 18 && idade <= 20) {
            System.out.println("Júnior");
        } else if (idade > 20) {
            System.out.println("Profissional");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}

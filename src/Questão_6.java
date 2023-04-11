public class Questão_6 {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("Coqueiro", 10, 15, 5.0);

        System.out.println("Nome: " + arvore.getNome());
        System.out.println("Idade: " + arvore.getIdade());
        System.out.println("Idade máxima: " + arvore.getIdadeMaxima());
        System.out.println("Tamanho: " + arvore.getTamanho());

        arvore.envelhecer();
        arvore.envelhecer();
        arvore.envelhecer();
        arvore.envelhecer();
        arvore.envelhecer();
        arvore.envelhecer();
    }
}

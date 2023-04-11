public class Questão_7 {
    public static void main(String[] args) {
        Heroi guerreiro = new Heroi(100, 20, "Hulk", "Heroi verde");
        System.out.println("Nome: " + guerreiro.getNome());
        System.out.println("Vida: " + guerreiro.getVidaAtual() + "/" + guerreiro.getVidaMaxima());
        System.out.println("Magia: " + guerreiro.getMagiaAtual() + "/" + guerreiro.getMagiaMaxima());

        guerreiro.receberDano(20);
        System.out.println("Vida após dano: " + guerreiro.getVidaAtual());

        guerreiro.usarMagia(10);
        System.out.println("Magia após uso: " + guerreiro.getMagiaAtual());

        guerreiro.recuperarVida(10);
        System.out.println("Vida após recuperação: " + guerreiro.getVidaAtual());
        guerreiro.recuperarMagia(10);
        System.out.println("Magia após recuperação: " + guerreiro.getMagiaAtual());
    }
}

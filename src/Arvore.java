public class Arvore {
    private String nome;
    private int idade;
    private int idade_maxima;
    private double tamanho;

    public Arvore(String nome, int idade, int idade_maxima, double tamanho) {
        this.nome = nome;
        this.idade = idade;
        this.idade_maxima = idade_maxima;
        this.tamanho = tamanho;
    }
    
    public void envelhecer() {
        if (this.idade < this.idade_maxima) {
            this.idade++;
            this.tamanho += 0.1;
            System.out.printf("Tamanho atual: %.2f\n", tamanho);
            System.out.println("Idade atual: " + idade);
        } else {
        	System.out.println("A árvore foi de base! :(");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdadeMaxima() {
        return idade_maxima;
    }

    public void setIdadeMaxima(int idade_maxima) {
        this.idade_maxima = idade_maxima;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
}



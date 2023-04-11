public class Heroi {
    private int vidaMaxima;
    private int vidaAtual;
    private int magiaMaxima;
    private int magiaAtual;
    private String nome;
    private String descricao;

    public Heroi(int vidaMaxima, int magiaMaxima, String nome, String descricao) {
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.magiaMaxima = magiaMaxima;
        this.magiaAtual = magiaMaxima;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
    }

    public void usarMagia(int quantidade) {
        this.magiaAtual -= quantidade;
        if (this.magiaAtual < 0) {
            this.magiaAtual = 0;
        }
    }

    public void recuperarVida(int quantidade) {
        this.vidaAtual += quantidade;
        if (this.vidaAtual > this.vidaMaxima) {
            this.vidaAtual = this.vidaMaxima;
        }
    }

    public void recuperarMagia(int quantidade) {
        this.magiaAtual += quantidade;
        if (this.magiaAtual > this.magiaMaxima) {
            this.magiaAtual = this.magiaMaxima;
        }
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getMagiaMaxima() {
        return magiaMaxima;
    }

    public int getMagiaAtual() {
        return magiaAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
        if (this.vidaAtual > vidaMaxima) {
            this.vidaAtual = vidaMaxima;
        }
    }

    public void setMagiaMaxima(int magiaMaxima) {
        this.magiaMaxima = magiaMaxima;
        if (this.magiaAtual > magiaMaxima) {
            this.magiaAtual = magiaMaxima;
        }
    }
}

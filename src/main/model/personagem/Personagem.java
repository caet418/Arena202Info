package main.model.personagem;

public class Personagem {

    private String nome;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void setVida(int vida) {
        this.vida = vida;
    }
}


package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreira extends Personagem {

    private int escudo;

    public Guerreira(String nome) {
        super(nome);
        this.escudo = 3;
    }

    public boolean defender(){
        if ((escudo-1)>=0) {
            escudo--;
            return true;
        }
        return false;
    }

    public int getEscudo() {
        return escudo;
    }
}

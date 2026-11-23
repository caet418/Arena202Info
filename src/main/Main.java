package main;

import main.model.personagem.concreto.Guerreira;
import utils.Input;

public class Main {
    public static void main(String[] args) {
        Guerreira guerreira = new Guerreira(Input.st("Digite o nome da guerreira: "));
        guerreira.receberDano(20);

        if (guerreira.defender()){
            System.out.printf("\n%s defende!\n",guerreira.getNome());
        }
        else{
            System.out.printf("\n%s nao defendeu. Sem mais pontos de escudo.\n",guerreira.getNome());
        }

        System.out.println("\nA vida da guerreira "+guerreira.getNome()+ " eh: "+guerreira.getVida());
        System.out.println("\nO escudo da guerreira "+guerreira.getNome()+ " eh: "+guerreira.getEscudo());
    }
}

package Personagens;

import Interfaces.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico{

    public Cavaleiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("O cavaleiro " + getNome() + " está atacando.");
    }

    @Override
    public void defender() {
        System.out.println("O cavaleiro " + getNome() + " defendeu.");
    }

    @Override
    public void saltar() {
        System.out.println("O cavaleiro " + getNome() + " saltou.");
    }

    @Override
    public void andar() {
        System.out.println("O cavaleiro " + getNome() + " está andando.");
    }

    @Override
    public void guardarItem() {
        System.out.println("O cavaleiro " + getNome() + " está guardando a espada.");
    }

    @Override
    public void usarItem() {
        System.out.println("O cavaleiro " + getNome() + " está atacando.");;
    }
}

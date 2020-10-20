package Personagens;

import Interfaces.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz {

    public Dragao(String nome) {
        super(nome);
    }

    @Override
    public void atirarFogo() {
        System.out.println("O dragão" + getNome() + "está cuspindo fogo.");
    }

    @Override
    public void voar() {
        System.out.println("O dragão" + getNome() + "está voando.");
    }

    @Override
    public void morder() {
        System.out.println("O dragão" + getNome() + "está atacando com mordidas.");
    }

    @Override
    public void andar() {
        System.out.println("O dragão" + getNome() + "está andando.");
    }
}

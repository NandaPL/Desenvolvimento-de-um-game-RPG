package Personagens;

import Interfaces.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void invisibilidade() {
        System.out.println("O mago " + getNome() + " ficou invisível.");
    }

    @Override
    public void ultraRapidez() {
        System.out.println("O mago " + getNome() + " usou a super velocidade.");
    }

    @Override
    public void andar() {
        System.out.println("O mago " + getNome() + " está andando.");
    }

    @Override
    public void guardarItem() {
        System.out.println("O mago " + getNome() + " guardou o cajado mágico.");
    }

    @Override
    public void usarItem() {
        System.out.println("O mago " + getNome() + " usou o cajado mágico.");
    }
}

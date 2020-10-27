package Personagens;

import Interfaces.ComportamentoFeroz;

import javax.swing.*;

public class Dragao extends Personagem implements ComportamentoFeroz {

    public Dragao(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        String passos = JOptionPane.showInputDialog("Quantos passos o dragão " + getNome() +" deseja andar?");
        System.out.println("O dragão " + getNome() + " moveu " + passos + ".");
        JOptionPane.showMessageDialog(null,("O dragão " + getNome() + " moveu " + passos + "."));
    }

    @Override
    public void guardarItem() {
    }

    @Override
    public void usarItem() {
    }

    @Override
    public void atirarFogo() {
        System.out.println("O dragão " + getNome() + " está cuspindo fogo.");
        JOptionPane.showMessageDialog(null,("O dragão " + getNome() + " está cuspindo fogo."));
    }

    @Override
    public void voar() {
        System.out.println("O dragão " + getNome() + " está voando.");
        JOptionPane.showMessageDialog(null,("O dragão " + getNome() + " está cuspindo fogo."));
    }

    @Override
    public void morder() {
        System.out.println("O dragão " + getNome() + " está atacando com mordidas.");
        JOptionPane.showMessageDialog(null,("O dragão " + getNome() + " está cuspindo fogo."));
    }


    //Não há necessidade de uso de item pelo dragão
}

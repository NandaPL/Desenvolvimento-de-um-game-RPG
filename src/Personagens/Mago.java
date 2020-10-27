package Personagens;

import Interfaces.ComportamentoMagico;

import javax.swing.*;

public class Mago extends Personagem implements ComportamentoMagico {
    public Mago(String nome) {
        super(nome);
    }

    boolean visivel;

    @Override
    public void invisibilidade(){
        visivel = !visivel;
        if(visivel) {
            System.out.println("O mago " + getNome() + " ficou invisível.");
        } else{
            System.out.println("O mago " + getNome() + " está visivel.");
        }
    }

    @Override
    public void ultraRapidez() {
        System.out.println("O mago " + getNome() + " usou a super velocidade.");
    }

    @Override
    public void andar() {
        String passos = JOptionPane.showInputDialog("Quantos passos o mago " + getNome() +" deseja andar?");
        System.out.println("O mago " + getNome() + " andou " + passos + ".");
    }

    @Override
    public void guardarItem() {
        String item = JOptionPane.showInputDialog("Qual item " + getNome() + " deseja guardar?");
        System.out.println("O mago " + getNome() + " guardou o(a) " + item + ".");
    }

    @Override
    public void usarItem() {
        String item = JOptionPane.showInputDialog("Qual item " + getNome() + " deseja usar?");
        System.out.println("O mago " + getNome() + " usou o(a) " + item + ".");
    }
}

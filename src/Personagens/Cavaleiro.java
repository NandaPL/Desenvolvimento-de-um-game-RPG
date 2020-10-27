package Personagens;
import javax.swing.JOptionPane;
import Interfaces.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico{

    public Cavaleiro(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        String passos = JOptionPane.showInputDialog("Quantos passos o cavaleiro " + getNome() +" deseja andar?");
        System.out.println("O cavaleiro " + getNome() + " andou " + passos + ".");
    }

    @Override
    public void guardarItem() {
        String item = JOptionPane.showInputDialog("Qual item " + getNome() + " deseja guardar?");
        System.out.println("O cavaleiro " + getNome() + " guardou o(a) " + item + ".");
    }

    @Override
    public void usarItem() {
        String item = JOptionPane.showInputDialog("Qual item " + getNome() + " deseja usar?");
        System.out.println("O cavaleiro " + getNome() + " usou o(a) " + item + ".");
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


}

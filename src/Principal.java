import Personagens.Cavaleiro;
import Personagens.Dragao;
import Personagens.Mago;
import Personagens.Personagem;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        Personagem[] personagens = new Personagem[6];
        Personagem persona;

        personagens[0] = new Cavaleiro("Joao");
        personagens[1] = new Cavaleiro("Astrovaldo");
        personagens[2] = new Mago("Jorge");
        personagens[3] = new Mago("Jucicreide");
        personagens[4] = new Dragao("Juju");
        personagens[5] = new Dragao("GG");

        Jogo areaDejogo = new Jogo();

        for(int i = 0; i < personagens.length; i++){
            areaDejogo.ControlarAcoesDosPersonagens(personagens[i]);
        }

        persona = personagens[2];

        Mago magoPersona = (Mago) persona;
        magoPersona.invisibilidade();
    }
}

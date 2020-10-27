import Personagens.Cavaleiro;
import Personagens.Dragao;
import Personagens.Mago;
import Personagens.Personagem;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args){
        Personagem[] personagens = new Personagem[6];


        //Cavaleiro, Mago e Dragao sao Personagens
        personagens[0] = new Cavaleiro("Seiya");
        personagens[1] = new Mago("Merlim");
        personagens[2] = new Dragao("Sauron");
        personagens[3] = new Cavaleiro("Aphrodite");
        personagens[4] = new Mago("Gandalf");
        personagens[5] = new Dragao("Drogon");

        Jogo areaDejogo = new Jogo();

        for (Personagem personas : personagens) {
            areaDejogo.ControlarAcoesDosPersonagens(personas);
        }

        Personagem persona;
        persona = personagens[1];

        Mago magoPersona = (Mago) persona;
        magoPersona.invisibilidade();
    }
}

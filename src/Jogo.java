import Personagens.Cavaleiro;
import Personagens.Dragao;
import Personagens.Mago;
import Personagens.Personagem;

public class Jogo {

    public void ControlarAcoesDosPersonagens(Personagem personagem){
        if(personagem instanceof Cavaleiro) {
            personagem.andar();
            personagem.usarItem();
            personagem.guardarItem();
        } if(personagem instanceof Dragao){
            personagem.andar();
        }if(personagem instanceof Mago){
            personagem.andar();
            personagem.usarItem();
            personagem.guardarItem();
        }
    }

}

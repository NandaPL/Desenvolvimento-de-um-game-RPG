import Personagens.Cavaleiro;
import Personagens.Dragao;
import Personagens.Mago;
import Personagens.Personagem;

public class Jogo {

    public void ControlarAcoesDosPersonagens(Personagem personagem){
        if(personagem instanceof Cavaleiro) {
            personagem.andar();
            personagem.guardarItem();
            personagem.usarItem();
        } if(personagem instanceof Dragao){
            personagem.andar();
            personagem.guardarItem();
            personagem.usarItem();
        }if(personagem instanceof Mago){
            personagem.andar();
            personagem.guardarItem();
            personagem.usarItem();
        }

    }

}

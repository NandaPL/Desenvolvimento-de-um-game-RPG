package Personagens;
import Interfaces.ComportamentoNormal;
import java.util.ArrayList;

public class Personagem implements ComportamentoNormal {
    private String nome;

    public Personagem(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void andar(){

    }

    @Override
    public void guardarItem() {

    }

    @Override
    public void usarItem() {

    }


}

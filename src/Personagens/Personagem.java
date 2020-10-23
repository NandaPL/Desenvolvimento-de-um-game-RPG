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
        System.out.println("O cavaleiro" + getNome() + "está atacando.");
    }

    @Override
    public void guardarItem() {
        System.out.println("O cavaleiro" + getNome() + "está atacando.");
    }

    @Override
    public void usarItem() {
        System.out.println("O cavaleiro" + getNome() + "está atacando.");
    }
}

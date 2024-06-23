package sorteio;

import java.util.List;

public class Pessoa {

    private String nome;
    private int numeroEscolhido;

    public Pessoa() {
    }

    public Pessoa(String nome, int numeroEscolhido) {
        this.nome = nome;
        this.numeroEscolhido = numeroEscolhido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }

}

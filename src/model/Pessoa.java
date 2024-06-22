package model;

import java.util.ArrayList;
import java.util.Random;

public class Pessoa {

    private String nome;
    private int numeroEscolhido;
    Random random = new Random();

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

    public int getNumeroEscolhido() {
        return numeroEscolhido;
    }

    public void setNumeroEscolhido(int numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }

    public String calcDif(String num, String numSorteado) {
        int diferenca = Integer.parseInt(numSorteado) - Integer.parseInt(num);
        if (diferenca < 0) {
            diferenca = diferenca * -1;
        }
        String dif = String.valueOf(diferenca);
        return dif;
    }

    public String sorteio() {
        int num = random.nextInt((100 - 30) + 1) + 30;
        String numSorteado = String.valueOf(num);
        return numSorteado;
    }

}

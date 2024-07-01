package sorteio;

import java.util.ArrayList;
import java.util.List;

public class Sorteado {

    private List<Integer> numerosSorteados;
    private List<Integer> diferencas;
    private List<Pessoa> vencedores;

    public Sorteado() {
        numerosSorteados = new ArrayList<>();
        diferencas = new ArrayList<>();
        vencedores = new ArrayList<>();
    }

    public List<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }

    public void addNumeroSorteado(int numeroSorteado) {
        this.numerosSorteados.add(numeroSorteado);
    }

    public List<Integer> getDiferencas() {
        return diferencas;
    }

    public void addDiferenca(int diferenca) {
        this.diferencas.add(diferenca);
    }

    public List<Pessoa> getVencedores() {
        return vencedores;
    }

    public void addVencedor(Pessoa vencedor) {
        vencedores.add(vencedor);
    }

}

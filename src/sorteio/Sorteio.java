package sorteio;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {

    private int numeroSorteado;
    private List<Pessoa> pessoas;

    public Sorteio() {
        this.pessoas = new ArrayList<>();
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public static int gerarNumeroRandomico() {
        int numeroRandomico = (int) (Math.random() * 100 + 1);
        return (int) Math.floor(numeroRandomico);
    }

    public void cadastrarPessoa(Pessoa participante) {
        pessoas.add(participante);
    }

    public void atualizarPalpite(Pessoa participante, int novoPalpite) {
        for (Pessoa p : pessoas) {
            if (p.equals(participante)) {
                p.setNumeroEscolhido(novoPalpite);
                break;
            }
        }
    }

    public Pessoa realizarSorteio() {
        if (pessoas.isEmpty()) {
            return null; // Não há participantes cadastrados
        }

        // Gerar novo número sorteado
        numeroSorteado = gerarNumeroRandomico();

        Pessoa vencedor = null;
        int menorDiferenca = Integer.MAX_VALUE;

        for (Pessoa p : pessoas) {
            int diferenca = (int) Math.abs(p.getNumeroEscolhido() - numeroSorteado);
            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                vencedor = p;
            }
        }

        return vencedor;
    }

}

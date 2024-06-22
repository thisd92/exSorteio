package sorteio;

import java.util.List;

public class SorteioClass {
    private int numeroSorteado;
    private List<Pessoa> pessoas;

    public SorteioClass() {
        this.numeroSorteado = SorteioClass.gerarNumeroRandomico();
        this.pessoas = pessoas;
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
    
    public static int gerarNumeroRandomico(){
        int numeroRandomico = (int)(Math.random()*100+1);
        return numeroRandomico;
    }
    
}

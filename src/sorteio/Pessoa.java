package sorteio;

public class Pessoa {
    private int id;
    private String nome;
    private double numeroEscolhido;
    private double diferenca;

    public Pessoa(String nome, double numeroEscolhido) {
        this.id = gerarID(0);
        this.nome = nome;
        this.numeroEscolhido = numeroEscolhido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setNumeroEscolhido(double numeroEscolhido) {
        this.numeroEscolhido = numeroEscolhido;
    }
    
    public static int gerarID(int ultimoID){
        int id = ultimoID;
        return id++;
    }
}

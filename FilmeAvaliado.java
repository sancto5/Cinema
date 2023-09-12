package main;

public class FilmeAvaliado extends Filme {
    private double classificacao;

    public FilmeAvaliado(String titulo, String diretor, int anoLancamento, double classificacao) {
        super(titulo, diretor, anoLancamento);
        this.classificacao = classificacao;
    }

    public double getClassificacao() {
        return classificacao;
    }
}

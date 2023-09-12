package main;

public class Lancamento extends Filme {
    private String dataLancamento;

    public Lancamento(String titulo, String diretor, int anoLancamento, String dataLancamento) {
        super(titulo, diretor, anoLancamento);
        this.dataLancamento = dataLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }
}

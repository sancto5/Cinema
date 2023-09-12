package main;
import java.util.List;
import java.util.ArrayList;
public class Sessao {
    private Filme filme;
    private List<String> horarios;

    public Sessao(Filme filme, List<String> horarios) {
        this.filme = filme;
        this.horarios = new ArrayList<>(horarios);
    }

    public Filme getFilme() {
        return filme;
    }

    public List<String> getHorarios() {
        return horarios;
    }
}

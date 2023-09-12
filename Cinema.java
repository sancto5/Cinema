package main;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Sessao> sessoes = new ArrayList<>();

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public List<Sessao> listarSessoes() {
        return sessoes;
    }
}


package main;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        FilmeAvaliado filme1 = new FilmeAvaliado("A Freira 2", "Michael Chaves", 2023, 3.4);
        FilmeAvaliado filme2 = new FilmeAvaliado("As Tartarugas Ninja: Caos Mutante", "Jeff Rowe", 2023, 4.5);
        Lancamento filme3 = new Lancamento("Duna", "Dennis Villenueve", 2023, "02/11/2023");

        List<String> horarios1 = Arrays.asList("16:15", "17:00", "18:30", "19:15", "20:45","21:30");
        List<String> horarios2 = Arrays.asList("16:55", "19:10");
        List<String> horarios3 = Arrays.asList("Disponível apenas em Novembro de 2023.");

        Sessao sessao1 = new Sessao(filme1, horarios1);
        Sessao sessao2 = new Sessao(filme2, horarios2);
        Sessao sessao3 = new Sessao(filme3, horarios3);

        cinema.adicionarSessao(sessao1);
        cinema.adicionarSessao(sessao2);
        cinema.adicionarSessao(sessao3);

        List<Sessao> sessoes = cinema.listarSessoes();
        for (Sessao sessao : sessoes) {
            Filme filme = sessao.getFilme();
            String titulo = filme.getTitulo();
            int anoLancamento = filme.getAnoLancamento();
            double classificacao = (filme instanceof FilmeAvaliado) ? ((FilmeAvaliado) filme).getClassificacao(): 0.0;

            System.out.println("Filme: " + sessao.getFilme().getTitulo());
            System.out.println("Ano de Lançamento: " + anoLancamento);
            if (classificacao > 0) {
                System.out.println("Avaliação do Público: " + classificacao);
            }

            List<String> horarios = sessao.getHorarios();
            System.out.println("Horário: " + horarios);
            System.out.println("------");
        }
    }
}





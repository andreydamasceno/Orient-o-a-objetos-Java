import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.estudos.Episodios;
import br.com.alura.screenmatch.estudos.Filme;
import br.com.alura.screenmatch.estudos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("homem de ferro", 2008);
        Filme filme2 = new Filme("Avatar", 2022);
        Serie serie1 = new Serie("The Office", 2000);
        var filme3 = new Filme("Mario Bros.", 2023);

        filme1.setDuracao(180);
        filme1.avalia(7.2);
        filme1.avalia(8);
        filme1.avalia(9);

        filme1.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme1.getDuracao());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Nota do filme: " + filme1.obtemMediaDasAvaliacoes());

        serie1.setTemporadas(9);
        serie1.setEpisodiosPorTemporada(20);
        serie1.setDuracaoPorEpisodio(20);
        serie1.exibeFichaTecnica();
        System.out.println("Temporadas: " + serie1.getTemporadas());
        System.out.println("Episódios por temporada: " + serie1.getEpisodiosPorTemporada());
        System.out.println("Duração de cada episódio: " + serie1.getDuracaoPorEpisodio());

        filme2.setDuracao(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Total de minutos para assistir: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(serie1);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

        filme3.setDuracao(160);
        filme3.avalia(9.6);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(2).toString());

    }
}
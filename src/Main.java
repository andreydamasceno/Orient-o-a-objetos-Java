import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.estudos.Episodios;
import br.com.alura.screenmatch.estudos.Filme;
import br.com.alura.screenmatch.estudos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie serie1 = new Serie();
        
        filme1.setNome("Homem de Ferro");
        filme1.setAnoDeLancamento(2008);
        filme1.setDuracao(180);
        filme1.avalia(7.2);
        filme1.avalia(8);
        filme1.avalia(9);

        filme1.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme1.getDuracao());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Nota do filme: " + filme1.obtemMediaDasAvaliacoes());

        serie1.setNome("The Office");
        serie1.setAnoDeLancamento(2000);
        serie1.setTemporadas(9);
        serie1.setEpisodiosPorTemporada(20);
        serie1.setDuracaoPorEpisodio(20);
        serie1.exibeFichaTecnica();
        System.out.println("Temporadas: " + serie1.getTemporadas());
        System.out.println("Episódios por temporada: " + serie1.getEpisodiosPorTemporada());
        System.out.println("Duração de cada episódio: " + serie1.getDuracaoPorEpisodio());

        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2012);
        filme2.setDuracao(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(serie1);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

    }
}
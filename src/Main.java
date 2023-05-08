import br.com.alura.screenmatch.estudos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        
        filme1.setNome("Homem de Ferro");
        filme1.setAnoDeLancamento(2008);
        filme1.setDuracaoEmMinutos(180);
        filme1.avalia(9.4);
        filme1.avalia(10);
        filme1.avalia(9);

        filme1.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Nota do filme: " + filme1.obtemMediaDasAvaliacoes());
    }
}
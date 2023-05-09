package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.estudos.Filme;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

   public void inclui (Filme f) {
        tempoTotal += f.getDuracao();
   }
}

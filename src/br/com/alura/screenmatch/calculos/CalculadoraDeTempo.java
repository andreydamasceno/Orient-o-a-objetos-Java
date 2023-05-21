package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.estudos.Filme;
import br.com.alura.screenmatch.estudos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {

       return this.tempoTotal;
    }

   public void inclui (Titulo t) {
        this.tempoTotal += t.getDuracao();
   }
}

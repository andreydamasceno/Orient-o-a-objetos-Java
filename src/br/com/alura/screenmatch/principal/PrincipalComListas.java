package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Homem de ferro", 2008);
        Filme filme2 = new Filme("Avatar", 2022);
        Serie serie1 = new Serie("The Office", 2000);
        var filme3 = new Filme("Mario Bros.", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        filme1.avalia(9.5);
        lista.add(filme2);
        filme2.avalia(8);
        lista.add(filme3);
        filme3.avalia(9);
        lista.add(serie1);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("woobuffet");
        buscaPorArtista.add("Steve Carrell");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}

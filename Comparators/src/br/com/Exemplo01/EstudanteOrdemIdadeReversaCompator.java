package br.com.Exemplo01;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaCompator implements Comparator<Estudantes>{

    @Override
    public int compare(Estudantes o1, Estudantes o2){
        return o2.getIdade() - o1.getIdade();

    }
    
}
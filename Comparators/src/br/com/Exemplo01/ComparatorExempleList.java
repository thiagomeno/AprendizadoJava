package br.com.Exemplo01;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExempleList {
    public static void main(String[] args) {
        List<Estudantes> estudantes = new ArrayList<>();

        estudantes.add(new Estudantes("Pedro", 19));
        estudantes.add(new Estudantes("Carlos", 23));
        estudantes.add(new Estudantes("Mariana", 21));
        estudantes.add(new Estudantes("João", 18));
        estudantes.add(new Estudantes("Thiago", 20));
        estudantes.add(new Estudantes("George", 22));
        estudantes.add(new Estudantes("Larissa", 21));

        System.out.println("--- ORDEM DE INSERÇÃO---");
        System.out.println(estudantes);
    }
}

package br.com.Exemplo01;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExampleList{
    public static void main (String[] args, Object Comparator) {
        
        List<Estudantes> estudante = new ArrayList<>();
        
        estudante.add(new Estudantes("Pedro", 19));
        estudante.add(new Estudantes("Carlos", 23));
        estudante.add(new Estudantes("Mariana", 21));
        estudante.add(new Estudantes("João", 18));
        estudante.add(new Estudantes("Thiago", 20));
        estudante.add(new Estudantes("George", 22));
        estudante.add(new Estudantes("Larissa", 21));
        
        System.out.println("--- Ordem de insserção ---");
        System.out.println(estudante);
        
        estudante.sort((first, second) -> first.getIdade() - second.getIdade());
        
        System.out.println("--- Ordem natual dos números - idade ---");
        System.out.println(estudante);
        
        estudante.sort((first,second) -> second.getIdade() - first.getIdade());
        
        System.out.println("--- Ordem reversa dos números - idade ---");
        System.out.println(estudante);
        
        /*estudante.sort(Comparator.comparingInt(Estudantes :: getIdade));
        
        System.out.println("--- Ordem natural dos números - idade (method reference)");
        System.out.println(estudante);
        
        estudante.sort(Comparator.comparingInt(Estudantes :: getIdade).reversed());
        
        System.out.println("--- Ordem reversa dos números - idade (method reference)");
        System.out.println(estudante);
        */
        Collections.sort(estudante);
        
        System.out.println("--- Ordem natural dos números - idade (interface Comparable)");
        System.out.println(estudante);
        
        Collections.sort(estudante, new EstudanteOrdemIdadeReversaCompator());
        
        System.out.println("--- Ordem reversa dos números - idade (interface Comparator)");    
        
        
        
    }
}
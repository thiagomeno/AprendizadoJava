package br.com.Exemplo01;

public class Estudantes implements Comparable<Estudantes> {
    private final String nome;
    private final Integer idade;

    public Estudantes(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;                
    }
    
    public String getNome(){return nome;}
    
    public Integer getIdade(){return idade;}

    @Override
    public String toString(){return nome + " - " + idade;}

    @Override
    public int compareTo(Estudantes o) {return this.getIdade() - o.getIdade();}
}


package classes;

import java.util.Scanner;


public class Musica {
    //atributos
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    //construtor
    public Musica(){
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    //construtor com parametos
    public Musica(String titulo, String artista, double duracao, double preco){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    //preencher
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o titulo: ");
        this.titulo = leitor.next();
        System.out.println("informe o artista: ");
        this.artista = leitor.next();
        System.out.println("informe a duracao: ");
        this.duracao = leitor.nextDouble();
        System.out.println("informe O preco");
        this.preco = leitor.nextDouble();
    }
    
    //toString
    @Override
    public String toString(){
        return "musica {titulo: " + this.titulo
                + ", artista: " + this.artista
                + ", duracao: " + this.duracao
                + ", preco: " + this.preco + "}";
    }
    
    //copiar
    public void copiar(Musica outro){
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
    
    //getters e setters
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public double getDuracao(){
        return this.duracao;
    }
    
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
}

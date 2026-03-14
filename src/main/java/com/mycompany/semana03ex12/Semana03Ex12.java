package com.mycompany.semana03Ex12;

import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Semana03Ex12 {

    public static int imprimeMenu() {
    Scanner leitor = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("1 - Inserir musica");
        System.out.println("2 - Remover musica");
        System.out.println("3 - Pesquisar musica (titulo)");
        System.out.println("4 - Pesquisar musica (autor)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }
    public static void main(String[] args) {
        List<Musica> musicas;
        musicas = new ArrayList<Musica>();
        Scanner leitor = new Scanner(System.in);
        
        int opcao = 0;
        
        do{
            opcao = imprimeMenu();
            if(opcao == 1){//insercao
                Musica m1 = new Musica();
                m1.preencher();
                musicas.add(m1);
            }else if(opcao == 2){//remocao
                System.out.println("informe o titulo para remocao");
                String titulo = leitor.nextLine();
                
                for(int i = 0; i < musicas.size();i++){
                    Musica mi = musicas.get(i);
                    if(titulo.equals(mi.getTitulo())){
                        System.out.println("musica removida");
                        musicas.remove(mi);
                    }
                }
            }else if(opcao == 3){//pesquisa titulo
                System.out.println("informe o titulo para pesquisa");
                String titulo = leitor.nextLine();
                
                for(int i = 0; i < musicas.size();i++){
                    Musica mi = musicas.get(i);
                    if(titulo.equals(mi.getTitulo())){
                        System.out.println("musica encontrada");
                        mi.toString();
                    }
                }
            }else if(opcao == 4){
                System.out.println("informe o artista para pesquisa");
                String artista = leitor.nextLine();
                
                for(int i = 0; i < musicas.size();i++){
                    Musica mi = musicas.get(i);
                    if(artista.equals(mi.getArtista())){
                        System.out.println("musica(s) encontrada(s)");
                        mi.toString();
                    }
                }
            }
        }while(opcao != 0);
        
    }
}
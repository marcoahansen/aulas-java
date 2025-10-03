package Biblioteca;

public class Livro {
    String titulo;
    int anoPublicacao;
    Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
}

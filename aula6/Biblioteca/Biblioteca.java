package Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Autor robert = new Autor("Robert Cecil Martin", "EUA");
        Livro codigoLimpo = new Livro("Código Limpo",2021, robert);

        System.out.printf("O livro '%s' foi escrito por %s", codigoLimpo.titulo, codigoLimpo.autor.nome);
    }
}



package Produto;

public class Produto {
    String nome;
    int codigo;
    double preco;

    // Nosso construtor personalizado!
    public Produto(String nome, int codigo, double preco) {
        // A palavra "this" se refere ao atributo do objeto
        // Distingue o atributo "nome" do parâmetro "nome"
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public static void main(String[] args) {
        // O jeito antigo não funciona mais!
        // Produto p1 = new Produto(); // <-- ISSO AGORA DÁ ERRO!

        // O jeito novo, correto e seguro:
        Produto p1 = new Produto("Teclado", 55, 150.00);
        Produto p2 = new Produto("Mouse", 56, 80.00);

        System.out.println("Produto: " + p1.nome); // O objeto já nasce pronto!
        System.out.println("Produto: " + p2.nome); // O objeto já nasce pronto!
    }
}



package aula7.BuscaObjeto;

public class Programa {
    public static void main(String[] args) {
        Item[] itens = {
            new Item("Uva", 10),
            new Item("Maça", 8),
            new Item("Pera", 12),
            new Item("Arroz", 9),
            new Item("Batata", 12),
            new Item("Milho", 12)
        };
        for (int i = 0; i < itens.length; i++) {
            System.out.println("- Nome: "+ itens[i].nome + " - Valor: " + itens[i].valor);
        }
        BuscaObjeto.selectionSortPorNome(itens);
        System.out.print("\n\n\n");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("- Nome: "+ itens[i].nome + " - Valor: " + itens[i].valor);
        }
    }
}

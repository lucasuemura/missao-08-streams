package br.com.technexus.model;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.cadastrar(new Produto("The Witcher", "GAMES", 150.0));
        loja.cadastrar(new Produto("FIFA", "GAMES", 200.0));
        loja.cadastrar(new Produto("Java for Dummies", "LIVROS", 100.0));
        loja.cadastrar(new Produto("Clean Code", "LIVROS", 80.0));
        loja.cadastrar(new Produto("Mouse", "HARDWARE", 50.0));

        System.out.println("--- Prateleira de GAMES ---");
        System.out.println(loja.buscarPorCategoria("GAMES"));

        System.out.println("\n--- Patrimônio Total em Estoque ---");
        System.out.println("R$ " + loja.calcularPatrimonioTotal());

        System.out.println("\n--- Valor Total de LIVROS ---");
        System.out.println("R$ " + loja.calcularTotalPorCategoria("LIVROS"));
    }
}
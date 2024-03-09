package br.edu.infnet.ErickdaSilva;

public class Main {

    public static void main(String[] args) {
        // Criando objetos da classe Livro com diferentes anos de publicação
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 29.90);
        Livro livro2 = new Livro("Java: Como Programar", "Deitel & Deitel", 2019, 99.90);
        Livro livro3 = new Livro("Clean Code", "Robert C. Martin", 2021, 59.90);
        
        // Exibindo informações sobre os livros
        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro1.getPreco());
        System.out.println("Status: " + livro1.getStatus());
        System.out.println();

        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de Publicação: " + livro2.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro2.getPreco());
        System.out.println("Status: " + livro2.getStatus());
        System.out.println();

        System.out.println("Livro 3:");
        System.out.println("Título: " + livro3.getTitulo());
        System.out.println("Autor: " + livro3.getAutor());
        System.out.println("Ano de Publicação: " + livro3.getAnoPublicacao());
        System.out.println("Preço: R$ " + livro3.getPreco());
        System.out.println("Status: " + livro3.getStatus());
    }
}

package br.edu.infnet.ErickdaSilva;

import java.time.Year;

public class Livro {
    // Atributos relevantes para uma loja de livros
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    // Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para retornar o status do livro
    public String getStatus() {
        int anoAtual = Year.now().getValue();
        if (anoAtual - anoPublicacao <= 10) {
            return "Este livro é recente.";
        } else {
            return "Este livro é antigo.";
        }
    }

   
}


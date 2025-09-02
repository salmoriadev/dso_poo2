package org.example;

public class Capitulo {
    private int numero;
    private String titulo;

    // Construtor
    public Capitulo(int numero, String titulo) {
        this.numero = numero; // 'this' refere-se ao atributo da instância atual
        this.titulo = titulo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
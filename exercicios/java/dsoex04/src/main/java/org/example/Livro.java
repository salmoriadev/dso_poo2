package org.example;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private int ano;
    private Editora editora;
    private List<Autor> autores;
    private List<Capitulo> capitulos;

    public Livro(int codigo, String titulo, int ano, Editora editora, Autor autor, int numeroCapitulo, String tituloCapitulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autores = new ArrayList<>();
        this.autores.add(autor);
        this.capitulos = new ArrayList<>();
        this.capitulos.add(new Capitulo(numeroCapitulo, tituloCapitulo));
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
    public void incluirAutor(Autor autor) {
        if (autor != null && !this.autores.contains(autor)) {
            this.autores.add(autor);
        }
    }
    public void incluirCapitulo(int numero, String titulo) {
        Capitulo capitulo = findCapituloByTitulo(titulo);
        if (capitulo == null) {
            this.capitulos.add(new Capitulo(numero,titulo));}
    }
    public Capitulo findCapituloByTitulo(String titulo){
        for (Capitulo capitulo : this.capitulos){
            if (capitulo.getTitulo().equals(titulo)){
                return capitulo;
            }
        }
        return null;
    }
    public void excluirAutor(Autor autor) {
        if (autor != null && this.autores.contains(autor)) {
            this.autores.remove(autor);
        }
    }
    public void excluirCapitulo(String titulo) {
        Capitulo capitulo = findCapituloByTitulo(titulo);
        if (capitulo != null && this.capitulos.contains(capitulo)) {
            this.capitulos.remove(capitulo);
        }
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void incluirLivros(Livro livro) {
        if (livro != null && !this.livros.contains(livro)) {
            this.livros.add(livro);
        }
    }

    public void excluirLivros(Livro livro) {
        if (livro != null) {
            this.livros.remove(livro);
        }
    }
}
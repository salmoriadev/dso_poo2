package org.example;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor(1, "Machado de Assis");
        Autor a2 = new Autor(2, "Ariano Suassuna");
        Editora ed1 = new Editora(1, "Via Leitura");

        Livro l1 = new Livro(42, "Dom Casmurro", 2015, ed1, a1, 1, "Do Título");

        System.out.println(l1.getCodigo() + ", " + l1.getTitulo() + ", " + l1.getAno() + ", " +
                l1.getEditora().getNome() + ", " + l1.getAutores().get(0).getNome() + ", " +
                l1.getCapitulos().get(0).getTitulo());

        l1.setCodigo(1);
        l1.setTitulo("Memórias Póstumas de Brás Cubas");
        l1.setAno(2010);

        l1.incluirAutor(a2);

        for (Autor autor : l1.getAutores()) {
            System.out.println(autor.getNome());
        }

        Biblioteca biblio = new Biblioteca();
        biblio.incluirLivros(l1);

        for (Livro livro : biblio.getLivros()) {
            System.out.println(livro.getTitulo());
        }
    }
}

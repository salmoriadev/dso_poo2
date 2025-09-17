package org.example;

public abstract class UsuarioBU {
    protected long cpf;
    protected int diasDeEmprestimo;

    public UsuarioBU(long cpf, int diasDeEmprestimo) {
        this.cpf = cpf;
        this.diasDeEmprestimo = diasDeEmprestimo;
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public int getDiasDeEmprestimo() {
        return diasDeEmprestimo;
    }
    public void setDiasDeEmprestimo(int diasDeEmprestimo) {
        this.diasDeEmprestimo = diasDeEmprestimo;
    }

    public String emprestar(String tituloDoLivro) {
        return "\" pegou emprestado o livro: " + tituloDoLivro + " com ";
    }
    public String devolver(String tituloDoLivro) {
        return "\" devolveu o livro: " + tituloDoLivro;
    }
}

package org.example;

public class Professor extends Funcionario {
    public Professor(String departamento, long cpf, int diasDeEmprestimo) {
        super(departamento,cpf, diasDeEmprestimo);
    }

    @Override
    public String devolver(String tituloLivro) {
        String devolucaoDoUsuario = super.devolver(tituloLivro);
        return "Professor " + devolucaoDoUsuario;
    }
    @Override
    public String emprestar(String tituloLivro) {
        String emprestarDoUsuario = super.emprestar(tituloLivro);
        return "Professor " + emprestarDoUsuario;
    }
}

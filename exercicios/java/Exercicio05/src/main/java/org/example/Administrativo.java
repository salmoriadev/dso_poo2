package org.example;

public class Administrativo extends Funcionario {
    public Administrativo(String departamento, long cpf, int diasDeEmprestimo) {
        super(departamento,cpf, diasDeEmprestimo);
    }

    @Override
    public String devolver(String tituloLivro) {
        String devolucaoDoUsuario = super.devolver(tituloLivro);
        return "Administrativo " + devolucaoDoUsuario;
    }
    @Override
    public String emprestar(String tituloLivro) {
        String emprestarDoUsuario = super.emprestar(tituloLivro);
        return "Administrativo " + emprestarDoUsuario;
    }
}

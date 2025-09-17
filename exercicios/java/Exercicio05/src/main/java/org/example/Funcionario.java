package org.example;

public abstract class Funcionario extends UsuarioBU {
    protected String departamento;
    public Funcionario(String departamento, long cpf, int diasDeEmprestimo) {
        super(cpf, diasDeEmprestimo);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String devolver(String tituloLivro) {
        String devolucaoDoUsuario = super.devolver(tituloLivro);
        return "Funcionário do departamento \"" + this.departamento + devolucaoDoUsuario;
    }
    @Override
    public String emprestar(String tituloLivro) {
        String emprestarDoUsuario = super.emprestar(tituloLivro);
        String strDiasDeEmprestimo = String.valueOf(this.diasDeEmprestimo);
        return "do departamento \"" + this.departamento + emprestarDoUsuario  + strDiasDeEmprestimo + " dias de prazo";
    }
}

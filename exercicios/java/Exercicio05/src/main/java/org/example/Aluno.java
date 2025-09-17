package org.example;

public abstract class Aluno extends UsuarioBU {
    private int matricula;

    public Aluno(int matricula, long cpf, int diasDeEmprestimo) {
        super(cpf, diasDeEmprestimo);
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String devolver(String tituloLivro) {
        String emprestarDoUsuario = super.devolver(tituloLivro);
        String strMatricula = String.valueOf(this.matricula);
        return "Aluno de matricula \"" + strMatricula + emprestarDoUsuario;
    }
    @Override
    public String emprestar(String tituloLivro) {
        String emprestarDoUsuario = super.emprestar(tituloLivro);
        String strmatricula = String.valueOf(this.matricula);
        return "de matricula \"" + strmatricula + emprestarDoUsuario;
    }
}

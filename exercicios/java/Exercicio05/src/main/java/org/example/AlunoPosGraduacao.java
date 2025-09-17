package org.example;

public class AlunoPosGraduacao extends Aluno{
    private boolean elaborandoTese;
    public AlunoPosGraduacao(int matricula, long cpf, int diasDeEmprestimo) {
        super(matricula, cpf, diasDeEmprestimo);
        this.elaborandoTese = false;
    }
    public boolean getElaborandoTese() {
        return this.elaborandoTese;
    }
    public void setElaborandoTese(boolean elaborandoTese) {
        this.elaborandoTese = elaborandoTese;
    }

    @Override
    public String emprestar(String tituloLivro) {
        int prazo;
        if (this.elaborandoTese) {
            prazo = this.diasDeEmprestimo * 2;
        }
        else {
            prazo = this.diasDeEmprestimo * 2;
        }
        String emprestarDoUsuario = super.emprestar(tituloLivro);
        String strprazo = String.valueOf(prazo);
        return "Aluno " + emprestarDoUsuario + strprazo + " dias de prazo";
    }
}

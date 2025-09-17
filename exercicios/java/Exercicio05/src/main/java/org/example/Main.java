package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Classe principal para executar o programa
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Operações com Aluno de Pós-Graduação ---");
        // Note que o tipo do CPF precisa ser long, pois o número é muito grande para int
        AlunoPosGraduacao a1 = new AlunoPosGraduacao(2021001, 12345678900L, 7);
        a1.setElaborandoTese(true);
        System.out.println(a1.emprestar("Introdução à Programação"));

        System.out.println("\n--- Operações com Professor ---");
        Professor p1 = new Professor("Matemática", 98765432100L, 8);
        System.out.println(p1.emprestar("Cálculo I"));

        System.out.println("\n--- Operações com Administrativo ---");
        Administrativo adm = new Administrativo("Recursos Humanos", 12345678901L, 14);
        System.out.println(adm.emprestar("Manual de Procedimentos"));

        System.out.println("\n--- Operações com Funcionário Genérico ---");

        System.out.println("\n--- Devoluções ---");
        System.out.println(a1.devolver("Introdução à Programação"));
        System.out.println(p1.devolver("Cálculo I"));
        System.out.println(adm.devolver("Manual de Procedimentos"));
    }
}
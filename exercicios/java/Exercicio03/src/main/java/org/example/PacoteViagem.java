package org.example;

public class PacoteViagem {
    private String origem;
    private String destino;
    private int duracao;
    private static double custoUnitario;

    public PacoteViagem(String origem, String destino, int duracao, double custoUnitario) {
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
        this.custoUnitario = custoUnitario;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public static double getCustoUnitario() {
        return custoUnitario;
    }
    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
}

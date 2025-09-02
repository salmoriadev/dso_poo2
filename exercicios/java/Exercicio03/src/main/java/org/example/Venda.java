package org.example;

public class Venda {
    private int codigo;
    private Cliente cliente;
    private String descricao;
    private PacoteViagem pacote;
    private int quantidade;

    public Venda(int codigo, Cliente cliente, String descricao, PacoteViagem pacote, int i) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descricao = descricao;
        this.pacote = pacote;
        this.quantidade = quantidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public PacoteViagem getPacote() {
        return pacote;
    }
    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double precoTotal(){
        double preco = this.quantidade * PacoteViagem.getCustoUnitario();
        return preco;
    }
}

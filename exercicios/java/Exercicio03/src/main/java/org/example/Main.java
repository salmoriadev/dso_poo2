package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João da Silva", "55-5555-5555", "joao.silva@email.com");

        PacoteViagem pacote = new PacoteViagem("São Paulo", "Cancun", 7, 2500.00);

        Venda venda = new Venda(101, cliente, "Venda de pacote de férias", pacote, 2);

        System.out.println("--- Detalhes da Venda ---");
        System.out.println("Código da Venda: " + venda.getCodigo());
        System.out.println("Descrição: " + venda.getDescricao());
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Pacote: " + venda.getPacote().getOrigem() + " -> " + venda.getPacote().getDestino());
        System.out.println("Quantidade: " + venda.getQuantidade());
        System.out.println("Preço Unitário: R$" + pacote.getCustoUnitario());
        System.out.println("-------------------------");

        double precoTotal = venda.precoTotal();
        System.out.println("Preço Total da Venda: R$" + precoTotal);
    }
}
package br.com.ecommerce;

public class Pedido {
    // Estados possíveis do pedido
    public enum Status {
        CRIADO, PAGO, ENVIADO, CANCELADO
    }

    private Status status;
    private Carrinho carrinho;

    public Pedido(Carrinho carrinho) {
        if (carrinho.getQuantidadeItens() == 0) {
            throw new IllegalStateException("Não pode criar pedido com carrinho vazio");
        }
        this.carrinho = carrinho;
        this.status = Status.CRIADO;
    }

    public void pagar() {
        if (status != Status.CRIADO) {
            throw new IllegalStateException("Pedido só pode ser pago se estiver CRIADO");
        }
        this.status = Status.PAGO;
    }

    public void enviar() {
        if (status != Status.PAGO) {
            throw new IllegalStateException("Pedido só pode ser enviado se estiver PAGO");
        }
        this.status = Status.ENVIADO;
    }

    public void cancelar() {
        if (status == Status.ENVIADO) {
            throw new IllegalStateException("Não pode cancelar pedido já ENVIADO");
        }
        this.status = Status.CANCELADO;
    }

    public Status getStatus() {
        return status;
    }
}
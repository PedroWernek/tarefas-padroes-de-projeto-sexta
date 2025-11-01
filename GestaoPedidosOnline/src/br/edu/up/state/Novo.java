package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

public record Novo(Pedido pedido) implements iState {

    @Override
    public void pagar() {
        System.out.println("Produto pago com sucesso!");
        pedido.setEstado(new Pago(pedido));
    }

    @Override
    public void enviar() {
        System.out.println("Produto ainda não pago!");
    }

    @Override
    public void entregar() {
        System.out.println("Produto ainda não pago!");
    }

    @Override
    public void cancelar() {
        System.out.println("Compra cancelada!");
        pedido.setEstado(new Cancelado(pedido));
    }
}

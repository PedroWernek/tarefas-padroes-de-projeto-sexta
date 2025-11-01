package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

public record Pago(Pedido pedido) implements iState {

    @Override
    public void pagar() {
        System.out.println("Pedido já pago!");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado com sucesso!");
        pedido.setEstado(new Enviado(pedido));
    }

    @Override
    public void entregar() {
        System.out.println("Pedido ainda não enviado");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado. Extornando dinheiro");
        pedido.setEstado(new Cancelado(pedido));
    }
}

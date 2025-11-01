package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

public record Enviado(Pedido pedido) implements iState {

    @Override
    public void pagar() {
        System.out.println("Pedido já pago e Enviado!");
    }

    @Override
    public void enviar() {
        System.out.println("Aguarde a chegada, pedido já enviado!");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregue com sucesso!");
        pedido .setEstado(new Entregue(pedido));
    }

    @Override
    public void cancelar() {
        System.out.println("Não é mais possível cancelar o pedido, pedido já enviado!");
    }
}

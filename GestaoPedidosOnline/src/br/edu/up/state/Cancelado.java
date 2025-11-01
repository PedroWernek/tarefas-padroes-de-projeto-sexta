package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

public record Cancelado(Pedido pedido) implements iState {

    @Override
    public void pagar() {
        retornarNovo();
    }

    @Override
    public void enviar() {
        retornarNovo();
    }

    @Override
    public void entregar() {
        retornarNovo();
    }

    @Override
    public void cancelar() {
        retornarNovo();
    }

    private void retornarNovo(){
        System.out.println("Pedido cancelado retornando ao estado normal!");
        pedido.setEstado(new Novo(pedido));
    }
}

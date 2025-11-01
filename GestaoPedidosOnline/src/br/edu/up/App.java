package br.edu.up;

import br.edu.up.state.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido();

        pedido.cancelar();
        pedido.pagar();
        pedido.pagar();
        pedido.entregar();
        pedido.enviar();
        pedido.pagar();
        pedido.entregar();
        pedido.cancelar();
    }
}

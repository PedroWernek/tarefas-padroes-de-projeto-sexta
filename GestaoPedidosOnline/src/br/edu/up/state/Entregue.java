package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

import java.util.Scanner;

public record Entregue(Pedido pedido) implements iState {

    @Override
    public void pagar() {
        System.out.println("Pedido já pago e entregue!");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido já entregue!");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido já entregue!");
    }

    @Override
    public void cancelar() {
        System.out.println("Deseja fazer a devolução do pedido?\n1- sim | 2- não");
        Scanner s = new Scanner(System.in);
        byte b = s.nextByte();

        if (b == 1) {
            System.out.println("pedido devolvido com sucesso! Enviamos um correio\npara pegar seu pedido e futuramente extornaremos seu dinheiro!");
            pedido.setEstado(new Cancelado(pedido));
        }
        System.out.println("Ok!");
        s.close();
    }
}

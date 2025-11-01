package br.edu.up.state;

import br.edu.up.state.interfaces.iState;

public class Pedido {
    private iState estado;

    public Pedido() {
        this.estado = new Novo(this);
    }

    protected void setEstado(iState estado) {
        this.estado = estado;
    }

    public void pagar() {
        estado.pagar();
    }

    public void enviar() {
        estado.enviar();
    }

    public void entregar() {
        estado.entregar();
    }

    public void cancelar() {
        estado.cancelar();
    }
}

package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private PedidoEstado estado;
    private List<PedidoEstado> memento = new ArrayList<>();

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        this.memento.add(estado);
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PedidoEstado> getEstados() {
        return memento;
    }
}

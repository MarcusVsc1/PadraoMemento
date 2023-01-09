package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoCancelado implements PedidoEstado {

    private PedidoEstadoCancelado() {}
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {return instance;}

    public String getNomeEstado() {
        return "Cancelado";
    }

}

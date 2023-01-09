package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoConfirmado implements PedidoEstado {

    private PedidoEstadoConfirmado() {}
    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();
    public static PedidoEstadoConfirmado getInstance() {return instance;}

    public String getNomeEstado() {
        return "Confirmado";
    }


}

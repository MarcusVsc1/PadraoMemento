package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoEmEntrega implements PedidoEstado {

    private PedidoEstadoEmEntrega() {}
    private static PedidoEstadoEmEntrega instance = new PedidoEstadoEmEntrega();
    public static PedidoEstadoEmEntrega getInstance() {return instance;}

    public String getNomeEstado() {
        return "Confirmado";
    }

}

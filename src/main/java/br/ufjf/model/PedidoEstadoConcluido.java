package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoConcluido implements PedidoEstado {

    private PedidoEstadoConcluido() {}
    private static PedidoEstadoConcluido instance = new PedidoEstadoConcluido();
    public static PedidoEstadoConcluido getInstance() {return instance;}

    public String getNomeEstado() {
        return "Concluído";
    }

}

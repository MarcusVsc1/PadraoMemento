package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoNovo implements PedidoEstado {

    private PedidoEstadoNovo() {}
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();
    public static PedidoEstadoNovo getInstance() {return instance;}

    public String getNomeEstado() {
        return "Novo";
    }

}

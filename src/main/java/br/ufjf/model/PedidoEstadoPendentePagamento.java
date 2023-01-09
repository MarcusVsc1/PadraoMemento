package br.ufjf.model;

import br.ufjf.interfaces.PedidoEstado;

public class PedidoEstadoPendentePagamento implements PedidoEstado {

    private PedidoEstadoPendentePagamento() {}
    private static PedidoEstadoPendentePagamento instance = new PedidoEstadoPendentePagamento();
    public static PedidoEstadoPendentePagamento getInstance() {return instance;}

    public String getNomeEstado() {
        return "Pendente Pagamento";
    }

}

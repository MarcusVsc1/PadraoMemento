import br.ufjf.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PedidoTest {

    @Test
    public void armazenarEstadosTest() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    public  void recuperarEstadoAnteriorTest() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPendentePagamento.getInstance());
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        pedido.setEstado(PedidoEstadoEmEntrega.getInstance());
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        pedido.restauraEstado(2);
        assertEquals(PedidoEstadoConfirmado.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido Pedido = new Pedido();
            Pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}

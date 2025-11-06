package br.com.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void fluxoNormal_DeveCriarPagarEEnviarPedido() {
        // Preparação
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new Produto("Notebook", 3000.0));

        // Execução da Sequência
        Pedido pedido = new Pedido(carrinho);
        assertEquals(Pedido.Status.CRIADO, pedido.getStatus(), "Deveria estar CRIADO");

        pedido.pagar();
        assertEquals(Pedido.Status.PAGO, pedido.getStatus(), "Deveria estar PAGO");

        pedido.enviar();
        assertEquals(Pedido.Status.ENVIADO, pedido.getStatus(), "Deveria estar ENVIADO");
    }

    @Test
    void fluxoExcecao_NaoDeveEnviarPedidoSemPagar() {
        // Preparação
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new Produto("Mouse", 100.0));
        Pedido pedido = new Pedido(carrinho);

        // Execução e Verificação da Exceção
        IllegalStateException excecao = assertThrows(IllegalStateException.class, () -> {
            pedido.enviar(); // Tentando pular a etapa de pagar
        });

        assertEquals("Pedido só pode ser enviado se estiver PAGO", excecao.getMessage());
    }
}
package br.com.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void fluxoNormal_DeveAdicionarItensECalcularTotal() {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(new Produto("Camiseta", 50.0));
        carrinho.adicionarItem(new Produto("Calça", 150.0));

        assertEquals(2, carrinho.getQuantidadeItens());
        assertEquals(200.0, carrinho.calcularTotal(), 0.001);
    }

    @Test
    void fluxoExcecao_NaoDeveRemoverItemInexistente() {
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Meia", 10.0);

        // Tenta remover algo que nunca foi adicionado
        assertThrows(IllegalStateException.class, () -> {
            carrinho.removerItem(produto1);
        });
    }
}
package br.com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarItem(Produto produto) {
        if (produto.getPreco() < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        itens.add(produto);
    }

    public void removerItem(Produto produto) {
        if (!itens.contains(produto)) {
            throw new IllegalStateException("Item não está no carrinho");
        }
        itens.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        return total;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }
}
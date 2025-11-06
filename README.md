# Servidor de E-commerce - Atividade 8

Integrantes: 
- Anderson Lucas do Nascimento Gondim RA: 24787293
- Arthur Sebastian Guarniz de Castro RA: 24795528
- Felipe Nonato Leoneli RA: 24021973
- Filipe Ribeiro Simões RA: 24007657
- Rafael Roveri Pires RA: 24007131
- William Kenzo Nakao RA: 24005718

## TEMA DO PROJETO:  Servidor simplificado de um e-commerce em java

Objetivo: demonstrar a aplicação de técnicas de teste unitário (INTRACLASSE) e de integração (INTERCLASSE)

No pacote `br.com.ecommerce`, contém as classes:

* **`Produto`**: Classe para itens com nome e preço.
* **`Carrinho`**: Gerencia uma lista de produtos. Usado para testes de partição por Categoria de Métodos.
* **`Pedido`**: Gerencia o ciclo de uma compra (CRIADO, PAGO, ENVIADO). Usada para testes de partição por Estados.
* **`CompraService`**: Serviço principal que gerencia o fluxo de finalização de compra. Usado para os testes INTERCLASSES.

## Como Executar

Recomendado executar e configurar no IntelliJ

1.  Abra o projeto no IntelliJ
2.  Faca o download das dependências
3.  Navegue até as classes de teste:
    - `src/br.com.ecommerce/PedidoTest.java`
    - `src/br.com.ecommerce/CarrinhoTest.java`
    - `src/br.com.ecommerce/CompraServiceTest.java`
4.  Clique no ícone "Run" para executar os testes e ver os resultados

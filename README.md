# Servidor de E-commerce
Servidor Teste em JAVA - Atividade 8 PI IV

Integrantes: 
- Anderson Lucas do Nascimento Gondim RA: 24787293
- Arthur Sebastian Guarniz de Castro RA: 24795528
- Felipe Nonato Leoneli RA: 24021973
- Filipe Ribeiro Simões RA: 24007657
- Rafael Roveri Pires RA: 24007131
- William Kenzo Nakao RA: 24005718

Este projeto é uma simulação simplificada de um servidor de e-commerce, desenvolvido em Java

O objetivo principal é demonstrar a aplicação de técnicas de teste unitário (INTRACLASSE) e de integração (INTERCLASSE)

## Estrutura do Projeto

No pacote `br.com.ecommerce`, o projeto contém as classes:

* **`Produto`**: Classe para itens com nome e preço.
* **`Carrinho`**: Gerencia uma lista de produtos. Usado para testes de partição por **Categoria de Métodos**.
* **`Pedido`**: Gerencia o ciclo de uma compra (CRIADO, PAGO, ENVIADO). Usada para testes de partição por **Estados**.
* **`CompraService`**: Serviço principal que gerencia o fluxo de finalização de compra. Usado para os testes **INTERCLASSES**.

## Como Executar os Testes

Este projeto é recomendado ser executado e configurado no **IntelliJ IDEA**.

1.  Abra o projeto no IntelliJ.
2.  Faca o download das dependências
3.  Navegue até as classes de teste:
    * `src/br.com.ecommerce/PedidoTest.java`
    * `src/br.com.ecommerce/CarrinhoTest.java`
    * `src/br.com.ecommerce/CompraServiceTest.java`
4.  Clique no ícone "Run" para executar os testes e ver os resultados

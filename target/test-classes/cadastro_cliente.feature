#language: pt

Funcionalidade: Carrinho


  Contexto:
    Dado que o usuario tenha efetuado o login no site

  Cenario: Adicionar produtos ao carrinho de compras
    Quando o usuario selecionar "Smartphone" e "SmartTV"
    Entao o produto aparecera no carrinho de compras

  Cenario: Excluir produto do carrinho
    E tenho produtos no carrinho
    Quando excluir o "Smartphone" do carrinho
    Entao o produto sera excluido do carrinho



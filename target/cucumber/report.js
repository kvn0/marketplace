$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/cadastro_cliente.feature");
formatter.feature({
  "name": "Carrinho",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuario tenha efetuado o login no site",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarrinhoSteps.queOUsuarioTenhaEfetuadoOLoginNoSite()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar produtos ao carrinho de compras",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "o usuario selecionar \"Smartphone\" e \"SmartTV\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CarrinhoSteps.oUsuarioSelecionarE(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto aparecera no carrinho de compras",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoSteps.oProdutoApareceraNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuario tenha efetuado o login no site",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarrinhoSteps.queOUsuarioTenhaEfetuadoOLoginNoSite()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Excluir produto do carrinho",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "tenho produtos no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.tenhoProdutosNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "excluir o \"Smartphone\" do carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CarrinhoSteps.excluirODoCarrinho(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto sera excluido do carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoSteps.oProdutoSeraExcluidoDoCarrinho()"
});
formatter.result({
  "status": "passed"
});
});
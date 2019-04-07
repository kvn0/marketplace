package cucumber.test;

import br.edu.flf.cadastro.service.CarrinhoAS;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoSteps {

    private CarrinhoAS carrinhoAS= new CarrinhoAS();
    private List<String> produtos = new ArrayList<>();

    @Dado("que o usuario tenha efetuado o login no site")
    public void queOUsuarioTenhaEfetuadoOLoginNoSite() {
        carrinhoAS.login();
    }

    @Quando("o usuario selecionar {string} e {string}")
    public void oUsuarioSelecionarE(String produto1, String produto2) {
        produtos.add(produto1);
        produtos.add(produto2);
        carrinhoAS.adicionarAoCarrinho(produtos);
    }

    @Entao("o produto aparecera no carrinho de compras")
    public void oProdutoApareceraNoCarrinhoDeCompras() {
        Assert.assertEquals(carrinhoAS.getCarrinhoCompras().getListaProduto().get(0).getNome(), produtos.get(0));
        Assert.assertEquals(carrinhoAS.getCarrinhoCompras().getListaProduto().get(1).getNome(), produtos.get(1));
    }

    @E("tenho produtos no carrinho")
    public void tenhoProdutosNoCarrinho() {
        carrinhoAS.adicionarAoCarrinho(produtos);
        Assert.assertFalse(carrinhoAS.getCarrinhoCompras().getListaProduto().isEmpty());
        Assert.assertEquals(carrinhoAS.getCarrinhoCompras().getListaProduto().size(), 2);
    }

    @Quando("excluir o {string} do carrinho")
    public void excluirODoCarrinho(String produto) {
        carrinhoAS.excluirProdutoCarrinho(produto);
    }

    @Entao("o produto sera excluido do carrinho")
    public void oProdutoSeraExcluidoDoCarrinho() {
        Assert.assertEquals(carrinhoAS.getCarrinhoCompras().getListaProduto().size(), 1);
    }
}

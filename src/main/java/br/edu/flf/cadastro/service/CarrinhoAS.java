package br.edu.flf.cadastro.service;

import br.edu.flf.cadastro.entity.Carrinho;
import br.edu.flf.cadastro.entity.Produto;
import br.edu.flf.cadastro.entity.Usuario;

import java.util.List;

public class CarrinhoAS {

   Carrinho carrinhoCompras = new Carrinho();

    public void login(){
        carrinhoCompras.setUsuario(new Usuario(1, "Kevin", "kvn0", "senha123"));
    }

    public void adicionarAoCarrinho(List<String> produtos){
        carrinhoCompras.getListaProduto().add(new Produto(1,
                "Smartphone",
                "Smartphone 8GB de RAM, 64Gb de Interna, Octa Core",
                3200.00));
        carrinhoCompras.getListaProduto().add(new Produto(1,
                "SmartTV",
                "TV 49 polegadas 4K UltraFina",
                4000.00));
    }


    public void excluirProdutoCarrinho(String produto){

        for(Produto prod: carrinhoCompras.getListaProduto()){
            if(produto.equals(prod.getNome()))
                carrinhoCompras.getListaProduto().remove(prod);
        }
    }

    public Carrinho getCarrinhoCompras() {
        return carrinhoCompras;
    }
}

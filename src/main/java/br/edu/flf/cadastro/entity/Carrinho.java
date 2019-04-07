package br.edu.flf.cadastro.entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    Usuario usuario;
    List<Produto> listaProduto;

    public Carrinho(){
        this.usuario = new Usuario();
        this.listaProduto = new ArrayList<>();
    }

    public Carrinho(Usuario usuario, List<Produto> listaProduto) {
        this.usuario = usuario;
        this.listaProduto = listaProduto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
}

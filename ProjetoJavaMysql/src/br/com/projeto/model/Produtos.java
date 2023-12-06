/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.model;

/**
 *
 * @author teste
 */
public class Produtos {

  private int id;
    private String descricao;
    private Double preco;
    private Integer qtd_estoque;
    private Integer for_id;
    private Fornecedores Fornecedor;

    
      public int getId() {
        return id;
    }
    
        public void setId(int id) {
        this.id=id;
        }

    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(Integer qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public Integer getFor_id() {
        return for_id;
    }

    public void setFor_id(Integer for_id) {
        this.for_id = for_id;
    }
    
    
    public Fornecedores getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(Fornecedores Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

   
    
    
    
}

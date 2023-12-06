
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author teste
 */
public class ProdutoDAO {
   
    private Connection con;
    public ProdutoDAO(){
    this.con= new ConnectionFactory().getConnection();
    }
        
    
    public void cadastrarProduto(Produtos obj){
        try {
            String sql="insert into tb_produtos (descricao,preco,qtd_estoque,for_id)values(?,?,?,?)";
    
    PreparedStatement stmt=con.prepareStatement(sql);
    stmt.setString(1,obj.getDescricao());
    stmt.setDouble(2,obj.getPreco());
    stmt.setDouble(3,obj.getQtd_estoque());
    stmt.setInt(4,obj.getFornecedor().getId());
    
    stmt.execute();
    stmt.close();
    
    JOptionPane.showMessageDialog(null,"cadastrado com sucesso");
     
        } catch (Exception erro) {   
            JOptionPane.showMessageDialog(null,"Erro"+ erro);

                    }      
        
    }

    public List<Produtos> ListarProdutos(){
        try {
            
         List<Produtos> lista = new ArrayList<>(); 
            
           String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
                        + "inner join tb_fornecedores as f on(p.for_id=f.id)";
                                
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
             Produtos obj = new Produtos();
             Fornecedores f = new Fornecedores();
             obj.setId(rs.getInt("p.id"));
             obj.setDescricao(rs.getString("p.descricao"));
             obj.setPreco(rs.getDouble("p.preco"));
             obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
             f.setNome(rs.getString("f.nome"));
             obj.setFornecedor(f);
             
            lista.add(obj);
            
            }                           
             return lista;
        } 
        
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro dao exeption"+ erro);
           return null;
        }
    
    
    }
    
    public void AlterarProduto(Produtos obj ){
   
   try {
           
String sql ="update tb_produtos set descricao=?,preco=?,qtd_estoque=?, for_id=? where id=?";
      
           PreparedStatement stmt = con.prepareStatement(sql);
           
           stmt.setString(1,obj.getDescricao());
           stmt.setDouble(2,obj.getPreco());
           stmt.setDouble(3,obj.getQtd_estoque());
           stmt.setInt(4,obj.getFornecedor().getId());
           stmt.setInt(5,obj.getId());
           stmt.execute();
           
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            
           stmt.close();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"erro"+ e);
       }
   }

    public void ExcluirProduto(Produtos obj){
       try {
           String sql= "delete from tb_produtos where id=?";
           PreparedStatement stmt = con.prepareStatement(sql);
           System.out.println("ID  Capturado - Excluir ID"+obj.getId());
           stmt.setInt(1, obj.getId());
           stmt.execute();
           stmt.close();
           
           JOptionPane.showMessageDialog(null, "Excluido com sucesso");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Erro de exclusão"+ e);
       }
   }
    
    public List<Produtos> PesquisarProdutosPorNome(String nome) {
       
        try {
            List<Produtos> pesquisa = new ArrayList<>();
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
                        + "inner join tb_fornecedores as f on(p.for_id=f.id) and p.descricao like ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){            
            
           Produtos obj = new Produtos();
           Fornecedores f = new Fornecedores();
           /*nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado*/
           obj.setId(rs.getInt("p.id"));
           obj.setDescricao(rs.getString("p.descricao"));
           obj.setPreco(rs.getDouble("p.preco"));
           obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
           
           f.setNome(rs.getString("f.nome"));
           obj.setFornecedor(f);
 
          pesquisa.add(obj);
                     
            }
            
            return pesquisa;
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro dao exeption"+ e);
           return null;
        }
        
}
    
     public Produtos PesquisarProdutosPorCodigo(int id) {
       
        try {
            //List<Produtos> pesquisa = new ArrayList<>();
            String sql = "select * from tb_produtos where id=?";
            
            // String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
            //;;            + "inner join tb_fornecedores as f on(p.for_id=f.id) and p.id=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
             Produtos obj = new Produtos();
            while(rs.next()){            
            
          
           Fornecedores f = new Fornecedores();
           /*nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado*/
           obj.setId(rs.getInt("id"));
           obj.setDescricao(rs.getString("descricao"));
           obj.setPreco(rs.getDouble("preco"));
           obj.setQtd_estoque(rs.getInt("qtd_estoque"));
           
                System.out.println("nome"+obj.getDescricao());
           
//           f.setNome(rs.getString("f.nome"));
//           obj.setFornecedor(f);
            
            }          
            return obj;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro dao exeption"+ e);
           return null;
        }
         
     }
     }
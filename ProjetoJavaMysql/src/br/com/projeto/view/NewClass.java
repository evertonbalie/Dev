/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.dao.AlunoDAO;
import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.model.Aluno;
import br.com.projeto.model.Clientes;


/**
 *
 * @author everton.rodrigues
 */
public class NewClass {
    
    
    
    public static void main(String[] args) {
        
//        ClientesDAO dao = new ClientesDAO();
//        dao.PesquisarClientesPorCpf("1");
//        Clientes a = new Clientes();
//        System.out.println(""+a.getNome());

        Aluno ab = new Aluno();
        AlunoDAO da = new AlunoDAO();
        ab=da.retornaAluno();
        
        
             
 System.out.println("nome:"+ab.getNome());
        
        
        
        
    
    }
}

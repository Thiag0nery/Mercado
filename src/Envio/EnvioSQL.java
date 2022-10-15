/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envio;

import Estoque.Produto;
import connection.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author thiago
 */
public class EnvioSQL {
    Produto produto = new Produto();
    public void Enviar(Produto metado){
        
        Connection con =  ConnectionFactory.getConnection();
        PreparedStatement stml = null;
        try {
            
            
            stml = con.prepareStatement("INSERT INTO estoque (produto,quantidade,preco,codico) VALUES(?,?,?,?)");
            stml.setString(1,metado.getNomeProduto());
            stml.setInt(2, metado.getQuantidade());
            stml.setDouble(3,metado.getPreco());
            stml.setInt(4,metado.getCodico());
            
            stml.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deu certo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu errado");
        }
        finally{
           ConnectionFactory.closeConnection(con, stml);
        }
    }
     public void Deletar(Produto metado){
        
        Connection con =  ConnectionFactory.getConnection();
        PreparedStatement stml = null;
        try {
            
            
            stml = con.prepareStatement("DELETE FORM estoque WHERE item = ?");
            stml.setInt(5,metado.getId());
            stml.executeUpdate();
            JOptionPane.showMessageDialog(null, "DELATADOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DEU ERRADO");
        }
        finally{
           ConnectionFactory.closeConnection(con, stml);
        }
    }
    
    
    public List<Produto> list(){
         Connection con =  ConnectionFactory.getConnection();
            PreparedStatement stml = null;
            ResultSet rs = null;
            ArrayList<Produto> produtos = new ArrayList<>();
        try {
            stml = con.prepareStatement("SELECT * FROM estoque");
            rs = stml.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
               
                produto.setNomeProduto(rs.getString("produto"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setCodico(rs.getInt("codico"));
                produtos.add(produto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EnvioSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stml, rs);
        }
        
        return produtos;
    }
   
    
     public void Atualizar(Produto metado){
        
        Connection con =  ConnectionFactory.getConnection();
        PreparedStatement stml = null;
        try {
            
            
            stml = con.prepareStatement("UPDATE estoque SET produto = ?,quantidade = ?,preco = ?,codico = ? WHERE item = ?");
            stml.setString(1,metado.getNomeProduto());
            stml.setInt(2, metado.getQuantidade());
            stml.setDouble(3,metado.getPreco());
            stml.setInt(4,metado.getCodico());
            stml.setInt(5,metado.getId());
            
            stml.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar o produto");
        }
        finally{
           ConnectionFactory.closeConnection(con, stml);
        }
    }
}

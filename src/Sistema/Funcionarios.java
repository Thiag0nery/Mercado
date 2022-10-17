/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import Main.Caixa;
import Main.Login;
import java.io.File;

/**
 *
 * @author thiago
 */
public class Funcionarios {
    private String pessoa;
    
    public String getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    
    public void  Funcionarios( String funcionario, String senha){
        if(funcionario.equals("THIAGO") && senha.equals("1234")){
             new Caixa().setVisible(true);
             
        }
        else if(funcionario.equals("ANGELO") && senha.equals("4562")){
            new Caixa().setVisible(true);
           
        }
        else if(funcionario.equals("BRUNO") && senha.equals("9854")){
            new Caixa().setVisible(true);
           
        }
        else if(funcionario.equals("GABRIEL") && senha.equals("3248")){
            new Caixa().setVisible(true);
            
        }
    }
}

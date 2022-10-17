/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import Main.Caixa;
import Sistema.Soma;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author thiago
 */
public class Impressao {
    Caixa caixa = new Caixa();
    Soma soma = new Soma();
    public void Arquivo( String file){
        
        boolean subpasta = new File("C:\\Receitas").mkdir();
        
        File Outra = new File("C:\\Receitas\\"+ file +".txt");
        
        String Funcionario = "Thiago";
       
        String data = "2000";
        
        String[] Arquivo = new String[]{
            Funcionario,
         
            data
        };
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(Outra))){
           for(String linha: Arquivo){
                bw.write(linha);
                bw.newLine();
           }
       }
       catch( IOException e){
           e.printStackTrace();
       }
        
        
        
        
    }
    
}

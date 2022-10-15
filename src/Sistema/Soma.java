/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

/**
 *
 * @author thiago
 */
public class Soma {
    private double Number;
    private double resultado;
    
    public double Somando(double numero){
        return this.Number += numero;
    }
    public double Unitario(double numero, int Unitario){
        return this.Number = numero * Unitario;
    }
    public String Resultado(){
        return String.format("%.2f", this.resultado);
    }
    public void Resultado(double Recebido, double Subtotal){
       this.resultado =  (Subtotal - Recebido);
    }

    @Override
    public String toString() {
        return  String.format("%.2f",this.Number);
    }
    
    
    
}

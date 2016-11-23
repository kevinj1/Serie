/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_im;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class modelo {
    
    double a;
    double b;
    double n;
    double limite;

    public modelo(double a, double b, double n, double limite) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.limite = limite;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void calcular(){
        
  
        double resultado = 0;
        
        for (int i = 1; i <= this.limite; i++) {
            if (i == 1) {
                resultado = resultado + (1 / this.a);

            } else {
                resultado = resultado + (1 / ((this.a + (this.n * this.b))));

                this.n = this.n + 1;
            }
        }  
        
        
        
        
        JOptionPane.showMessageDialog(null, "el resultado es: "+resultado);
        
        
        
        
    }
    
    
}

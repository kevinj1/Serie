
package Centigrados;

import javax.swing.JOptionPane;


public class nuevo {
    public double numero;
    public int opcion;

    public nuevo(double numero, int opcion) {
        this.numero = numero;
        this.opcion = opcion;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void calcular(){
        double almacenar;
        
        switch(opcion){
            
            case 1:
                //Formula para transformar grados centigrados a fahrenheit
                almacenar = (numero*9/5)+32;                             
                JOptionPane.showMessageDialog(null,almacenar);
                break;
            case 2:
                almacenar = (numero-32)*5/9;
                JOptionPane.showMessageDialog(null,almacenar);
                break;
        }
    }
    
}

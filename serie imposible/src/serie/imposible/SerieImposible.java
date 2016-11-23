/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie.imposible;

import javax.swing.JOptionPane;
import serie_im.modelo;

/**
 *
 * @author usuario
 */
public class SerieImposible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double a,b,limite,n;
        a=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de A: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de B: "));
        n=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de limite: "));
        limite=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de N: "));
        modelo objeto=new modelo(a, b, n, limite);
        objeto.calcular();
        
    }
    
}

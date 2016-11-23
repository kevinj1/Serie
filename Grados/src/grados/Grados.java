
package grados;

import Centigrados.nuevo;
import javax.swing.JOptionPane;


public class Grados {

    
    public static void main(String[] args) {
        int opcion;
        double numero;
        
       
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor"));

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opcion:\n1) Si desea convertir a grados Farenheit\n2) Si desea convertir a grados Centigrados"));
        
        nuevo objeto= new nuevo(numero,opcion);
        objeto.calcular();
    }
    
}

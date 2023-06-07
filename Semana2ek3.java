/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2ek3;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class Semana2ek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 = Sábado.");
        
        String dia= JOptionPane.showInputDialog("Digite el numero de dia");
        int dias = Integer.parseInt(dia);
        
        if (dias == 1)
            System.out.println("El dia es Domingo " + "El dia es libre");
        else if (dias == 2)
            System.out.println("El dia es Lunes "+ "El dia es laborable" );
        else if (dias == 3)
            System.out.println("El dia es Martes "+ "El dia es laborable");
        else if (dias == 4)
            System.out.println("El dia es Miercoles " + "El dia es laborable");
        else if (dias == 5)
            System.out.println("El dia es Jueves " + "El dia es laborable");
        else if (dias == 6)
            System.out.println("El dia es Viernes " + "El dia es laborable");
        else 
            System.out.println("El dia es Sabado " + "El dia es libre");
        
        
        
    }
    
}

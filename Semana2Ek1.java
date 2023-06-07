/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2.ek1;

import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class Semana2Ek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        String salario = JOptionPane.showInputDialog("Digite su salario");
        
        double sal = Integer.parseInt(salario);
        double deducciones = 9.34;
        double salbruto = sal*4;
        double salneto= (salbruto * deducciones)/100;
        
        System.out.println("Su nombre es "+ nombre);
        System.out.println("Salario bruto: "+ salbruto);
        System.out.println("Deducciones: "+ deducciones);
        System.out.println("Salario neto: "+ salneto);
        
        
        
    }
    
}

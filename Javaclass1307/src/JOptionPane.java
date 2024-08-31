/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;

/**
 *
 * @author andre
 */
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //CONSTRUIR VENTADA
        String NombreUser=javax.swing.JOptionPane.showInputDialog("Introduce tu nombre");
        String edad=javax.swing.JOptionPane.showInputDialog("Introduce tu edad");
        System.out.println("Hola "+NombreUser);
        
        //Integer.parseInt() = Convertir de String a Int
        //printf("%1.2f", parametro)
        String numero=javax.swing.JOptionPane.showInputDialog("ingrese numero");
        double numeroo=Double.parseDouble(numero);
        System.out.print("la raiz de "+numeroo+" es " );
        System.out.printf("%1.2f", Math.sqrt(numeroo));
        
    }
    
}

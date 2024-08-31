
import java.util.Scanner;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mi_nombre= "Andrea";
        String tu_nombre= "yo";
        
        //.lenght funciona para contar la cantidad de una cadena
        System.out.println(mi_nombre.length());
       //.charAt funciona para saber la posicion de una letra
        System.out.println(mi_nombre.charAt(5));
        int ultimletra=mi_nombre.length();
        System.out.println("La ultima letra es"+ mi_nombre.charAt(ultimletra-1));
        
        //substring(x,y)
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero de DPI");
        String DPI= entrada.next();;
        String fraseresumen= DPI.substring(0, 3);
        System.out.println(fraseresumen);
        if(fraseresumen.equals("1231")){
            System.out.println("codigo correcto");
            
        
        //equuals(cadena) / distingue mayusculas y minusculas
        //equalsIgnoreCase()=No valida o distingue entre mayusculas/minusculas
        
        
        //JOPTION PANE*******************************
        
        }
       
        
        
        
       
        
        
    }
    
}

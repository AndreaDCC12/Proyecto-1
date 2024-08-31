
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Newwxercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
                System.out.println("Ingrese direccion de correo electronico");
        Scanner entrada=new Scanner(System.in);
        String correo=entrada.nextLine();
        for(int x=0;x<=correo.length();x++){
             if(correo.charAt(x)=='@'){
                 System.out.println("Correo valido");
             }
            
        }
    }
    
}

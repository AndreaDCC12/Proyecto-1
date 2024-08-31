/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import javax.swing.*;

public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasena="Yo";
        String contra = "";

        while (contrasena.equalsIgnoreCase(contra) == false) {

            contra = javax.swing.JOptionPane.showInputDialog("Introduce tu contrasena");
            if(contrasena.equalsIgnoreCase(contra)==false){
                System.out.println("Incorrecta");
            } else{
                System.out.println("Correcta");
            }

        }

    }

}




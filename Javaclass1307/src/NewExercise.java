/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class NewExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio=(int)(Math.random()*5);
        System.out.println(aleatorio);
        String aleatorioo = Integer.toString(aleatorio);
        if(aleatorioo.equalsIgnoreCase("2")){
            System.out.println("Acertaste");
        }
    }
    
}


package javaaprendizaje;

public class Video11_ClaseString {

    public static void main(String[] args) {
        // 
        String nombre="Juan";
        System.out.println("Su nombre es: "+nombre);
        
        //cuantas letras tiene el nombre .lenght()
        System.out.println("Mi nombre tiene: "+nombre.length()+" letras");
        
        //Cual es la letra de la posición x nombre.charAt(x)
        System.out.println("La primera letra de tu nombre es: "+nombre.charAt(0));
        
        //averiguar la ultima letra
        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("Y la ultima letra es la : "+nombre.charAt(ultima_letra-1));
    }
    
}

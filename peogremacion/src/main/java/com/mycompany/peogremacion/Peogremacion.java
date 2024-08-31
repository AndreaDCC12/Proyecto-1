/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peogremacion;

/**
 *
 * @author andre
 */
public class Peogremacion {

    
private int valor;
Peogremacion(int valor){
this.valor=valor;
}
}
public class Principal{
public static void main(String[] args) {
peogremacion a = new PreguntaUno( 3);
PreguntaUno b = new PreguntaUno( -4);
PreguntaUno z = new PreguntaUno( 0);
z.valor=a.valor+b.valor;
z.valor++;
System.out.println(z.valor);
}


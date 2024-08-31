/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author andre
 */
public class archivos {
    
import java.io.*;
/**
 *
 * @author PERSONal
 */
public class Archivo {
    //rsonas nuevaPersona = new Personas(nombre1, nombre2, apellido1, apellido2, telefono, correo);
    
    public void escribirPersona(Personas nuevaPersona){
        try {
            File f= new File("agenda.txt");
            FileWriter fw;
            BufferedWriter bw;            
            if(f.exists() && f.length()!=0){
                fw =new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nuevaPersona.getNombre1()+"%"+nuevaPersona.getNombre2()+"%"+nuevaPersona.getApellido1()+"%"+nuevaPersona.getApellido2()+"%"+nuevaPersona.getTelefono()+"%"+nuevaPersona.getCorreo());
            } else {
                fw=new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(nuevaPersona.getNombre1()+"%"+nuevaPersona.getNombre2()+"%"+nuevaPersona.getApellido1()+"%"+nuevaPersona.getApellido2()+"%"+nuevaPersona.getTelefono()+"%"+nuevaPersona.getCorreo());
            }
            bw.close();
            fw.close();            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void mostrararchivo(){
        try {
            File f=new File("agenda.txt");            
            if (f.exists()){
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;                
                while((linea = br.readLine())!=null){
                    String [] contacto = linea.split("%");
                    Personas p = new Personas(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5]);
                    System.out.println(p.toString());
                }
                br.close();
                fr.close();
            } else {
                System.out.println("Agenda no existente");
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }// fin de mostrararchivo
    
    public void buscar(String nombreBuscar){
        try {
            File f= new File("agenda.txt");
            if (f.exists()){
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;                
                boolean encontrado = false;
                while((linea = br.readLine())!=null){
                    String [] contacto = linea.split("%");
                    if (contacto[0].equalsIgnoreCase(nombreBuscar)) {
                        encontrado = true;
                        Personas p = new Personas(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5]);
                        System.out.println("Persona Encontrada: ");
                        System.out.println(p.toString());
                    }
                    
                }
                br.close();
                fr.close();
                if (encontrado == false ){
                    System.out.println("Persona no encontrada!");
                }
            } else {
                System.out.println("No hay registros.");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }// fin de buscar
    
    public void eliminar (String nombreEliminar){
        try {
            File f= new File("agenda.txt");
            if (f.exists()){
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;                
                int numeroLineas=0;
                while((linea = br.readLine())!=null){
                    numeroLineas++;
                }//fin del while
                System.out.println("Cantidad de Registros: "+ numeroLineas);
                String contacto[] = new String[numeroLineas];
                //vamos a inicializar un nuevo buffer
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i = 0;
                while ((linea=br.readLine())!=null) {
                    contacto[i] = linea;
                    i++;
                }//fin del while
                br.close();
                fr.close();                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(fw);
                boolean eliminado = false;
                boolean primerLinea = true;
                for (int j = 0; j < contacto.length; j++) {
                    String nuevaLinea [] = contacto[j].split("%");
                    if (nuevaLinea[0].equalsIgnoreCase(nombreEliminar) ){
                        eliminado = true;
                        System.out.println("Registro eliminado!");
                    } else {
                        if (primerLinea == true){
                            bw.write(contacto[j]);
                            primerLinea = false;
                        } else{
                            bw.newLine();
                            bw.write(contacto[j]);
                        }
                        
                    }
                }//fin del for
                if (eliminado==false) {
                    System.out.println("No se encontro registro.");
                }
                bw.close();
                fw.close();                
                if (numeroLineas==1 && eliminado == true) {
                    f.delete();
                }
            } else {
                System.out.println("No hay registros que eliminar.");
            }
        } catch (Exception e) {
        }
    }
            
}


}

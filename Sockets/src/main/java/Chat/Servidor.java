/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoServidor mimarco = new MarcoServidor();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoServidor extends JFrame implements Runnable {

    public MarcoServidor() {

        setBounds(1200, 300, 280, 350);

        JPanel milamina = new JPanel();

        milamina.setLayout(new BorderLayout());

        areatexto = new JTextArea();

        milamina.add(areatexto, BorderLayout.CENTER);

        add(milamina);

        setVisible(true);

        //creacion de nuevo hilo
        Thread hilo = new Thread(this);
        hilo.start();

    }

    private JTextArea areatexto;

    @Override
    public void run() {
        try {
            //clase server socket construye un puente del servidor
            ServerSocket servidor = new ServerSocket(9999);
            //Detecta cuando alguien se conecta al servidor----------
            InetAddress localizar= servidor.getInetAddress();
            String iplocalizar=localizar.getHostAddress();
            System.out.println("En linea : "+iplocalizar);
            //termina codigo
            
            //Aceptar conexiones del exterior
            //crear bucle
            String nombre, ip, mensajee;
            informacion paquete_recibido;

            while (true) {
                Socket socketchat = servidor.accept();
                ObjectInputStream paquete_datos = new ObjectInputStream(socketchat.getInputStream());
                paquete_recibido = (informacion) paquete_datos.readObject();

                nombre = paquete_recibido.getNombre();
                ip = paquete_recibido.getIp();
                mensajee = paquete_recibido.getMensajee();

                areatexto.append("\n" + nombre + " : " + mensajee + " para " + ip);
                //Flujo de entrada que va a utilizar como medio de transporte
                //DataInputStream entrada= new DataInputStream(socketchat.getInputStream());
                //
                //String texto=entrada.readUTF();
                //areatexto.append("\n"+texto);

                //se cierra la conexion
                
                //Creacion de socket para reenviar la informacion 
                
                Socket enviaInformacion=new Socket(ip,9090);
                ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaInformacion.getOutputStream());
                paqueteReenvio.writeObject(paquete_recibido);
                enviaInformacion.close();
                
                socketchat.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

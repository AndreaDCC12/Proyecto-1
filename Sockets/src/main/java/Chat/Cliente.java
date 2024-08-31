/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;

public class Cliente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoCliente mimarco = new MarcoCliente();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCliente extends JFrame {

    public MarcoCliente() {

        setBounds(600, 300, 280, 350);

        LaminaMarcoCliente milamina = new LaminaMarcoCliente();

        add(milamina);

        setVisible(true);
    }

}

class Envioip extends  WindowAdapter{
   
    public void windowOpened(WindowEvent e){
        try {
            Socket socketchat=new Socket("192.168.0.14", 9999);
            
            informacion datos=new informacion();
  
        }catch (Exception i){
            
        }
    }

}

class LaminaMarcoCliente extends JPanel implements Runnable{

    public LaminaMarcoCliente() {
        
        String nombreUsuario=JOptionPane.showInputDialog("Por favor ingresa tu nombre");
        
        JLabel nick= new JLabel("Nombre: ");
        add (nick);
        nombre = new JLabel();
        nombre.setText(nombreUsuario);
        
        add(nombre);

        JLabel texto = new JLabel("En linea: ");
        add(texto);
        
         ip = new JTextField(8);
        add(ip);

        campoareachat = new JTextArea(12, 20);
        add(campoareachat);

        campo1 = new JTextField(20);
        add(campo1);

        miboton = new JButton("Enviar");
        EnviarMensage mievento = new EnviarMensage();
        miboton.addActionListener(mievento);
        add(miboton);
        
        //crear hilo
        Thread mihilo=new Thread(this);
        mihilo.start();

    }

    @Override
    public void run() {
        try{
            ServerSocket servidor_cliente=new ServerSocket(9090);
            Socket cliente;
            informacion paqueteRecibido;
            while(true){
               cliente=servidor_cliente.accept();
                ObjectInputStream flujoentrada=new ObjectInputStream(cliente.getInputStream());
                paqueteRecibido=(informacion) flujoentrada.readObject();
                campoareachat.append("\n" + paqueteRecibido.getNombre()+" : " + paqueteRecibido.getMensajee());
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private class EnviarMensage implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            campoareachat.append("\n" + "Yo: "  +  campo1.getText());
            
            try {
                //Creacion del socket.

                Socket socketchat = new Socket("192.168.0.14", 9999);
                informacion datos = new informacion();

                //obtener los datos ingresados en un paquete para enviiarlos al servidor
                datos.setNombre(nombre.getText());
                datos.setIp(ip.getText());
                datos.setMensajee(campo1.getText());
                //Flujo para enviar el objeto al destinatario
                ObjectOutputStream paquetedatos = new ObjectOutputStream(socketchat.getOutputStream());
                paquetedatos.writeObject(datos);
                socketchat.close();
                //flujo de datos de salida
                //DataOutputStream salida=new DataOutputStream(socketchat.getOutputStream());
                //  salida.writeUTF(campo1.getText());
                //  salida.close();
            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }

        }
    }

    private JTextField campo1, ip;
    private JLabel nombre;
    private JTextArea campoareachat;
    private JButton miboton;

}

//Crear constructor para almacenar informacion
//Serialiazable, se indica al programa que todas las instancias van a ser capaces de convertires en una serie de bytes para poder ser enviadas a través de la red
class informacion implements Serializable{

    private String nombre, ip, mensajee;

    public String getNombre() {
        return nombre;
    }

    public String getIp() {
        return ip;
    }

    public String getMensajee() {
        return mensajee;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMensajee(String mensajee) {
        this.mensajee = mensajee;
    }

}

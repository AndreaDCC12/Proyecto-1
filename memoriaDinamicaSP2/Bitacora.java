package memoriaDinamicaSP2;

/**
 * @author JennyMorales 7690-08-6790
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Bitacora {
	File archivoBitacora;
	
	//Constructor 
	public Bitacora() {
	}

	public void guardar(String usuario, String transaccion) {
		System.out.println("Guardar registro en el txt.");
		try {
			archivoBitacora = new File("bitacoraRegistros.txt");
			if(!archivoBitacora.exists()) {
				if(archivoBitacora.createNewFile()) {
					System.out.println("Se ha crearo el archivo bitácora con exito.");
				}
			}else {
				System.out.println("El archivo bitácora  ya existe...");
			}
			FileWriter escribir = new FileWriter(archivoBitacora, true);
			escribir.write("\n|  " + usuario + "  |    " + transaccion + "   |     " + LocalDateTime.now() +"  |  ");
			escribir.close();
		}catch (IOException e){
			e.printStackTrace(System.out);
		}
	}
		
	/*public void crearArchivo() {
		
		try {
		 bitacora = new File("bitacoraRegistros.txt");
			if(!bitacora.exists()) {
				if(bitacora.createNewFile()) {
				System.out.println("Se ha crearo el archivo bitácora con exito.");
				}
			}else {
				System.out.println("El archivo bitácora  ya existe...");
			}
		}catch (IOException e){
			e.printStackTrace(System.out);
		}
	}
	
	public void agregarRegistros(String usuario, String transaccion) {
		System.out.println("bitacora" + bitacora);
		try {
			FileWriter escribir = new FileWriter(bitacora, true);
			escribir.write("\n|  " + usuario + "  |    " + transaccion + "   |     " + LocalDateTime.now() +"  |  ");
			escribir.close();
		}catch(IOException e) {
			e.printStackTrace(System.out);
		}
	}*/
}

package memoriaDinamicaSP2;

import javax.swing.JFrame;
import java.awt.event.*;
import java.util.Iterator;

/**
 * @author Jenny<morales
 */
public class ColaProcesos {
	private NodoCola primero;
	private NodoCola fin;
	private int tamanioCola;
	private int memoriaT = 0;
	private int memoriaSo = 0;
	
	
	public int getMemoriaT() {
		return memoriaT;
	}


	public void setMemoriaT(int memoriaT) {
		this.memoriaT = memoriaT;
	}


	public int getMemoriaSo() {
		return memoriaSo;
	}


	public void setMemoriaSo(int memoriaSo) {
		this.memoriaSo = memoriaSo;
	}

	
	public int getTamanioCola() {
		return tamanioCola;
	}


	public void setTamanioCola(int tamanioCola) {
		this.tamanioCola = tamanioCola;
	}


	//Constructor
	public void ColaProcessos(int memoriaT , int memoriaSo) {
		primero = null;
		fin = null;
		tamanioCola = 0;
		this.memoriaT = memoriaT;
		this.memoriaSo = memoriaSo;
		
	}
	
	
	public boolean esVacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Método para agregar a la cola un nuevo nodo
	 */
	public void push(Proceso proceso) {
		NodoCola nuevo;
		if (esVacia()) {
			nuevo = new NodoCola(proceso, null);
			primero = nuevo;
			fin = nuevo;
		} else {
			nuevo = new NodoCola(proceso, null);
			fin.setSiguiente(nuevo);// Agregar el nuevo nodo al final de la lista
			fin = nuevo;// Actualizar la referencia del nodo
		}
		tamanioCola++;
	}
	
	/**
	 * Método para imprimir la cola 
	 */
	public void mostrarProcesoCola() {
		NodoCola auxCola = primero;
		System.out.println("***************COLA PROCESOS*********************");
		System.out.println("Memoria total: " + memoriaT);
		System.out.println("Memoria Sistema OP: " + memoriaSo);
		while (auxCola != null) {
			System.out.println("[" + auxCola.getProceso().toString() + " ]" );
			auxCola = auxCola.getSiguiente();

		}
	}
	
	/*
	 * Método para obtener el indice
	 */
	public Proceso get(int index) {
	    if (index < 0 || index >= tamanioCola) {
	        throw new IndexOutOfBoundsException("Índice fuera de los límites de la cola");
	    }

	    NodoCola aux = primero;
	    for (int i = 0; i < index; i++) {
	        aux = aux.getSiguiente();
	    }

	    return aux.getProceso();
	}

	
}
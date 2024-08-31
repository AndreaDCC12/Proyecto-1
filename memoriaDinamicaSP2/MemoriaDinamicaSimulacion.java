package memoriaDinamicaSP2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.SwingConstants;
import java.awt.Color;

public class MemoriaDinamicaSimulacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<DefaultTableModel> modelosTablas;
	private JTable table;
	private ColaProcesos colaProcesos;
	private int contadorTablas = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoriaDinamicaSimulacion frame = new MemoriaDinamicaSimulacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Contructor que recibe la lista de procesos
	public void setListaProcesos(ColaProcesos cola) {
		// TODO Auto-generated method stub
		this.colaProcesos = cola;
		 // Llenar la tabla con los datos de la lista de procesos
	    agregarProceso(colaProcesos);
	}
	
	/**
	 * Create the frame.
	 */
	public MemoriaDinamicaSimulacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 236, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblInstante = new JLabel("Tabla de procesos");
		lblInstante.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstante.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		lblInstante.setBounds(43, 40, 333, 29);
		contentPane.add(lblInstante);
		
		modelosTablas = new ArrayList<>();
		
		//tabla con encabezados fijos
		//String[] encabezado = {"Nombre", "Tamano", "Llegada", "Duracion"};
		DefaultTableModel modeloTabla = new DefaultTableModel(null, new String[]{"Nombre Proceso", "Tamaño", "Tiempo Llegada", "Duración"});
        modelosTablas.add(modeloTabla);

		table = new JTable(modeloTabla);
		table.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		table.setBounds(43, 112, 333, 151);
		contentPane.add(table);
		/*table = new JTable();
		table.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] { "Nombre Proceso", "Tamano", "Tiempo Llegada", "Duracion"}
		));
						
		table.setBounds(43, 112, 333, 151);
		contentPane.add(table);*/

	}
	
	/**
	 * Método para llenar la Jtable con los procesos
	 * @param listaProcesos
	 */
	 public void agregarProceso(ColaProcesos listaProcesos) {
	        // Crear un nuevo modelo de tabla basado en el último modelo
	        DefaultTableModel nuevoModeloTabla = new DefaultTableModel();
	        Proceso proceso = colaProcesos.get(contadorTablas);
	        // Agregar el nuevo proceso al nuevo modelo de tabla
	        Object[] rowData = {proceso.getNombreProceso(), proceso.getTamamio(), proceso.getTiemLlegada(), proceso.getDuracion()};
	        nuevoModeloTabla.addRow(rowData);

	        // Agregar el nuevo modelo de tabla a la lista de modelos
	        modelosTablas.add(nuevoModeloTabla);

	        // Actualizar la tabla con el nuevo modelo
	        table.setModel(nuevoModeloTabla);
	        
	        // Cambiar el título de la ventana
	        setTitle("Tabla de procesos " + contadorTablas);
	        contadorTablas++;
	    }
	/*public void llenarTablaConProcesos(ColaProcesos listaProcesos) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Limpiar la tabla antes de agregar nuevos datos
        model.setRowCount(0);
        
     // Verificar si la cola de procesos es null
        if (colaProcesos == null) {
            return;
        }
        
       
       // Iterar sobre la lista de procesos y agregarlos a la tabla
        for (int i = 0; i < colaProcesos.getTamanioCola(); i++) {
        	Proceso proceso = colaProcesos.get(i);
            Object[] rowData = {
            		proceso.getNombreProceso(),
            		proceso.getTamamio(),
            		proceso.getTiemLlegada(),
            		proceso.getDuracion()
            };
            model.addRow(rowData);
        }
    }*/


	
}

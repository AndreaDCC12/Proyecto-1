/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;

/**
 *
 * @author andre
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private JFrame frame;
    private JTextField txtNombreEstudiante;
    private JTextField txtNotaBimestre;
    private JTextArea txtResultado;

    public MainGUI() {
        frame = new JFrame("Gestión de Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel lblNombreEstudiante = new JLabel("Nombre del Estudiante:");
        txtNombreEstudiante = new JTextField(20);
        JLabel lblNotaBimestre = new JLabel("Nota del Bimestre:");
        txtNotaBimestre = new JTextField(5);
        JButton btnAgregarNota = new JButton("Agregar Nota");
        txtResultado = new JTextArea(10, 30);
        txtResultado.setEditable(false);

        btnAgregarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes implementar la lógica para agregar nota
                // y calcular el promedio.
                txtResultado.setText("Nota agregada y calculada.");
            }
        });

        frame.add(lblNombreEstudiante);
        frame.add(txtNombreEstudiante);
        frame.add(lblNotaBimestre);
        frame.add(txtNotaBimestre);
        frame.add(btnAgregarNota);
        frame.add(new JScrollPane(txtResultado));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI();
            }
        });
    }
}


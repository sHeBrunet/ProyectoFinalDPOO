package interfaz;

import javax.swing.*;

import logica.TiendaDeComputadoras;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComprarPieza extends JDialog{
	
	private static final long serialVersionUID = 1L;
	Principal p;
	TiendaDeComputadoras tienda;
	
	public ComprarPieza(Principal principal, TiendaDeComputadoras t){
		super(principal, true);
		p = principal;
		tienda = t;
			setTitle("Piezas en Venta");
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setResizable(false);
			setSize(900, 746);
			setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane();


		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);


		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);

		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.WHITE);
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.WHITE);
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.WHITE);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.WHITE);
		
		JPanel panel10 = new JPanel();
		panel10.setBackground(Color.WHITE);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(Color.WHITE);
		
	
		tabbedPane.addTab("Bocina", panel1);
		tabbedPane.addTab("Chasis", panel2);
		tabbedPane.addTab("Disco", panel3);
		tabbedPane.addTab("Fuente", panel4);
		tabbedPane.addTab("RAM", panel5);
		tabbedPane.addTab("Microprocesador", panel6);
		tabbedPane.addTab("Monitor", panel7);
		tabbedPane.addTab("Ratón", panel8);
		tabbedPane.addTab("Tarjeta de Video", panel9);
		tabbedPane.addTab("Teclado", panel10);
		tabbedPane.addTab("Otros", panel11); //Hay que hacer esta clase
		

		// Agregar el JTabbedPane al marco
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		getContentPane().setVisible(true);
	}

}




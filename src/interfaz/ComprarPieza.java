package interfaz;

import javax.swing.*;

import logica.TiendaDeComputadoras;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class ComprarPieza extends JDialog{
	
	private static final long serialVersionUID = 1L;
	Principal p;
	TiendaDeComputadoras tienda;
	private JButton btnAtras;
	private JButton btnAceptar;
	
	public ComprarPieza(Principal principal, TiendaDeComputadoras t){
		super(principal, true);
		p = principal;
		tienda = t;
			setTitle("Piezas en Venta");
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setResizable(false);
			setSize(900, 766);
			setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);


		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		
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
		panel1.setLayout(null);
		
		JPanel panelFotosBocinas1 = new JPanel();
		panelFotosBocinas1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosBocinas1.setBackground(Color.WHITE);
		panelFotosBocinas1.setBounds(12, 12, 868, 190);
		panel1.add(panelFotosBocinas1);
		panelFotosBocinas1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas9.jpg")));
		lblNewLabel.setBounds(12, 12, 214, 166);
		panelFotosBocinas1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas5.jpg")));
		lblNewLabel_1.setBounds(280, 12, 214, 166);
		panelFotosBocinas1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas13.jpg")));
		lblNewLabel_2.setBounds(586, 12, 214, 166);
		panelFotosBocinas1.add(lblNewLabel_2);
		
		JPanel panelFotosBocinas2 = new JPanel();
		panelFotosBocinas2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosBocinas2.setBackground(UIManager.getColor("Button.highlight"));
		panelFotosBocinas2.setBounds(12, 350, 868, 190);
		panel1.add(panelFotosBocinas2);
		panelFotosBocinas2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas8.jpg")));
		lblNewLabel_3.setBounds(12, 12, 214, 166);
		panelFotosBocinas2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas7.jpg")));
		lblNewLabel_4.setBounds(298, 12, 214, 166);
		panelFotosBocinas2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Bocinas/bocinas11.jpg")));
		lblNewLabel_5.setBounds(598, 12, 214, 166);
		panelFotosBocinas2.add(lblNewLabel_5);
		
		JPanel panelInfoBocinas1 = new JPanel();
		panelInfoBocinas1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelInfoBocinas1.setBackground(UIManager.getColor("Button.light"));
		panelInfoBocinas1.setBounds(12, 214, 868, 111);
		panel1.add(panelInfoBocinas1);
		panelInfoBocinas1.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(500, 12, 37, 22);
		panelInfoBocinas1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(219, 12, 37, 22);
		panelInfoBocinas1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(805, 12, 37, 22);
		panelInfoBocinas1.add(spinner_2);
		
		JButton buttonBocina1 = new JButton("Comprar");
		buttonBocina1.setBounds(197, 78, 67, 22);
		panelInfoBocinas1.add(buttonBocina1);
		
		JButton buttonBocina2 = new JButton("Comprar");
		buttonBocina2.setBounds(484, 78, 67, 22);
		panelInfoBocinas1.add(buttonBocina2);
		
		JButton buttonBocina3 = new JButton("Comprar");
		buttonBocina3.setBounds(790, 78, 67, 22);
		panelInfoBocinas1.add(buttonBocina3);
		
		JPanel datosBocina1 = new JPanel();
		datosBocina1.setBackground(UIManager.getColor("Button.highlight"));
		datosBocina1.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina1.setBounds(12, 12, 174, 87);
		panelInfoBocinas1.add(datosBocina1);
		datosBocina1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3 = new JLabel("Marca: Samsung");
		datosBocina1.add(lblNewLabel_6_3);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_6_1 = new JLabel("Conectividad: Cable");
		datosBocina1.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Modelo:  ");
		datosBocina1.add(lblNewLabel_6_2_1);
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_6_2 = new JLabel("Precio:  $200");
		datosBocina1.add(lblNewLabel_6_2);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel datosBocina3 = new JPanel();
		datosBocina3.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina3.setBackground(UIManager.getColor("Button.disabledShadow"));
		datosBocina3.setBounds(593, 12, 186, 87);
		panelInfoBocinas1.add(datosBocina3);
		datosBocina3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5_1 = new JLabel("Marca: 1Hora");
		lblNewLabel_6_3_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3.add(lblNewLabel_6_3_5_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Conectividad: Cable");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3.add(lblNewLabel_6_2_1_1_1);
		
		JLabel lblNewLabel_6_2_2_1 = new JLabel("Precio:  $100");
		lblNewLabel_6_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3.add(lblNewLabel_6_2_2_1);
		
		JPanel datosBocina2 = new JPanel();
		datosBocina2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina2.setBackground(UIManager.getColor("Button.highlight"));
		datosBocina2.setBounds(287, 12, 186, 87);
		panelInfoBocinas1.add(datosBocina2);
		datosBocina2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Marca: LG");
		lblNewLabel_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2.add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Conectividad: Cable");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2.add(lblNewLabel_6_2_1_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Precio:  $150");
		lblNewLabel_6_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2.add(lblNewLabel_6_2_2);
		
		JPanel panelInfoBocinas2 = new JPanel();
		panelInfoBocinas2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelInfoBocinas2.setBackground(UIManager.getColor("Button.disabledShadow"));
		panelInfoBocinas2.setBounds(12, 552, 868, 116);
		panel1.add(panelInfoBocinas2);
		panelInfoBocinas2.setLayout(null);
		
		JPanel datosBocina4 = new JPanel();
		datosBocina4.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina4.setBackground(Color.WHITE);
		datosBocina4.setBounds(12, 12, 174, 87);
		panelInfoBocinas2.add(datosBocina4);
		datosBocina4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_2 = new JLabel("Marca: Samsung");
		lblNewLabel_6_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina4.add(lblNewLabel_6_3_2);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Conectividad: Bluetooth");
		lblNewLabel_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina4.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_2_1_2 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina4.add(lblNewLabel_6_2_1_2);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("Precio:  $400");
		lblNewLabel_6_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina4.add(lblNewLabel_6_2_3);
		
		JPanel datosBocina5 = new JPanel();
		datosBocina5.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina5.setBackground(Color.WHITE);
		datosBocina5.setBounds(297, 12, 174, 87);
		panelInfoBocinas2.add(datosBocina5);
		datosBocina5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_3 = new JLabel("Marca: LG");
		lblNewLabel_6_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina5.add(lblNewLabel_6_3_3);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("Conectividad: Bluetooth");
		lblNewLabel_6_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina5.add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_6_2_1_3 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina5.add(lblNewLabel_6_2_1_3);
		
		JLabel lblNewLabel_6_2_4 = new JLabel("Precio:  $350");
		lblNewLabel_6_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina5.add(lblNewLabel_6_2_4);
		
		JPanel datosBocina6 = new JPanel();
		datosBocina6.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina6.setBackground(Color.WHITE);
		datosBocina6.setBounds(596, 12, 174, 87);
		panelInfoBocinas2.add(datosBocina6);
		datosBocina6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_4 = new JLabel("Marca: F9");
		lblNewLabel_6_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina6.add(lblNewLabel_6_3_4);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("Conectividad: Bluetooth");
		lblNewLabel_6_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina6.add(lblNewLabel_6_1_4);
		
		JLabel lblNewLabel_6_2_1_4 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina6.add(lblNewLabel_6_2_1_4);
		
		JLabel lblNewLabel_6_2_5 = new JLabel("Precio:  $300");
		lblNewLabel_6_2_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina6.add(lblNewLabel_6_2_5);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(226, 12, 37, 22);
		panelInfoBocinas2.add(spinner_1_1);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setBounds(506, 12, 37, 22);
		panelInfoBocinas2.add(spinner_1_2);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setBounds(808, 12, 37, 22);
		panelInfoBocinas2.add(spinner_1_3);
		
		JButton buttonBocina4 = new JButton("Comprar");
		buttonBocina4.setBounds(197, 77, 67, 22);
		panelInfoBocinas2.add(buttonBocina4);
		
		JButton buttonBocina5 = new JButton("Comprar");
		buttonBocina5.setBounds(482, 77, 67, 22);
		panelInfoBocinas2.add(buttonBocina5);
		
		JButton buttonBocina6 = new JButton("Comprar");
		buttonBocina6.setBounds(778, 77, 67, 22);
		panelInfoBocinas2.add(buttonBocina6);
		
		tabbedPane.addTab("Chasis", panel2);
		panel2.setLayout(null);
		
		JPanel panelFotosChasis1 = new JPanel();
		panelFotosChasis1.setLayout(null);
		panelFotosChasis1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosChasis1.setBackground(Color.WHITE);
		panelFotosChasis1.setBounds(12, 12, 868, 190);
		panel2.add(panelFotosChasis1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis2.jpg")));
		lblNewLabel_6.setBounds(12, 12, 214, 166);
		panelFotosChasis1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis1.jpg")));
		lblNewLabel_1_1.setBounds(280, 12, 214, 166);
		panelFotosChasis1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis3.jpg")));
		lblNewLabel_2_1.setBounds(586, 12, 214, 166);
		panelFotosChasis1.add(lblNewLabel_2_1);
		
		JPanel panelFotosChasis2 = new JPanel();
		panelFotosChasis2.setLayout(null);
		panelFotosChasis2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosChasis2.setBackground(Color.WHITE);
		panelFotosChasis2.setBounds(12, 351, 868, 190);
		panel2.add(panelFotosChasis2);
		
		JLabel lblNewLabel_6_4 = new JLabel("New label");
		lblNewLabel_6_4.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis4.jpg")));
		lblNewLabel_6_4.setBounds(12, 12, 214, 166);
		panelFotosChasis2.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis1.jpg")));
		lblNewLabel_1_1_1.setBounds(280, 12, 214, 166);
		panelFotosChasis2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Chasis/chasis3.jpg")));
		lblNewLabel_2_1_1.setBounds(586, 12, 214, 166);
		panelFotosChasis2.add(lblNewLabel_2_1_1);
		
		JPanel panelInfoChasis1 = new JPanel();
		panelInfoChasis1.setLayout(null);
		panelInfoChasis1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelInfoChasis1.setBackground(Color.WHITE);
		panelInfoChasis1.setBounds(12, 228, 868, 111);
		panel2.add(panelInfoChasis1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(500, 12, 37, 22);
		panelInfoChasis1.add(spinner_3);
		
		JSpinner spinner_1_4 = new JSpinner();
		spinner_1_4.setBounds(219, 12, 37, 22);
		panelInfoChasis1.add(spinner_1_4);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setBounds(805, 12, 37, 22);
		panelInfoChasis1.add(spinner_2_1);
		
		JButton buttonBocina1_1 = new JButton("Comprar");
		buttonBocina1_1.setBounds(197, 78, 67, 22);
		panelInfoChasis1.add(buttonBocina1_1);
		
		JButton buttonBocina2_1 = new JButton("Comprar");
		buttonBocina2_1.setBounds(484, 78, 67, 22);
		panelInfoChasis1.add(buttonBocina2_1);
		
		JButton buttonBocina3_1 = new JButton("Comprar");
		buttonBocina3_1.setBounds(790, 78, 67, 22);
		panelInfoChasis1.add(buttonBocina3_1);
		
		JPanel datosBocina1_1 = new JPanel();
		datosBocina1_1.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina1_1.setBackground(Color.WHITE);
		datosBocina1_1.setBounds(12, 12, 174, 87);
		panelInfoChasis1.add(datosBocina1_1);
		datosBocina1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5 = new JLabel("Marca: Samsung");
		lblNewLabel_6_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1.add(lblNewLabel_6_3_5);
		
		JLabel lblNewLabel_6_1_5 = new JLabel("Potencia: ");
		lblNewLabel_6_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1.add(lblNewLabel_6_1_5);
		
		JLabel lblNewLabel_6_2_1_5 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1.add(lblNewLabel_6_2_1_5);
		
		JLabel lblNewLabel_6_2_6 = new JLabel("Precio:  $200");
		lblNewLabel_6_2_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1.add(lblNewLabel_6_2_6);
		
		JPanel datosBocina3_1 = new JPanel();
		datosBocina3_1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina3_1.setBackground(Color.WHITE);
		datosBocina3_1.setBounds(593, 12, 186, 87);
		panelInfoChasis1.add(datosBocina3_1);
		datosBocina3_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5_1_1 = new JLabel("Marca: 1Hora");
		lblNewLabel_6_3_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1.add(lblNewLabel_6_3_5_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("Potencia:");
		lblNewLabel_6_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1.add(lblNewLabel_6_1_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1_1_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1.add(lblNewLabel_6_2_1_1_1_1);
		
		JLabel lblNewLabel_6_2_2_1_1 = new JLabel("Precio:  $100");
		lblNewLabel_6_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1.add(lblNewLabel_6_2_2_1_1);
		
		JPanel datosBocina2_1 = new JPanel();
		datosBocina2_1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina2_1.setBackground(Color.WHITE);
		datosBocina2_1.setBounds(287, 12, 186, 87);
		panelInfoChasis1.add(datosBocina2_1);
		datosBocina2_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_1_1 = new JLabel("Marca: LG");
		lblNewLabel_6_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1.add(lblNewLabel_6_3_1_1);
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("Potencia:");
		lblNewLabel_6_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1.add(lblNewLabel_6_1_1_2);
		
		JLabel lblNewLabel_6_2_1_1_2 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1.add(lblNewLabel_6_2_1_1_2);
		
		JLabel lblNewLabel_6_2_2_2 = new JLabel("Precio:  $150");
		lblNewLabel_6_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1.add(lblNewLabel_6_2_2_2);
		
		JPanel panelInfoChasis2 = new JPanel();
		panelInfoChasis2.setLayout(null);
		panelInfoChasis2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelInfoChasis2.setBackground(Color.WHITE);
		panelInfoChasis2.setBounds(12, 557, 868, 111);
		panel2.add(panelInfoChasis2);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setBounds(500, 12, 37, 22);
		panelInfoChasis2.add(spinner_3_1);
		
		JSpinner spinner_1_4_1 = new JSpinner();
		spinner_1_4_1.setBounds(219, 12, 37, 22);
		panelInfoChasis2.add(spinner_1_4_1);
		
		JSpinner spinner_2_1_1 = new JSpinner();
		spinner_2_1_1.setBounds(805, 12, 37, 22);
		panelInfoChasis2.add(spinner_2_1_1);
		
		JButton buttonBocina1_1_1 = new JButton("Comprar");
		buttonBocina1_1_1.setBounds(197, 78, 67, 22);
		panelInfoChasis2.add(buttonBocina1_1_1);
		
		JButton buttonBocina2_1_1 = new JButton("Comprar");
		buttonBocina2_1_1.setBounds(484, 78, 67, 22);
		panelInfoChasis2.add(buttonBocina2_1_1);
		
		JButton buttonBocina3_1_1 = new JButton("Comprar");
		buttonBocina3_1_1.setBounds(790, 78, 67, 22);
		panelInfoChasis2.add(buttonBocina3_1_1);
		
		JPanel datosBocina1_1_1 = new JPanel();
		datosBocina1_1_1.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina1_1_1.setBackground(Color.WHITE);
		datosBocina1_1_1.setBounds(12, 12, 174, 87);
		panelInfoChasis2.add(datosBocina1_1_1);
		datosBocina1_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5_2 = new JLabel("Marca: Samsung");
		lblNewLabel_6_3_5_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1_1.add(lblNewLabel_6_3_5_2);
		
		JLabel lblNewLabel_6_1_5_1 = new JLabel("Potencia:");
		lblNewLabel_6_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1_1.add(lblNewLabel_6_1_5_1);
		
		JLabel lblNewLabel_6_2_1_5_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1_1.add(lblNewLabel_6_2_1_5_1);
		
		JLabel lblNewLabel_6_2_6_1 = new JLabel("Precio:  $200");
		lblNewLabel_6_2_6_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_1_1.add(lblNewLabel_6_2_6_1);
		
		JPanel datosBocina3_1_1 = new JPanel();
		datosBocina3_1_1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina3_1_1.setBackground(Color.WHITE);
		datosBocina3_1_1.setBounds(593, 12, 186, 87);
		panelInfoChasis2.add(datosBocina3_1_1);
		datosBocina3_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5_1_1_1 = new JLabel("Marca: 1Hora");
		lblNewLabel_6_3_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1_1.add(lblNewLabel_6_3_5_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1_1_1 = new JLabel("Potencia:");
		lblNewLabel_6_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1_1.add(lblNewLabel_6_1_1_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1_1_1_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1_1.add(lblNewLabel_6_2_1_1_1_1_1);
		
		JLabel lblNewLabel_6_2_2_1_1_1 = new JLabel("Precio:  $100");
		lblNewLabel_6_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_1_1.add(lblNewLabel_6_2_2_1_1_1);
		
		JPanel datosBocina2_1_1 = new JPanel();
		datosBocina2_1_1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina2_1_1.setBackground(Color.WHITE);
		datosBocina2_1_1.setBounds(287, 12, 186, 87);
		panelInfoChasis2.add(datosBocina2_1_1);
		datosBocina2_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_1_1_1 = new JLabel("Marca: LG");
		lblNewLabel_6_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1_1.add(lblNewLabel_6_3_1_1_1);
		
		JLabel lblNewLabel_6_1_1_2_1 = new JLabel("Potencia:");
		lblNewLabel_6_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1_1.add(lblNewLabel_6_1_1_2_1);
		
		JLabel lblNewLabel_6_2_1_1_2_1 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1_1.add(lblNewLabel_6_2_1_1_2_1);
		
		JLabel lblNewLabel_6_2_2_2_1 = new JLabel("Precio:  $150");
		lblNewLabel_6_2_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_1_1.add(lblNewLabel_6_2_2_2_1);
		tabbedPane.addTab("Fuente", panel4);
		panel4.setLayout(null);
		
		JPanel panelFotosFuente1 = new JPanel();
		panelFotosFuente1.setLayout(null);
		panelFotosFuente1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosFuente1.setBackground(Color.WHITE);
		panelFotosFuente1.setBounds(12, 23, 868, 190);
		panel4.add(panelFotosFuente1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Fuentes/fuente1.jpg")));
		lblNewLabel_8.setBounds(12, 12, 214, 166);
		panelFotosFuente1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Fuentes/fuente3.jpg")));
		lblNewLabel_1_3.setBounds(304, 12, 214, 166);
		panelFotosFuente1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Fuentes/fuente4.jpg")));
		lblNewLabel_2_3.setBounds(545, 12, 237, 166);
		panelFotosFuente1.add(lblNewLabel_2_3);
		
				JPanel panel3 = new JPanel();
				panel3.setBackground(Color.WHITE);
				
				tabbedPane.addTab("Disco", panel3);
				panel3.setLayout(null);
				
				JPanel panelFotosDisco1 = new JPanel();
				panelFotosDisco1.setLayout(null);
				panelFotosDisco1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
				panelFotosDisco1.setBackground(Color.WHITE);
				panelFotosDisco1.setBounds(12, 12, 868, 190);
				panel3.add(panelFotosDisco1);
				
				JLabel lblNewLabel_7 = new JLabel("New label");
				lblNewLabel_7.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Discos/discos1.jpg")));
				lblNewLabel_7.setBounds(12, 12, 214, 166);
				panelFotosDisco1.add(lblNewLabel_7);
				
				JLabel lblNewLabel_1_2 = new JLabel("New label");
				lblNewLabel_1_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Discos/discos2.jpg")));
				lblNewLabel_1_2.setBounds(280, 12, 214, 166);
				panelFotosDisco1.add(lblNewLabel_1_2);
				
				JLabel lblNewLabel_2_2 = new JLabel("New label");
				lblNewLabel_2_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Discos/discos3.jpg")));
				lblNewLabel_2_2.setBounds(586, 12, 214, 166);
				panelFotosDisco1.add(lblNewLabel_2_2);
		tabbedPane.addTab("RAM", panel5);
		panel5.setLayout(null);
		
		JPanel panelFotosRAM1 = new JPanel();
		panelFotosRAM1.setLayout(null);
		panelFotosRAM1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosRAM1.setBackground(Color.WHITE);
		panelFotosRAM1.setBounds(12, 12, 868, 190);
		panel5.add(panelFotosRAM1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("New label");
		lblNewLabel_7_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram1.jpg")));
		lblNewLabel_7_1_1.setBounds(12, 12, 214, 166);
		panelFotosRAM1.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("New label");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram4.jpg")));
		lblNewLabel_1_2_1_1.setBounds(300, 36, 258, 107);
		panelFotosRAM1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("New label");
		lblNewLabel_2_2_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram9.jpg")));
		lblNewLabel_2_2_1_1.setBounds(586, 12, 214, 166);
		panelFotosRAM1.add(lblNewLabel_2_2_1_1);
		
		JPanel panelFotosRAM2 = new JPanel();
		panelFotosRAM2.setLayout(null);
		panelFotosRAM2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosRAM2.setBackground(Color.WHITE);
		panelFotosRAM2.setBounds(12, 350, 868, 190);
		panel5.add(panelFotosRAM2);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("New label");
		lblNewLabel_7_1_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram2.jpg")));
		lblNewLabel_7_1_1_1.setBounds(12, 12, 214, 166);
		panelFotosRAM2.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("New label");
		lblNewLabel_1_2_1_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram3.jpg")));
		lblNewLabel_1_2_1_1_1.setBounds(300, 36, 258, 97);
		panelFotosRAM2.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("New label");
		lblNewLabel_2_2_1_1_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/RAM/ram6.jpg")));
		lblNewLabel_2_2_1_1_1.setBounds(586, 12, 258, 166);
		panelFotosRAM2.add(lblNewLabel_2_2_1_1_1);
		
		JPanel panelInfoBocinas1_1 = new JPanel();
		panelInfoBocinas1_1.setLayout(null);
		panelInfoBocinas1_1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelInfoBocinas1_1.setBackground(Color.WHITE);
		panelInfoBocinas1_1.setBounds(12, 214, 868, 111);
		panel5.add(panelInfoBocinas1_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(500, 12, 37, 22);
		panelInfoBocinas1_1.add(spinner_4);
		
		JSpinner spinner_1_5 = new JSpinner();
		spinner_1_5.setBounds(219, 12, 37, 22);
		panelInfoBocinas1_1.add(spinner_1_5);
		
		JSpinner spinner_2_2 = new JSpinner();
		spinner_2_2.setBounds(805, 12, 37, 22);
		panelInfoBocinas1_1.add(spinner_2_2);
		
		JButton buttonBocina1_2 = new JButton("Comprar");
		buttonBocina1_2.setBounds(197, 78, 67, 22);
		panelInfoBocinas1_1.add(buttonBocina1_2);
		
		JButton buttonBocina2_2 = new JButton("Comprar");
		buttonBocina2_2.setBounds(484, 78, 67, 22);
		panelInfoBocinas1_1.add(buttonBocina2_2);
		
		JButton buttonBocina3_2 = new JButton("Comprar");
		buttonBocina3_2.setBounds(790, 78, 67, 22);
		panelInfoBocinas1_1.add(buttonBocina3_2);
		
		JPanel datosBocina1_2 = new JPanel();
		datosBocina1_2.setBorder(new LineBorder(new Color(0, 88, 168)));
		datosBocina1_2.setBackground(Color.WHITE);
		datosBocina1_2.setBounds(12, 12, 174, 87);
		panelInfoBocinas1_1.add(datosBocina1_2);
		datosBocina1_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_6 = new JLabel("Marca: Samsung");
		lblNewLabel_6_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_2.add(lblNewLabel_6_3_6);
		
		JLabel lblNewLabel_6_1_6 = new JLabel("Conectividad: Cable");
		lblNewLabel_6_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_2.add(lblNewLabel_6_1_6);
		
		JLabel lblNewLabel_6_2_1_6 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_2.add(lblNewLabel_6_2_1_6);
		
		JLabel lblNewLabel_6_2_7 = new JLabel("Precio:  $200");
		lblNewLabel_6_2_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina1_2.add(lblNewLabel_6_2_7);
		
		JPanel datosBocina3_2 = new JPanel();
		datosBocina3_2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina3_2.setBackground(Color.WHITE);
		datosBocina3_2.setBounds(593, 12, 186, 87);
		panelInfoBocinas1_1.add(datosBocina3_2);
		datosBocina3_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_5_1_2 = new JLabel("Marca: 1Hora");
		lblNewLabel_6_3_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_2.add(lblNewLabel_6_3_5_1_2);
		
		JLabel lblNewLabel_6_1_1_1_2 = new JLabel("Conectividad: Cable");
		lblNewLabel_6_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_2.add(lblNewLabel_6_1_1_1_2);
		
		JLabel lblNewLabel_6_2_1_1_1_2 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_2.add(lblNewLabel_6_2_1_1_1_2);
		
		JLabel lblNewLabel_6_2_2_1_2 = new JLabel("Precio:  $100");
		lblNewLabel_6_2_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina3_2.add(lblNewLabel_6_2_2_1_2);
		
		JPanel datosBocina2_2 = new JPanel();
		datosBocina2_2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		datosBocina2_2.setBackground(Color.WHITE);
		datosBocina2_2.setBounds(287, 12, 186, 87);
		panelInfoBocinas1_1.add(datosBocina2_2);
		datosBocina2_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6_3_1_2 = new JLabel("Marca: LG");
		lblNewLabel_6_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_2.add(lblNewLabel_6_3_1_2);
		
		JLabel lblNewLabel_6_1_1_3 = new JLabel("Conectividad: Cable");
		lblNewLabel_6_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_2.add(lblNewLabel_6_1_1_3);
		
		JLabel lblNewLabel_6_2_1_1_3 = new JLabel("Modelo:  ");
		lblNewLabel_6_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_2.add(lblNewLabel_6_2_1_1_3);
		
		JLabel lblNewLabel_6_2_2_3 = new JLabel("Precio:  $150");
		lblNewLabel_6_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		datosBocina2_2.add(lblNewLabel_6_2_2_3);
		tabbedPane.addTab("Microprocesador", panel6);
		panel6.setLayout(null);
		
		JPanel panelFotosMIcro1 = new JPanel();
		panelFotosMIcro1.setLayout(null);
		panelFotosMIcro1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosMIcro1.setBackground(Color.WHITE);
		panelFotosMIcro1.setBounds(12, 12, 868, 190);
		panel6.add(panelFotosMIcro1);
		
		JLabel lblNewLabel_7_1 = new JLabel("New label");
		lblNewLabel_7_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Micro/micro1.jpg")));
		lblNewLabel_7_1.setBounds(12, 12, 214, 166);
		panelFotosMIcro1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New label");
		lblNewLabel_1_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Micro/micro2.jpg")));
		lblNewLabel_1_2_1.setBounds(300, 36, 170, 118);
		panelFotosMIcro1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("New label");
		lblNewLabel_2_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Micro/micro1.jpg")));
		lblNewLabel_2_2_1.setBounds(586, 12, 214, 166);
		panelFotosMIcro1.add(lblNewLabel_2_2_1);
		tabbedPane.addTab("Monitor", panel7);
		panel7.setLayout(null);
		
		JPanel panelFotosMonitor1 = new JPanel();
		panelFotosMonitor1.setLayout(null);
		panelFotosMonitor1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosMonitor1.setBackground(Color.WHITE);
		panelFotosMonitor1.setBounds(12, 12, 868, 190);
		panel7.add(panelFotosMonitor1);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("New label");
		lblNewLabel_7_1_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor1.jpg")));
		lblNewLabel_7_1_2.setBounds(12, 12, 214, 166);
		panelFotosMonitor1.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("New label");
		lblNewLabel_1_2_1_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor2.jpg")));
		lblNewLabel_1_2_1_2.setBounds(312, 12, 222, 166);
		panelFotosMonitor1.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("New label");
		lblNewLabel_2_2_1_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor3.jpg")));
		lblNewLabel_2_2_1_2.setBounds(586, 12, 214, 166);
		panelFotosMonitor1.add(lblNewLabel_2_2_1_2);
		
		JPanel panelFotosMonitor2 = new JPanel();
		panelFotosMonitor2.setLayout(null);
		panelFotosMonitor2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosMonitor2.setBackground(Color.WHITE);
		panelFotosMonitor2.setBounds(12, 340, 868, 190);
		panel7.add(panelFotosMonitor2);
		
		JLabel lblNewLabel_7_1_2_1 = new JLabel("New label");
		lblNewLabel_7_1_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor6.jpg")));
		lblNewLabel_7_1_2_1.setBounds(12, 12, 214, 166);
		panelFotosMonitor2.add(lblNewLabel_7_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("New label");
		lblNewLabel_1_2_1_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor7.jpg")));
		lblNewLabel_1_2_1_2_1.setBounds(260, 12, 285, 166);
		panelFotosMonitor2.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("New label");
		lblNewLabel_2_2_1_2_1.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Monitores/monitor8.jpg")));
		lblNewLabel_2_2_1_2_1.setBounds(586, 12, 214, 166);
		panelFotosMonitor2.add(lblNewLabel_2_2_1_2_1);
		tabbedPane.addTab("Ratón", panel8);
		panel8.setLayout(null);
		
		JPanel panelFotosRaton1 = new JPanel();
		panelFotosRaton1.setLayout(null);
		panelFotosRaton1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosRaton1.setBackground(Color.WHITE);
		panelFotosRaton1.setBounds(12, 12, 868, 190);
		panel8.add(panelFotosRaton1);
		
		JLabel lblNewLabel_7_1_2_2 = new JLabel("New label");
		lblNewLabel_7_1_2_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse1.jpg")));
		lblNewLabel_7_1_2_2.setBounds(12, 12, 214, 166);
		panelFotosRaton1.add(lblNewLabel_7_1_2_2);
		
		JLabel lblNewLabel_1_2_1_2_2 = new JLabel("New label");
		lblNewLabel_1_2_1_2_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse6.jpg")));
		lblNewLabel_1_2_1_2_2.setBounds(312, 12, 222, 166);
		panelFotosRaton1.add(lblNewLabel_1_2_1_2_2);
		
		JLabel lblNewLabel_2_2_1_2_2 = new JLabel("New label");
		lblNewLabel_2_2_1_2_2.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse4.jpg")));
		lblNewLabel_2_2_1_2_2.setBounds(586, 12, 214, 166);
		panelFotosRaton1.add(lblNewLabel_2_2_1_2_2);
		
		JPanel panelFotosRaton2 = new JPanel();
		panelFotosRaton2.setLayout(null);
		panelFotosRaton2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosRaton2.setBackground(Color.WHITE);
		panelFotosRaton2.setBounds(12, 357, 868, 190);
		panel8.add(panelFotosRaton2);
		
		JLabel lblNewLabel_7_1_2_3 = new JLabel("New label");
		lblNewLabel_7_1_2_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse7.jpg")));
		lblNewLabel_7_1_2_3.setBounds(12, 12, 261, 166);
		panelFotosRaton2.add(lblNewLabel_7_1_2_3);
		
		JLabel lblNewLabel_1_2_1_2_3 = new JLabel("New label");
		lblNewLabel_1_2_1_2_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse8.jpg")));
		lblNewLabel_1_2_1_2_3.setBounds(312, 12, 222, 166);
		panelFotosRaton2.add(lblNewLabel_1_2_1_2_3);
		
		JLabel lblNewLabel_2_2_1_2_3 = new JLabel("New label");
		lblNewLabel_2_2_1_2_3.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Mouse/mouse5.jpg")));
		lblNewLabel_2_2_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_2_3.setBounds(607, 6, 214, 178);
		panelFotosRaton2.add(lblNewLabel_2_2_1_2_3);
		tabbedPane.addTab("Tarjeta de Video", panel9);
		panel9.setLayout(null);
		
		JPanel panelFotosTarjetasDeVideo1 = new JPanel();
		panelFotosTarjetasDeVideo1.setLayout(null);
		panelFotosTarjetasDeVideo1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosTarjetasDeVideo1.setBackground(Color.WHITE);
		panelFotosTarjetasDeVideo1.setBounds(12, 23, 868, 190);
		panel9.add(panelFotosTarjetasDeVideo1);
		
		JLabel lblNewLabel_7_1_2_4 = new JLabel("New label");
		lblNewLabel_7_1_2_4.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas1.jpg")));
		lblNewLabel_7_1_2_4.setBounds(12, 12, 214, 166);
		panelFotosTarjetasDeVideo1.add(lblNewLabel_7_1_2_4);
		
		JLabel lblNewLabel_1_2_1_2_4 = new JLabel("New label");
		lblNewLabel_1_2_1_2_4.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas2.jpg")));
		lblNewLabel_1_2_1_2_4.setBounds(312, 19, 222, 153);
		panelFotosTarjetasDeVideo1.add(lblNewLabel_1_2_1_2_4);
		
		JLabel lblNewLabel_2_2_1_2_4 = new JLabel("New label");
		lblNewLabel_2_2_1_2_4.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas3.jpg")));
		lblNewLabel_2_2_1_2_4.setBounds(586, 12, 214, 166);
		panelFotosTarjetasDeVideo1.add(lblNewLabel_2_2_1_2_4);
		
		JPanel panelFotoTarjetasDeVideo = new JPanel();
		panelFotoTarjetasDeVideo.setLayout(null);
		panelFotoTarjetasDeVideo.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotoTarjetasDeVideo.setBackground(Color.WHITE);
		panelFotoTarjetasDeVideo.setBounds(12, 364, 868, 190);
		panel9.add(panelFotoTarjetasDeVideo);
		
		JLabel lblNewLabel_7_1_2_5 = new JLabel("New label");
		lblNewLabel_7_1_2_5.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas4.jpg")));
		lblNewLabel_7_1_2_5.setBounds(12, 12, 214, 166);
		panelFotoTarjetasDeVideo.add(lblNewLabel_7_1_2_5);
		
		JLabel lblNewLabel_1_2_1_2_5 = new JLabel("New label");
		lblNewLabel_1_2_1_2_5.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas6.jpg")));
		lblNewLabel_1_2_1_2_5.setBounds(312, 12, 222, 166);
		panelFotoTarjetasDeVideo.add(lblNewLabel_1_2_1_2_5);
		
		JLabel lblNewLabel_2_2_1_2_5 = new JLabel("New label");
		lblNewLabel_2_2_1_2_5.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Tarjetas/tarjetas8.jpg")));
		lblNewLabel_2_2_1_2_5.setBounds(586, 12, 238, 166);
		panelFotoTarjetasDeVideo.add(lblNewLabel_2_2_1_2_5);
		tabbedPane.addTab("Teclado", panel10);
		panel10.setLayout(null);
		
		JPanel panelFotosTeclado1 = new JPanel();
		panelFotosTeclado1.setLayout(null);
		panelFotosTeclado1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosTeclado1.setBackground(Color.WHITE);
		panelFotosTeclado1.setBounds(12, 40, 868, 190);
		panel10.add(panelFotosTeclado1);
		
		JLabel lblNewLabel_7_1_2_6 = new JLabel("New label");
		lblNewLabel_7_1_2_6.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclado1.jpg")));
		lblNewLabel_7_1_2_6.setBounds(12, 12, 201, 166);
		panelFotosTeclado1.add(lblNewLabel_7_1_2_6);
		
		JLabel lblNewLabel_1_2_1_2_6 = new JLabel("New label");
		lblNewLabel_1_2_1_2_6.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclados4.jpg")));
		lblNewLabel_1_2_1_2_6.setBounds(260, 12, 262, 166);
		panelFotosTeclado1.add(lblNewLabel_1_2_1_2_6);
		
		JLabel lblNewLabel_2_2_1_2_6 = new JLabel("New label");
		lblNewLabel_2_2_1_2_6.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclados6.jpg")));
		lblNewLabel_2_2_1_2_6.setBounds(589, 12, 214, 166);
		panelFotosTeclado1.add(lblNewLabel_2_2_1_2_6);
		
		JPanel panelFotosTeclado2 = new JPanel();
		panelFotosTeclado2.setLayout(null);
		panelFotosTeclado2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosTeclado2.setBackground(Color.WHITE);
		panelFotosTeclado2.setBounds(12, 345, 868, 190);
		panel10.add(panelFotosTeclado2);
		
		JLabel lblNewLabel_7_1_2_7 = new JLabel("New label");
		lblNewLabel_7_1_2_7.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclados5.jpg")));
		lblNewLabel_7_1_2_7.setBounds(12, 12, 261, 166);
		panelFotosTeclado2.add(lblNewLabel_7_1_2_7);
		
		JLabel lblNewLabel_1_2_1_2_7 = new JLabel("New label");
		lblNewLabel_1_2_1_2_7.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclados3.jpg")));
		lblNewLabel_1_2_1_2_7.setBounds(312, 12, 261, 166);
		panelFotosTeclado2.add(lblNewLabel_1_2_1_2_7);
		
		JLabel lblNewLabel_2_2_1_2_7 = new JLabel("New label");
		lblNewLabel_2_2_1_2_7.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Teclados/teclado1.jpg")));
		lblNewLabel_2_2_1_2_7.setBounds(627, 12, 199, 166);
		panelFotosTeclado2.add(lblNewLabel_2_2_1_2_7);
		tabbedPane.addTab("Otros", panel11); //Hay que hacer esta clase
		panel11.setLayout(null);
		
		JPanel panelFotosOtros1 = new JPanel();
		panelFotosOtros1.setLayout(null);
		panelFotosOtros1.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosOtros1.setBackground(Color.WHITE);
		panelFotosOtros1.setBounds(12, 25, 868, 190);
		panel11.add(panelFotosOtros1);
		
		JLabel lblNewLabel_7_1_2_8 = new JLabel("New label");
		lblNewLabel_7_1_2_8.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros1.jpg")));
		lblNewLabel_7_1_2_8.setBounds(12, 12, 154, 166);
		panelFotosOtros1.add(lblNewLabel_7_1_2_8);
		
		JLabel lblNewLabel_1_2_1_2_8 = new JLabel("New label");
		lblNewLabel_1_2_1_2_8.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros2.jpg")));
		lblNewLabel_1_2_1_2_8.setBounds(312, 12, 174, 166);
		panelFotosOtros1.add(lblNewLabel_1_2_1_2_8);
		
		JLabel lblNewLabel_2_2_1_2_8 = new JLabel("New label");
		lblNewLabel_2_2_1_2_8.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros3.jpg")));
		lblNewLabel_2_2_1_2_8.setBounds(586, 12, 214, 166);
		panelFotosOtros1.add(lblNewLabel_2_2_1_2_8);
		
		JPanel panelFotosOtros2 = new JPanel();
		panelFotosOtros2.setLayout(null);
		panelFotosOtros2.setBorder(new LineBorder(UIManager.getColor("Button.frame")));
		panelFotosOtros2.setBackground(Color.WHITE);
		panelFotosOtros2.setBounds(12, 366, 868, 190);
		panel11.add(panelFotosOtros2);
		
		JLabel lblNewLabel_7_1_2_9 = new JLabel("New label");
		lblNewLabel_7_1_2_9.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros4.jpg")));
		lblNewLabel_7_1_2_9.setBounds(12, 12, 214, 166);
		panelFotosOtros2.add(lblNewLabel_7_1_2_9);
		
		JLabel lblNewLabel_1_2_1_2_9 = new JLabel("New label");
		lblNewLabel_1_2_1_2_9.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros5.jpg")));
		lblNewLabel_1_2_1_2_9.setBounds(312, 12, 222, 166);
		panelFotosOtros2.add(lblNewLabel_1_2_1_2_9);
		
		JLabel lblNewLabel_2_2_1_2_9 = new JLabel("New label");
		lblNewLabel_2_2_1_2_9.setIcon(new ImageIcon(ComprarPieza.class.getResource("/gui/images/Otros/otros1.jpg")));
		lblNewLabel_2_2_1_2_9.setBounds(662, 12, 153, 166);
		panelFotosOtros2.add(lblNewLabel_2_2_1_2_9);
		
		JPanel panelBotones = new JPanel();
		btnAtras = new JButton("Atrás");
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelBotones.add(btnAtras);

		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("Aceptar");
		panelBotones.add(btnAceptar);

		// Agregar el JTabbedPane al marco
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		getContentPane().setVisible(true);
	}
}




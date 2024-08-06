package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

	public class Principal extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel PanelPrincipal;
		/**
		 * Create the frame.
		 */
		public Principal() {
			setUndecorated(true);
			setResizable(false);
			setBounds(100, 100, 800, 680);
			PanelPrincipal = new JPanel();
			PanelPrincipal.setBackground(new Color(255, 255, 255));
			PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(PanelPrincipal);
			PanelPrincipal.setLayout(null);
			final Motherboards motherboards = new Motherboards();
			final Microprocesadores micros = new Microprocesadores();
			final Fuentes fuentes = new Fuentes();
			final Bocinas bocinas = new Bocinas();
			final Chasis chasis = new Chasis();
			final Discos discos = new Discos();
			final MemoriasRAM ram = new MemoriasRAM();
			final Monitor monitor = new Monitor();
			final Mouse mouse = new Mouse();
			final Otros otros = new Otros();
			final TarjetaDeVideo tarjetas = new TarjetaDeVideo();
			final Teclado teclado = new Teclado();
			
			JLabel Quest = new JLabel("Productos en venta:");
			Quest.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
			Quest.setBounds(24, 51, 321, 33);
			PanelPrincipal.add(Quest);
			
			JPanel PanelObjetos = new JPanel();
			PanelObjetos.setBounds(24, 95, 750, 155);
			PanelPrincipal.add(PanelObjetos);
			PanelObjetos.setBackground(Color.WHITE);
			PanelObjetos.setLayout(new GridLayout(1, 4, 5, 40));
			
			final JButton btnMotherboards = new JButton("");
			btnMotherboards.setBorder(null);
			btnMotherboards.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnMotherboards.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnMotherboards.setBorder(null);
				}
			});
			btnMotherboards.setForeground(Color.BLACK);
			btnMotherboards.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Motherboards/motherboard2.jpg")));
			btnMotherboards.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					motherboards.setVisible(true);
				}
			});
			btnMotherboards.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnMotherboards.setFocusable(false);
			btnMotherboards.setBackground(new Color(255, 255, 255));
			PanelObjetos.add(btnMotherboards);
			
			final JButton btnMicro = new JButton("");
			btnMicro.setBorder(null);
			btnMicro.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnMicro.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnMicro.setBorder(null);
				}
			});
			btnMicro.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Micro/micro1.jpg")));
			btnMicro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					micros.setVisible(true);
				}
			});
			btnMicro.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnMicro.setFocusable(false);
			btnMicro.setBackground(new Color(255, 255, 255));
			PanelObjetos.add(btnMicro);
			
			final JButton btnRam = new JButton("");
			btnRam.setBorder(null);
			btnRam.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnRam.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnRam.setBorder(null);
				}
			});
			btnRam.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/RAM/ram9.jpg")));
			btnRam.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					ram.setVisible(true);
				}
			});
			btnRam.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnRam.setFocusable(false);
			btnRam.setBackground(new Color(255, 255, 255));
			PanelObjetos.add(btnRam);
			
			final JButton btnTarjeta = new JButton("");
			btnTarjeta.setBorder(null);
			btnTarjeta.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnTarjeta.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnTarjeta.setBorder(null);
				}
			});
			PanelObjetos.add(btnTarjeta);
			btnTarjeta.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Tarjetas/tarjetas3.jpg")));
			btnTarjeta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					tarjetas.setVisible(true);
				}
			});
			btnTarjeta.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnTarjeta.setFocusable(false);
			btnTarjeta.setBackground(new Color(255, 255, 255));
			
			JPanel PanelObjetos2 = new JPanel();
			PanelObjetos2.setBackground(Color.WHITE);
			PanelObjetos2.setBounds(24, 297, 750, 155);
			PanelPrincipal.add(PanelObjetos2);
			PanelObjetos2.setLayout(new GridLayout(1, 4, 5, 40));
			
			final JButton btnDiscos = new JButton("");
			btnDiscos.setBorder(null);
			btnDiscos.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnDiscos.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnDiscos.setBorder(null);
				}
			});
			PanelObjetos2.add(btnDiscos);
			btnDiscos.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Discos/discos3.jpg")));
			btnDiscos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					discos.setVisible(true);
				}
			});
			btnDiscos.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnDiscos.setFocusable(false);
			btnDiscos.setBackground(new Color(255, 255, 255));
			
			final JButton btnFuente = new JButton("");
			btnFuente.setBorder(null);
			btnFuente.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnFuente.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnFuente.setBorder(null);
				}
			});
			PanelObjetos2.add(btnFuente);
			btnFuente.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Fuentes/fuente4.jpg")));
			btnFuente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					setVisible(false);
					fuentes.setVisible(true);
				}
			});
			btnFuente.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnFuente.setFocusable(false);
			btnFuente.setBackground(new Color(255, 255, 255));
			
			final JButton btnMonitor = new JButton("");
			btnMonitor.setBorder(null);
			btnMonitor.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnMonitor.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnMonitor.setBorder(null);
				}
			});
			PanelObjetos2.add(btnMonitor);
			btnMonitor.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Monitores/monitor7.jpg")));
			btnMonitor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					monitor.setVisible(true);
				}
			});
			btnMonitor.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnMonitor.setFocusable(false);
			btnMonitor.setBackground(new Color(255, 255, 255));
			
			final JButton btnTeclado = new JButton("");
			btnTeclado.setBorder(null);
			btnTeclado.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnTeclado.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnTeclado.setBorder(null);
				}
			});
			btnTeclado.setHorizontalTextPosition(SwingConstants.CENTER);
			btnTeclado.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Teclados/teclado1.jpg")));
			PanelObjetos2.add(btnTeclado);
			btnTeclado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					teclado.setVisible(true);
				}
			});
			btnTeclado.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnTeclado.setFocusable(false);
			btnTeclado.setBackground(new Color(255, 255, 255));
			
			JPanel PanelObjetos3 = new JPanel();
			PanelObjetos3.setBackground(Color.WHITE);
			PanelObjetos3.setBounds(24, 503, 750, 155);
			PanelPrincipal.add(PanelObjetos3);
			PanelObjetos3.setLayout(new GridLayout(1, 4, 5, 40));
			
			final JButton btnMouse = new JButton("");
			btnMouse.setBorder(null);
			btnMouse.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnMouse.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnMouse.setBorder(null);
				}
			});
			btnMouse.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Mouse/mouse6.jpg")));
			PanelObjetos3.add(btnMouse);
			btnMouse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					mouse.setVisible(true);
				}
			});
			btnMouse.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnMouse.setFocusable(false);
			btnMouse.setBackground(new Color(255, 255, 255));
			
			final JButton btnBocinas = new JButton("");
			btnBocinas.setBorder(null);
			btnBocinas.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnBocinas.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnBocinas.setBorder(null);
				}
			});
			btnBocinas.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Bocinas/bocinas13.jpg")));
			PanelObjetos3.add(btnBocinas);
			btnBocinas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					bocinas.setVisible(true);
				}
			});
			btnBocinas.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnBocinas.setFocusable(false);
			btnBocinas.setBackground(new Color(255, 255, 255));
			
			final JButton btnChasis = new JButton("");
			btnChasis.setBorder(null);
			btnChasis.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnChasis.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnChasis.setBorder(null);
				}
			});
			btnChasis.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Chasis/chasis3.jpg")));
			PanelObjetos3.add(btnChasis);
			btnChasis.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					chasis.setVisible(true);
				}
			});
			btnChasis.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnChasis.setFocusable(false);
			btnChasis.setBackground(new Color(255, 255, 255));
			
			final JButton btnOtros = new JButton("");
			btnOtros.setBorder(null);
			btnOtros.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnOtros.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
				}
				public void mouseExited(MouseEvent e) {
					btnOtros.setBorder(null);
				}
			});
			btnOtros.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/Otros/otros4.jpg")));
			PanelObjetos3.add(btnOtros);
			btnOtros.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					otros.setVisible(true);
				}
			});
			btnOtros.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnOtros.setFocusable(false);
			btnOtros.setBackground(new Color(255, 255, 255));
			
			JPanel UpperBar = new JPanel();
			UpperBar.setBackground(new Color(0, 153, 204));
			UpperBar.setBounds(0, 0, 800, 23);
			PanelPrincipal.add(UpperBar);
			UpperBar.setLayout(null);
			
			final JButton btnExit = new JButton("X");
			btnExit.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnExit.setBorder(new MatteBorder(3, 3, 3, 3, (Color.RED)));
				}
				public void mouseExited(MouseEvent e) {
					btnExit.setBorder(null);
				}
			});
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 int i = JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
	                 if(i==0)
	                     System.exit(0);
				}
			});
			btnExit.setFocusable(false);
			btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnExit.setBorder(null);
			btnExit.setBackground(new Color(255, 127, 80));
			btnExit.setBounds(773, 0, 27, 23);
			UpperBar.add(btnExit);
			
			final JButton btnMin = new JButton("-");
			btnMin.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					btnMin.setBorder(new MatteBorder(3, 3, 3, 3, (Color.LIGHT_GRAY)));
				}
				public void mouseExited(MouseEvent e) {
					btnMin.setBorder(null);
				}
			});
			btnMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setExtendedState(ICONIFIED);
				}
			});
			btnMin.setFocusable(false);
			btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnMin.setBorder(null);
			btnMin.setBackground(new Color(220, 220, 220));
			btnMin.setBounds(746, -1, 27, 24);
			UpperBar.add(btnMin);
			
			JPanel PanelNombreObj = new JPanel();
			PanelNombreObj.setBackground(Color.WHITE);
			PanelNombreObj.setBounds(24, 249, 750, 22);
			PanelPrincipal.add(PanelNombreObj);
			PanelNombreObj.setLayout(new GridLayout(1, 4, 0, 0));
			
			JLabel lbl1 = new JLabel("Motherboards");
			lbl1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj.add(lbl1);
			
			JLabel lbl2 = new JLabel("Microprocesadores");
			lbl2.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj.add(lbl2);
			
			JLabel lbl3 = new JLabel("Memorias RAM");
			lbl3.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl3.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj.add(lbl3);
			
			JLabel lbl4 = new JLabel("Tarjetas de Video");
			lbl4.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl4.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj.add(lbl4);
			
			JPanel PanelNombreObj1 = new JPanel();
			PanelNombreObj1.setBackground(Color.WHITE);
			PanelNombreObj1.setBounds(24, 451, 750, 22);
			PanelPrincipal.add(PanelNombreObj1);
			PanelNombreObj1.setLayout(new GridLayout(1, 4, 0, 0));
			
			JLabel lbl5 = new JLabel("HDD/SDD");
			lbl5.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl5.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj1.add(lbl5);
			
			JLabel lbl6 = new JLabel("Fuentes");
			lbl6.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl6.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj1.add(lbl6);
			
			JLabel lbl7 = new JLabel("Monitores");
			lbl7.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl7.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj1.add(lbl7);
			
			JLabel lbl8 = new JLabel("Teclados");
			lbl8.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl8.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj1.add(lbl8);
			
			JPanel PanelNombreObj2 = new JPanel();
			PanelNombreObj2.setBackground(Color.WHITE);
			PanelNombreObj2.setBounds(24, 658, 750, 22);
			PanelPrincipal.add(PanelNombreObj2);
			PanelNombreObj2.setLayout(new GridLayout(1, 4, 0, 0));
			
			JLabel lbl9 = new JLabel("Mouse");
			lbl9.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl9.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj2.add(lbl9);
			
			JLabel lbl10 = new JLabel("Bocinas");
			lbl10.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl10.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj2.add(lbl10);
			
			JLabel lbl11 = new JLabel("Chasis");
			lbl11.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl11.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj2.add(lbl11);
			
			JLabel lbl12 = new JLabel("Otros");
			lbl12.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl12.setHorizontalAlignment(SwingConstants.CENTER);
			PanelNombreObj2.add(lbl12);
			
			JLabel icono = new JLabel("");
			icono.setIcon(new ImageIcon(Principal.class.getResource("/gui/icons/logoPeque\u00F1o1.jpg")));
			icono.setBounds(695, 23, 81, 75);
			PanelPrincipal.add(icono);
			
			setLocationRelativeTo(null);
		}
	}


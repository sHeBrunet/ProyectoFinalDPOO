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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Microprocesadores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;
	private JTextField textBuscar;
	public static String texto = "Buscar en Microprocesadores";
	public static String textoAux = "";

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Microprocesadores() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 680);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.WHITE);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
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
		
		JPanel panelIzq = new JPanel();
		panelIzq.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(135, 206, 235)));
		panelIzq.setBackground(Color.WHITE);
		panelIzq.setBounds(0, 23, 152, 657);
		PanelPrincipal.add(panelIzq);
		panelIzq.setLayout(null);
		
		JLabel lblGoTo = new JLabel("Ir A...");
		lblGoTo.setBounds(43, 112, 66, 22);
		panelIzq.add(lblGoTo);
		lblGoTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panelGoTo = new JPanel();
		panelGoTo.setBounds(0, 145, 150, 398);
		panelIzq.add(panelGoTo);
		panelGoTo.setBackground(new Color(255, 255, 255));
		panelGoTo.setLayout(null);
		
		final JButton btnMb = new JButton("Motherboards");
		btnMb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMb.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnMb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnMb.setBorder(null);
			}
		});
		btnMb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Motherboards motherboards = new Motherboards();
				motherboards.setVisible(true);
			}
		});
		btnMb.setFocusable(false);
		btnMb.setBorder(null);
		btnMb.setBackground(Color.WHITE);
		btnMb.setBounds(0, 34, 150, 23);
		panelGoTo.add(btnMb);
		
		final JButton btnMemoriasRam = new JButton("Memorias RAM");
		btnMemoriasRam.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMemoriasRam.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnMemoriasRam.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnMemoriasRam.setBorder(null);
			}
		});
		btnMemoriasRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MemoriasRAM ram = new MemoriasRAM();
				ram.setVisible(true);
			}
		});
		btnMemoriasRam.setFocusable(false);
		btnMemoriasRam.setBorder(null);
		btnMemoriasRam.setBackground(Color.WHITE);
		btnMemoriasRam.setBounds(0, 68, 150, 23);
		panelGoTo.add(btnMemoriasRam);
		
		final JButton btnTarjetasDeVideo = new JButton("Tarjetas de Video");
		btnTarjetasDeVideo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTarjetasDeVideo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnTarjetasDeVideo.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnTarjetasDeVideo.setBorder(null);
			}
		});
		btnTarjetasDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TarjetaDeVideo tarjetas = new TarjetaDeVideo();
				tarjetas.setVisible(true);
			}
		});
		btnTarjetasDeVideo.setFocusable(false);
		btnTarjetasDeVideo.setBorder(null);
		btnTarjetasDeVideo.setBackground(Color.WHITE);
		btnTarjetasDeVideo.setBounds(0, 102, 150, 23);
		panelGoTo.add(btnTarjetasDeVideo);
		
		final JButton btnHddsdd = new JButton("HDD/SDD");
		btnHddsdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHddsdd.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnHddsdd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnHddsdd.setBorder(null);
			}
		});
		btnHddsdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Discos discos = new Discos();
				discos.setVisible(true);
			}
		});
		btnHddsdd.setFocusable(false);
		btnHddsdd.setBorder(null);
		btnHddsdd.setBackground(Color.WHITE);
		btnHddsdd.setBounds(0, 136, 150, 23);
		panelGoTo.add(btnHddsdd);
		
		final JButton btnFuente = new JButton("Fuente\r\ns");
		btnFuente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFuente.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnFuente.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnFuente.setBorder(null);
			}
		});
		btnFuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Fuentes fuentes = new Fuentes();
				fuentes.setVisible(true);
			}
		});
		btnFuente.setFocusable(false);
		btnFuente.setBorder(null);
		btnFuente.setBackground(Color.WHITE);
		btnFuente.setBounds(0, 170, 150, 23);
		panelGoTo.add(btnFuente);
		
		final JButton btnMonitor = new JButton("Monitor\r\n");
		btnMonitor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMonitor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnMonitor.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnMonitor.setBorder(null);
			}
		});
		btnMonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Monitor monitor = new Monitor();
				monitor.setVisible(true);
			}
		});
		btnMonitor.setFocusable(false);
		btnMonitor.setBorder(null);
		btnMonitor.setBackground(Color.WHITE);
		btnMonitor.setBounds(0, 204, 150, 23);
		panelGoTo.add(btnMonitor);
		
		final JButton btnTeclado = new JButton("Teclado");
		btnTeclado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTeclado.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnTeclado.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnTeclado.setBorder(null);
			}
		});
		btnTeclado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Teclado teclado = new Teclado();
				teclado.setVisible(true);
			}
		});
		btnTeclado.setFocusable(false);
		btnTeclado.setBorder(null);
		btnTeclado.setBackground(Color.WHITE);
		btnTeclado.setBounds(0, 238, 150, 23);
		panelGoTo.add(btnTeclado);
		
		final JButton btnMouse = new JButton("Mouse");
		btnMouse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMouse.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnMouse.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnMouse.setBorder(null);
			}
		});
		btnMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Mouse mouse = new Mouse();
				mouse.setVisible(true);
			}
		});
		btnMouse.setFocusable(false);
		btnMouse.setBorder(null);
		btnMouse.setBackground(Color.WHITE);
		btnMouse.setBounds(0, 272, 150, 23);
		panelGoTo.add(btnMouse);
		
		final JButton btnChasis = new JButton("Chasis");
		btnChasis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChasis.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnChasis.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnChasis.setBorder(null);
			}
		});
		btnChasis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Chasis chasis = new Chasis();
				chasis.setVisible(true);
			}
		});
		btnChasis.setFocusable(false);
		btnChasis.setBorder(null);
		btnChasis.setBackground(Color.WHITE);
		btnChasis.setBounds(0, 340, 150, 23);
		panelGoTo.add(btnChasis);
		
		final JButton btnOtros = new JButton("Otros");
		btnOtros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOtros.setBorder(null);
		btnOtros.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnOtros.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnOtros.setBorder(null);
			}
		});
		btnOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Otros otros = new Otros();
				otros.setVisible(true);
			}
		});
		btnOtros.setFocusable(false);
		btnOtros.setBackground(new Color(255, 255, 255));
		btnOtros.setBounds(0, 374, 150, 23);
		panelGoTo.add(btnOtros);
		
		final JButton btnPrincipal = new JButton("Menu Principal");
		btnPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPrincipal.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnPrincipal.setBorder(null);
			}
		});
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Principal principal = new Principal();
				principal.setVisible(true);
			}
		});
		btnPrincipal.setFocusable(false);
		btnPrincipal.setBorder(null);
		btnPrincipal.setBackground(Color.WHITE);
		btnPrincipal.setBounds(0, 0, 150, 23);
		panelGoTo.add(btnPrincipal);
		
		final JButton btnBocinas = new JButton("Bocinas");
		btnBocinas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBocinas.setBounds(0, 306, 150, 23);
		panelGoTo.add(btnBocinas);
		btnBocinas.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnBocinas.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnBocinas.setBorder(null);
			}
		});
		btnBocinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Bocinas bocinas = new Bocinas();
				bocinas.setVisible(true);
			}
		});
		btnBocinas.setFocusable(false);
		btnBocinas.setBorder(null);
		btnBocinas.setBackground(Color.WHITE);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBackground(new Color(255, 255, 255));
		panelLogo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(135, 206, 235)));
		panelLogo.setBounds(0, 0, 150, 101);
		panelIzq.add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel icono = new JLabel("");
		icono.setHorizontalAlignment(SwingConstants.CENTER);
		icono.setBackground(new Color(255, 255, 255));
		icono.setIcon(new ImageIcon(Bocinas.class.getResource("/gui/icons/logoPeque\u00F1o1.jpg")));
		icono.setBounds(0, 0, 150, 109);
		panelLogo.add(icono);
		
		JPanel panelAnuncios = new JPanel();
		panelAnuncios.setBackground(new Color(255, 255, 255));
		panelAnuncios.setBounds(162, 126, 638, 543);
		PanelPrincipal.add(panelAnuncios);
		panelAnuncios.setLayout(new GridLayout(10, 0, 0, 0));

		final JButton btnAnuncio1 = new JButton("Anuncio 1");
		btnAnuncio1.setFocusable(false);
		btnAnuncio1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio1.setBorder(null);
			}
		});
		btnAnuncio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnuncio1.setBorder(null);
		btnAnuncio1.setBackground(Color.WHITE);
		btnAnuncio1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnuncio1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAnuncios.add(btnAnuncio1);

		final JButton btnAnuncio2 = new JButton("Anuncio 2");
		btnAnuncio2.setFocusable(false);
		btnAnuncio2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio2.setBorder(null);
			}
		});
		btnAnuncio2.setBorder(null);
		btnAnuncio2.setBackground(Color.WHITE);
		btnAnuncio2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio2.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio2);

		final JButton btnAnuncio3 = new JButton("Anuncio 3");
		btnAnuncio3.setFocusable(false);
		btnAnuncio3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio3.setBorder(null);
			}
		});
		btnAnuncio3.setBorder(null);
		btnAnuncio3.setBackground(Color.WHITE);
		btnAnuncio3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio3.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio3);

		final JButton btnAnuncio4 = new JButton("Anuncio 4");
		btnAnuncio4.setFocusable(false);
		btnAnuncio4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio4.setBorder(null);
			}
		});
		btnAnuncio4.setBorder(null);
		btnAnuncio4.setBackground(Color.WHITE);
		btnAnuncio4.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnuncio4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAnuncios.add(btnAnuncio4);

		final JButton btnAnuncio5 = new JButton("Anuncio 5");
		btnAnuncio5.setFocusable(false);
		btnAnuncio5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio5.setBorder(null);
			}
		});
		btnAnuncio5.setBorder(null);
		btnAnuncio5.setBackground(Color.WHITE);
		btnAnuncio5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio5.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio5);

		final JButton btnAnuncio6 = new JButton("Anuncio 6");
		btnAnuncio6.setFocusable(false);
		btnAnuncio6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio6.setBorder(null);
			}
		});
		btnAnuncio6.setBorder(null);
		btnAnuncio6.setBackground(Color.WHITE);
		btnAnuncio6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio6.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio6);

		final JButton btnAnuncio7 = new JButton("Anuncio 7");
		btnAnuncio7.setFocusable(false);
		btnAnuncio7.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio7.setBorder(null);
			}
		});
		btnAnuncio7.setBorder(null);
		btnAnuncio7.setBackground(Color.WHITE);
		btnAnuncio7.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnuncio7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAnuncios.add(btnAnuncio7);

		final JButton btnAnuncio8 = new JButton("Anuncio 8");
		btnAnuncio8.setFocusable(false);
		btnAnuncio8.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio8.setBorder(null);
			}
		});
		btnAnuncio8.setBorder(null);
		btnAnuncio8.setBackground(Color.WHITE);
		btnAnuncio8.setHorizontalAlignment(SwingConstants.LEFT);
		btnAnuncio8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAnuncios.add(btnAnuncio8);

		final JButton btnAnuncio9 = new JButton("Anuncio 9");
		btnAnuncio9.setFocusable(false);
		btnAnuncio9.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio9.setBorder(null);
			}
		});
		btnAnuncio9.setBorder(null);
		btnAnuncio9.setBackground(Color.WHITE);
		btnAnuncio9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio9.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio9);

		final JButton btnAnuncio10 = new JButton("Anuncio 10");
		btnAnuncio10.setFocusable(false);
		btnAnuncio10.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAnuncio10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(135, 206, 235)));
			}
			public void mouseExited(MouseEvent e) {
				btnAnuncio10.setBorder(null);
			}
		});
		btnAnuncio10.setBorder(null);
		btnAnuncio10.setBackground(Color.WHITE);
		btnAnuncio10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAnuncio10.setHorizontalAlignment(SwingConstants.LEFT);
		panelAnuncios.add(btnAnuncio10);

		JPanel panelOpciones = new JPanel();
		panelOpciones.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(135, 206, 235)));
		panelOpciones.setBackground(Color.WHITE);
		panelOpciones.setBounds(152, 23, 648, 101);
		PanelPrincipal.add(panelOpciones);
		panelOpciones.setLayout(null);

		JPanel panelBuscar = new JPanel();
		panelBuscar.setBackground(new Color(255, 255, 255));
		panelBuscar.setBounds(31, 50, 586, 23);
		panelOpciones.add(panelBuscar);
		panelBuscar.setLayout(null);

		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textoAux = textBuscar.getText();
				if(textoAux != ""){
					textBuscar.setEnabled(false);
				}
			}
		});
		btnBuscar.setIcon(new ImageIcon(Bocinas.class.getResource("/gui/icons/flecha.png")));
		btnBuscar.setBounds(560, 0, 26, 23);
		panelBuscar.add(btnBuscar);
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBackground(new Color(255, 255, 255));

		JButton btnX = new JButton("");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBuscar.setText(texto);
				textBuscar.setEnabled(false);
			}
		});
		btnX.setIcon(new ImageIcon(Bocinas.class.getResource("/gui/icons/X.png")));
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(535, 0, 26, 23);
		panelBuscar.add(btnX);

		JLabel lblLupa = new JLabel("");
		lblLupa.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		lblLupa.setBounds(0, 0, 32, 23);
		panelBuscar.add(lblLupa);
		lblLupa.setIcon(new ImageIcon(Bocinas.class.getResource("/gui/icons/lupa.png")));

		textBuscar = new JTextField();
		textBuscar.setEnabled(false);
		textBuscar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(!textBuscar.isEnabled()){
					textBuscar.setEnabled(true);
					textBuscar.setText(textoAux);
				}
			}
		});
		textBuscar.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		textBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textBuscar.setText(texto);
		textBuscar.setBackground(Color.WHITE);
		textBuscar.setEditable(true);
		textBuscar.setBounds(32, 0, 506, 23);
		panelBuscar.add(textBuscar);
		textBuscar.setColumns(10);
		
		JLabel lblNombre = new JLabel("Microprocesadores:");
		lblNombre.setBounds(200, 16, 212, 23);
		panelOpciones.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		setLocationRelativeTo(null);
	}

}

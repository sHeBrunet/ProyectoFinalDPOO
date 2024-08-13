package interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import logica.TiendaDeComputadoras;
import logica.Trabajador;
import logica.Gerente;
import inicializaciones.*;


public class AgregarTrabajador extends JDialog {
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel = new JPanel();
	private JTextField numTrabajador;
	private JTextField nombreT;
	private JTextField apellidosT;
	private JTextField CiT;
	private JTextField salarioT;
	private JComboBox<String> NivelE;
	private JComboBox<String> cargoT;
	private JSpinner spinnerFecha;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JTable table;
	private DefaultTableModel tableModel;
	private Principal p;
	private TiendaDeComputadoras tienda;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JLabel fechaOcupTextLabel;
	private Trabajador trab;
	private JPanel panel_1;
	private JButton btnAtrs;

	public AgregarTrabajador(Principal principal, TiendaDeComputadoras tiendaC) {
		super(principal, true);
		InicializacionDeDatos.crearTrabajadores(tiendaC);
		InicializacionDeDatos.crearGerentes(tiendaC);

		setTitle("Manejo de trabajadores");
		p = principal;
		tienda = tiendaC;
		setBounds(100, 100, 900, 746);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 890, 682);
		panel.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPanel.add(panel);
		panel.setLayout(null);

		JPanel panelAgregarTrabajadores = new JPanel();
		panelAgregarTrabajadores.setBounds(116, 87, 751, 296);
		panelAgregarTrabajadores.setForeground(UIManager.getColor("Button.frame"));
		panelAgregarTrabajadores.setBorder(new TitledBorder(new LineBorder(new Color(0, 88, 168)), "Agregar Trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelAgregarTrabajadores.setBackground(UIManager.getColor("Button.light"));
		panel.add(panelAgregarTrabajadores);
		panelAgregarTrabajadores.setLayout(null);

		JLabel lblnombreT = new JLabel("Nombre:");
		lblnombreT.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblnombreT.setBounds(12, 55, 128, 16);
		panelAgregarTrabajadores.add(lblnombreT);

		JLabel lblApellidosT = new JLabel("Apellidos:");
		lblApellidosT.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApellidosT.setBounds(12, 83, 128, 16);
		panelAgregarTrabajadores.add(lblApellidosT);

		JLabel lblCiT = new JLabel("CI:");
		lblCiT.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCiT.setBounds(12, 111, 128, 16);
		panelAgregarTrabajadores.add(lblCiT);

		JLabel lblSalarioT = new JLabel("Salario B�sico:");
		lblSalarioT.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSalarioT.setBounds(12, 139, 128, 16);
		panelAgregarTrabajadores.add(lblSalarioT);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Nivel Escolar:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2.setBounds(12, 167, 128, 16);
		panelAgregarTrabajadores.add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Cargo:");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2_1.setBounds(12, 195, 128, 16);
		panelAgregarTrabajadores.add(lblNewLabel_1_1_1_1_2_1);

		nombreT = new JTextField();
		nombreT.setFont(new Font("Arial", Font.PLAIN, 15));
		nombreT.setForeground(UIManager.getColor("Button.foreground"));
		nombreT.setBounds(247, 54, 445, 20);
		panelAgregarTrabajadores.add(nombreT);
		nombreT.setColumns(10);

		apellidosT = new JTextField();
		apellidosT.setFont(new Font("Arial", Font.PLAIN, 15));
		apellidosT.setColumns(10);
		apellidosT.setBounds(247, 82, 445, 20);
		panelAgregarTrabajadores.add(apellidosT);

		CiT = new JTextField();
		CiT.setFont(new Font("Arial", Font.PLAIN, 15));
		CiT.setColumns(10);
		CiT.setBounds(247, 110, 445, 20);
		panelAgregarTrabajadores.add(CiT);

		salarioT = new JTextField();
		salarioT.setFont(new Font("Arial", Font.PLAIN, 15));
		salarioT.setColumns(10);
		salarioT.setBounds(247, 138, 445, 20);
		panelAgregarTrabajadores.add(salarioT);

		NivelE = new JComboBox<>();
		NivelE.setBounds(247, 166, 445, 20);
		panelAgregarTrabajadores.add(NivelE);

		cargoT = new JComboBox<>();
		cargoT.setBounds(247, 194, 445, 20);
		panelAgregarTrabajadores.add(cargoT);

		llenarComboBox(NivelE, InicializacionDeDatos.nivelesEscolar());
		llenarComboBox(cargoT, InicializacionDeDatos.cargos());

		fechaOcupTextLabel = new JLabel("Fecha Ocupaci�n del cargo:");
		fechaOcupTextLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		fechaOcupTextLabel.setBounds(12, 223, 200, 16);
		panelAgregarTrabajadores.add(fechaOcupTextLabel).setVisible(false);

		spinnerFecha = new JSpinner(new SpinnerDateModel(new Date(), null, new Date(), Calendar.DAY_OF_YEAR));
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy");
		spinnerFecha.setEditor(dateEditor);
		spinnerFecha.setBounds(246, 221, 98, 22);
		panelAgregarTrabajadores.add(spinnerFecha);
		spinnerFecha.setVisible(false);

		JLabel lblNewLabel_1 = new JLabel("No. trabajador:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 27, 128, 16);
		panelAgregarTrabajadores.add(lblNewLabel_1);

		numTrabajador = new JTextField();
		numTrabajador.setEditable(false);
		numTrabajador.setBounds(247, 26, 38, 20);
		panelAgregarTrabajadores.add(numTrabajador);
		numTrabajador.setColumns(10);
		iniciarDatos();

		btnAgregar = new JButton("Agregar Trabajador/Gerente");
		btnAgregar.setBounds(247, 250, 445, 25);
		panelAgregarTrabajadores.add(btnAgregar);

		cargoT.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cargoT.getSelectedItem().equals("Gerente")) {
					fechaOcupTextLabel.setVisible(true);
					spinnerFecha.setVisible(true);
				} else {
					spinnerFecha.setVisible(false);
					fechaOcupTextLabel.setVisible(false);
				}
			}
		});
		iniciarDatos();
		btnAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean datoIncorrecto = false;
				int noTrabajador = 0;
				String nombre = nombreT.getText();
				String apellidos = apellidosT.getText();
				String ci = CiT.getText();
				String salarioB = salarioT.getText();
				String cargo = (String) cargoT.getSelectedItem();
				String nivelE = (String) NivelE.getSelectedItem();

				if (numTrabajador.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(AgregarTrabajador.this, "El n�mero de trabajador no puede estar vac�o.");
					datoIncorrecto = true;
				} else {
					try {
						noTrabajador = Integer.parseInt(numTrabajador.getText().trim());
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(AgregarTrabajador.this, "El n�mero de trabajador debe ser un n�mero v�lido.");
						datoIncorrecto = true;
					}
				}

				if (nombre.trim().isEmpty() || !nombre.matches("[a-zA-Z]+")) {
					lblnombreT.setForeground(Color.RED);
					datoIncorrecto = true;
				} else {
					lblnombreT.setForeground(Color.BLACK);
				}

				if (apellidos.trim().isEmpty() || !apellidos.matches("[a-zA-Z]+")) {
					lblApellidosT.setForeground(Color.RED);
					datoIncorrecto = true;
				} else {
					lblApellidosT.setForeground(Color.BLACK);
				}

				if (ci.trim().isEmpty() || !ci.matches("\\d+")) {
					lblCiT.setForeground(Color.RED);
					datoIncorrecto = true;
				} else {
					lblCiT.setForeground(Color.BLACK);
				}

				if (salarioB.trim().isEmpty()) {
					lblSalarioT.setForeground(Color.RED);
					datoIncorrecto = true;
				} else {
					lblSalarioT.setForeground(Color.BLACK);
				}

				if (datoIncorrecto) {
					JOptionPane.showMessageDialog(AgregarTrabajador.this, "No pueden estar vac�os los campos marcados en rojo.");
				} else {
					try {
						float salario = Float.parseFloat(salarioB);
						Trabajador trabajador;
						if (cargo.equals("Gerente")) {
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							String fechaStr = sdf.format((Date) spinnerFecha.getValue());
							java.sql.Date fecha = null;
							try {
								fecha = new java.sql.Date(sdf.parse(fechaStr).getTime());
							} catch (ParseException ex) {
								JOptionPane.showMessageDialog(null, "Error al convertir la fecha: " + ex.getMessage());
								ex.printStackTrace();
							}
							trabajador = new Gerente(noTrabajador, nombre, apellidos, ci, salario, nivelE, cargo, fecha);
						} else {
							trabajador = new Trabajador(noTrabajador, nombre, apellidos, ci, salario, nivelE, cargo);
						}
						tienda.agregarTrabajador(trabajador);
						trab = trabajador;
						JOptionPane.showMessageDialog(AgregarTrabajador.this, "Trabajador agregado de manera satisfactoria");

						if (cargo.equals("Gerente")) {
							SimpleDateFormat formFecha = new SimpleDateFormat("dd/mm/yyyy");
							String fecha = formFecha.format((Date) spinnerFecha.getValue());
							tableModel.addRow(new Object[]{noTrabajador, nombre, apellidos, ci, salario, nivelE, cargo, fecha});
						} else {
							tableModel.addRow(new Object[]{noTrabajador, nombre, apellidos, ci, salario, nivelE, cargo, ""});
						}

						iniciarDatos();
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(AgregarTrabajador.this, "El salario debe ser un n�mero v�lido.");
					}
				}
			}


		});
		btnAgregar.setBounds(583, 263, 70, 22);
		panelAgregarTrabajadores.add(btnAgregar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = table.getSelectedRow();
				if (pos != -1) {
					tienda.eliminarTrabajador(pos);
					((DefaultTableModel) table.getModel()).removeRow(pos);
				} else {
					JOptionPane.showMessageDialog(AgregarTrabajador.this, "Antes de eliminar debe de seleccionar un trabajador de la tabla");
				}
			}
		});
		btnEliminar.setBounds(670, 263, 70, 22);
		panelAgregarTrabajadores.add(btnEliminar);

		JPanel panelTrabajadoresAgregados = new JPanel();
		panelTrabajadoresAgregados.setBounds(29, 448, 837, 188);
		panelTrabajadoresAgregados.setBorder(new TitledBorder(null, "Trabajadores Agregados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTrabajadoresAgregados.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel.add(panelTrabajadoresAgregados);
		panelTrabajadoresAgregados.setLayout(new BorderLayout(0, 0));

		tableModel = new DefaultTableModel();
		tableModel.addColumn("No.");
		tableModel.addColumn("Nombre");
		tableModel.addColumn("Apellidos");
		tableModel.addColumn("CI");
		tableModel.addColumn("Salario");
		tableModel.addColumn("Educaci�n");
		tableModel.addColumn("Cargo");
		tableModel.addColumn("Fecha de Ingreso");

		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		panelTrabajadoresAgregados.add(scrollPane, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(22, 55, 76, 60);
		lblNewLabel.setIcon(new ImageIcon(AgregarTrabajador.class.getResource("/gui/icons/logoPeque\u00F1o1.jpg")));
		panel.add(lblNewLabel);
				
				panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(0, 683, 890, 33);
				contentPanel.add(panel_1);
						panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
						
						btnAtrs = new JButton("Atr\u00E1s");
						btnAtrs.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
							}
						});
						panel_1.add(btnAtrs);
				
						btnGuardar = new JButton("Aceptar");
						panel_1.add(btnGuardar);
						
								btnCancelar = new JButton("Cancelar");
								panel_1.add(btnCancelar);
								btnCancelar.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										dispose();
									}
								});
						btnGuardar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(actualizarLista() == true) {
									actualizarLista();
									JOptionPane.showMessageDialog(AgregarTrabajador.this, "Trabajador guardado satisfactoriamente");
								}
							}
						});
	}

	private void llenarComboBox(JComboBox<String> comboBox, ArrayList<String> items) {
		for (String item : items) {
			comboBox.addItem(item);
		}
	}
	private boolean actualizarLista() {
		boolean act = false;
		if(trab != null) {
			tienda.getTrabajadores().add(trab);
			act = true;
		}
		else {
			JOptionPane.showMessageDialog(AgregarTrabajador.this, "Antes de guardar debe de agregar un trabajador");
		}
		return act;
	}
	private void iniciarDatos() {
		numTrabajador.setText(String.valueOf(tienda.getUltimoNoTrabajador() + 1));
		nombreT.setText("");
		apellidosT.setText("");
		CiT.setText("");
		salarioT.setText("");
		NivelE.setSelectedIndex(0);
		cargoT.setSelectedIndex(0);
		spinnerFecha.setValue(new Date());
		spinnerFecha.setVisible(false);
		fechaOcupTextLabel.setVisible(false);
	}
}

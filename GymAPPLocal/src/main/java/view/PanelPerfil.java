package view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelPerfil extends JPanel {

	private static final long serialVersionUID = 1L;

	private Ventana ventana;
	private JTextField textPNombre;
	private JTextField textPApellidos;
	private JTextField textPEmail;
	private JTextField textPPassword;
	private JTextField textPFecha;

	/**
	 * Create the panel.
	 */
	public PanelPerfil(Ventana ventana) {
		this.ventana = ventana;

		setBounds(new Rectangle(0, 0, 640, 480));
		setLayout(null);

		JButton btnPGuardar = new JButton("Guardar");
		btnPGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana.mostrarPanel("");
			}
		});
		btnPGuardar.setBounds(240, 317, 175, 23);
		add(btnPGuardar);

		JButton btnPSalir = new JButton("Salir");
		btnPSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPSalir.setBounds(495, 402, 89, 23);
		add(btnPSalir);

		JButton btnPVolver = new JButton("Volver");
		btnPVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana.mostrarPanel("");
			}
		});
		btnPVolver.setBounds(392, 402, 89, 23);
		add(btnPVolver);

		JLabel lblPNombre = new JLabel("Nombre:");
		lblPNombre.setBounds(117, 92, 113, 14);
		add(lblPNombre);

		JLabel lblPApellidos = new JLabel("Apellidos:");
		lblPApellidos.setBounds(117, 130, 113, 14);
		add(lblPApellidos);

		JLabel lblPEmail = new JLabel("Email:");
		lblPEmail.setBounds(117, 172, 113, 14);
		add(lblPEmail);

		JLabel lblPPassword = new JLabel("Contraseña:");
		lblPPassword.setBounds(117, 214, 113, 14);
		add(lblPPassword);

		JLabel lblPFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblPFechaNacimiento.setBounds(117, 253, 126, 14);
		add(lblPFechaNacimiento);

		textPNombre = new JTextField();
		textPNombre.setBounds(261, 92, 154, 20);
		add(textPNombre);
		textPNombre.setColumns(10);

		textPApellidos = new JTextField();
		textPApellidos.setColumns(10);
		textPApellidos.setBounds(261, 130, 154, 20);
		add(textPApellidos);

		textPEmail = new JTextField();
		textPEmail.setColumns(10);
		textPEmail.setBounds(261, 172, 154, 20);
		add(textPEmail);

		textPPassword = new JTextField();
		textPPassword.setColumns(10);
		textPPassword.setBounds(261, 214, 154, 20);
		add(textPPassword);

		textPFecha = new JTextField();
		textPFecha.setColumns(10);
		textPFecha.setBounds(261, 253, 154, 20);
		add(textPFecha);

	}

	/**
	 * Devuelve el JPanel transformándolo con los parámetros y coordenadas que le
	 * pasamos
	 * 
	 * @param x      Nueva coordenada x
	 * @param y      Nueva coordenada y
	 * @param width  Nueva anchura
	 * @param height Nueva altura
	 * @param name   Nombre del panel
	 * @return El panel con sus componentes añadidos
	 */
	public JPanel getJPanel(int x, int y, int width, int height, String name) {
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		this.setName(name);

		return this;
	}

}

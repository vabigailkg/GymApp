package view;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRegistro extends JPanel {

	private static final long serialVersionUID = 1L;

	private Ventana ventana;
	private JTextField textRNombre;
	private JTextField textRApellidos;
	private JTextField textREmail;
	private JTextField textRPassword;
	private JTextField textRFecha;

	public PanelRegistro(Ventana ventana) {
		this.ventana = ventana;

		setBounds(new Rectangle(0, 0, 640, 480));
		setLayout(null);
		
		JButton btnRegistrarUsuario = new JButton("Registrar usuario");
		btnRegistrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarUsuario.setBounds(240, 317, 175, 23);
		add(btnRegistrarUsuario);
		
		JButton btnRSalir = new JButton("Salir");
		btnRSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRSalir.setBounds(495, 402, 89, 23);
		add(btnRSalir);
		
		JButton btnRVolver = new JButton("Volver");
		btnRVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Cambiar panel
				ventana.mostrarPanel("panelLogin");
			}
		});
		btnRVolver.setBounds(392, 402, 89, 23);
		add(btnRVolver);
		
		JLabel lblRNombre = new JLabel("Nombre:");
		lblRNombre.setBounds(117, 92, 113, 14);
		add(lblRNombre);
		
		JLabel lblRApellidos = new JLabel("Apellidos:");
		lblRApellidos.setBounds(117, 130, 113, 14);
		add(lblRApellidos);
		
		JLabel lblREmail = new JLabel("Email:");
		lblREmail.setBounds(117, 172, 113, 14);
		add(lblREmail);
		
		JLabel lblRPassword = new JLabel("Contraseña:");
		lblRPassword.setBounds(117, 214, 113, 14);
		add(lblRPassword);
		
		JLabel lblRFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblRFechaNacimiento.setBounds(117, 253, 126, 14);
		add(lblRFechaNacimiento);
		
		textRNombre = new JTextField();
		textRNombre.setBounds(261, 92, 154, 20);
		add(textRNombre);
		textRNombre.setColumns(10);
		
		textRApellidos = new JTextField();
		textRApellidos.setColumns(10);
		textRApellidos.setBounds(261, 130, 154, 20);
		add(textRApellidos);
		
		textREmail = new JTextField();
		textREmail.setColumns(10);
		textREmail.setBounds(261, 172, 154, 20);
		add(textREmail);
		
		textRPassword = new JTextField();
		textRPassword.setColumns(10);
		textRPassword.setBounds(261, 214, 154, 20);
		add(textRPassword);
		
		textRFecha = new JTextField();
		textRFecha.setColumns(10);
		textRFecha.setBounds(261, 253, 154, 20);
		add(textRFecha);
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

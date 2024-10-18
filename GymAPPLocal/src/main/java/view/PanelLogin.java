package view;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class PanelLogin extends JPanel {

	private static final long serialVersionUID = 1L;

	private Ventana ventana;
	private JTextField txtUsuario;
	private JTextField txtPassword;

	public PanelLogin(Ventana ventana) {
		// Referenciamos el frame
		this.ventana = ventana;

		setBounds(new Rectangle(0, 0, 640, 480));
		setLayout(null);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLogin.setBounds(211, 307, 89, 23);
		add(btnLogin);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnSalir.setBounds(493, 407, 89, 23);
		add(btnSalir);

		JButton btnRegistro = new JButton("Nuevo usuario");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistro.setBounds(328, 307, 117, 23);
		add(btnRegistro);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(211, 164, 234, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setBounds(211, 208, 117, 20);
		add(txtPassword);
		txtPassword.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(96, 167, 105, 14);
		add(lblUsuario);

		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(96, 211, 105, 14);
		add(lblPassword);
	}

	/**
	 * Devuelve el JPanel con los parámetros y coordenadas que le pasamos ya
	 * aplicados.
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

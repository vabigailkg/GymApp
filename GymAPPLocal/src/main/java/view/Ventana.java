package view;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Clase JFrame que cambia de panel a mostrar.
 */
public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	public JFrame ventana = null;

	// MEDIDAS FRAME + PANELES
	private static final int FRAME_X = 100;
	private static final int FRAME_Y = 100;
	private static final int FRAME_ANCHO = 640;
	private static final int FRAME_ALTO = 480;
	private static final int PANEL_X = 0;
	private static final int PANEL_Y = 0;
	private static final int PANEL_ANCHO = 640;
	private static final int PANEL_ALTO = 480;

	/**
	 * Constructor que instancia la ventana.
	 */
	public Ventana() {
		//setTitle("GymApp - Aplicación de escritorio"); ??????????????? no se ve
		ventana = new JFrame();
	}

	/**
	 * Método que aplica parámetros a paneles + frame y configura la visibilidad por
	 * defecto.
	 */
	public void iniciar() {
		// Parámetros frame
		ventana.setBounds(FRAME_X, FRAME_Y, FRAME_ANCHO, FRAME_ALTO);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		// Instanciar clases JPanel
		PanelLogin panelLogin = new PanelLogin(this);
		PanelRegistro panelRegistro = new PanelRegistro(this);

		// Aplicar parámetros a paneles
		JPanel pLogin = panelLogin.getJPanel(PANEL_X, PANEL_Y, PANEL_ANCHO, PANEL_ALTO, "panelLogin");
		JPanel pRegistro = panelRegistro.getJPanel(PANEL_X, PANEL_Y, PANEL_ANCHO, PANEL_ALTO, "panelRegistro");

		// Agregar paneles al frame
		ventana.getContentPane().add(pLogin);
		ventana.getContentPane().add(pRegistro);
		
		// Visibilidad por defecto
		pLogin.setVisible(true);
		pRegistro.setVisible(false);
		ventana.setVisible(true);
	}

	/**
	 * Muestra el panel que le pasamos por nombre y oculta el resto.
	 * 
	 * @param nombrePanel Panel a mostrar.
	 */
	public void mostrarPanel(String nombrePanel) {
		// Saca todos los componentes de JFrame
		Component[] listaComponentes = ventana.getContentPane().getComponents();
		List<Component> componentes = Arrays.asList(listaComponentes);

		for (Component component : componentes) {

			// Ignora todo menos los JPanel
			if (component instanceof JPanel) {
				if ((null != component.getName()) && (component.getName().equals(nombrePanel))) {
					component.setVisible(true);
				} else {
					component.setVisible(false);
				}
			}
		}
	}

}

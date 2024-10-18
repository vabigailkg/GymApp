package view;

import java.awt.Rectangle;

import javax.swing.JPanel;

public class PanelWorkout extends JPanel {

	private static final long serialVersionUID = 1L;

	private Ventana ventana;

	public PanelWorkout(Ventana ventana) {
		this.ventana = ventana;

		setBounds(new Rectangle(0, 0, 640, 480));
		setLayout(null);

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

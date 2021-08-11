package ejercicio1.ejerciciomaven1;

import java.awt.Component;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AplicacionGrafica4 extends JFrame {
	private JPanel panel;
	private JLabel etiqueta1;
	private final String etiqueta1String = "Eventos";
	private JTextArea textArea1;

	public void crearVentana() {
		// añadimos el titulo
		setTitle("Ventana con más interacción");
		// configuramos dimensiones ventana
		setBounds(400, 200, 550, 400);
		// iniciar componentes
		iniciarComponentes();
		// al cerrar la ventana se para la app
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// nos hace visible la ventana
		setVisible(true);
	}

	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarTextArea();

	}

	public void colocarPanel() {

		// Creacion del panel
		panel = new JPanel();
		// Diseño del panel
		panel.setLayout(null);
		// Asignar el panel a la ventana
		setContentPane(panel);
	}

	public void colocarEtiquetas() {

		// añadir etiqueta
		etiqueta1 = new JLabel();

		// resultado = new JLabel();
		// añadir texto de la etiqueta
		etiqueta1.setText(etiqueta1String);

		// dimensiones etiqueta
		etiqueta1.setBounds(10, 100, 100, 30);

		// resultado.setBounds(125, 20, 80, 30);
		// fondo etiqueta 2 (resultado)
		// resultado.setOpaque(true);
		// resultado.setBackground(Color.WHITE);
		// añadir etiqueta al panel
		// panel.add(resultado);
		panel.add(etiqueta1);

	}

	public void colocarTextArea() {
		// añadir area de texto
		textArea1 = new JTextArea();
		// dimensiones de area de texto
		textArea1.setBounds(115, 15, 400, 250);

		// añadir textArea al panel
		panel.add(textArea1);
		// añadir eventos al textArea
		eventosVentana oyenteEventos = new eventosVentana();
		addWindowListener(oyenteEventos);
	}

	public class eventosVentana implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.setText("Ventana Abierta");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			textArea1.setText("Cerrando Ventana");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			textArea1.setText("Ventana Cerrada");

		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.setText("Ventana Minimizada");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			textArea1.setText("Ventana Restaurada");

		}

		@Override
		public void windowActivated(WindowEvent e) {
			textArea1.setText("Ventana Activada");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.setText("Ventana Desactivada");

		}
	}
}

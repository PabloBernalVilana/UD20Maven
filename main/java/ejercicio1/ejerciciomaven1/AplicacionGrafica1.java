package ejercicio1.ejerciciomaven1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AplicacionGrafica1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiqueta;

	public void Ventana() {
		// titulo de la interfaz
		setTitle("Nueva aplicación");

		// coordenadas x e y, altura y longitud
		setBounds(400, 200, 250, 300);

		iniciarComponentes();
		// controles básicos
		// cerrar aplicacion / ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// hacer visible la ventana
		setVisible(true);
	}

	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();

	}

	public void colocarPanel() {

		// Creacion del panel
		contentPane = new JPanel();

		// Diseño del panel
		contentPane.setLayout(null);

		// Asignar el panel a la ventana
		setContentPane(contentPane);
	}

	public void colocarEtiqueta() {

		// Crear la etiqueta
		// Alineacion en el centro de la etiqueta
		// en horizontal
		etiqueta = new JLabel();

		// introducir texto etiqueta
		etiqueta.setText("ETIQUETA");

		// Alinear horizontalmente
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

		// cambiar color de la letra
		etiqueta.setForeground(Color.WHITE);

		// Cambiar el formato de la etiqueta por defecto
		// para que nos permita cambiar el fondo de la etiqueta
		etiqueta.setOpaque(true);

		// cambiar el fondo de la etiqueta
		etiqueta.setBackground(Color.BLACK);

		// Colocar etiqueta
		etiqueta.setBounds(50, 20, 150, 100);

		// Establecer fuente
		etiqueta.setFont(new Font("chiller", Font.PLAIN, 40));
		// Añadir el elemento al panel
		contentPane.add(etiqueta);

	}

}

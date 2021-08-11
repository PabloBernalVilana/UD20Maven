package ejercicio1.ejerciciomaven1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ejercicio1.ejerciciomaven1.AplicacionGrafica4.eventosVentana;

public class AplicacionGrafica6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel etiquetaAltura;
	private JLabel etiquetaPeso;
	private JLabel etiquetaIMC;
	private JTextArea textAreaAltura;
	private JTextArea textAreaPeso;
	private JTextArea textAreaIMC;
	private final String etiqueta1String = "Altura(metros): ";
	private final String etiqueta2String = "Peso(Kg): ";
	private final String etiqueta3String = "IMC: ";
	// private JLabel resultado;
	private JButton calcularIMC;

	public void crearVentana() {
		// añadimos el titulo
		setTitle("Ventana con más interacción");
		// configuramos dimensiones ventana
		setBounds(400, 200, 500, 500);
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
		colocarBotones();
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
		etiquetaAltura = new JLabel();
		etiquetaPeso = new JLabel();
		etiquetaIMC = new JLabel();
		// añadir texto de la etiqueta
		etiquetaAltura.setText(etiqueta1String);
		etiquetaPeso.setText(etiqueta2String);
		etiquetaIMC.setText(etiqueta3String);
		// dimensiones etiqueta
		etiquetaAltura.setBounds(40, 20, 100, 30);
		etiquetaPeso.setBounds(240, 20, 100, 30);
		etiquetaIMC.setBounds(100, 60, 60, 30);
		// añadir etiqueta al panel
		panel.add(etiquetaAltura);
		panel.add(etiquetaPeso);
		panel.add(etiquetaIMC);

	}

	public void colocarBotones() {
		// crear los botones
		// e insertar el texto del boton
		calcularIMC = new JButton();
		calcularIMC.setText("Calcular IMC");
		// Formato del texto de los botones
		// color de la letra
		calcularIMC.setForeground(Color.WHITE);
		// fuente de la letra
		calcularIMC.setFont(new Font("arial", 1, 12));
		// cambiar fondo a opaco(Solo necesario en las etiquetas)
		// Asignar color de fondo
		// boton1.setOpaque(true);
		// boton2.setOpaque(true);
		calcularIMC.setBackground(Color.BLACK);
		// Fijamos tamaño de los botones
		calcularIMC.setBounds(250, 60, 110, 30);
		// activar o desactivar los botones
		calcularIMC.setEnabled(true);
		// añadir botons al panel
		panel.add(calcularIMC);
		// Oyente de Accion
		calcularIMC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textAreaAltura.
				
			}
		});
	}

	public void colocarTextArea() {
		// añadir area de texto
		textAreaAltura = new JTextArea();
		textAreaPeso = new JTextArea();
		textAreaIMC = new JTextArea();
		// dimensiones de area de texto
		textAreaAltura.setBounds(130, 20, 100, 30);
		textAreaAltura.setBackground(Color.DARK_GRAY);
		textAreaAltura.setForeground(Color.WHITE);
		textAreaAltura.setEnabled(true);

		textAreaPeso.setBounds(300, 20, 100, 30);
		textAreaPeso.setBackground(Color.DARK_GRAY);
		textAreaPeso.setForeground(Color.WHITE);
		textAreaPeso.setEnabled(true);

		textAreaIMC.setBounds(130, 60, 100, 30);
		textAreaIMC.setBackground(Color.DARK_GRAY);
		textAreaIMC.setForeground(Color.WHITE);
		textAreaIMC.setEditable(false);

		// añadir textArea al panel
		panel.add(textAreaAltura);
		panel.add(textAreaPeso);
		panel.add(textAreaIMC);

		// añadir eventos al textArea

	}
}

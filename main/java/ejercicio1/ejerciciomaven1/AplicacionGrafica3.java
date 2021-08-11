package ejercicio1.ejerciciomaven1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AplicacionGrafica3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private final String etiqueta1String = "";
	private final String etiqueta2String = "";
	// private JLabel resultado;
	private JButton boton1;
	private JButton boton2;
	private int contadorBoton1 = 0;
	private int contadorBoton2 = 0;

	public void crearVentana() {
		// añadimos el titulo
		setTitle("Ventana con más interacción");
		// configuramos dimensiones ventana
		setBounds(400, 200, 500, 175);
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
		etiqueta2 = new JLabel();
		// resultado = new JLabel();
		// añadir texto de la etiqueta
		etiqueta1.setText(etiqueta1String);
		etiqueta2.setText(etiqueta2String);
		// dimensiones etiqueta
		etiqueta1.setBounds(140, 20, 200, 30);
		etiqueta2.setBounds(250, 20, 200, 30);
		// resultado.setBounds(125, 20, 80, 30);
		// fondo etiqueta 2 (resultado)
		// resultado.setOpaque(true);
		// resultado.setBackground(Color.WHITE);
		// añadir etiqueta al panel
		// panel.add(resultado);
		panel.add(etiqueta1);
		panel.add(etiqueta2);

	}

	public void colocarBotones() {
		// crear los botones
		// e insertar el texto del boton
		boton1 = new JButton();
		boton1.setText("Boton 1");
		boton2 = new JButton();
		boton2.setText("Boton 2 ");
		// Formato del texto de los botones
		// color de la letra
		boton1.setForeground(Color.WHITE);
		boton2.setForeground(Color.WHITE);
		// fuente de la letra
		boton1.setFont(new Font("arial", 1, 12));
		boton2.setFont(new Font("arial", 1, 12));
		// cambiar fondo a opaco(Solo necesario en las etiquetas)
		// Asignar color de fondo
		// boton1.setOpaque(true);
		// boton2.setOpaque(true);
		boton1.setBackground(Color.BLACK);
		boton2.setBackground(Color.BLACK);
		// Fijamos tamaño de los botones
		boton1.setBounds(140, 50, 90, 30);
		boton2.setBounds(250, 50, 90, 30);
		// activar o desactivar los botones
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		// añadir botons al panel
		panel.add(boton1);
		panel.add(boton2);
		// Oyente de Accion

		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// resultado.setText(" " + e.getActionCommand());

				contadorBoton1++;

				etiqueta1.setText(etiqueta1String + e.getActionCommand() + ": "
				+ contadorBoton1 + " veces ");
			}
		});
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contadorBoton2++;
				etiqueta2.setText(etiqueta2String + e.getActionCommand() + ": " 
				+ contadorBoton2 + " veces ");

			}
		});
	}
}

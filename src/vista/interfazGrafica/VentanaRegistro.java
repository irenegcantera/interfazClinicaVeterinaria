package vista.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido1;
	private JTextField textApellido2;
	private JTextField textUsuario;
	private JTextField textField;
	private JTextField textPasswordRepetir;
	private ImageIcon iconClinica;
	private JButton btnDarAlta;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelNombre.setBounds(38, 81, 68, 31);
		contentPane.add(labelNombre);
		
		JLabel labelApellido1 = new JLabel("Apellido 1");
		labelApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelApellido1.setBounds(38, 122, 78, 19);
		contentPane.add(labelApellido1);
		
		JLabel labelApellido2 = new JLabel("Apellido 2");
		labelApellido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelApellido2.setBounds(38, 160, 68, 19);
		contentPane.add(labelApellido2);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombre.setBounds(132, 84, 224, 25);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido1 = new JTextField();
		textApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textApellido1.setBounds(132, 121, 224, 25);
		contentPane.add(textApellido1);
		textApellido1.setColumns(10);
		
		textApellido2 = new JTextField();
		textApellido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textApellido2.setBounds(132, 156, 224, 25);
		contentPane.add(textApellido2);
		textApellido2.setColumns(10);
		
		JLabel labelRegistro = new JLabel("Nuevo empleado");
		labelRegistro.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelRegistro.setBounds(38, 32, 249, 25);
		contentPane.add(labelRegistro);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelUsuario.setBounds(38, 236, 68, 19);
		contentPane.add(labelUsuario);
		
		JLabel labelPassword = new JLabel("Contrase\u00F1a");
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelPassword.setBounds(38, 275, 78, 19);
		contentPane.add(labelPassword);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(132, 232, 224, 25);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(132, 269, 224, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnDarAlta = new JButton("Dar de alta");
		btnDarAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDarAlta.setBounds(59, 382, 120, 31);
		contentPane.add(btnDarAlta);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(224, 382, 120, 31);
		contentPane.add(btnCancelar);
		
		JLabel labelPasswordRepetir = new JLabel("Repetir ");
		labelPasswordRepetir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelPasswordRepetir.setBounds(38, 313, 78, 19);
		contentPane.add(labelPasswordRepetir);
		
		textPasswordRepetir = new JTextField();
		textPasswordRepetir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPasswordRepetir.setColumns(10);
		textPasswordRepetir.setBounds(132, 304, 224, 28);
		contentPane.add(textPasswordRepetir);
		
		setVisible(true);
		setLocationRelativeTo(null);
		iconClinica = new ImageIcon("images\\iconoCV.png");
		setTitle("Clínica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());
        
        accionesActivadas();
        
	}
	
	/**
	 * Este método recoge todas las acciones de los botones y se inicializan en el constructor.
	 */
	private void accionesActivadas() {
		btnDarAlta.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	 btnDarAltaActionPerformed(evt);
	        }
	    });
	}
	
	/**
	 * Este método mostrará un mensaje de bienvenido al dar alta a un nuevo empleado.
	 * @param evt
	 */
	private void btnDarAltaActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	javax.swing.JOptionPane.showMessageDialog(this,"Bienvenido a Clínica Veterinaria MegaMascotas","Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    	new VentanaIdentificacion();
    	this.setVisible(false);
    }
}

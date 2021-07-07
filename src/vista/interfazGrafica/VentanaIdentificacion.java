
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.interfazGrafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase que hereda de un JFrame. Esta clase representa una ventana de inicio
 * que solicita un usuario y contrase�a para acceder a la p�gina principal
 * de la interfaz gr�fica.
 * @author Irene Gonz�lez Cantera 
 * @version 1.5
 */
@SuppressWarnings("serial")
public class VentanaIdentificacion extends JFrame {

    /** Creates new form VentanaIdentificacion */
    public VentanaIdentificacion() {
        initComponents();
        configuracionComponetes();
        configuracionVentana();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * Este m�todo es llamado en el constructor e incializar� todos los 
     * componentes de la ventana (etiquetas, campo de texto, iconos, botones).                          
     */
    private void initComponents() {
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();
        labelUsuario = new JLabel();
        labelPassword = new JLabel();
        btnEntrar = new JButton();
        iconHelp = new ImageIcon("images\\iconoHelp2.png");
        btnHelp = new JButton(iconHelp);
        labelIdentificacion = new JLabel();
        iconClinica = new ImageIcon("images\\iconoCV.png");
    }
    
    /**
     * Este m�todo es llamado en el constructor y configura los componentes
     * inicializados anteriormente. Configura las etiquetas, el t�tulo de la ventana y 
     * a�ade icono.
     * Los botones inicializan un evento que llama al m�todo actionPerformed.
     */
    private void configuracionComponetes() {
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        setTitle("Cl�nica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());

        labelUsuario.setText("USUARIO");

        labelPassword.setText("CONTRASE�A");

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnHelp.setText("HELP");
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        labelIdentificacion.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        labelIdentificacion.setText("IDENTIFICACI�N");
        
        labelRegistro = new JLabel("Clicar aqu\u00ED para comenzar registro");
        labelRegistro.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		new VentanaRegistro();
        		setVisible(false);
        	}
        });    
    }
    
    private void configuracionVentana() {
        labelRegistro.setFont(new Font("Tahoma", Font.BOLD, 10));
        labelRegistro.setForeground(new Color(32, 178, 170));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(35, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        							.addGap(14)
        							.addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
        						.addComponent(labelIdentificacion)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(labelUsuario, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        							.addGap(51)
        							.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(labelPassword, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        							.addGap(34)
        							.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
        					.addGap(85))
        				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        					.addComponent(labelRegistro, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        					.addGap(53))))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(labelIdentificacion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(26)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(labelUsuario)))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(labelPassword)))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnEntrar)
        				.addComponent(btnHelp))
        			.addGap(18)
        			.addComponent(labelRegistro)
        			.addGap(16))
        );
        getContentPane().setLayout(groupLayout);
        pack();
    }// </editor-fold>                        

    /**
     * En este m�todo se compara el usuario y contrase�a introducidos por el trabajador con 
     * aquellos que se encuentran registrados. Primero analiza el usuario y luego la contrase�a. 
     * Lanza mensajes seg�n la situaci�n.
     * Por �ltimo, crea un objeto InterfazPrincipal que se configura visible cuando el usuario 
     * son correctos y la contrase�a.
     * @param evt : evento de acci�n
     */
    private void btnEntrarActionPerformed(ActionEvent evt) {   
    	
    	String usuarioCorrecto = "usuario";
    	String usuario = txtUsuario.getText();
    	
    	char[] passwordCorrecta = new char[] {'u','s','u','a','r','i','o'};
    	char[] password = txtPassword.getPassword();
    	
    	if(usuario.isBlank() && password.length == 0) {
    		javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� el usuario ni la contrase�a","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
        	return;
    	}else if(usuario.isBlank()) {
    		javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� el usuario","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
        	return;
    	}else if(password.length == 0){
    		javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� la contrase�a","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
        	return;
    	}else {
    		if(usuario.equals(usuarioCorrecto) && Arrays.equals(password, passwordCorrecta)) {
        		javax.swing.JOptionPane.showMessageDialog(this,"Usuario y contrase�a correctos","Confirmaci�n", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        		InterfazPrincipal ip = new InterfazPrincipal();
            	ip.setVisible(true);
            	this.setVisible(false);
        	}else{
        		if(!usuario.equals(usuarioCorrecto) && !Arrays.equals(password, passwordCorrecta)) {
            		javax.swing.JOptionPane.showMessageDialog(this,"Usuario y contrase�a incorrectos","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
        		}else if(!usuario.equals(usuarioCorrecto)) {
        			javax.swing.JOptionPane.showMessageDialog(this,"Usuario incorrecto","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
        		}else if(!Arrays.equals(password, passwordCorrecta)) {
        			javax.swing.JOptionPane.showMessageDialog(this,"Contrase�a incorrecta","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
        		}
        	}
    	}
    }                                        
    
    /**
     * Este m�todo hace visible un mensaje al usuario cuando se pulsa el bot�n btnHelp, da una
     * pista de la contrase�a y usuario.
     * @param evt : evento de acci�n
     */
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	javax.swing.JOptionPane.showMessageDialog(this,"Hola Usuario, \nUsuario: usuario\nContrase�a: usuario","Informaci�n", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * M�todo principal de la VentanaIdentificaci�n.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIdentificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton btnEntrar;
    private JButton btnHelp;
    private JLabel labelUsuario;
    private JLabel labelPassword;
    private JLabel labelIdentificacion;
    private JPasswordField txtPassword;
    private JTextField txtUsuario;
    private ImageIcon iconHelp;
    private ImageIcon iconClinica;
    private JLabel labelRegistro;
}

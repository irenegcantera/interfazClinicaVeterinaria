
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
        btnRegistrar = new JButton();
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
        
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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
        
        
    }
    
    private void configuracionVentana() {
    	org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(65, 65, 65)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(labelIdentificacion)
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(labelUsuario)
                                .add(labelPassword))
                            .add(43, 43, 43)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnHelp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    	.add(btnEntrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(29, 29, 29)))
		                .add(btnRegistrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
		                .add(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(labelIdentificacion)
                .add(18, 18, 18)
                .add(btnHelp)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelUsuario))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelPassword))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 34, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                		.add(btnEntrar)
                        .add(btnRegistrar))
                .add(45, 45, 45))
        );
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
     * Este m�todo hace visible una ventana para registrar a un nuevo empleado cuando se pulsa 
     * el bot�n btnRegistrar, la VentanaIdentificaci�n se oculta.
     * @param evt : evento de acci�n
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new VentanaRegistro();
    	this.setVisible(false);
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
    private JButton btnRegistrar;
    private JButton btnHelp;
    private JLabel labelUsuario;
    private JLabel labelPassword;
    private JLabel labelIdentificacion;
    private JPasswordField txtPassword;
    private JTextField txtUsuario;
    private ImageIcon iconHelp;
    private ImageIcon iconClinica;
    // End of variables declaration                   

}

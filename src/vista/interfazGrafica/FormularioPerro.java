/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.interfazGrafica;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import controlador.interfazGrafica.ClinicaVeterinaria;
import modelo.interfazGrafica.*;

/**
 * Clase que hereda de un JDialog. Esta clase representa una ventana que 
 * solicita los datos de un animal tipo Perro para insertarlos en el 
 * archivo de datos.
 * @author Irene Gonz�lez Cantera 
 * @version 1.5
 */
@SuppressWarnings("serial")
public class FormularioPerro extends javax.swing.JDialog {
    
	/** Creates new form FormularioPerro */
    public FormularioPerro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configuracionComponetes();
        configuracionVentana();
        setLocationRelativeTo(parent);
    }

    /**
     * Este m�todo es llamado en el constructor e incializar� todos los 
     * componentes de la ventana (etiquetas, campo de texto, botones, paneles,
     * spinner).                          
     */     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        btnGroupRazas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelRaza = new javax.swing.JLabel();
        rbtnRazaPastorAleman = new javax.swing.JRadioButton();
        rbtnRazaHusky = new javax.swing.JRadioButton();
        rbtnRazaFoxTerrier = new javax.swing.JRadioButton();
        rbtnRazaDalmata = new javax.swing.JRadioButton();
        rbtnRazaSanBernardo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        labelMicrochip = new javax.swing.JLabel();
        txtMicrochip = new javax.swing.JTextField();
        ejemploFecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelPeso = new javax.swing.JLabel();
        javax.swing.SpinnerNumberModel model = new javax.swing.SpinnerNumberModel(0.0,0.0,120.0,0.1); //rango de valor: valor inicial, min, max, paso
        txtPeso = new javax.swing.JSpinner(model);
        ejemploPeso = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelComentarios = new javax.swing.JLabel();
        txtComentarios = new javax.swing.JTextField();
        tituloInsertarPerro = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        iconClinica = new ImageIcon("images\\iconoCV.png");
    }

    /**
     * Este m�todo es llamado en el constructor y configura los componentes
     * inicializados anteriormente. Configura las etiquetas, el t�tulo de la ventana y 
     * a�ade icono, los botones y el spinner.
     * El bot�n btnInsertar inicializa un evento que llama al m�todo botonInsertarActionPerformed.
     */
    private void configuracionComponetes() {
        
    	setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cl�nica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());
        
        labelRaza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRaza.setText("Raza");

        rbtnRazaPastorAleman.setText("Pastor Alem�n");
        rbtnRazaHusky.setText("Husky");
        rbtnRazaSanBernardo.setText("San Bernardo");
        rbtnRazaFoxTerrier.setText("Fox Terrier");
        rbtnRazaDalmata.setText("Dalmata");
        
        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNombre.setText("Nombre");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setText("Fecha de nacimiento");

        labelMicrochip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMicrochip.setText("Microchip");
        
        ejemploFecha.setForeground(new java.awt.Color(0, 153, 51));
        ejemploFecha.setText("Ej.: 2018-06-23 (a�o-mes-d�a)");
        
        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPeso.setText("Peso");
        
        ejemploPeso.setForeground(new java.awt.Color(0, 153, 51));
        ejemploPeso.setText("Ej.: 3,6");
        
        labelComentarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelComentarios.setText("Comentarios");
        
        tituloInsertarPerro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloInsertarPerro.setText("INSERTAR PERRO");

        botonInsertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonInsertar.setText("INSERTAR");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
    }
    
    /**
     * M�todo que configura la posici�n, el tama�o y el grupo de los componentes.
     */
    private void configuracionVentana() {
    	// configuraci�n de los botones radiobutton
        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(rbtnRazaHusky, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnRazaPastorAleman, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnRazaSanBernardo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnRazaFoxTerrier, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnRazaDalmata, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(labelRaza, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelRaza)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnRazaPastorAleman)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnRazaHusky)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnRazaSanBernardo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnRazaFoxTerrier)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnRazaDalmata)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        // configuraci�n de las etiquetas y su respectivos campos de texto
        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(labelNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(30, 30, 30)
                            .add(txtNombre))
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(labelFecha)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(txtFechaNacimiento))
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(labelMicrochip)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(txtMicrochip, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(ejemploFecha))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelNombre)
                    .add(txtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelFecha)
                    .add(txtFechaNacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(ejemploFecha)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelMicrochip, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtMicrochip, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        // configuraci�n de las etiquetas peso y ejemplo peso
        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(ejemploPeso)
                            .add(0, 0, Short.MAX_VALUE))
                        .add(labelPeso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                    .add(18, 18, 18)
                    .add(txtPeso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(txtPeso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(labelPeso)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(ejemploPeso)))
                    .addContainerGap(25, Short.MAX_VALUE))
        );

        // configuraci�n etiqueta y campo de texto comentarios
        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelComentarios)
                .add(18, 18, 18)
                .add(txtComentarios, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 223, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(labelComentarios)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(txtComentarios, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
    
        // configuraci�n titulo insertar perfil y bot�n insertar
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tituloInsertarPerro)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(28, 28, 28))
                                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(139, 139, 139)
                        .add(botonInsertar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(tituloInsertarPerro)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 23, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(74, 74, 74)))
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(botonInsertar)
                .add(21, 21, 21))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * En este m�todo se comprueba los textos introducidos por el usuario. En el caso de que
     * no cumpla los requisitos mostrar� ventanas de mensajes con el problema. Los textos que
     * se comprueban son el nombre, la fecha de nacimmiento, el microchip, el peso y 
     * los comentarios. Se comprueba tambi�n que especie ha sido seleccionado en el grupo de 
     * botones radiales.
     * Por �ltimo, abre el archivo e introduce los datos si son correctos. Trata las excepciones
     * que se lancen y muestra por una ventana el problema que ha habido.
     * @param evt : evento de acci�n
     */
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
    	// nombre
    	String nombre = txtNombre.getText();
        if(nombre.isEmpty()){
        	javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� el nombre","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // fecha de nacimiento
        String fechaNac = txtFechaNacimiento.getText();
        if(fechaNac.isEmpty()){
        	javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� la fecha de nacimiento","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // microchip
        String microchip = txtMicrochip.getText();
        if(microchip.isEmpty()){
        	javax.swing.JOptionPane.showMessageDialog(this,"No se ingres� el microchip","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }else if((microchip.length() != 7)){
        	javax.swing.JOptionPane.showMessageDialog(this,"El microchip solo puede tener 7 d�gitos","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // peso
        Double peso = (Double)txtPeso.getValue();
        if(peso == 0){
        	javax.swing.JOptionPane.showMessageDialog(this,"No se indic� el peso","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // botones razas
        rbtnRazaPastorAleman.setActionCommand("Pastor Alem�n");
        rbtnRazaHusky.setActionCommand("Husky");
        rbtnRazaFoxTerrier.setActionCommand("Fox Terrier");
        rbtnRazaDalmata.setActionCommand("Dalmata");
        rbtnRazaSanBernardo.setActionCommand("San Bernardo");
        
        btnGroupRazas.add(rbtnRazaPastorAleman);
        btnGroupRazas.add(rbtnRazaHusky);
        btnGroupRazas.add(rbtnRazaFoxTerrier);
        btnGroupRazas.add(rbtnRazaDalmata);
        btnGroupRazas.add(rbtnRazaSanBernardo);
        
        java.util.Enumeration<javax.swing.AbstractButton> enumBotones = btnGroupRazas.getElements();
        boolean seleccionado = false;
        String raza = null;
        while(enumBotones.hasMoreElements() && seleccionado == false) {
        	javax.swing.AbstractButton boton = (javax.swing.AbstractButton)enumBotones.nextElement();   
            if (boton.isSelected()) {
            	raza = boton.getText();
            	seleccionado = true;
            }
        }
        if(raza == null) {
        	javax.swing.JOptionPane.showMessageDialog(this,"No se ha seleccionado la raza","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        // comentarios
        String comentario = txtComentarios.getText();
        if(comentario.isEmpty()) {
        	comentario = "Sin comentarios.";
        }else if (comentario.length() > 250){
        	javax.swing.JOptionPane.showMessageDialog(this,"Has sobrepasado el l�mite de caracteres","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        	return;
        }
        
        // inserci�n de los datos
        try {
        	ClinicaVeterinaria.abrirArchivoClinica(new File("animales.dat"));
        	Perro perro = new Perro(nombre,LocalDate.parse(fechaNac),peso,raza,microchip);
        	perro.setComentarios(comentario);
        	ClinicaVeterinaria.insertarPerro(perro);
        	JOptionPane.showMessageDialog(this, "Se ha registrado correctamente.", "Confirmaci�n", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException ioex) {
        	JOptionPane.showMessageDialog(this, "Error al escribir los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }finally {
        	try {
        		ClinicaVeterinaria.cerrarArchivoClinica();
        	}catch(IOException ioex) {
        		JOptionPane.showMessageDialog(this, "Error al cerrar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        	}
        } 
    }//GEN-LAST:event_botonInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioPerro dialog = new FormularioPerro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.ButtonGroup btnGroupRazas;
    private javax.swing.JLabel ejemploFecha;
    private javax.swing.JLabel ejemploPeso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelComentarios;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMicrochip;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JRadioButton rbtnRazaPastorAleman;
    private javax.swing.JRadioButton rbtnRazaHusky;
    private javax.swing.JRadioButton rbtnRazaFoxTerrier;
    private javax.swing.JRadioButton rbtnRazaDalmata;
    private javax.swing.JRadioButton rbtnRazaSanBernardo;
    private javax.swing.JLabel tituloInsertarPerro;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtMicrochip;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPeso;
    private ImageIcon iconClinica;
    // End of variables declaration//GEN-END:variables

}

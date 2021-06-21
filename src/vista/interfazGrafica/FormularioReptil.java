
package vista.interfazGrafica;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.*;
import controlador.interfazGrafica.ClinicaVeterinaria;
import modelo.interfazGrafica.*;

/**
 * Clase que hereda de un JDialog. Esta clase representa una ventana que 
 * solicita los datos de un animal tipo Reptil para insertarlos en el 
 * archivo de datos.
 * @author Irene González Cantera 
 * @version 1.5
 */
@SuppressWarnings("serial")
public class FormularioReptil extends javax.swing.JDialog {
	
    /** Creates new form FormularioReptil */
    public FormularioReptil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configuracionComponetes();
        configuracionVentana();
        setLocationRelativeTo(parent);
    }

    /**
     * Este método es llamado en el constructor e incializará todos los 
     * componentes de la ventana (etiquetas, campo de texto, botones, paneles
     * combobox).                          
     */                       
    private void initComponents() {
        btnGroupEspecies = new ButtonGroup();
        jPanel1 = new JPanel();
        labelEspecie = new JLabel();
        rbtnEspecieTortuga = new JRadioButton();
        rbtnEspecieIguana = new JRadioButton();
        rbtnEspecieDragon = new JRadioButton();
        jPanel2 = new JPanel();
        labelNombre = new JLabel();
        txtNombre = new JTextField();
        labelFecha = new JLabel();
        txtFechaNacimiento = new JTextField();
        labelVenenoso = new JLabel();
        ejemploFecha = new JLabel();
        comboBoxVenenoso = new JComboBox<>();
        jPanel4 = new JPanel();
        labelPeso = new JLabel();
        SpinnerNumberModel model = new SpinnerNumberModel(0.0,0.0,130.0,0.1); //rango de valor: valor inicial, min, max, paso
        txtPeso = new JSpinner(model);
        ejemploPeso = new JLabel();
        jPanel3 = new JPanel();
        labelComentarios = new JLabel();
        txtComentarios = new JTextField();
        tituloInsertarReptil = new JLabel();
        botonInsertar = new JButton();
        iconClinica = new ImageIcon("images\\iconoCV.png");
    }
    
    /**
     * Este método es llamado en el constructor y configura los componentes
     * inicializados anteriormente. Configura las etiquetas, el título de la ventana y 
     * añade icono, los botones.
     * El botón btnInsertar inicializa un evento que llama al método botonInsertarActionPerformed.
     */
    private void configuracionComponetes() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clínica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());

        labelEspecie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEspecie.setText("Especie");

        rbtnEspecieTortuga.setText("Tortuga");
        rbtnEspecieIguana.setText("Iguana");
        rbtnEspecieIguana.setAlignmentX(1.8F);
        rbtnEspecieDragon.setText("Dragón Comodoro");
        
        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNombre.setText("Nombre");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setText("Fecha de nacimiento");

        labelVenenoso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVenenoso.setText("Venenoso");

        ejemploFecha.setForeground(new java.awt.Color(0, 153, 51));
        ejemploFecha.setText("Ej.: 2018-06-23 (año-mes-día)");

        comboBoxVenenoso.setModel(new DefaultComboBoxModel<>(new String[] { "NS/NC","Sí", "No" }));
        
        labelComentarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelComentarios.setText("Comentarios");
        
        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPeso.setText("Peso (kg)");

        ejemploPeso.setForeground(new java.awt.Color(0, 153, 51));
        ejemploPeso.setText("Ej.: 3,6");
        
        tituloInsertarReptil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloInsertarReptil.setText("INSERTAR REPTIL");

        botonInsertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonInsertar.setText("INSERTAR");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
    }
    
    /**
     * Método que configura la posición, el tamaño y el grupo de los componentes.
     */
    private void configuracionVentana() {
    	// configuración de los botones radiobutton
    	org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(rbtnEspecieTortuga, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnEspecieIguana, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rbtnEspecieDragon)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelEspecie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelEspecie)
                .add(7, 7, 7)
                .add(rbtnEspecieTortuga)
                .add(6, 6, 6)
                .add(rbtnEspecieIguana)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbtnEspecieDragon)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        // configuración de las etiquetas y su respectivos campos de texto
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
                            .add(labelVenenoso)
                            .add(37, 37, 37)
                            .add(comboBoxVenenoso, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(159, 159, 159)))
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
                    .add(labelVenenoso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(comboBoxVenenoso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
 
        // configuración de las etiquetas peso y ejemplo peso
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
        
        // configuración etiqueta y campo de texto comentarios
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

        //configuración titulo insertar perfil y botón insertar
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(tituloInsertarReptil)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(35, 35, 35))
                                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(139, 139, 139)
                        .add(botonInsertar)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(tituloInsertarReptil)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(botonInsertar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>                        

    /**
     * En este método se comprueba los textos introducidos por el usuario. En el caso de que
     * no cumpla los requisitos mostrará ventanas de mensajes con el problema. Los textos que
     * se comprueban son el nombre, la fecha de nacimmiento, si es venenoso o no, el peso y 
     * los comentarios. Se comprueba también que especie ha sido seleccionado en el grupo de 
     * botones radiales.
     * Por último, abre el archivo e introduce los datos si son correctos. Trata las excepciones
     * que se lancen y muestra por una ventana el problema que ha habido.
     * @param evt : evento de acción
     */
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //nombre
    	String nombre = txtNombre.getText();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(this,"No se ingresó el nombre","Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //fecha de nacimiento
        String fechaNac = txtFechaNacimiento.getText();
        if(fechaNac.isEmpty()){
            JOptionPane.showMessageDialog(this,"No se ingresó la fecha de nacimiento","Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //venenoso o no
        String venenoso = (String)comboBoxVenenoso.getSelectedItem();
        boolean bVenenoso = false;
        switch(venenoso) {
	        case "Sí" : bVenenoso = true;
	        case "No" : bVenenoso = false;
	        case "NS/NC" : bVenenoso = false; //como no sabemos lo ponemos false
        }
        
        //peso
        Double peso = (Double)txtPeso.getValue();
        if(peso == 0){
        	JOptionPane.showMessageDialog(this,"No se indicó el peso","Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //botones especies
        rbtnEspecieTortuga.setActionCommand("Común");
        rbtnEspecieIguana.setActionCommand("Persa");
        rbtnEspecieDragon.setActionCommand("Angora");
        
        btnGroupEspecies.add(rbtnEspecieTortuga);
        btnGroupEspecies.add(rbtnEspecieIguana);
        btnGroupEspecies.add(rbtnEspecieDragon);
        
        java.util.Enumeration<AbstractButton> enumBotones = btnGroupEspecies.getElements();
        boolean seleccionado = false;
        String especie = null;
        while(enumBotones.hasMoreElements() && seleccionado == false) {
        	AbstractButton boton = (AbstractButton)enumBotones.nextElement();   
            if (boton.isSelected()) {
            	especie = boton.getText();
            	seleccionado = true;
            }
        }
        if(especie == null) {
        	JOptionPane.showMessageDialog(this,"No se ha seleccionado la raza","Advertencia", JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        //comentarios
        String comentario = txtComentarios.getText();
        if(comentario.isEmpty()) {
        	comentario = "Sin comentarios.";
        }else if (comentario.length() > 250){
        	JOptionPane.showMessageDialog(this,"Has sobrepasado el límite de caracteres","Error", JOptionPane.ERROR_MESSAGE);
        	return;
        }
        
        //inserción de los datos
        try {
        	ClinicaVeterinaria.abrirArchivoClinica(new File("animales.dat"));
        	Reptil reptil = new Reptil(nombre,LocalDate.parse(fechaNac),peso,especie,bVenenoso);
        	reptil.setComentarios(comentario);
        	ClinicaVeterinaria.insertarReptil(reptil);
        	JOptionPane.showMessageDialog(this, "Se ha registrado correctamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException ioex) {
        	JOptionPane.showMessageDialog(this, "Error al escribir los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }finally {
        	try {
        		ClinicaVeterinaria.cerrarArchivoClinica();
        	}catch(IOException ioex) {
        		JOptionPane.showMessageDialog(this, "Error al cerrar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        	}
        }
    }

    /**
     * Método principal de la VentanaIdentificación.
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
            java.util.logging.Logger.getLogger(FormularioReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioReptil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioReptil dialog = new FormularioReptil(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup btnGroupEspecies;
    private javax.swing.JComboBox<String> comboBoxVenenoso;
    private javax.swing.JLabel ejemploFecha;
    private javax.swing.JLabel ejemploPeso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelComentarios;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelVenenoso;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelEspecie;
    private javax.swing.JRadioButton rbtnEspecieTortuga;
    private javax.swing.JRadioButton rbtnEspecieIguana;
    private javax.swing.JRadioButton rbtnEspecieDragon;
    private javax.swing.JLabel tituloInsertarReptil;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPeso;
    private ImageIcon iconClinica;
    // End of variables declaration//GEN-END:variables

}

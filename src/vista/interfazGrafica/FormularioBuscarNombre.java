/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.interfazGrafica;

import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controlador.interfazGrafica.ClinicaVeterinaria;

/**
 * Clase que hereda de un JDialog. Esta clase representa una ventana que 
 * solicita el nombre de un animal para mostrar la información.
 * @author Irene González Cantera 
 * @version 1.5
 */
@SuppressWarnings("serial")
public class FormularioBuscarNombre extends javax.swing.JDialog {

    /** Creates new form FormularioBuscarNombre */
    public FormularioBuscarNombre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configuracionComponetes();
        configuracionVentana();
        setLocationRelativeTo(parent);
    }

    /**
     * Este método es llamado en el constructor e incializará todos los 
     * componentes de la ventana (etiquetas, campo de texto, botones, tabla).                          
     */     
    private void initComponents() {
        btnAceptar = new javax.swing.JButton();
        btnBorrarBusqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        iconClinica = new ImageIcon("images\\iconoCV.png");
        /* Inicializa el modelo de la tabla con unas columnas predeterminadas y cero filas, y 
         * declara que las celdas no son editables. */
        modelo = new DefaultTableModel(new Object [] { "Tipo", "Nombre", "Fecha nacimiento", "Microchip", "Peso", "Raza/Especie", "Venenoso/Cantor", "Comentarios" }, 0) {
        	@Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
    }
    
    /**
     * Este método es llamado en el constructor y configura los componentes
     * inicializados anteriormente. Configura las etiquetas, el título de la ventana y 
     * añade icono, los botones y la tabla.
     * El botón btnInsertar inicializa un evento que llama al método botonInsertarActionPerformed.
     */
    private void configuracionComponetes() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clínica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());
        tablaDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaDatos.getTableHeader().setReorderingAllowed(false);

        btnAceptar.setText("BUSCAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablaDatos);

        labelNombre.setText("Nombre");

        btnBorrarBusqueda.setText("BORRAR");
        btnBorrarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarBusquedaActionPerformed(evt);
            }
        });
    }
    
    /**
     * Método que configura la posición, el tamaño y el grupo de los componentes.
     */
    private void configuracionVentana() {
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(129, 129, 129)
                .add(labelNombre)
                .add(18, 18, 18)
                .add(txtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnAceptar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnBorrarBusqueda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(labelNombre)
                            .add(txtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btnAceptar)
                            .add(btnBorrarBusqueda))
                        .add(29, 29, 29)))
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 325, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7))
        );
        pack();
    }// </editor-fold> // </editor-fold>//GEN-END:initComponents

    /**
     * En este método se comprueba el nombre introducido por el usuario. En el caso de que
     * no cumpla los requisitos mostrará ventanas de mensajes con el problema. El fichero sufre 
     * varios procesamientos de carcateres para reparar cada dato del fichero e introducirlos 
     * en un array de String. Este array formará parte del modelo de la tabla.
     * 
     * Una vez encontrado el nombre se introducirá el modelo en la tabla, y en esta se mostrará 
     * los datos del animal buscado.
     * 
     * Trata las excepciones que se lancen y muestra por una ventana el problema que ha habido.
     * 
     * ESTE MÉTODO NO FUNCIONA CORRECTAMENTE, NO INTRODUCE LOS DATOS DE ALGUNOS ANIMALES EN LAS
     * CELDAS CORRESPONDIENTES. SALTA UNA EXCEPCIÓN DE FUERA DEL INDICE DEL ARRAY.
     * @param evt : evento de acción
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // nombre
    	String nombre = txtNombre.getText();
        if(nombre.isEmpty()){
        	javax.swing.JOptionPane.showMessageDialog(this,"No se ingresó el nombre","Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //busqueda de los datos
        try {
        	String[] datos;
        	ClinicaVeterinaria.abrirArchivoClinica(new File("animales.dat"));
        	String cadena = "";
        	while((cadena = ClinicaVeterinaria.getFlujoClinica().readLine()) != null) {
        		cadena = cadena.replaceAll("[^A-Za-z0-9()\\[\\]]", "").trim();
        		System.out.println(cadena);
                if(nombre.equalsIgnoreCase(cadena)){
                	String nombreDato = cadena;
            		cadena = ClinicaVeterinaria.getFlujoClinica().readLine();
            		cadena = cadena.replaceAll("[^A-Za-z0-9()\\[\\@.-]]", " ").trim();
            		String[] splitDatos = cadena.split("@");
            		String fechaDato, pesoDato, comentDato, tAnimalDato, razaDato;
                	try{
                		fechaDato = splitDatos[0].replaceAll("[^A-Za-z0-9()\\[\\@.-]]", "").trim();
                		pesoDato = cadena.split("@")[1].replaceAll("[^A-Za-z0-9()\\[\\@.-0123456789]]", "").trim();
                        comentDato = cadena.split("@")[2].replaceAll("[^A-Za-z0-9()\\[\\@.-0123456789]]", "").trim();
                        tAnimalDato = cadena.split("@")[3].replaceAll("[^A-Za-z0-9()\\[\\@.-0123456789]]", "").trim();
                        razaDato = cadena.split("@")[4].replaceAll("[^A-Za-z0-9()\\[\\@.-]]", "").trim();
                	}catch(java.lang.ArrayIndexOutOfBoundsException aioex) {
                		JOptionPane.showMessageDialog(this, "Error! Fuera del límite del Array", "Error", JOptionPane.ERROR_MESSAGE);
                		return;
                	}
                    
                    if((tAnimalDato.equalsIgnoreCase("gato")) || (tAnimalDato.equalsIgnoreCase("perro"))) {
                    	String microchipDato = cadena.split("@")[5].replaceAll("[^A-Za-z0-9()\\[\\@.-]]", "").trim();
                    	datos = new String[] { tAnimalDato, nombreDato, fechaDato, microchipDato, pesoDato, razaDato, null , comentDato };
                    }else{
                    	String esVenCanDato = cadena.split("@")[4].replaceAll("[^A-Za-z0-9()\\[\\@.-]]", " ").trim();
                    	datos = new String[] { tAnimalDato, nombreDato, fechaDato, null, pesoDato, razaDato, esVenCanDato, comentDato };
                    }
                    modelo.addRow(datos);
            		tablaDatos.setModel(modelo);
                 }
        	}
        }catch(IOException ioex) {
        	JOptionPane.showMessageDialog(this, "Error al leer los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
        	try {
        		ClinicaVeterinaria.cerrarArchivoClinica();
        	}catch(IOException ioex) {
        		JOptionPane.showMessageDialog(this, "Error al cerrar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        	}
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * En este método se recorre la tabla de datos y borra las líneas una a una de búsqueda 
     * cada vez que se pulsa el botón btnBorrar. Borra de abajo a arriba.
     * @param evt : evento de acción
     */
    private void btnBorrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) { 
    	for (int i = 0; i < tablaDatos.getRowCount(); i++) {
    		modelo.removeRow(i);
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
            java.util.logging.Logger.getLogger(FormularioBuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioBuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioBuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioBuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioBuscarNombre dialog = new FormularioBuscarNombre(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrarBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField txtNombre;
    private DefaultTableModel modelo;
    private ImageIcon iconClinica;
    // End of variables declaration//GEN-END:variables

}

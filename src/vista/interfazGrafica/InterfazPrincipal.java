/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.interfazGrafica;

import javax.swing.ImageIcon;

/**
 * Esta clase es la ventana principal de la interfaz gráfica. En ella se accede al resto
 * de las funcionalidades.
 * LOS MENUS BUSCAR POR RAZA O ESPECIE, MODIFICAR EL PESO Y LOS COMENTARIOS NO SE HAN DESARROLLADO.
 * @author Irene González Cantera 
 * @version 1.5
 */
@SuppressWarnings("serial")
public class InterfazPrincipal extends javax.swing.JFrame {

    /** Creates new form InterfazPrincipal */
    public InterfazPrincipal() {
        initComponents();
        configuracionComponetes();
        configuracionVentana();
        setLocationRelativeTo(null);
    }

    /**
     * Este método es llamado en el constructor e incializará todos los 
     * componentes de la ventana (etiquetas, barra de menu, menus e iconos).                          
     */  
    private void initComponents() {
        barraMenu = new javax.swing.JMenuBar();
        labelBienvenido = new javax.swing.JLabel();
        menuInsertar = new javax.swing.JMenu();
        menuInsertarGato = new javax.swing.JMenuItem();
        menuInsertarPerro = new javax.swing.JMenuItem();
        menuInsertarReptil = new javax.swing.JMenuItem();
        menuInsertarPajaro = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        menuBuscarNombre = new javax.swing.JMenuItem();
        menuBuscaEspRaza = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenu();
        menuModificarPeso = new javax.swing.JMenuItem();
        menuModificarComentario = new javax.swing.JMenuItem();
        
        iconClinica = new ImageIcon("images\\iconoCV.png");
        iconGato = new ImageIcon("images\\iconoGato.png");
        iconPerro = new ImageIcon("images\\iconoPerro.png");
        iconReptil = new ImageIcon("images\\iconoReptil.png");
        iconPajaro = new ImageIcon("images\\iconoPajaro.png");
    }     
    
    /**
     * Este método es llamado en el constructor y configura los componentes
     * inicializados anteriormente. Configura el título de la ventana y añade icono, 
     * los botones, etiquetas, barra de menu, menus e iconos
     * 
     * El botón menuInsertar... inicializa un evento que llama al método menuInsertar...ActionPerformed.
     */
    private void configuracionComponetes() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Veterinaria MegaMascotas");
        setIconImage(iconClinica.getImage());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelBienvenido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelBienvenido.setText("¡Bienvenido, Usuario!");

        menuInsertar.setText("Insertar");

        menuInsertarGato.setText("Gato");
        menuInsertarGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarGatoActionPerformed(evt);
            }
        });
        menuInsertar.add(menuInsertarGato);
        menuInsertarGato.setIcon(iconGato);

        menuInsertarPerro.setText("Perro");
        menuInsertarPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarPerroActionPerformed(evt);
            }
        });
        menuInsertar.add(menuInsertarPerro);
        menuInsertarPerro.setIcon(iconPerro);

        menuInsertarReptil.setText("Reptil");
        menuInsertarReptil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarReptilActionPerformed(evt);
            }
        });
        menuInsertar.add(menuInsertarReptil);
        menuInsertarReptil.setIcon(iconReptil);

        menuInsertarPajaro.setText("Pájaro");
        menuInsertarPajaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarPajaroActionPerformed(evt);
            }
        });
        menuInsertar.add(menuInsertarPajaro);
        menuInsertarPajaro.setIcon(iconPajaro);

        barraMenu.add(menuInsertar);

        menuBuscar.setText("Buscar");
        
        menuBuscarNombre.setText("Por nombre...");
        menuBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuBuscarNombreActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarNombre);

        menuBuscaEspRaza.setText("Por raza o especie...");
        menuBuscar.add(menuBuscaEspRaza);

        barraMenu.add(menuBuscar);

        menuModificar.setText("Modificar");

        menuModificarPeso.setText("Peso");
        menuModificar.add(menuModificarPeso);

        menuModificarComentario.setText("Comentarios");
        menuModificar.add(menuModificarComentario);

        barraMenu.add(menuModificar);

        setJMenuBar(barraMenu);
    }

    /**
     * Método que configura la posición, el tamaño y el grupo de los componentes.
     */
    private void configuracionVentana() {
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(28, 28, 28)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
                .add(labelBienvenido)
                .add(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(173, 173, 173)
                        .add(labelBienvenido))
                    .add(layout.createSequentialGroup()
                        .add(87, 87, 87)
                .addContainerGap(93, Short.MAX_VALUE))
        )));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInsertarGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarGatoActionPerformed
        new FormularioGato(this, true).setVisible(true);
    }//GEN-LAST:event_menuInsertarGatoActionPerformed
    
    private void menuInsertarPerroActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	new FormularioPerro(this, true).setVisible(true);
    } //GEN-LAST:event_menuInsertarPerroActionPerformed
    
    private void menuInsertarReptilActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	new FormularioReptil(this, true).setVisible(true);
    } //GEN-LAST:event_menuInsertarReptilActionPerformed
    
    private void menuInsertarPajaroActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	new FormularioPajaro(this, true).setVisible(true);
    } //GEN-LAST:event_menuInsertarPajaroActionPerformed
    
    private void menuBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        new FormularioBuscarNombre(this,true).setVisible(true);
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuModificar;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem menuInsertarGato;
    private javax.swing.JMenuItem menuInsertarPerro;
    private javax.swing.JMenuItem menuInsertarReptil;
    private javax.swing.JMenuItem menuInsertarPajaro;
    private javax.swing.JMenuItem menuBuscarNombre;
    private javax.swing.JMenuItem menuBuscaEspRaza;
    private javax.swing.JMenuItem menuModificarPeso;
    private javax.swing.JMenuItem menuModificarComentario;
    private javax.swing.JLabel labelBienvenido;
    private ImageIcon iconClinica;
    private ImageIcon iconGato;
    private ImageIcon iconPerro;
    private ImageIcon iconReptil;
    private ImageIcon iconPajaro;
    // End of variables declaration//GEN-END:variables

}

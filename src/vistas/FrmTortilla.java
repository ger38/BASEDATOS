
package vistas;

import Controlador.ControladorTortilla;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Tortilla;

/**
 *
 * @author gerardo
 */
public class FrmTortilla extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel(); //tabla
    
    int id; //variable de tipo global id

    public FrmTortilla() {
        this.id = 0; //inicializo id en 0
        initComponents();
        estiloFrmTortilla();
        this.controlador = new ControladorTortilla(); //CONTROLADOR
        controlador.llenarTablaConListaTortillas(dtm, tblTabla); // CARGO LA TABLA
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        IbTitulo = new javax.swing.JLabel();
        IbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        IbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbSeleccionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IbTitulo.setBackground(new java.awt.Color(255, 153, 153));
        IbTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        IbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbTitulo.setText("TORTILLAS");

        IbNombre.setBackground(new java.awt.Color(255, 255, 51));
        IbNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IbNombre.setText("NOMBRE");

        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        IbPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IbPrecio.setText("PRECIO");

        txtPrecio.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        btnVolver.setBackground(new java.awt.Color(255, 204, 51));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(153, 255, 153));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 255, 102));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 204, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        lbSeleccionar.setBackground(new java.awt.Color(255, 153, 0));
        lbSeleccionar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbSeleccionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSeleccionar.setText("SELECCIONAR OPCCION");

        tblTabla.setAutoCreateRowSorter(true);
        tblTabla.setBackground(new java.awt.Color(255, 51, 0));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(IbTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(lbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IbPrecio)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(lbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre;
        String precio;
  
        nombre = txtNombre.getText();
        precio = txtPrecio.getText();
        
        if (controlador.agregarTortilla(nombre, precio) == true) {
            dtm.setRowCount(0);//para evitar que se repitan en la tabla al mostrarse
            controlador.llenarTablaConListaTortillas(dtm, tblTabla);
        }

        btnLimpiarActionPerformed(evt);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         String nombre;
        String precio;
        
        nombre = txtNombre.getText();
        precio = txtPrecio.getText();
        
        if (controlador.actualizarTortilla(id, nombre, precio) == true) {

            dtm.setRowCount(0);

            controlador.llenarTablaConListaTortillas(dtm, tblTabla);

        }
        btnLimpiarActionPerformed(evt);
                                           
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int i = 1; 

        List<Tortilla> listaTortillas = controlador.listarTortillas();
        for (Tortilla tipotortilla : listaTortillas) { // Forich
            //System.out.println("valor de id q ya hay: " + tipotortilla.getId());
            if ((id) == tipotortilla.getId()) { //si el id coincide con uno de los de la lista, lo borra, tiene que pasar el true
                if (controlador.borrarTortilla(id) == true) {
                    dtm.removeRow(i - 1); // aca lo borra
                    //System.out.println("entro al remove");
                }
            }
            i++;
        }

        btnLimpiarActionPerformed(evt);                                           
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
         MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose(); //para que se cierre la actual y vuelva al menu
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtNombre.setText("");
        this.txtPrecio.setText("");
        id = 0;
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
         JTable target = (JTable) evt.getSource();
        id = (int) this.tblTabla.getModel().getValueAt(target.getSelectedRow(), 0); //pongo el numero del id en la variable global id
        this.txtNombre.setText(this.tblTabla.getModel().getValueAt(target.getSelectedRow(), 1).toString());
        this.txtPrecio.setText(this.tblTabla.getModel().getValueAt(target.getSelectedRow(), 2).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTablaMouseClicked
    
    private void estiloFrmTortilla(){
        Color naranju=new Color(255,201,100); 
        this.getContentPane().setBackground(naranju);
        this.setResizable(false);
        tblTabla.setFont(new java.awt.Font("Segoe UI Semibold",0, 13)); 
        JTableHeader thTortilla;
        thTortilla = tblTabla.getTableHeader();
        thTortilla.setFont(new java.awt.Font("Segoe UI Semibold",0, 14));
    }
    
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTortilla().setVisible(true);
            }
        });
        
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbNombre;
    private javax.swing.JLabel IbPrecio;
    private javax.swing.JLabel IbTitulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSeleccionar;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

 // Variables declaration - do not modify                     
   
    private ControladorTortilla controlador;

}
  
  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectotienda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soviedog
 */
public class Tienda extends javax.swing.JFrame {

    int filas;

    /**
     * Creates new form NewJFrame
     */
    public Tienda() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Descuento");
        modelo.addColumn("Tipo");
        modelo.addColumn("SubTotal");
        modelo.addColumn("IVA");
        modelo.addColumn("Total");
        Factura recibir = new Factura();
        recibir.setVisible(true);
        this.Tabla.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        ELIMINAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        TOTAL = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelTransparente2 = new LIB.JPanelTransparente();
        Facturar = new javax.swing.JButton();
        NOMBRECLIENTE = new javax.swing.JTextField();
        CEDULACLIENTE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CORREOCLIENTE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        IVA = new javax.swing.JTextField();
        TOTALF = new javax.swing.JTextField();
        jPanelTransparente3 = new LIB.JPanelTransparente();
        jPanel3 = new javax.swing.JPanel();
        libros = new javax.swing.JRadioButton();
        electrodomesticos = new javax.swing.JRadioButton();
        accesorios = new javax.swing.JRadioButton();
        instrumentos = new javax.swing.JRadioButton();
        otro = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdescuento = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        AGREGAR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 0, 0);

        jPanelTransparente1.setLayout(null);

        ELIMINAR.setText("Eliminar");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(ELIMINAR);
        ELIMINAR.setBounds(70, 140, 100, 40);

        SALIR.setText("Salir ");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(SALIR);
        SALIR.setBounds(520, 150, 100, 23);
        jPanelTransparente1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 383, 410, 340);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jPanelTransparente1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 10, 570, 110);
        jPanelTransparente1.add(total);
        total.setBounds(330, 140, 100, 30);

        TOTAL.setText("Pago Total");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(TOTAL);
        TOTAL.setBounds(210, 140, 110, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectotienda/Imagenes/cash_30px.png"))); // NOI18N
        jPanelTransparente1.add(jLabel15);
        jLabel15.setBounds(440, 130, 100, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectotienda/Imagenes/icons8_delete_database_32px.png"))); // NOI18N
        jPanelTransparente1.add(jLabel16);
        jLabel16.setBounds(30, 130, 79, 50);

        getContentPane().add(jPanelTransparente1);
        jPanelTransparente1.setBounds(20, 310, 650, 210);

        jPanelTransparente2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 102, 0))); // NOI18N
        jPanelTransparente2.setLayout(null);

        Facturar.setText("Generar Factura Electronica");
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });
        jPanelTransparente2.add(Facturar);
        Facturar.setBounds(30, 360, 230, 23);
        jPanelTransparente2.add(NOMBRECLIENTE);
        NOMBRECLIENTE.setBounds(150, 60, 120, 22);
        jPanelTransparente2.add(CEDULACLIENTE);
        CEDULACLIENTE.setBounds(150, 100, 120, 22);

        jLabel2.setText("Nombre Del Cliente");
        jPanelTransparente2.add(jLabel2);
        jLabel2.setBounds(10, 60, 110, 16);

        jLabel8.setText("Cedula Cliente");
        jPanelTransparente2.add(jLabel8);
        jLabel8.setBounds(20, 100, 77, 16);

        jLabel9.setText("Correo Cliente");
        jPanelTransparente2.add(jLabel9);
        jLabel9.setBounds(20, 140, 90, 20);
        jPanelTransparente2.add(CORREOCLIENTE);
        CORREOCLIENTE.setBounds(150, 140, 120, 22);

        jLabel10.setText("Cantidad De Articulos");
        jPanelTransparente2.add(jLabel10);
        jLabel10.setBounds(10, 190, 120, 16);

        jLabel12.setText("Ingrese Fecha actual");
        jPanelTransparente2.add(jLabel12);
        jLabel12.setBounds(10, 20, 120, 16);
        jPanelTransparente2.add(CANTIDAD);
        CANTIDAD.setBounds(150, 190, 120, 22);
        jPanelTransparente2.add(FECHA);
        FECHA.setBounds(150, 20, 120, 22);

        jLabel13.setText("IVA");
        jPanelTransparente2.add(jLabel13);
        jLabel13.setBounds(50, 250, 50, 16);

        jLabel14.setText("Total");
        jPanelTransparente2.add(jLabel14);
        jLabel14.setBounds(50, 300, 50, 16);
        jPanelTransparente2.add(IVA);
        IVA.setBounds(150, 240, 120, 22);
        jPanelTransparente2.add(TOTALF);
        TOTALF.setBounds(150, 290, 120, 22);

        getContentPane().add(jPanelTransparente2);
        jPanelTransparente2.setBounds(690, 20, 280, 450);

        jPanelTransparente3.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), "Tipo de Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 102, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        botones.add(libros);
        libros.setForeground(new java.awt.Color(153, 102, 0));
        libros.setText("Libros");
        jPanel3.add(libros);
        libros.setBounds(10, 120, 55, 21);

        botones.add(electrodomesticos);
        electrodomesticos.setForeground(new java.awt.Color(153, 102, 0));
        electrodomesticos.setText("Electrodomesticos");
        jPanel3.add(electrodomesticos);
        electrodomesticos.setBounds(10, 60, 140, 21);

        botones.add(accesorios);
        accesorios.setForeground(new java.awt.Color(153, 102, 0));
        accesorios.setText("Accesorios");
        jPanel3.add(accesorios);
        accesorios.setBounds(10, 90, 120, 21);

        botones.add(instrumentos);
        instrumentos.setForeground(new java.awt.Color(153, 102, 0));
        instrumentos.setText("Instrumentos Musicales");
        jPanel3.add(instrumentos);
        instrumentos.setBounds(10, 30, 170, 30);

        botones.add(otro);
        otro.setForeground(new java.awt.Color(153, 102, 0));
        otro.setText("Otro");
        jPanel3.add(otro);
        otro.setBounds(10, 150, 110, 21);

        jPanelTransparente3.add(jPanel3);
        jPanel3.setBounds(260, 10, 190, 200);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 102, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(153, 102, 0));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 0));
        jLabel7.setText("Codigo");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 30, 60, 24);

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel4.add(txtcodigo);
        txtcodigo.setBounds(120, 30, 100, 22);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("Fecha");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 70, 60, 19);

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("Nombre del Articulo");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 100, 130, 40);
        jPanel4.add(txtnombre);
        txtnombre.setBounds(120, 110, 100, 22);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 0));
        jLabel4.setText("Cantidad");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 150, 70, 20);

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        jPanel4.add(txtcantidad);
        txtcantidad.setBounds(120, 150, 100, 22);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("Precio");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 190, 70, 19);
        jPanel4.add(txtprecio);
        txtprecio.setBounds(120, 190, 100, 22);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 0));
        jLabel6.setText("Descuento");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 230, 68, 19);
        jPanel4.add(txtdescuento);
        txtdescuento.setBounds(120, 230, 100, 22);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(jDateChooser1);
        jDateChooser1.setBounds(120, 70, 100, 22);

        jPanelTransparente3.add(jPanel4);
        jPanel4.setBounds(10, 10, 240, 260);

        AGREGAR.setBackground(new java.awt.Color(102, 102, 102));
        AGREGAR.setForeground(new java.awt.Color(204, 204, 204));
        AGREGAR.setText("Agregar");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });
        jPanelTransparente3.add(AGREGAR);
        AGREGAR.setBounds(310, 220, 130, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectotienda/Imagenes/icons8_save_30px.png"))); // NOI18N
        jPanelTransparente3.add(jLabel11);
        jLabel11.setBounds(270, 220, 77, 40);

        getContentPane().add(jPanelTransparente3);
        jPanelTransparente3.setBounds(100, 20, 470, 280);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyectotienda/Imagenes/2717.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(-240, 0, 1290, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel modelo = new DefaultTableModel();
    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();

        //Sección 2
        int a = Tabla.getSelectedRow();

        //Sección 3
        if (a < 0) {

            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");

        } else {

            //Sección 4
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");

            //Sección 5 
            if (JOptionPane.OK_OPTION == confirmar) {

                //Sección 6
                model.removeRow(a);

                //Sección 7
                JOptionPane.showMessageDialog(null, "Registro Eliminado");

            }

        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed

        double cant;
        double precio;
        double descuento;
        double subtotal;
        double totalneto;
        double iva, iva2 = 1.13;

        cant = Double.parseDouble(this.txtcantidad.getText());
        precio = Double.parseDouble(this.txtprecio.getText());
        descuento = Double.parseDouble(this.txtdescuento.getText());
        subtotal = precio * cant;
        iva2 = iva2 * subtotal;
        totalneto = iva2 - descuento;
        iva = totalneto - subtotal;

        if (instrumentos.isSelected()) {
            this.modelo.addRow(new Object[]{this.txtcodigo.getText(), this.jDateChooser1.getDate(), this.txtnombre.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtdescuento.getText(), "Instrumentos", subtotal, iva, totalneto});
        }
        if (electrodomesticos.isSelected()) {
            this.modelo.addRow(new Object[]{this.txtcodigo.getText(), this.jDateChooser1.getDate().toString(), this.txtnombre.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtdescuento.getText(), "Electrodomesticos", subtotal, iva, totalneto});
        }
        if (accesorios.isSelected()) {
            this.modelo.addRow(new Object[]{this.txtcodigo.getText(), this.jDateChooser1.getDate().toString(), this.txtnombre.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtdescuento.getText(), "Accesorios", subtotal, iva, totalneto});
        }
        if (libros.isSelected()) {
            this.modelo.addRow(new Object[]{this.txtcodigo.getText(), this.jDateChooser1.getDate().toString(), this.txtnombre.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtdescuento.getText(), "Libros", subtotal, iva, totalneto});
        }
        if (otro.isSelected()) {
            this.modelo.addRow(new Object[]{this.txtcodigo.getText(), this.jDateChooser1.getDate().toString(), this.txtnombre.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtdescuento.getText(), "Otro", subtotal, iva, totalneto});
        }

        this.txtcodigo.setText("");
        this.botones.clearSelection();
        this.txtcantidad.setText("");
        this.txtnombre.setText("");
        this.txtprecio.setText("");
        this.txtdescuento.setText("");
        this.jDateChooser1.setDate(null);


    }//GEN-LAST:event_AGREGARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcantidadActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        // TODO add your handling code here:
        double suma;
        double suma1 = 0;
        int totalrow = Tabla.getRowCount();
        // totalrow = 1; 
        for (int i = 0; i <= (totalrow) - 1; i++) {
            suma = Double.parseDouble(String.valueOf(Tabla.getModel().getValueAt(i, 9)));
            suma1 += suma;
        }
        total.setText("₡" + String.valueOf(suma1));
    }//GEN-LAST:event_TOTALActionPerformed

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed
        // TODO add your handling code here:

        Factura.Nombre.setText(NOMBRECLIENTE.getText());
        Factura.Cedula.setText(CEDULACLIENTE.getText());
        Factura.Correo.setText(CORREOCLIENTE.getText());
        Factura.Cantidadarticulos.setText(CANTIDAD.getText());
        Factura.Iva.setText(IVA.getText());
        Factura.Total.setText(TOTALF.getText());
        Factura.Fecha.setText(FECHA.getText());

    }//GEN-LAST:event_FacturarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:

        int seleccion = Tabla.getSelectedRow();

        txtcodigo.setText(Tabla.getValueAt(seleccion, 0).toString());
        jDateChooser1.setDateFormatString(Tabla.getValueAt(seleccion, 1).toString());
        txtnombre.setText(Tabla.getValueAt(seleccion, 2).toString());
        txtcantidad.setText(Tabla.getValueAt(seleccion, 3).toString());
        txtprecio.setText(Tabla.getValueAt(seleccion, 4).toString());
        txtdescuento.setText(Tabla.getValueAt(seleccion, 5).toString());

        if (instrumentos.isSelected()) {
            Tabla.getValueAt(seleccion, 6).toString();
        }


    }//GEN-LAST:event_TablaMouseClicked

    /**
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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JTextField CANTIDAD;
    private javax.swing.JTextField CEDULACLIENTE;
    private javax.swing.JTextField CORREOCLIENTE;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField FECHA;
    private javax.swing.JButton Facturar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField IVA;
    private javax.swing.JTextField NOMBRECLIENTE;
    private javax.swing.JButton SALIR;
    private javax.swing.JButton TOTAL;
    private javax.swing.JTextField TOTALF;
    private javax.swing.JTable Tabla;
    private javax.swing.JRadioButton accesorios;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JRadioButton electrodomesticos;
    private javax.swing.JRadioButton instrumentos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private LIB.JPanelTransparente jPanelTransparente1;
    private LIB.JPanelTransparente jPanelTransparente2;
    private LIB.JPanelTransparente jPanelTransparente3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton libros;
    private javax.swing.JRadioButton otro;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}

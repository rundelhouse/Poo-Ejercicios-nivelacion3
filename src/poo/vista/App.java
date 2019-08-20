package poo.vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.modelo.Artefacto;

public class App extends javax.swing.JFrame {
    
    Artefacto productoTemp = new Artefacto();
    DefaultTableModel miModelo;
    Object data [][] = {};
    String encabezado [] = {"Nombre","Descuento","Incremento","Iva","Total"};
    boolean calcular = false;

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ejercicio 3 - Nivelación");
        miModelo = new DefaultTableModel(data, encabezado);
        miTabla.setModel(miModelo);
        System.out.printf("          .                                                      .\n" +
"        .n                   .                 .                  n.\n" +
"  .   .dP                  dP                   9b                 9b.    .\n" +
" 4    qXb         .       dX                     Xb       .        dXp     t\n" +
"dX.    9Xb      .dXb    __                         __    dXb.     dXP     .Xb\n" +
"9XXb._       _.dXXXXb dXXXXbo.                 .odXXXXb dXXXXb._       _.dXXP\n" +
" 9XXXXXXXXXXXXXXXXXXXVXXXXXXXXOo.           .oOXXXXXXXXVXXXXXXXXXXXXXXXXXXXP\n" +
"  `9XXXXXXXXXXXXXXXXXXXXX'~   ~`OOO8b   d8OOO'~   ~`XXXXXXXXXXXXXXXXXXXXXP'\n" +
"    `9XXXXXXXXXXXP' `9XX'   BY    `98v8P'  ARNOLD   `XXP' `9XXXXXXXXXXXP'\n" +
"        ~~~~~~~       9X.          .db|db.          .XP       ~~~~~~~\n" +
"                        )b.  .dbo.dP'`v'`9b.odb.  .dX(\n" +
"                      ,dXXXXXXXXXXXb     dXXXXXXXXXXXb.\n" +
"                     dXXXXXXXXXXXP'   .   `9XXXXXXXXXXXb\n" +
"                    dXXXXXXXXXXXXb   d|b   dXXXXXXXXXXXXb\n" +
"                    9XXb'   `XXXXXb.dX|Xb.dXXXXX'   `dXXP\n" +
"                     `'      9XXXXXX(   )XXXXXXP      `'\n" +
"                              XXXX X.`v'.X XXXX\n" +
"                              XP^X'`b   d'`X^XX\n" +
"                              X. 9  `   '  P )X\n" +
"                              `b  `       '  d'\n" +
"                               `             '" ); 
        
        
        JOptionPane.showMessageDialog(null, "Autor: Arnold Salazar \n Código fuente en:  https://github.com/rundelhouse/Poo-Ejercicios-nivelacion3.git");
    }  
        
    private void capturarInfo(){
        try {
            productoTemp.setNombre(txbNombre.getText());
            productoTemp.setCosto(Double.parseDouble(txbCosto.getText())); 
            productoTemp.setContado(chkContado.isSelected());
            capturarTipo();
            calcular = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Presenta un error: \n" + e);
            calcular = false;
        }         
    }
    
    private void capturarTipo(){
        if(rbtnAudio.isSelected()){
            productoTemp.setTipo("audio");
        }else if (rbtnVideo.isSelected()){
            productoTemp.setTipo("video");
        }else if (rbtnLinea_blanca.isSelected()){
            productoTemp.setTipo("linea_blanca");
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo");
            rbtnAudio.requestFocus();
        }
    }
    
    private void setLabels () {
        lbDescuento.setText(String.valueOf(productoTemp.getDescuento()));
        lbIncremento.setText(String.valueOf(productoTemp.getIncremento()));
        lbIva.setText(String.valueOf(productoTemp.getIva()));
        lbTotal.setText(String.valueOf(productoTemp.getTotal()));
    }
    
    private void limpiarProducto(){
        txbNombre.setText(null);
        txbCosto.setText(null);  
        txbNombre.requestFocus();
    }
    
    private void limpiarInfo(){
        limpiarProducto();
        lbDescuento.setText("0");
        lbIncremento.setText("0");
        lbIva.setText("0");
        lbTotal.setText("0");       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txbNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txbCosto = new javax.swing.JTextField();
        rbtnAudio = new javax.swing.JRadioButton();
        rbtnVideo = new javax.swing.JRadioButton();
        rbtnLinea_blanca = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        chkContado = new javax.swing.JCheckBox();
        btnOk = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbDescuento = new javax.swing.JLabel();
        lbIncremento = new javax.swing.JLabel();
        lbIva = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(105, 100, 100));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(105, 100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(105, 100, 100));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(233, 229, 221))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(233, 229, 221));
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 30, -1, -1));

        txbNombre.setNextFocusableComponent(txbCosto);
        jPanel2.add(txbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 26, 204, -1));

        jLabel2.setForeground(new java.awt.Color(233, 229, 221));
        jLabel2.setText("Costo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 64, -1, -1));

        txbCosto.setNextFocusableComponent(rbtnAudio);
        jPanel2.add(txbCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 60, 204, -1));

        buttonGroup1.add(rbtnAudio);
        rbtnAudio.setForeground(new java.awt.Color(233, 229, 221));
        rbtnAudio.setText("Audio");
        rbtnAudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnAudio.setNextFocusableComponent(rbtnVideo);
        jPanel2.add(rbtnAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 24, 104, -1));

        buttonGroup1.add(rbtnVideo);
        rbtnVideo.setForeground(new java.awt.Color(233, 229, 221));
        rbtnVideo.setText("Video");
        rbtnVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnVideo.setNextFocusableComponent(rbtnLinea_blanca);
        jPanel2.add(rbtnVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 58, 102, -1));

        buttonGroup1.add(rbtnLinea_blanca);
        rbtnLinea_blanca.setForeground(new java.awt.Color(233, 229, 221));
        rbtnLinea_blanca.setText("Línea Blanca");
        rbtnLinea_blanca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnLinea_blanca.setNextFocusableComponent(chkContado);
        jPanel2.add(rbtnLinea_blanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 94, 96, -1));

        jLabel3.setForeground(new java.awt.Color(233, 229, 221));
        jLabel3.setText("Pago:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 100, -1, -1));

        chkContado.setForeground(new java.awt.Color(233, 229, 221));
        chkContado.setText("Contado");
        chkContado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkContado.setNextFocusableComponent(btnOk);
        jPanel2.add(chkContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 96, -1, -1));

        btnOk.setBackground(new java.awt.Color(208, 73, 37));
        btnOk.setForeground(new java.awt.Color(233, 229, 221));
        btnOk.setText("Ok");
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setNextFocusableComponent(txbNombre);
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOkKeyPressed(evt);
            }
        });
        jPanel2.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 92, -1, -1));

        btnBorrar.setBackground(new java.awt.Color(208, 73, 37));
        btnBorrar.setForeground(new java.awt.Color(233, 229, 221));
        btnBorrar.setText("Borrar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setNextFocusableComponent(txbNombre);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 92, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 408, 133));

        jPanel3.setBackground(new java.awt.Color(105, 100, 100));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(233, 229, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 150));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 247, 408, 170));

        jPanel4.setBackground(new java.awt.Color(105, 100, 100));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(233, 229, 221))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(233, 229, 221));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(233, 229, 221));
        jLabel4.setText("Descuento:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        jLabel5.setForeground(new java.awt.Color(233, 229, 221));
        jLabel5.setText("Incremento:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 66, -1, -1));

        jLabel6.setForeground(new java.awt.Color(233, 229, 221));
        jLabel6.setText("IVA:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 24, -1, -1));

        jLabel7.setForeground(new java.awt.Color(233, 229, 221));
        jLabel7.setText("Total:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 66, -1, -1));

        lbDescuento.setBackground(new java.awt.Color(105, 100, 100));
        lbDescuento.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbDescuento.setForeground(new java.awt.Color(255, 153, 153));
        lbDescuento.setText("0");
        jPanel4.add(lbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 25, -1, -1));

        lbIncremento.setBackground(new java.awt.Color(105, 100, 100));
        lbIncremento.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbIncremento.setForeground(new java.awt.Color(255, 153, 153));
        lbIncremento.setText("0");
        jPanel4.add(lbIncremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 67, -1, -1));

        lbIva.setBackground(new java.awt.Color(105, 100, 100));
        lbIva.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbIva.setForeground(new java.awt.Color(255, 153, 153));
        lbIva.setText("0");
        jPanel4.add(lbIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 25, -1, -1));

        lbTotal.setBackground(new java.awt.Color(105, 100, 100));
        lbTotal.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 153, 153));
        lbTotal.setText("0");
        jPanel4.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 67, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 410, 100));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        capturarInfo();
       if (calcular == true){
            productoTemp.getTotal();
            setLabels();
            limpiarProducto();
            Object datos [] = {productoTemp.getNombre(),productoTemp.getDescuento(), productoTemp.getIncremento(),productoTemp.getIva(), productoTemp.getTotal()};
            miModelo.addRow(datos);  
       }
    }//GEN-LAST:event_btnOkMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       limpiarInfo();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOkKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            capturarInfo();
            productoTemp.getTotal();
            setLabels();
            limpiarProducto();
        }
    }//GEN-LAST:event_btnOkKeyPressed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkContado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescuento;
    private javax.swing.JLabel lbIncremento;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable miTabla;
    private javax.swing.JRadioButton rbtnAudio;
    private javax.swing.JRadioButton rbtnLinea_blanca;
    private javax.swing.JRadioButton rbtnVideo;
    private javax.swing.JTextField txbCosto;
    private javax.swing.JTextField txbNombre;
    // End of variables declaration//GEN-END:variables
}

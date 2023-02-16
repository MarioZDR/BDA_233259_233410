/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import implementaciones.ClientesDAO;
import interfaces.IClientesDAO;
import interfaces.IDireccionesDAO;
import java.util.logging.Logger;

/**
 *
 * @author lv1013
 */
public class FrmTransferencia extends javax.swing.JFrame {
private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    public final IClientesDAO clientesDAO;
    public final IDireccionesDAO direccionesDAO;
    /**
    * Método constructor que inicializa los atributos al valor de sus parámetros.
    * @param clientesDAO clientesDAO.
    * @param direccionesDAO direccionesDAO.
    */
    public FrmTransferencia(IClientesDAO clientesDAO,IDireccionesDAO direccionesDAO) {
        this.clientesDAO=clientesDAO;
        this.direccionesDAO=direccionesDAO;
        initComponents();
        this.setSize(450, 350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTransferencias = new javax.swing.JLabel();
        lblNumeroCuenta = new javax.swing.JLabel();
        lblNombreDestinatario = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        txtNombreDestinatario = new javax.swing.JTextField();
        txtNumeroCuenta = new javax.swing.JTextField();
        jpnFondo = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 28, 68));
        jPanel1.setForeground(new java.awt.Color(12, 28, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTransferencias.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 50)); // NOI18N
        lblTransferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblTransferencias.setText("Transferencias");
        jPanel1.add(lblTransferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblNumeroCuenta.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblNumeroCuenta.setText("Número de cuenta");
        jPanel1.add(lblNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblNombreDestinatario.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblNombreDestinatario.setText("Nombre destinatario");
        jPanel1.add(lblNombreDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btnConfirmar.setBackground(new java.awt.Color(65, 103, 158));
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));
        jPanel1.add(txtNombreDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 30));

        txtNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));

        jpnFondo.setBackground(new java.awt.Color(183, 210, 242));

        javax.swing.GroupLayout jpnFondoLayout = new javax.swing.GroupLayout(jpnFondo);
        jpnFondo.setLayout(jpnFondoLayout);
        jpnFondoLayout.setHorizontalGroup(
            jpnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jpnFondoLayout.setVerticalGroup(
            jpnFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jpnFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 390, -1));

        btnRegresar.setBackground(new java.awt.Color(183, 210, 242));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuentaKeyTyped

    }//GEN-LAST:event_txtNumeroCuentaKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       FrmMenu frmMenu = new FrmMenu(clientesDAO,direccionesDAO);
       this.setVisible(false);
       frmMenu.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnFondo;
    private javax.swing.JLabel lblNombreDestinatario;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblTransferencias;
    private javax.swing.JTextField txtNombreDestinatario;
    private javax.swing.JTextField txtNumeroCuenta;
    // End of variables declaration//GEN-END:variables
}

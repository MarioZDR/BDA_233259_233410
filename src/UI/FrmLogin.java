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
public class FrmLogin extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    public final IClientesDAO clientesDAO;
    public final IDireccionesDAO direccionesDAO;
    public FrmLogin(IClientesDAO clientesDAO,IDireccionesDAO direccionesDAO) {
        this.clientesDAO=clientesDAO;
        this.direccionesDAO=direccionesDAO;
        initComponents();
        this.setSize(450, 370);
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
        lblBienvenido = new javax.swing.JLabel();
        lblRegistrarse = new javax.swing.JLabel();
        lblNombreCuenta1 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        txtNombreCuenta = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        lblContrasenia1 = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        lblNombreCuenta2 = new javax.swing.JLabel();
        lblRetiroSinCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 28, 68));
        jPanel1.setForeground(new java.awt.Color(12, 28, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 50)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenido");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblNombreCuenta1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblNombreCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCuenta1.setText("Banco");
        jPanel1.add(lblNombreCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 350, 50));

        txtNombreCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 350, 50));

        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBackground(new java.awt.Color(65, 103, 158));
        btnIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        lblContrasenia1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblContrasenia1.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia1.setText("Contraseña");
        jPanel1.add(lblContrasenia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Ayuda.setText("Ayuda");
        Ayuda.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(255, 255, 255));
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });
        jPanel1.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        lblNombreCuenta2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblNombreCuenta2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCuenta2.setText("Nombre de cuenta");
        jPanel1.add(lblNombreCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblRetiroSinCuenta.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblRetiroSinCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblRetiroSinCuenta.setText("Retiro Sin Cuenta");
        lblRetiroSinCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRetiroSinCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(lblRetiroSinCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
       frmRegistro frm = new frmRegistro(clientesDAO,direccionesDAO);
       this.setVisible(false);
       frm.setVisible(true);
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
          FrmAyuda frmAyuda = new FrmAyuda(clientesDAO,direccionesDAO);
       this.setVisible(false);
       frmAyuda.setVisible(true);
    }//GEN-LAST:event_AyudaMouseClicked

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
      FrmMenu frmMenu = new FrmMenu(clientesDAO,direccionesDAO);
      this.setVisible(false);
      frmMenu.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtNombreCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCuentaKeyTyped
        if (evt.getKeyChar() >= 32 && evt.getKeyChar() <= 64 || evt.getKeyChar() >= 91 && evt.getKeyChar() <= 96 || evt.getKeyChar() >= 123 && evt.getKeyChar() <= 208 || evt.getKeyChar() >= 210 && evt.getKeyChar() <= 240 || evt.getKeyChar() >= 242 && evt.getKeyChar() <= 255) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCuentaKeyTyped

    private void lblRetiroSinCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRetiroSinCuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRetiroSinCuentaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ayuda;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContrasenia1;
    private javax.swing.JLabel lblNombreCuenta1;
    private javax.swing.JLabel lblNombreCuenta2;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblRetiroSinCuenta;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtNombreCuenta;
    // End of variables declaration//GEN-END:variables
}

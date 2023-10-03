/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author wilia
 */
public class Login extends javax.swing.JFrame {
    
    Icono icono= new Icono();
    IconoMenu iconoMenu = new IconoMenu();
    
    
    public Login() {
        initComponents();
        icono.setImageToLabel(logo, "src/main/java/imagenes/logo.png");
        icono.setImageToLabel(login, "src/main/java/imagenes/login.png");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        usuarioLogin = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1947483647, 1947483647));
        getContentPane().setLayout(new java.awt.GridLayout(0, 2));

        jPanel1.setBackground(new java.awt.Color(35, 39, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, 140));

        jLabel3.setBackground(new java.awt.Color(190, 208, 235));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 208, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 210, 50));

        jLabel4.setBackground(new java.awt.Color(190, 208, 235));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 208, 235));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INICIAR SESION");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 240, 60));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(241, 241, 242));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setDoubleBuffered(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 310, 10));

        jLabel5.setBackground(new java.awt.Color(190, 208, 235));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 208, 235));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USUARIO");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 130, 50));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(241, 241, 242));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setDoubleBuffered(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 310, 10));

        password.setBackground(new java.awt.Color(35, 39, 43));
        password.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("********");
        password.setToolTipText("");
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 310, 40));

        usuarioLogin.setEditable(false);
        usuarioLogin.setBackground(new java.awt.Color(35, 39, 43));
        usuarioLogin.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        usuarioLogin.setForeground(new java.awt.Color(204, 204, 204));
        usuarioLogin.setText("Ingrese su usuario");
        usuarioLogin.setBorder(null);
        usuarioLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioLoginMouseClicked(evt);
            }
        });
        jPanel1.add(usuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 310, -1));

        entrar.setBackground(new java.awt.Color(0, 112, 161));
        entrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("Entrar");
        entrar.setBorder(null);
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 150, 40));

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(17, 38, 53));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(190, 208, 235));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 208, 235));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COMUNICACIONES "); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 310, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 208, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUATEMALTECAS S.A");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 320, 29));
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 310));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
        if(usuarioLogin.getText().isBlank()){
            usuarioLogin.setText("Ingrese su usuario");
        }
        
       
    }//GEN-LAST:event_passwordMouseClicked

    private void usuarioLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioLoginMouseClicked
        usuarioLogin.setText("");
        usuarioLogin.setEditable(true);
        if(password.getText().isBlank()){
            password.setText("********");
        }
        
    }//GEN-LAST:event_usuarioLoginMouseClicked

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        Color customColor = new Color(143,209,255); // RGBA: Rojo, Verde, Azul, Alfa
        entrar.setBackground(customColor);
        
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
        Color customColor = new Color(0,112,161); // RGBA: Rojo, Verde, Azul, Alfa
        entrar.setBackground(customColor);
    }//GEN-LAST:event_entrarMouseExited

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        MenuPrincipal menu = new MenuPrincipal();
        menu.setSize(1100, 700);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_entrarMouseClicked
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuarioLogin;
    // End of variables declaration//GEN-END:variables
}

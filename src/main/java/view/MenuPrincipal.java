/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author wilia
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Icono icono = new Icono();
    
    public MenuPrincipal() {
        initComponents();
        icono.setImageToLabel(logo, "src/main/java/imagenes/logo.png");
        IconoMenu.setImageToLabel(iconoVenta, "src/main/java/imagenes/iconoVenta.png");
        IconoMenu.setImageToLabel(iconoBuscar, "src/main/java/imagenes/iconoBuscar.png");
        IconoMenu.setImageToLabel(iconoIngresar, "src/main/java/imagenes/iconoIngresar.png");
        
        
        String texto = "<html><body>Es una influyente empresa de telecomunicaciones en Guatemala que se especializa en la oferta de planes prepagos y postpagos para satisfacer las necesidades de comunicación de sus clientes. Como líder en el mercado de telecomunicaciones, CGSA se ha convertido en un nombre de confianza en todo el país gracias a su sólida infraestructura y una amplia gama de servicios de alta calidad.</body></html>";
        descripcion.setText(texto);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opciones = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        opcionVenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconoVenta = new javax.swing.JLabel();
        opcionReportes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iconoBuscar = new javax.swing.JLabel();
        opcionIngresar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        iconoIngresar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 38, 53));

        opciones.setBackground(new java.awt.Color(17, 38, 53));
        opciones.setLayout(new java.awt.GridLayout(5, 0));

        Menu.setBackground(new java.awt.Color(17, 38, 53));
        Menu.setLayout(new java.awt.GridLayout(1, 2));
        opciones.add(Menu);

        opcionVenta.setBackground(new java.awt.Color(17, 38, 53));
        opcionVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcionVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcionVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcionVentaMouseExited(evt);
            }
        });
        opcionVenta.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setBackground(new java.awt.Color(17, 38, 53));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 208, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA");
        opcionVenta.add(jLabel1);

        iconoVenta.setBackground(new java.awt.Color(17, 38, 53));
        opcionVenta.add(iconoVenta);

        opciones.add(opcionVenta);

        opcionReportes.setBackground(new java.awt.Color(17, 38, 53));
        opcionReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcionReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcionReportesMouseExited(evt);
            }
        });
        opcionReportes.setLayout(new java.awt.GridLayout(1, 2));

        jLabel3.setBackground(new java.awt.Color(17, 38, 53));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 208, 235));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REPORTES");
        opcionReportes.add(jLabel3);

        iconoBuscar.setBackground(new java.awt.Color(17, 38, 53));
        opcionReportes.add(iconoBuscar);

        opciones.add(opcionReportes);

        opcionIngresar.setBackground(new java.awt.Color(17, 38, 53));
        opcionIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcionIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcionIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcionIngresarMouseExited(evt);
            }
        });
        opcionIngresar.setLayout(new java.awt.GridLayout(1, 2));

        jLabel7.setBackground(new java.awt.Color(17, 38, 53));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 208, 235));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INGRESO");
        opcionIngresar.add(jLabel7);

        iconoIngresar.setBackground(new java.awt.Color(17, 38, 53));
        opcionIngresar.add(iconoIngresar);

        opciones.add(opcionIngresar);

        jPanel7.setBackground(new java.awt.Color(17, 38, 53));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));
        opciones.add(jPanel7);

        jLabel10.setBackground(new java.awt.Color(190, 208, 235));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 208, 235));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BIENVENIDO ");
        jLabel10.setToolTipText("");

        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        descripcion.setForeground(new java.awt.Color(190, 208, 235));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionReportesMouseEntered
        Color customColor = new Color(252,255,247); 
        opcionReportes.setBackground(customColor);
    }//GEN-LAST:event_opcionReportesMouseEntered

    private void opcionReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionReportesMouseExited
        Color customColor = new Color(17,38,53); 
        opcionReportes.setBackground(customColor);
    }//GEN-LAST:event_opcionReportesMouseExited

    private void opcionIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionIngresarMouseEntered
        Color customColor = new Color(252,255,247); 
        opcionIngresar.setBackground(customColor);
    }//GEN-LAST:event_opcionIngresarMouseEntered

    private void opcionIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionIngresarMouseExited
        Color customColor = new Color(17,38,53); 
        opcionIngresar.setBackground(customColor);
    }//GEN-LAST:event_opcionIngresarMouseExited

    private void opcionIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionIngresarMouseClicked
        IngresoCelular pantallaIngresar = new IngresoCelular();
        pantallaIngresar.setSize(1100, 700);
        pantallaIngresar.setVisible(true);
        pantallaIngresar.setLocationRelativeTo(null);
        pantallaIngresar.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_opcionIngresarMouseClicked

    private void opcionVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionVentaMouseExited
        Color customColor = new Color(17,38,53);
        opcionVenta.setBackground(customColor);
    }//GEN-LAST:event_opcionVentaMouseExited

    private void opcionVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionVentaMouseEntered
        Color customColor = new Color(252,255,247);
        opcionVenta.setBackground(customColor);
    }//GEN-LAST:event_opcionVentaMouseEntered

    private void opcionVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionVentaMouseClicked
        Venta pantallaVenta = new Venta();
        pantallaVenta.setSize(1100, 700);
        pantallaVenta.setVisible(true);
        pantallaVenta.setLocationRelativeTo(null);
        pantallaVenta.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_opcionVentaMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel iconoBuscar;
    private javax.swing.JLabel iconoIngresar;
    private javax.swing.JLabel iconoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel opcionIngresar;
    private javax.swing.JPanel opcionReportes;
    private javax.swing.JPanel opcionVenta;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}

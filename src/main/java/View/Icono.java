/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Icono {
      public static void setImageToLabel(JLabel label, String imagePath) {
        try {
            // Cargar la imagen desde el archivo
            BufferedImage originalImage = ImageIO.read(new File(imagePath));

            // Obtener el tamaño del JLabel
            int labelWidth = label.getWidth();
            int labelHeight = label.getHeight();

            // Escalar la imagen para que se ajuste al tamaño del JLabel
            Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

            // Crear un ImageIcon a partir de la imagen escalada
            ImageIcon icon = new ImageIcon(scaledImage);

            // Establecer el icono en el JLabel
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

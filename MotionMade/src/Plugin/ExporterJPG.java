/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plugin;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public class ExporterJPG implements Exporter {
    /**
     * Menyimpan screenshot Canvas ke dalam sebuah file image sesuai ekstensi
     * @param filename nama file export
     */
    @Override
    public boolean exportCanvas(Component c, String filename) {
        if (isSupported(filename)) {
            BufferedImage img = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_RGB);
            c.printAll(img.getGraphics()); // or: panel.printAll(...)
            try {
                ImageIO.write(img, "jpg", new File(filename));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            return true;
        }
        return false;
    }
    
    /**
     * Mengecek apakah file yang akan di-export merupakan file yang disupport oleh plugin ini
     * @param filename nama file export
     * @return true apabila file disupport oleh plugin ini, false apabila tidak. 
     */
    @Override
    public boolean isSupported(String filename) {
        String fileExtension = filename.substring(filename.lastIndexOf('.'), filename.length());
        
        return fileExtension.equals(".jpg");
    }
}

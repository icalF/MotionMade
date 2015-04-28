/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plugin;

import java.awt.Component;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public interface Exporter {
    /**
     * Menyimpan screenshot Canvas ke dalam sebuah file image sesuai ekstensi
     * @param c
     * @param filename nama file export
     */
    public boolean exportCanvas(Component c, String filename);
    
    /**
     * Mengecek apakah file yang akan di-export merupakan file yang disupport oleh plugin ini
     * @param filename nama file export
     * @return true apabila file disupport oleh plugin ini, false apabila tidak. 
     */
    public boolean isSupported(String filename);
}

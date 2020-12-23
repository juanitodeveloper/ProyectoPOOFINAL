/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementodecorativo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
 class decorativo {
     class fondopanel extends JPanel{
     
     private Image imagenes;
     
     
     @Override
     public void paint(Graphics g){
         imagenes=new ImageIcon(getClass().getResource("/Imagenes/urna.jpg")).getImage();
         g.drawImage(imagenes, 0, 0, getWidth(), getHeight(), this);
         setOpaque(false);
         super.paint(g);
     }

   
     
 }
    
}

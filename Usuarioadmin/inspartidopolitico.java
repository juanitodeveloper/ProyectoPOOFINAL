/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarioadmin;

import Usuarioadmin.admin;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyectourna.VentanaInicio;


public class inspartidopolitico extends javax.swing.JFrame {

      fondopanel fondo=new fondopanel();
    public inspartidopolitico() {
            this.setContentPane(fondo);
        
        setLocationRelativeTo(null);    //Ubicacion, centro de pantalla
        setTitle("URNA VIRTUAL 2020");  //Agrega titulo de la ventana
        setMinimumSize(new Dimension(300, 300));    //Establecemos el tamaño maximo de la ventana
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre_partido = new javax.swing.JTextField();
        fecha_fundacion = new javax.swing.JTextField();
        siglas = new javax.swing.JTextField();
        ideal = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        guardarregistro = new javax.swing.JButton();
        limpiarregistro = new javax.swing.JButton();
        labelexit = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Acerca_pres = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSCRIPCION DE PARTIDO POLITICO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de fundacion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ideal:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Siglas:");

        fecha_fundacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_fundacionActionPerformed(evt);
            }
        });

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partidopolitico/flecj (2).png"))); // NOI18N
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setDefaultCapable(false);
        atras.setFocusCycleRoot(true);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        guardarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partidopolitico/Guardar.png"))); // NOI18N
        guardarregistro.setBorderPainted(false);
        guardarregistro.setContentAreaFilled(false);
        guardarregistro.setDefaultCapable(false);
        guardarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarregistroActionPerformed(evt);
            }
        });

        limpiarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/partidopolitico/limpiar.png"))); // NOI18N
        limpiarregistro.setBorderPainted(false);
        limpiarregistro.setContentAreaFilled(false);
        limpiarregistro.setDefaultCapable(false);
        limpiarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarregistroActionPerformed(evt);
            }
        });

        labelexit.setForeground(new java.awt.Color(255, 255, 255));

        Acerca_pres.setText("Acerca de");
        jMenuBar1.add(Acerca_pres);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelexit, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarregistro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(99, 99, 99))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha_fundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre_partido, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ideal, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siglas, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guardarregistro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_partido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fecha_fundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ideal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siglas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(guardarregistro)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelexit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpiarregistro)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecha_fundacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_fundacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_fundacionActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
 dispose();        
admin v3 =new admin();
         v3.setVisible(true);
        this.setVisible(false);

 // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void limpiarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarregistroActionPerformed
Nombre_partido.setText(null);
fecha_fundacion.setText(null);
ideal.setText(null);
siglas.setText(null);

    }//GEN-LAST:event_limpiarregistroActionPerformed

    private void guardarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarregistroActionPerformed
        // TODO add your handling code here:
                            try {
               
              Connection  cn=DriverManager.getConnection("jdbc:mysql://localhost/elecciones", "root", "");
              PreparedStatement pst=cn.prepareStatement("insert into partidop values(?,?,?,?,?)");
              pst.setString(1, "0");
              pst.setString(2, Nombre_partido.getText().trim());
              pst.setString(3, fecha_fundacion.getText().trim());
              pst.setString(4, ideal.getText().trim());
              pst.setString(5, siglas.getText().trim());
           
              pst.executeUpdate();
              
              
             Nombre_partido.setText("");
             fecha_fundacion.setText("");
             ideal.setText("");
             siglas.setText("");
   
            
            labelexit.setText("Registro exitoso");
               JOptionPane.showMessageDialog(null, "Conexion establecida");
              
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Sin conexion a la base de datos"+" "+ex.getMessage());
          }
    }//GEN-LAST:event_guardarregistroActionPerformed

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
            java.util.logging.Logger.getLogger(inspartidopolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inspartidopolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inspartidopolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inspartidopolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inspartidopolitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca_pres;
    private javax.swing.JTextField Nombre_partido;
    private javax.swing.JButton atras;
    private javax.swing.JTextField fecha_fundacion;
    private javax.swing.JButton guardarregistro;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelexit;
    private javax.swing.JButton limpiarregistro;
    private javax.swing.JTextField siglas;
    // End of variables declaration//GEN-END:variables
 class fondopanel extends JPanel{
     
     private Image imagenes;
     
     
     @Override
     public void paint(Graphics g){
         imagenes=new ImageIcon(getClass().getResource("/Imagenes/Fondito.png")).getImage();
         g.drawImage(imagenes, 0, 0, getWidth(), getHeight(), this);
         setOpaque(false);
         super.paint(g);
         setLocationRelativeTo(null);
     }
     
 }
@Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/uth.png"));
        return retValue;
    }



}

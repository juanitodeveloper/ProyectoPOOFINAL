
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


public class inscripciondip extends javax.swing.JFrame {

      fondopanel fondo=new fondopanel();
    
      
      
    public inscripciondip() {
            this.setContentPane(fondo);
         
        
        setLocationRelativeTo(null);    //Ubicacion, centro de pantalla
        setTitle("URNA VIRTUAL 2020");  //Agrega titulo de la ventana
        setMinimumSize(new Dimension(250, 250));    //Establecemos el tamaño maximo de la ventana
        initComponents();
        setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre_dip = new javax.swing.JTextField();
        Apellido_dip = new javax.swing.JTextField();
        Sex_dip = new javax.swing.JComboBox<>();
        trabajo_dip = new javax.swing.JComboBox<>();
        Departamento_dip = new javax.swing.JTextField();
        edad_dip = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        guardarregistro = new javax.swing.JButton();
        limpiarregistro = new javax.swing.JButton();
        labelexit = new javax.swing.JLabel();
        Partido_dip = new javax.swing.JTextField();
        Menubarra = new javax.swing.JMenuBar();
        Acerca_pres = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSCRIPCION PARA DIPUTADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departamento: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trabajo que desempeña: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Partido al que pertenecera:  ");

        Nombre_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_dipActionPerformed(evt);
            }
        });

        Apellido_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido_dipActionPerformed(evt);
            }
        });

        Sex_dip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino"}));

        trabajo_dip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abogado", "Ingeniero", "Licenciado ", "Doctor" }));
        trabajo_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajo_dipActionPerformed(evt);
            }
        });

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inscripcionesdip/flecj (2).png"))); // NOI18N
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setDefaultCapable(false);
        atras.setVerifyInputWhenFocusTarget(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        guardarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inscripcionesalcalde/Guardar.png"))); // NOI18N
        guardarregistro.setBorderPainted(false);
        guardarregistro.setContentAreaFilled(false);
        guardarregistro.setDefaultCapable(false);
        guardarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarregistroActionPerformed(evt);
            }
        });

        limpiarregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inscripcionesalcalde/limpiar.png"))); // NOI18N
        limpiarregistro.setBorderPainted(false);
        limpiarregistro.setContentAreaFilled(false);
        limpiarregistro.setDefaultCapable(false);
        limpiarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarregistroActionPerformed(evt);
            }
        });

        Partido_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Partido_dipActionPerformed(evt);
            }
        });

        Acerca_pres.setText("Acerca de");
        Menubarra.add(Acerca_pres);

        setJMenuBar(Menubarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Departamento_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trabajo_dip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edad_dip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sex_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(guardarregistro))
                            .addComponent(Partido_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarregistro)
                        .addGap(292, 292, 292)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sex_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trabajo_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Partido_dip)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(guardarregistro)
                        .addComponent(limpiarregistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelexit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Apellido_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido_dipActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
dispose();         
dispose();        
admin v3 =new admin();
         v3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void trabajo_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajo_dipActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_trabajo_dipActionPerformed

    private void limpiarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarregistroActionPerformed
Nombre_dip.setText(null);
Apellido_dip.setText(null);
Departamento_dip.setText(null);
edad_dip.setText(null);    
Partido_dip.setToolTipText(null);
Sex_dip.setToolTipText(null);
trabajo_dip.setToolTipText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarregistroActionPerformed

    private void guardarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarregistroActionPerformed
        // TODO add your handling code here:
                     try {
               
              Connection  cn=DriverManager.getConnection("jdbc:mysql://localhost/elecciones", "root", "");
              PreparedStatement pst=cn.prepareStatement("insert into diputado values(?,?,?,?,?,?,?,?)");
              pst.setString(1, "0");
              pst.setString(2, Nombre_dip.getText().trim());
              pst.setString(3, Apellido_dip.getText().trim());
              pst.setString(4, edad_dip.getText().trim());
              pst.setString(5, Departamento_dip.getText().trim());
              pst.setString(6, trabajo_dip.getSelectedItem().toString());
              pst.setString(7, Partido_dip.getText().trim());
              pst.setString(8, Sex_dip.getSelectedItem().toString());
              pst.executeUpdate();
              
              
             Nombre_dip.setText("");
             Apellido_dip.setText("");
             edad_dip.setText("");
             Departamento_dip.setText("");
             trabajo_dip.setSelectedItem("");
             Partido_dip.setText("");
             Sex_dip.setSelectedItem("");
            
            labelexit.setText("Registro exitoso");
               JOptionPane.showMessageDialog(null, "Conexion establecida");
              
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Sin conexion a la base de datos"+" "+ex.getMessage());
          }
        
       
        
    }//GEN-LAST:event_guardarregistroActionPerformed

    private void Nombre_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_dipActionPerformed

    private void Partido_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Partido_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Partido_dipActionPerformed

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
            java.util.logging.Logger.getLogger(inscripciondip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscripciondip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscripciondip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscripciondip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inscripciondip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca_pres;
    private javax.swing.JTextField Apellido_dip;
    private javax.swing.JTextField Departamento_dip;
    private javax.swing.JMenuBar Menubarra;
    private javax.swing.JTextField Nombre_dip;
    private javax.swing.JTextField Partido_dip;
    private javax.swing.JComboBox<String> Sex_dip;
    private javax.swing.JButton atras;
    private javax.swing.JTextField edad_dip;
    private javax.swing.JButton guardarregistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelexit;
    private javax.swing.JButton limpiarregistro;
    private javax.swing.JComboBox<String> trabajo_dip;
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

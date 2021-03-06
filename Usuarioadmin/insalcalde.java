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


public class insalcalde extends javax.swing.JFrame {

      fondopanel fondo=new fondopanel();
    public insalcalde() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre_alca = new javax.swing.JTextField();
        Apellido_alca = new javax.swing.JTextField();
        Sex_alca = new javax.swing.JComboBox<>();
        trabajo_alca = new javax.swing.JComboBox<>();
        Departamento_alca = new javax.swing.JTextField();
        Partidoalca = new javax.swing.JTextField();
        edad_alca = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        guardarregistro = new javax.swing.JButton();
        limpiarcampo = new javax.swing.JButton();
        labelexit = new javax.swing.JLabel();
        Menubarra = new javax.swing.JMenuBar();
        Acerca_pres = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSCRIPCION PARA ALCALDE");

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
        jLabel6.setText("Departamento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trabajo que desempeña: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Partido al que pertenecera:  ");

        Apellido_alca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido_alcaActionPerformed(evt);
            }
        });

        Sex_alca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino"}));

        trabajo_alca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abogado", "Ingeniero", "Licenciado ", "Doctor " }));
        trabajo_alca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajo_alcaActionPerformed(evt);
            }
        });

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inscripcionesalcalde/flecj (2).png"))); // NOI18N
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        limpiarcampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inscripcionesalcalde/limpiar.png"))); // NOI18N
        limpiarcampo.setBorderPainted(false);
        limpiarcampo.setContentAreaFilled(false);
        limpiarcampo.setDefaultCapable(false);
        limpiarcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarcampoActionPerformed(evt);
            }
        });

        labelexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelexit.setForeground(new java.awt.Color(255, 255, 255));

        Acerca_pres.setText("Acerca de");
        Menubarra.add(Acerca_pres);

        setJMenuBar(Menubarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Departamento_alca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre_alca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabajo_alca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Apellido_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Sex_alca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edad_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Partidoalca))
                    .addComponent(jLabel8))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(labelexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpiarcampo)
                .addGap(186, 186, 186)
                .addComponent(guardarregistro)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Apellido_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edad_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sex_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Departamento_alca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trabajo_alca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarregistro)
                            .addComponent(limpiarcampo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Partidoalca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Apellido_alcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido_alcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido_alcaActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
dispose();       

dispose();        
admin v3 =new admin();
         v3.setVisible(true);
        this.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void trabajo_alcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajo_alcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trabajo_alcaActionPerformed

    private void limpiarcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarcampoActionPerformed
Nombre_alca.setText(null);
Apellido_alca.setText(null);
Departamento_alca.setText(null);
edad_alca.setText(null);    
Partidoalca.setText(null);
Sex_alca.setToolTipText(null);
trabajo_alca.setToolTipText(null);


    }//GEN-LAST:event_limpiarcampoActionPerformed

    private void guardarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarregistroActionPerformed
       
        try {
               
              Connection  cn=DriverManager.getConnection("jdbc:mysql://localhost/elecciones", "root", "");
              PreparedStatement pst=cn.prepareStatement("insert into alcalde values(?,?,?,?,?,?,?,?)");
              pst.setString(1, "0");
              pst.setString(2, Nombre_alca.getText().trim());
              pst.setString(3, Apellido_alca.getText().trim());
              pst.setString(4, edad_alca.getText().trim());
              pst.setString(5, Departamento_alca.getText().trim());
              pst.setString(6, trabajo_alca.getSelectedItem().toString());
              pst.setString(7, Partidoalca.getText().trim());
              pst.setString(8, Sex_alca.getSelectedItem().toString());
              pst.executeUpdate();
              
              
             Nombre_alca.setText("");
             Apellido_alca.setText("");
             edad_alca.setText("");
             Departamento_alca.setText("");
             trabajo_alca.setSelectedItem("");
             Partidoalca.setText("");
             Sex_alca.setSelectedItem("");
            
            labelexit.setText("Registro exitoso");
              
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Sin conexion a la base de datos"+" "+ex.getMessage());
          }
          
    }                                            

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
            java.util.logging.Logger.getLogger(insalcalde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insalcalde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insalcalde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insalcalde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insalcalde().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca_pres;
    private javax.swing.JTextField Apellido_alca;
    private javax.swing.JTextField Departamento_alca;
    private javax.swing.JMenuBar Menubarra;
    private javax.swing.JTextField Nombre_alca;
    private javax.swing.JTextField Partidoalca;
    private javax.swing.JComboBox<String> Sex_alca;
    private javax.swing.JButton atras;
    private javax.swing.JTextField edad_alca;
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
    private javax.swing.JButton limpiarcampo;
    private javax.swing.JComboBox<String> trabajo_alca;
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

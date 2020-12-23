
package Usuarioadmin;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author alexander
 */
public class conexion_consulta {
        public String bd="elecciones";
        public String ruta="jdbc:mysql://localhost/"+bd;
        public String user="root";
        public String pass="";
    Connection con=null;
   
    
    
    public void conectar(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(ruta,user,pass); 
           
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No conectado");
        }
    }
    
    
    
    /*public static ArrayList<String> llenar_combo(){
        ArrayList<String> lista = new ArrayList<String>();
        String q = "select * from partidop";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (SQLException e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                lista.add(resultado.getString("NombrePartido"));
            }
        } catch (SQLException e) {
        }
        return lista;
    }*/
    
    public ResultSet consulta(String sql){
        ResultSet res=null;
        try {
            PreparedStatement pstm=con.prepareStatement(sql);
            res=pstm.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error consulta: "+e.getMessage());
        }
        
        return res; 
    }
    
    public DefaultComboBoxModel obtenerpartidos(){
        DefaultComboBoxModel listamodelo = new DefaultComboBoxModel();
        listamodelo.addElement("Seleccione una opcion: ");
        ResultSet res=this.consulta("Select * from partidop order by NombrePartido");
        try {
                while(res.next()){
                    listamodelo.addElement(res.getString("NombrePartido"));
                    res.close();
                }
        } catch (SQLException e) {
            System.err.print(e.getCause().getMessage());
        }
                
        return listamodelo;
    }
}

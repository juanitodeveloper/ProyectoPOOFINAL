/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemae;
import java.sql.*;
import javax.swing.JComboBox;
/**
 *
 * @author Suazo
 */
public class SistemaE {

    /*public static Connection getSistemaE(){
        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                +"database=eleccion;"
                +"user=usuarioSQL;"
                +"password=1313;"
                +"loginTimeout=30;";
        try{ Connection con = DriverManager.getConnection(conexionURL);
        return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }*/
    
    public static void Deptos(JComboBox comboDepto){
        //agregamos los items
        comboDepto.addItem("Atlantida");
        comboDepto.addItem("Colon");
        comboDepto.addItem("Comayagua");
        comboDepto.addItem("Copan");
        comboDepto.addItem("Cortes");
        comboDepto.addItem("Choluteca");
        comboDepto.addItem("El Paraiso");
        comboDepto.addItem("Francisco Morazan");
        comboDepto.addItem("Gracias a Dios");
        comboDepto.addItem("Intibuca");
        comboDepto.addItem("Islas de la Bahia");
        comboDepto.addItem("La Paz");
        comboDepto.addItem("Lempira");
        comboDepto.addItem("Ocotepeque");
        comboDepto.addItem("Olancho");
        comboDepto.addItem("Santa Barbara");
        comboDepto.addItem("Valle");
        comboDepto.addItem("Yoro");
    }
    
 public static void Munis(JComboBox comboDepto,JComboBox comboMuni){
        comboMuni.removeAllItems();
        switch (comboDepto.getSelectedItem().toString()) {
            case "Atlantida":
                comboMuni.addItem("La Ceiba");
                comboMuni.addItem("Tela");
                comboMuni.addItem("Jutiapa");
                comboMuni.addItem("La Masica");
                comboMuni.addItem("San Francisco");
                comboMuni.addItem("Arizona");
                comboMuni.addItem("Esparta");
                comboMuni.addItem("El Porvenir");
                break;
            case "Colon":
                comboMuni.addItem("Trujillo");
                comboMuni.addItem("Balfate");
                comboMuni.addItem("Iriona");
                comboMuni.addItem("Limon");
                comboMuni.addItem("Saba");
                comboMuni.addItem("Santa Fe");
                comboMuni.addItem("Santa Rosa de Aguan");
                comboMuni.addItem("Sonaguera");
                comboMuni.addItem("Tocoa");
                comboMuni.addItem("Bonito Oriental");
                    break;
            case "Comayagua":
                comboMuni.addItem("Comayagua");
                comboMuni.addItem("Ajuterique");
                comboMuni.addItem("El Rosario");
                comboMuni.addItem("Esquias");
                comboMuni.addItem("Humuya");
                comboMuni.addItem("La Libertad");
                comboMuni.addItem("Lamani");
                comboMuni.addItem("La Trinidad");
                comboMuni.addItem("Lejamani");
                comboMuni.addItem("Meambar");
                comboMuni.addItem("Minas de Oro");
                comboMuni.addItem("Ojos de Agua");
                comboMuni.addItem("San Jeronimo");
                comboMuni.addItem("San Jose de Comayagua");
                comboMuni.addItem("San Jose del Potrero");
                comboMuni.addItem("San Luis");
                comboMuni.addItem("San Sebastian");
                comboMuni.addItem("Siguatepeque");
                comboMuni.addItem("Villa de San Antonio");
                comboMuni.addItem("Las Lajas");
                comboMuni.addItem("Taulabe");
                    break;
            case "Copan":
                comboMuni.addItem("Santa Rosa");
                comboMuni.addItem("Cabanas");
                comboMuni.addItem("Concepcion");
                comboMuni.addItem("Copan Ruinas");
                comboMuni.addItem("Corquin");
                comboMuni.addItem("Cucuyagua");
                comboMuni.addItem("Dolores");
                comboMuni.addItem("Dulce Nombre");
                comboMuni.addItem("El Paraiso");
                comboMuni.addItem("Florida");
                comboMuni.addItem("La Jigua");
                comboMuni.addItem("La union");
                comboMuni.addItem("Nueva Arcadia");
                comboMuni.addItem("San Agustin");
                comboMuni.addItem("San Antonio");
                comboMuni.addItem("San Jeronimo");
                comboMuni.addItem("San Jose");
                comboMuni.addItem("San Juan de Opoa");
                comboMuni.addItem("San Nicolas");
                comboMuni.addItem("San Pedro");
                comboMuni.addItem("Santa Rita");
                comboMuni.addItem("Trinidad de Copan");
                comboMuni.addItem("Veracruz");
                
                    break;
            case "Cortes":
                comboMuni.addItem("San Pedro Sula");
                comboMuni.addItem("Choloma");
                comboMuni.addItem("Omoa");
                comboMuni.addItem("Pimienta");
                comboMuni.addItem("Potrerillos");
                comboMuni.addItem("Puerto Cortes");
                comboMuni.addItem("San Antonio de Cortes");
                comboMuni.addItem("San Francisco de Yojoa");
                comboMuni.addItem("San Manuel");
                comboMuni.addItem("Santa Cruz de Yojoa");
                comboMuni.addItem("Villanueva");
                comboMuni.addItem("La lima");
                    break;
                    
            case "Choluteca":
                comboMuni.addItem("Choluteca");
                comboMuni.addItem("Apacilagua");
                comboMuni.addItem("Concepcion de Maria");
                comboMuni.addItem("Duyure");
                comboMuni.addItem("El Corpus");
                comboMuni.addItem("El Triunfo");
                comboMuni.addItem("Marcovia");
                comboMuni.addItem("Morolica");
                comboMuni.addItem("Namasigue");
                comboMuni.addItem("Orocuina");
                comboMuni.addItem("Pespire");
                comboMuni.addItem("San Antonio de Flores");
                comboMuni.addItem("San Isidro");
                comboMuni.addItem("San Jose");
                comboMuni.addItem("San Marcos de Colon");
                comboMuni.addItem("Santa Ana de Yusguare");
                    break;
            case "El Paraiso":
                comboMuni.addItem("Yuscaran");
                comboMuni.addItem("Alauca");
                comboMuni.addItem("Danli");
                comboMuni.addItem("El Paraiso");
                comboMuni.addItem("Guinope");
                comboMuni.addItem("Jacaleapa");
                comboMuni.addItem("Liure");
                comboMuni.addItem("Moroceli");
                comboMuni.addItem("Oropoli");
                comboMuni.addItem("Potrerillos");
                comboMuni.addItem("San Antonio de Flores");
                comboMuni.addItem("San Lucas");
                comboMuni.addItem("San Matias");
                comboMuni.addItem("Soledad");
                comboMuni.addItem("Teupasenti");
                comboMuni.addItem("Texiguat");
                comboMuni.addItem("Vado Ancho");
                comboMuni.addItem("Yauyupe");
                comboMuni.addItem("Trojes");
                    break;
            case "Francisco Morazan":
                comboMuni.addItem("Distrito central");
                comboMuni.addItem("Alubaren");
                comboMuni.addItem("Cedros");
                comboMuni.addItem("Curaren");
                comboMuni.addItem("El Porvenir");
                comboMuni.addItem("Guaimaca");
                comboMuni.addItem("La Libertad");
                comboMuni.addItem("La Venta");
                comboMuni.addItem("Lepaterique");
                comboMuni.addItem("Maraita");
                comboMuni.addItem("Marale");
                comboMuni.addItem("Nueva Armenia");
                comboMuni.addItem("Ojojona");
                comboMuni.addItem("Orica");
                comboMuni.addItem("Reitoca");
                comboMuni.addItem("Sabanagrande");
                comboMuni.addItem("San Antonio de Oriente");
                comboMuni.addItem("San Buenaventura");
                comboMuni.addItem("San Ignacio");
                comboMuni.addItem("San Juan de Flores");
                comboMuni.addItem("San Miguelito");
                comboMuni.addItem("Santa Ana");
                comboMuni.addItem("Santa Lucia");
                comboMuni.addItem("Talanga");
                comboMuni.addItem("Tatumbla");
                comboMuni.addItem("Valle de Angeles");
                comboMuni.addItem("Villa de San Francisco");
                comboMuni.addItem("Vallecillo");
                                
                    break;
            case "Gracias a Dios":
                comboMuni.addItem("Puerto Lempira");
                comboMuni.addItem("Brus Laguna");
                comboMuni.addItem("Ahuas");
                comboMuni.addItem("Juan Francisco Bulnes");
                comboMuni.addItem("Ramon Villeda Morales");
                comboMuni.addItem("Wampusirpe");
                     break;
            case "Intibuca":
                comboMuni.addItem("La Esperanza");
                comboMuni.addItem("Camasca");
                comboMuni.addItem("Colomoncagua");
                comboMuni.addItem("Concepcion");
                comboMuni.addItem("Dolores");
                comboMuni.addItem("Intibuca");
                comboMuni.addItem("Jesus de Otoro");
                comboMuni.addItem("Magdalena");
                comboMuni.addItem("Masaguara");
                comboMuni.addItem("San Antonio");
                comboMuni.addItem("San Isidro");
                comboMuni.addItem("San Juan");
                comboMuni.addItem("San Marcos de la Sierra");
                comboMuni.addItem("San Miguel de Guancapla");
                comboMuni.addItem("Santa Lucia");
                comboMuni.addItem("Yamaranguila");
                comboMuni.addItem("San Francisco de Opalaca");
                    break;
            case "Islas de la Bahia":
                comboMuni.addItem("Roatan");
                comboMuni.addItem("Guanaja");
                comboMuni.addItem("Jose Santos Guardiola");
                comboMuni.addItem("Utila");
                
                    break;
             case "La Paz":
                comboMuni.addItem("La Paz");
                comboMuni.addItem("Aguanqueterique");
                comboMuni.addItem("Cabanas");
                comboMuni.addItem("Cane");
                comboMuni.addItem("Chinada");
                comboMuni.addItem("Guajiquiro");
                comboMuni.addItem("Lauterique");
                comboMuni.addItem("Marcala");
                comboMuni.addItem("Mercedes de Oriente");
                comboMuni.addItem("Opatoro");
                comboMuni.addItem("San Antonio del Norte");
                comboMuni.addItem("San Jose");
                comboMuni.addItem("San Juan");
                comboMuni.addItem("San Pedro de Tutule");
                comboMuni.addItem("Santa Ana");
                comboMuni.addItem("Santa Elena");
                comboMuni.addItem("Santa Maria");
                comboMuni.addItem("Santiago de Puringla");
                comboMuni.addItem("Yarula");
                
                    break;
            case "Lempira":
                comboMuni.addItem("Gracias");
                comboMuni.addItem("Belen");
                comboMuni.addItem("Candelaria");
                comboMuni.addItem("Cololaca");
                comboMuni.addItem("Erandique");
                comboMuni.addItem("Gualcine");
                comboMuni.addItem("Guarita");
                comboMuni.addItem("La Campa");
                comboMuni.addItem("La Iguala");
                comboMuni.addItem("Las Flores");
                comboMuni.addItem("La Union");
                comboMuni.addItem("La Virtud");
                comboMuni.addItem("Lepaera");
                comboMuni.addItem("Mapulaca");
                comboMuni.addItem("Piraera");
                comboMuni.addItem("San Andres");
                comboMuni.addItem("San Francisco");
                comboMuni.addItem("San Juan Guarita");
                comboMuni.addItem("San Manuel Colohete");
                comboMuni.addItem("San Rafael");
                comboMuni.addItem("San Sebastian");
                comboMuni.addItem("Santa Cruz");
                comboMuni.addItem("Talgua");
                comboMuni.addItem("Tambla");
                comboMuni.addItem("Tomala");
                comboMuni.addItem("Valladolid");
                comboMuni.addItem("Virginia");
                comboMuni.addItem("San Marcos de Caiquin");
                    break;                    
            case "Ocotepeque":
                comboMuni.addItem("Ocotepeque");
                comboMuni.addItem("Belen Gualcho");
                comboMuni.addItem("Concepcion");
                comboMuni.addItem("Dolores Merendon");
                comboMuni.addItem("Fraternidad");
                comboMuni.addItem("La Encarnacion");
                comboMuni.addItem("La Labor");
                comboMuni.addItem("Lucerna");
                comboMuni.addItem("Mercedes");
                comboMuni.addItem("San Fernando");
                comboMuni.addItem("San Francisco del Valle");
                comboMuni.addItem("San Jorge");
                comboMuni.addItem("San Marcos");
                comboMuni.addItem("Santa Fe");
                comboMuni.addItem("Sensenti");
                comboMuni.addItem("Sinuapa");
                    break;
            case "Olancho":
                comboMuni.addItem("Juticalpa");
                comboMuni.addItem("Campamento");
                comboMuni.addItem("Catacamas");
                comboMuni.addItem("Concordia");
                comboMuni.addItem("Dulce Nombre de Culmi");
                comboMuni.addItem("El Rosario");
                comboMuni.addItem("Esquipulas del Norte");
                comboMuni.addItem("Gualaco");
                comboMuni.addItem("Guarizama");
                comboMuni.addItem("Guata");
                comboMuni.addItem("Guayape");
                comboMuni.addItem("Jano");
                comboMuni.addItem("La Union");
                comboMuni.addItem("Manguilile");
                comboMuni.addItem("Manto");
                comboMuni.addItem("Salama");
                comboMuni.addItem("San Esteban");
                comboMuni.addItem("San Francisco de Becerra");
                comboMuni.addItem("San Francisco de la Paz");
                comboMuni.addItem("Santa Maria del Real");
                comboMuni.addItem("Silca");
                comboMuni.addItem("Yocon");
                comboMuni.addItem("Patuca");
                    break;   
            case "Santa Barbara":
                comboMuni.addItem("Santa Barbara");
                comboMuni.addItem("Arada");
                comboMuni.addItem("Atima");
                comboMuni.addItem("Azacualpa");
                comboMuni.addItem("Ceguaca");
                comboMuni.addItem("Concepcion del Norte");
                comboMuni.addItem("Concepcion del Sur");
                comboMuni.addItem("Chinda");
                comboMuni.addItem("El Nispero");
                comboMuni.addItem("Gualala");
                comboMuni.addItem("Ilama");
                comboMuni.addItem("Las Vegas");
                comboMuni.addItem("Macuelizo");
                comboMuni.addItem("Naranjito");
                comboMuni.addItem("Nuevo Celilac");
                comboMuni.addItem("Nueva Frontera");
                comboMuni.addItem("Petoa");
                comboMuni.addItem("Proteccion");
                comboMuni.addItem("Quimistan");
                comboMuni.addItem("San Francisco de Ojuera");
                comboMuni.addItem("San Jose de las Colinas");
                comboMuni.addItem("San Luis");
                comboMuni.addItem("San Marcos");
                comboMuni.addItem("San Nicolas");
                comboMuni.addItem("San Pedro Zacapa");
                comboMuni.addItem("San Vicente Centenario");
                comboMuni.addItem("San Rita");
                comboMuni.addItem("Trinida");
                    break; 
            case "Valle":
                comboMuni.addItem("Nacaome");
                comboMuni.addItem("Alianza");
                comboMuni.addItem("Amapala");
                comboMuni.addItem("Aramecina");
                comboMuni.addItem("Caridad");
                comboMuni.addItem("Goascoran");
                comboMuni.addItem("Langue");
                comboMuni.addItem("San Francisco de Coray");
                comboMuni.addItem("San Lorenzo");
                
                    break; 
            case "Yoro":
                comboMuni.addItem("Yoro");
                comboMuni.addItem("Arenal");
                comboMuni.addItem("El Negrito");
                comboMuni.addItem("El Progreso");
                comboMuni.addItem("Jocon");
                comboMuni.addItem("Morazan");
                comboMuni.addItem("Olanchito");
                comboMuni.addItem("Santa Rita");
                comboMuni.addItem("Sulaco");
                comboMuni.addItem("Victoria");
                comboMuni.addItem("Yorito");         
            default:
        }
    }
    
}

    


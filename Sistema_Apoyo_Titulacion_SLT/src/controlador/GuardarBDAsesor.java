package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//Ajustar los datos de acuerdo a la base de datos local
public class GuardarBDAsesor{

public void guardarBD(Asesor asesor) {
        String cadena = "jdbc:postgresql://localhost:5432/prueba";     //ajustar
        String user = "postgres";     //ajustar
        String pass = "123";     //ajustar

        try {
            Class.forName("org.postgresql.Driver");
            Connection conex = (Connection) DriverManager.getConnection(cadena, user, pass);    //Conectar a la base de datos
            java.sql.Statement st = conex.createStatement();    //No agarra sin añadir la linea java.sql
            String sql = "INSERT INTO asesores (nombre, apellido_paterno, apellido_materno, telefono, cubiculo, correo_electronico) VALUES ('" + asesor.getnombre() + "', '" + asesor.getapellidoPaterno() + "', '" + asesor.getapellidoMaterno() + "', '" + asesor.gettelefono() + "', '" + asesor.getcubiculo() + "', '" + asesor.getcorreoElectronico() + "')";
            st.executeUpdate(sql);  //Actualiza la base de datos
            st.close();
            conex.close();
        } catch (Exception e) {
            System.out.println("No se pudo agregar el asesor a la base de datos.");
        }
    }
}

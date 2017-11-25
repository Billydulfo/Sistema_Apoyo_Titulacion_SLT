/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class AdminBD {
	private Connection conexion;
	private ResultSet resultados;//objeto que almacena una tabla o lista de una conculta de una base de  datos
	//recibe una o varial filas de una tabla 
	private String controladorBD;
	private String host;
	private String puerto;
	private String baseDatos;
	private String url;
	private String usuario;
	private String contraseña;
	/*creacion de variables de sat*/
        private Asesor asesor = new Asesor();
        private Candidato candidato = new Candidato();
        private Carrera carrera = new Carrera();
        private Grupo grupo = new Grupo();
        private Horario horario= new Horario();
        private Lugar lugar = new Lugar();
        private Persona persona = new Persona();
        private Seminario seminario = new Seminario();
        private Tesis tesis = new Tesis();
        private Trabajo trabajo = new Trabajo();

        private DefaultTableModel catalogos;

	
	public AdminBD(){
	  controladorBD= "org.postgresql.Driver";
	  host= "127.0.0.1";
	  puerto = "5432";
	  baseDatos="sat";/*nombre de la base de datos */
	  url ="jdbc:postgresql://"+host+":"+puerto+"/"+baseDatos;
	  usuario="postgres";
	  contraseña="p057gr35";
	  resultados=null;
	  conexion =null;
	}
	
	public String conectate(){
        	String mensaje=null;
       		try{
    	  		 Class.forName(controladorBD); 
       
       		}catch(ClassNotFoundException cnfe){
       			mensaje="No se hallo el controlador de PostgreSQL";
       		}
       		try{
 	      		conexion=DriverManager.getConnection(url,usuario,contraseña);
       		}catch(SQLException sqe){
    	   		mensaje ="conexion Fallo"; 
     		}
      		return mensaje;
   	}
        
        public String insertarCandidato(Candidato candidato){
            
            String mensaje=null;
            String ordenSQL=null;
            Statement proposicion=null;
                /*variables de candidato*/
            String nombre = null;
            String apellidoPaterno = null;
            String apellidoMaterno = null;
            String correoElectronico = null;
            int telefono = 0;
            int foto = 0;
            String matricula = null;
            String generacion = null;
            Carrera carrera = null;
            Trabajo trabajo = null;
            Tesis tesis = null;
            String valores = null;
		
                /*buscamos guardar info de candidato en la base de datos*/
            this.candidato = candidato;
            nombre= candidato.getNombre();
            apellidoPaterno = candidato.getApellidoPaterno();
            apellidoMaterno = candidato.getApellidoMaterno();
            correoElectronico = candidato.getCorreoElectronico();
            matricula = candidato.getMatricula();
            generacion = candidato.getGeneracion();
            carrera = candidato.getCarrera();
            trabajo = candidato.getTrabajo();
            tesis = candidato.getTesis();
            telefono = candidato.getTelefono();
            foto = candidato.getFoto();
                   
                /*  anteriormemte agregamos imagen con este codigo
                    imagen= hongo.getBytesImg();

                */

		mensaje = conectate();
		
		if(conexion != null){
			try{
		       		proposicion = conexion.createStatement();//sirve para conectarse sabe ir a la base de datos y ejecuta lo que le pidamos 
			   	valores= "'"+matricula+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+correoElectronico+"','"+generacion+"','"+telefono+"','"+telefono+"'"; 
		       		ordenSQL="INSERT INTO candidato VALUES("+valores+") ";

		       		System.out.println(ordenSQL);
	           		proposicion.executeUpdate(ordenSQL);//para modificar la base de datos por eso no se necesita un result set
	           		proposicion.close();
			 }catch(SQLException sqle){
				 mensaje="fallo actualizacion";
				 sqle.printStackTrace();
			 }finally{
			 	try{
					conexion.close();
			   	}catch(SQLException sqle){
                 			mensaje="falla conexcion";			   
			 	}
			 }  
		}else{
			mensaje="fallo conexion";
		}
		return mensaje;
	}
	
        
        
        
            public String insertarAsesor(Asesor asesor){
            
            String mensaje=null;
            String ordenSQL=null;
            Statement proposicion=null;
                //variables de candidato
            String nombre = null;
            String apellidoPaterno = null;
            String apellidoMaterno = null;
            String correoElectronico = null;
            int telefono = 0;
            String numeroTrabajador = null;
            String cubiculo = null;

            String valores = null;
		
                //buscamos guardar info de candidato en la base de datos
            this.asesor = asesor;
            nombre= asesor.getNombre();
            apellidoPaterno = asesor.getApellidoPaterno();
            apellidoMaterno = asesor.getApellidoMaterno();
            correoElectronico = asesor.getCorreoElectronico();
            numeroTrabajador = asesor.getNumeroTrabajador();
            telefono = asesor.getTelefono();
            cubiculo = asesor.getCubiculo();

		mensaje = conectate();
		
		if(conexion != null){
			try{
		       		proposicion = conexion.createStatement();//sirve para conectarse sabe ir a la base de datos y ejecuta lo que le pidamos 
			   	valores= "'"+numeroTrabajador+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+correoElectronico+"','"+telefono+"','"+cubiculo+"'"; 
		       		ordenSQL="INSERT INTO asesor VALUES("+valores+") ";

		       		System.out.println(ordenSQL);
	           		proposicion.executeUpdate(ordenSQL);//para modificar la base de datos por eso no se necesita un result set
	           		proposicion.close();
			 }catch(SQLException sqle){
				 mensaje="fallo actualizacion";
				 sqle.printStackTrace();
			 }finally{
			 	try{
					conexion.close();
			   	}catch(SQLException sqle){
                 			mensaje="falla conexcion";			   
			 	}
			 }  
		}else{
			mensaje="fallo conexion";
		}
		return mensaje;
	}
        
     
        
        
}
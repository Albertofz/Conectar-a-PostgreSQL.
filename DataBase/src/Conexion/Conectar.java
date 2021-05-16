package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {

	public static void main(String[] args) {
		
	    try {
	    	Connection miConection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgress","postgress","elimora");
	  
	    	Statement miStatement=miConection.createStatement ();
	    	
	    	ResultSet miResulset=miStatement.executeQuery("SELECT * FROM estudiantes");
	    	
	        while    ( miResulset.next() ) {
	        	
	        	System.out.println("Nombre: "+miResulset.getString("Nombre") + ", Apellido "+miResulset.getString("Apellido")+ ", Carreras: "+miResulset.getString("Carreras"));
	        }
	    }
	       catch (Exception e) {
	        System.out.println("no conecta");
	        e.printStackTrace();
	        }
	    }
}


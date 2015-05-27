package Modelo;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Clase que comprueba el codigo de entrada
public class IngresoLaby {
	//CONSULTA A LA BASE DE DATOS
	private final static String CHECK_SEL="SELECT cod FROM cod WHERE id=";
	private final static String COD_COL="cod";
	
	private final static String ID_JUG="id";
	private final static String NOMBRE_JUG="nombre";
	private final static String APELLIDOS_JUG="apellidos";
	private final static String EDAD_JUG="edad";
	private final static String NAC_JUG="nacionalidad";
	private final static String EQUIPO_JUG="equipo";
	
	public ArrayList<String> cadete=new ArrayList<String>();
	public ArrayList<String> jugador=new ArrayList<String>();
	
	//Conexion
	private Connection conexion = null;// maneja la conexió
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;

	public IngresoLaby() {
		//Obtenemos la conexion de datos
		conexion=ConexionDB.getConexion();		
	}
	
	
	
	public String checkCod(int id,String apellido){
		try{
			String cod="";
			instruccion = this.conexion.createStatement();
			//conjuntoResultados = instruccion.executeQuery(CHECK_SEL+String.valueOf(id));
			
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next() ) {
				if(apellido.equals(conjuntoResultados.getString(COD_COL))) cod="CODIGO CORRECTO ENHORABUENA. LLAMA A TU INSTRUCTOR";
				else return cod="CODIGO INCORRECTO COMPRUEBA TODOS LOS PASOS";
			}// fin de while
			return cod;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return "ERROR EN LA CONEXION. LLAMA A TU INSTRUCTOR";
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}	
	}
	
}
package Modelo;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Clase que comprueba el codigo de entrada
public class ModeloJugadores {
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

	public ModeloJugadores() {
		//Obtenemos la conexion de datos
		conexion=ConexionDB.getConexion();		
	}
	
	public ArrayList<Cadete> getCadete(){
		ArrayList<Cadete> cadetes=new ArrayList<Cadete>();
		String consulta="SELECT * FROM cadetes";
		try{
			//Crea una instrucción para realizar una consulta a la base de datos que nos devuelvan los datos que necesitamos	
			instruccion = (Statement) this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(consulta);
			//Recorremomos las filas de la base de datos para almacenarlos datos en arrays de 7 Strings. 
			while(conjuntoResultados.next()){
				Integer id= conjuntoResultados.getInt(ID_JUG);
				String nombre=conjuntoResultados.getString(NOMBRE_JUG);
				String apellidos=conjuntoResultados.getString(APELLIDOS_JUG);
				Integer edad= conjuntoResultados.getInt(EDAD_JUG);
				String nacionalidad=conjuntoResultados.getString(NAC_JUG);
				Integer equipo= conjuntoResultados.getInt(EQUIPO_JUG);

				Cadete c = new Cadete(id, nombre, apellidos, edad, nacionalidad, equipo);
				cadetes.add(c);
			}
			
		}catch ( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
			}finally{
				//Una vez ya obtenidos los datos se cierra la instrucción.
				try{
					conjuntoResultados.close();
					instruccion.close();
				}
				catch( SQLException excepcionSql ) 
				{
					excepcionSql.printStackTrace();
				}
			}
		return cadetes;
	}
	
	
	public ArrayList<String> getJugador(){
		ArrayList<String> jugador=new ArrayList<String>();
		String consulta="SELECT * FROM cadetes where id=12";
		
		try{
			//Crea una instrucción para realizar una consulta a la base de datos que nos devuelvan los datos que necesitamos	
			instruccion = (Statement) this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(consulta);
			//Recorremomos las filas de la base de datos para almacenarlos datos en arrays de 7 Strings. 
			while(conjuntoResultados.next()){
				Integer id= conjuntoResultados.getInt(ID_JUG);
				jugador.add(conjuntoResultados.getString(ID_JUG));
				System.out.print(id+";");
				
				String nombre=conjuntoResultados.getString(NOMBRE_JUG);
				jugador.add(conjuntoResultados.getString(NOMBRE_JUG));
				System.out.print(nombre+";");
				
				String apellidos=conjuntoResultados.getString(APELLIDOS_JUG);
				jugador.add(conjuntoResultados.getString(APELLIDOS_JUG));
				System.out.print(apellidos+";");
				
				Integer edad= conjuntoResultados.getInt(EDAD_JUG);
				jugador.add(conjuntoResultados.getString(EDAD_JUG));
				System.out.print(edad+";");
				
				String nacionalidad=conjuntoResultados.getString(NAC_JUG);
				jugador.add(conjuntoResultados.getString(NAC_JUG));
				System.out.print(nacionalidad+";");
				
				Integer equipo= conjuntoResultados.getInt(EQUIPO_JUG);
				jugador.add(conjuntoResultados.getString(EQUIPO_JUG));
				System.out.println(equipo);
				
			}
			
		}catch ( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
			}finally{
				//Una vez ya obtenidos los datos se cierra la instrucción.
				try{
					conjuntoResultados.close();
					instruccion.close();
				}
				catch( SQLException excepcionSql ) 
				{
					excepcionSql.printStackTrace();
				}
			}
		
		return jugador;
	}

}
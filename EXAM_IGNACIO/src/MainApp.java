import views.AppFrame;
import Modelo.IngresoLaby;
import Modelo.Cadete;
import Modelo.ConexionDB;
import Modelo.ModeloJugadores;


public class MainApp {
	public static void main(String[] args) {
		ConexionDB cDB;
		Cadete cad;
		IngresoLaby laby;
		ModeloJugadores mJug;
		cDB= ConexionDB.getInstance("localhost","thelaby","root","tonphp");
		if(cDB.connectDB()==true){
			System.out.println("ESTAS CONECTADO CORRECTAMENTE");
			AppFrame frame = new AppFrame();
			frame.setVisible(true);
			mJug = new ModeloJugadores();
			mJug.getCadete();
			cad=new Cadete();
			
		}
	}

}

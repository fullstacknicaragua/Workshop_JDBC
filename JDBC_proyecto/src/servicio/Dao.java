package servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Cuenta;

public class Dao implements IDao<Cuenta>{
	
	private final String HOST="jdbc:oracle:thin:@10.10.10.10:1521:xe";

	@Override
	public Connection getConnection(String usuario, String password) throws Exception {
		Connection con = DriverManager.getConnection(HOST,usuario,password);
		return con;
	}

	@Override
	public List<Cuenta> consultarTodos(Connection con) throws Exception{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM CUENTA");
		List<Cuenta> lista = new ArrayList<Cuenta>();
		while (rs.next()) {
			Cuenta cuenta = new Cuenta(rs.getInt("id"),
			rs.getString("nombre"),rs.getString("apellido"));
			lista.add(cuenta);			
		}
		return lista;
	}

	@Override
	public void insertarCuenta(Connection con, Cuenta cuenta) throws Exception {
		PreparedStatement ps = con.prepareStatement("INSERT INTO CUENTA VALUES (:1,:2,:3)");
		ps.setInt(1,cuenta.getId());
			ps.setString(2,cuenta.getNombre());
			ps.setString(3,cuenta.getApellido());
		ps.execute();	
	}

}

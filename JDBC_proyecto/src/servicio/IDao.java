package servicio;

import java.sql.Connection;
import java.util.List;

import modelo.Cuenta;

public interface IDao<T> {
	
	public Connection getConnection(String usuario,String password) throws Exception;
	
	public List<T> consultarTodos(Connection con) throws Exception;
	
	public void insertarCuenta(Connection con, Cuenta cuenta) throws Exception;

}

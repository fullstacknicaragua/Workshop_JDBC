package test;

import java.sql.Connection;

import modelo.Cuenta;
import servicio.Dao;
import servicio.IDao;

public class Test {

	public static void main(String[] args) throws Exception {
		IDao<Cuenta> d = new Dao();
		Connection con = d.getConnection("admon","admon");
		System.out.println(d.consultarTodos(con));
		Cuenta cuenta = new Cuenta(5,"Roger","Peralta");
		d.insertarCuenta(con, cuenta);
		System.out.println(d.consultarTodos(con));		
	}

}

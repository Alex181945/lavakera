package com.itgam.dao;

import java.sql.SQLException;
import java.util.List;

import com.itgam.model.Empleado;

public interface EmpleadoDAO {

	public void agregarEmpleado(Empleado objE);
	
	public void actualizarEmpleado(Empleado objE);
	
	public void eliminarEmpleado(Integer idEmpleado);
	
	public List<Empleado> listaEmpleado();
	
	public Empleado getEmpleado(Integer idEmpleado);
	
	public Boolean acceso(Integer idEmpleado) throws SQLException;
	
			
}

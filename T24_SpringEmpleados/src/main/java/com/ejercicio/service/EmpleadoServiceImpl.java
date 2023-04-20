package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.EmpleadoDAO;
import com.ejercicio.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	EmpleadoDAO iEmpleadoDAO; 
	
	@Override 
	public List<Empleado> listarEmpleado(){
		return iEmpleadoDAO.findAll(); 
	}
	
	@Override
	public Empleado createEmpleado(Empleado empleado) 
	{
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoID(Long id) 
	{
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoTrabajo(String trabajo) 
	{
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) 
	{
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) 
	{
		iEmpleadoDAO.deleteById(id);
	} 
	
	


}

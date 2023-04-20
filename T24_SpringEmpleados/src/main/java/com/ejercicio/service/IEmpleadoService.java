package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Empleado;

public interface IEmpleadoService {

	//Metodos para listar, guardar..etc
	
	//Listar all
	
	public List<Empleado> listarEmpleado(); 
	//Guarda un empleado CREATE
	public Empleado createEmpleado(Empleado empleado); 
	//READ
	public Empleado empleadoID(Long id);
	//Buscar por campo nombre
	public List<Empleado> listarEmpleadoTrabajo(String trabajo); 
	
	//UPDATE empleado
	public Empleado actualizarEmpleado(Empleado empleado);
	//DELETE empleado
	public void eliminarEmpleado(Long id); 
}

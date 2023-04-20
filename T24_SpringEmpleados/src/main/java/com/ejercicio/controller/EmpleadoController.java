package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.dto.Empleado;
import com.ejercicio.service.EmpleadoServiceImpl;


@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados()
	{
		return empleadoServiceImpl.listarEmpleado();
	}

	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadosTrabajo(@PathVariable(name="trabajo") String trabajo)
	{
		return empleadoServiceImpl.listarEmpleadoTrabajo(trabajo);
	}
	
	@PostMapping("/empleados")
	public Empleado createEmpleado(@RequestBody Empleado empleado)
	{
		return empleadoServiceImpl.createEmpleado(empleado);
	}
	
	

	@GetMapping("/empleados/{id}")
	public Empleado empleadoID(@PathVariable(name="id") Long id, @RequestBody Empleado empleado)
	{
		Empleado empleado_xid = new Empleado();
		
		empleado_xid = empleadoServiceImpl.empleadoID(id);
		
		System.out.println("Empleado XID: " + empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empleado)
	{
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_seleccionado = empleadoServiceImpl.empleadoID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getSalario());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: " + empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") Long id)
	{
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}

package com.ejercicio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{
	public List<Empleado> findByTrabajo(String trabajo);

}

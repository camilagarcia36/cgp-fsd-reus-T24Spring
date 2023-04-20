package com.ejercicio.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

	//Creo los campossql y atributos de empleados
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column
	private String nombre;
	@Column
	private String trabajo; 
	@Column
	private Double salario; 
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(Long id, String nombre, String trabajo, Double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		switch (trabajo) {
		case "gestor":
			salario = 2000.00;
			break;
		case "ingeniero":
			salario = 1800.00;
			break;
		case "cajero":
			salario = 1000.00;
			break;
		}
	}

	/**
	 * @return the sueldo
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario; 
	
	}
	
	


}

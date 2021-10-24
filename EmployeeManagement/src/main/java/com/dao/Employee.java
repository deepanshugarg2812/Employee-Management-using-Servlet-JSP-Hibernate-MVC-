package com.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name="employee")
@Table(name="Employee")
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String doj;
	private int salary;
	
	@OneToOne
	private Address addressId;
	
	public Employee() {
		super();
	}

	public Employee(String name, String doj, int salary) {
		super();
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", salary=" + salary + ", addressId="
				+ addressId + "]";
	}
	
	

}

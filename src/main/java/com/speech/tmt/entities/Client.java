package com.speech.tmt.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;
	
	private String firstName;
	
	private String lastName;
	
	private String gender; // male, female, prefer not to answer
	
	private int age;
	
	@ManyToMany(cascade= {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	@JoinTable(name="employee_client", joinColumns=@JoinColumn(name="client_id"),
	inverseJoinColumns=@JoinColumn(name="employee_id"))
	
	private List<Employee> employees;

	public Client() {

	}

	public Client(String firstName, String lastName, String gender, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//Convenient to add a addEmployee method to the Client 
	public void addEmployee(Employee emp) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
		employees.add(emp);
	}

}

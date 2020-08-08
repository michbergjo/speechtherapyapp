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
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;

	private String firstName;

	private String lastName;

	private String credential; // SLP, SLPA

	@ManyToMany(cascade= {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	@JoinTable(name="employee_client", joinColumns=@JoinColumn(name="employee_id"),
	inverseJoinColumns=@JoinColumn(name="client_id"))
	
	private List<Client> clients;
	

	public Employee() {

	}

	public Employee(String firstName, String lastName, String credential) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.credential = credential;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
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

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}
	
	//Convenient to add a addClient method to the Employee 
	public void addClient(Client client) {
		if(clients == null) {
			clients = new ArrayList<>();
		}
		clients.add(client);
	}
}

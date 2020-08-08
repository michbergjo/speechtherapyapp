package com.speech.tmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.speech.tmt.dao.ClientRepository;
import com.speech.tmt.dao.EmployeeRepository;

@SpringBootApplication
public class SpeechTherapyManagementApplication {
	
	@Autowired 
	EmployeeRepository empRepo;
	
	@Autowired
	ClientRepository clientRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpeechTherapyManagementApplication.class, args);
	}

	//seed data into the database 
//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			
//			//define employees 
//			Employee emp1 = new Employee("Michelle", "Joseph", "SLP");
//			Employee emp2 = new Employee("Mary", "Margarita", "SLPA");
//			Employee emp3 = new Employee("Adam", "Grant", "SLP");
//			Employee emp4 = new Employee("Thomas", "Burger", "SLPA");
//			Employee emp5 = new Employee("Amanda", "Johnson", "SLP");
//			
//			//define clients 
//			Client client1 = new Client("Amelia", "Borgon", "female", 6);
//			Client client2 = new Client("Samuel", "Ortega", "male", 3);
//			Client client3 = new Client("Russel", "Russo", "male", 10);
//			Client client4 = new Client("Marcel", "Marikibo", "male", 5);
//			Client client5 = new Client("Darius", "Le'Blanc", "male", 12);
//			Client client6 = new Client("Graham", "Reed", "male", 7);
//			Client client7 = new Client("Montrell", "Corder", "male", 9);
//			Client client8 = new Client("Greyson", "Greenburg", "male", 14);
//			Client client9 = new Client("Leon", "Samuelson", "male", 6);
//			
//			//link clients to employees 
//			client1.setEmployees(Arrays.asList(emp1, emp2));
//			client2.setEmployees(Arrays.asList(emp3, emp4));
//			client3.setEmployees(Arrays.asList(emp1, emp2));
//			client4.setEmployees(Arrays.asList(emp5, emp2, emp4));
//			client5.setEmployees(Arrays.asList(emp3, emp4));
//			client6.setEmployees(Arrays.asList(emp5, emp1));
//			client7.setEmployees(Arrays.asList(emp2, emp4, emp5));
//			client8.setEmployees(Arrays.asList(emp1, emp4));
//			client9.setEmployees(Arrays.asList(emp3, emp4, emp5));
//		
//			
//			//link employees to clients 
//			//can use Arrays.asList 
//			emp1.setClients(Arrays.asList(client1, client3, client6, client8));
//			emp2.setClients(Arrays.asList(client1, client3, client4, client7));
//			emp3.setClients(Arrays.asList(client2, client5, client9));
//			emp4.setClients(Arrays.asList(client2, client4, client5, client7, client8, client9));
//			
//			//or add a addClient method to the employee object 
//			emp5.addClient(client4);
//			emp5.addClient(client6);
//			emp5.addClient(client7);
//			emp5.addClient(client9);
//			
//			//save employees to database 
//			empRepo.save(emp1);
//			empRepo.save(emp2);
//			empRepo.save(emp3);
//			empRepo.save(emp4);
//			empRepo.save(emp5);
//			
//			//save clients to database 
//			clientRepo.save(client1);
//			clientRepo.save(client2);
//			clientRepo.save(client3);
//			clientRepo.save(client4);
//			clientRepo.save(client5);
//			clientRepo.save(client6);
//			clientRepo.save(client7);
//			clientRepo.save(client8);
//			clientRepo.save(client9);
//			
//		};
//	}
	
}

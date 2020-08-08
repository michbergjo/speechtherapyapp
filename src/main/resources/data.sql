-- INSERT EMPLOYEES
insert into employee (employee_id, first_name, last_name, credential) values (1, 'Michelle', 'Joseph', 'SLP');
insert into employee (employee_id, first_name, last_name, credential) values (2, 'Mary', 'Margarita', 'SLPA');
insert into employee (employee_id, first_name, last_name, credential) values (3, 'Adam', 'Grant', 'SLP');
insert into employee (employee_id, first_name, last_name, credential) values (4, 'Tabitha', 'Burger', 'SLPA');
insert into employee (employee_id, first_name, last_name, credential) values (5, 'Amanda', 'Johnson', 'SLP');


-- INSERT CLIENTS 
insert into client (client_id, first_name, last_name, gender, age) values (100, 'Amelia', 'Borgon', 'FEMALE', 5);
insert into client (client_id, first_name, last_name, gender, age) values (101, 'Samuel', 'Ortega', 'MALE', 2);
insert into client (client_id, first_name, last_name, gender, age) values (102, 'Russel', 'Russo', 'MALE', 7);
insert into client (client_id, first_name, last_name, gender, age) values (103, 'Marcel', 'Marikibo', 'MALE', 12);
insert into client (client_id, first_name, last_name, gender, age) values (104, 'Darius', 'LeBlanc', 'MALE', 7);
insert into client (client_id, first_name, last_name, gender, age) values (105, 'Graham', 'Reed', 'MALE', 4);
insert into client (client_id, first_name, last_name, gender, age) values (106, 'Montrell', 'Corder', 'MALE', 10);
insert into client (client_id, first_name, last_name, gender, age) values (107, 'Greyson', 'Greenburg', 'MALE', 9);
insert into client (client_id, first_name, last_name, gender, age) values (108, 'Leon', 'Samuelson', 'MALE', 3);


-- INSERT PROJECT_EMPLOYEE RELATION
insert into employee_client (employee_id, client_id) values (1, 100);
insert into employee_client (employee_id, client_id) values (1, 103);
insert into employee_client (employee_id, client_id) values (1, 104);
insert into employee_client (employee_id, client_id) values (1, 107);
insert into employee_client (employee_id, client_id) values (2, 100);
insert into employee_client (employee_id, client_id) values (2, 105);
insert into employee_client (employee_id, client_id) values (2, 107);
insert into employee_client (employee_id, client_id) values (2, 108);
insert into employee_client (employee_id, client_id) values (3, 101);
insert into employee_client (employee_id, client_id) values (3, 102);
insert into employee_client (employee_id, client_id) values (3, 104);
insert into employee_client (employee_id, client_id) values (3, 105);
insert into employee_client (employee_id, client_id) values (4, 100);
insert into employee_client (employee_id, client_id) values (4, 106);
insert into employee_client (employee_id, client_id) values (4, 107);
insert into employee_client (employee_id, client_id) values (4, 108);
insert into employee_client (employee_id, client_id) values (5, 102);
insert into employee_client (employee_id, client_id) values (5, 104);
insert into employee_client (employee_id, client_id) values (5, 105);
insert into employee_client (employee_id, client_id) values (5, 106);
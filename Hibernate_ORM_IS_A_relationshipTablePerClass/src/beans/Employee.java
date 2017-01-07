package beans;

public class Employee {
private int id,salary;
private String name,email;

public Employee() {
}

public Employee(int id, int salary, String name, String email) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.email = email;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}

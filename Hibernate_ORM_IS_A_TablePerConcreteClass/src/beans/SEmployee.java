package beans;

public class SEmployee extends Employee {
private String tool;

public SEmployee(int id, int salary, String name, String email, String tool) {
	super(id, salary, name, email);
	this.tool = tool;
}
public SEmployee() {
}
public String getTool() {
	return tool;
}
public void setTool(String tool) {
	this.tool = tool;
}
	
}

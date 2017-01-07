package beans;

public class HEmployee extends Employee {
private int wh;
public HEmployee() {
}
public HEmployee(int id, int salary, String name, String email, int wh) {
	super(id, salary, name, email);
	this.wh = wh;
}
public int getWh() {
	return wh;
}
public void setWh(int wh) {
	this.wh = wh;
}



}

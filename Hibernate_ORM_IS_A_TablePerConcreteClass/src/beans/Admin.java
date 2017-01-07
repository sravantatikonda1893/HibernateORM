package beans;

public class Admin extends Employee {

	private String branchName;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Admin(int id, String name, String email, int salary, String branchName) {
		super(id, salary, name, email);
		this.branchName = branchName;
	}
	public Admin() {
	}
}

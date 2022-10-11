package n2duc.lab3;

import java.util.Scanner;

public class Professor extends Person {
	private String department;
	
	public Professor() {}
	public Professor(String code, String name, int rank, String department) {
		super(code, name, rank);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.intput();
		System.out.println("Enter Department: ");
		this.department = sc.nextLine();
	}
	@Override
	public String description() {
		if(this.rank == 0) {
			return "None";
		} else if (this.rank == 1) {
			return "Assistant Professor";
		} else if (this.rank == 2) {
			return "Associate Professor";
		} else if (this.rank == 3) {
			return "Professor";
		} else if (this.rank == 4) {
			return "Assistant Teaching Professor";
		} else if (this.rank == 5) {
			return "Associate Teaching Professor";
		} else if (this.rank == 6) {
			return "Teaching Professor";
		} else {
			return "Undefined";
		}
	}
	public void display() {
		super.display();
		System.out.println("Department: " + this.department);
		description();
	}
	@Override
	public String toString() {
		return "Professor [" +
				"department=" + department + 
				", code=" + code + 
				", name=" + name + 
				", rank=" + rank + 
				"]";
	}
	
}

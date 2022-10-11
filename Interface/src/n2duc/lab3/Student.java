package n2duc.lab3;

import java.util.Scanner;

public class Student extends Person {
	private String degreeProgram;
	private int yearGraduation;
	
	public Student() {
		
	}
	public Student(String code, String name, int rank, String degreeProgram, int yearGradution) {
		super(code, name, rank);
		this.degreeProgram = degreeProgram;
		this.yearGraduation = yearGradution;
	}
	

	public String getDegreeProgram() {
		return degreeProgram;
	}
	public void setDegreeProgram(String degreeProgram) {
		this.degreeProgram = degreeProgram;
	}
	public int getYearGraduation() {
		return yearGraduation;
	}
	public void setYearGraduation(int yearGraduation) {
		this.yearGraduation = yearGraduation;
	}
	
	public void input() {
		super.intput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Degree Program: ");
		this.degreeProgram = sc.nextLine();
		System.out.println("Enter YearGradution: ");
		this.yearGraduation = sc.nextInt();
	}
	
	
	@Override
	public String description() {
		if(this.rank == 0) {
			return "None";
		} else if(this.rank == 1) {
			return "Freshman";
		} else if(this.rank == 2) {
			return "Sophomore";
		} else if(this.rank == 3) {
			return "Junior";
		} else if(this.rank == 4) {
			return "Senior";
		} else if(this.rank == 5) {
			return "Graduate";
		} else if(this.rank == 6) {
			return "Masters Postgraduate";
		} else if(this.rank == 7) {
			return "PhD Postgraduate";
		} else {
			return "Undefined";
		}
	}
	
	public void display() {
		super.display();
		System.out.println("Degree Program: " + this.degreeProgram);
		System.out.println("Year Of Gradution: " + this.yearGraduation);
		description();
	}
	@Override
	public String toString() {
		return "Student [" + 
				"degreeProgram=" + degreeProgram + 
				", yearGraduation=" + yearGraduation + 
				", code=" + code + 
				", name=" + name + 
				", rank=" + rank + 
				"]";
	}
	
}

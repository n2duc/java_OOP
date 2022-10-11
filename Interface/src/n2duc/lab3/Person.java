package n2duc.lab3;

import java.util.Scanner;

public abstract class Person {
	protected String code;
	protected String name;
	protected int rank;
	
	public Person() {}
	
	public Person(String code, String name, int rank) {
		this.code = code;
		this.name = name;
		this.rank = rank;
	}

	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}

	public abstract String description();
	
	public void display() {
		System.out.println("Employee code: " + code);
		System.out.println("Employee name: " + name);
		System.out.println("Rank: " + rank);
	}
	
	public void intput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		this.code = sc.nextLine();
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		System.out.println("Enter rank: ");
		this.rank = Integer.parseInt(sc.nextLine());
	}
}

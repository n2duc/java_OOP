package n2duc;

import java.util.*;

public class Employee implements Comparable {
	String name;
	int age;
	
//	Employee(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Age: ");
		age = sc.nextInt();
	}
	void output() {
		System.out.println("Name: " + name + "\nAge: " + age);
	}
	public int compareTo(Employee e) {
		if(this.age == e.age) {
			return 0;
		} else if(this.age > e.age) {
			return 1;
		} else {
			return -1;
		}
	}
	@Override
	public int compareTo(Object o) {
		return compareTo(o);
	}
	public static void main(String[] args) {
//		ArrayList<Employee> le = new ArrayList<Employee>();
//		le.add(new Employee("Duc", 19));
//		le.add(new Employee("Thuong", 19));
//		Collections.sort(le);
//		for(Employee ep:le) {
//			System.out.println(ep.name + " " + ep.age);
//		}
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.input(); e2.input();
		if(e1.compareTo(e2) > 0) {
			System.out.println("E1 > E2");
		} else if(e1.compareTo(e2) == 0) {
			System.out.println("E1 = E2");
		} else {
			System.out.println("E1 < E2");
		}
	}

}

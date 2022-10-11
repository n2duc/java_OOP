package n2duc.lab3;

import java.util.Scanner;

public class PersonList {
	private Person[] ps;
	private int n;
	Scanner sc = new Scanner(System.in);
	
	public PersonList() {
		System.out.println("Enter invoice number: ");
		this.n = Integer.parseInt(sc.nextLine());
		ps = new Person[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Professor OR Student (0/1) ?");
			int choose = sc.nextInt();
			if(choose == 0) {
				ps[i] = new Professor();
				ps[i].intput();
			} else if(choose == 1) {
				ps[i] = new Student();
				ps[i].intput();
			}
		}
	}
	public void displayAll() {
		System.out.println("Enter Rank: ");
		int rankClone = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(rankClone == ps[i].getRank()) {
				ps[i].display();
			}
		}
	}
	public void average() {
		int temp = 0;
		for(int i=0; i<n; i++) {
			temp += ps[i].rank;
		}
		float avg = (float)temp/n;
		System.out.println("Average: " + avg);
	}
	public void maxRank() {
		Person max = ps[0];
		for(int i=0; i<n; i++) {
			if(max.getRank() == ps[0].getRank()) {
				max = ps[i];
			}
		}
		System.out.println("Max Rank: ");
		max.display();
	}
	public void removePerson() {
		System.out.println("Enter Person Code to Remove: ");
		String codeRemove = sc.nextLine();
		int co = 0, k = 0;
		
		for(Person p:ps) {
			if(p.getCode().compareTo(codeRemove)==0) {
				co = 1;
				break;
			}
		}
		if(co == 1) {
			Person[] temp = new Person[n-1];
			for(int i=0; i<n; i++) {
				if(ps[i].getCode().compareTo(codeRemove) != 0) {
					temp[k++] = ps[i];
				}
			}
			n = n -1;
			ps = temp;
			System.out.println("Done!");
		} else {
			System.out.println("No Person Found!");
		}
	}
	public static void main(String[] args) {
		PersonList pL = new PersonList();
		pL.displayAll();
		pL.average();
		pL.maxRank();
		pL.removePerson();
	}

}

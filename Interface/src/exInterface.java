interface printable {
	void print();
}
//interface showable {
//	void show();
//}

interface showable extends printable {
	void show();
}

public class exInterface implements showable {
	public void print() {
		System.out.println("Welcome");
	}
	public void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
//		printable b = new printable(); Error
//		printable b = new exInterface();
//		b.print();
		
		exInterface obj = new exInterface();
		obj.print();
		obj.show();

	}

}

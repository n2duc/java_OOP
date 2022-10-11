
abstract class Bike {
	int limit = 30;
	Bike(){
		System.out.println("constructor in invoked");
	}
	void getDetails() {
		System.out.println("it has two wheels");
	}
	abstract void run();
}

public class abstractClass extends Bike {
	void run() {
		System.out.println("running safely...");
	}
	public static void main(String[] args) {
		Bike obj = new abstractClass();
		obj.run();
		obj.getDetails();
	}
}

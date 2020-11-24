package Opgave1;

public class Staff {
	public static void main(String[] args) {
		Person adam = new Person();
		Boss bill = new Boss();
		Programmer carl = new Programmer();
		JavaProgrammer dean = new JavaProgrammer("Dean");
		JavaProgrammer eric = new JavaProgrammer("Eric");

		printInfo(adam, "adam");
		printInfo(bill, "bill");
		printInfo(carl, "carl");
		printInfo(dean, "");
		printInfo(eric, "");
	}

	static void printInfo(Person p, String varName) {
		var name = varName == "" ? p : varName;
		System.out.println(p.getClass().getName() + " " + name);
	}
}
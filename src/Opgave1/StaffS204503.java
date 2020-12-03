package Opgave1;

public class Staff {
	public static void main(String[] args) {
		Person adam = new Person();
		Boss bill = new Boss();
		Programmer carl = new Programmer();
		JavaProgrammer dean = new JavaProgrammer("Dean");
		JavaProgrammer eric = new JavaProgrammer("Eric");

		System.out.println("adam " + adam);
		System.out.println("bill " + bill);
		System.out.println("carl " + carl);
		System.out.println("dean " + dean);
		System.out.println("eric " + eric);
	}
}

// s204503
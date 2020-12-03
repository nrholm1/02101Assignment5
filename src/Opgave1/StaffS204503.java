package Opgave1;

public class StaffS204503 {
	public static void main(String[] args) {
		PersonS204503 adam = new PersonS204503();
		BossS204503 bill = new BossS204503();
		ProgrammerS204503 carl = new ProgrammerS204503();
		JavaProgrammerS204503 dean = new JavaProgrammerS204503("Dean");
		JavaProgrammerS204503 eric = new JavaProgrammerS204503("Eric");

		// S204503 added to class names as well -> a bit uglier but still works as intended ¯\_(ツ)_/¯
		System.out.println("adam " + adam);
		System.out.println("bill " + bill);
		System.out.println("carl " + carl);
		System.out.println("dean " + dean);
		System.out.println("eric " + eric);
	}
}

// s204503
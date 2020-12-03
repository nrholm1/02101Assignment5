package Opgave1;

public class JavaProgrammerS204503 extends ProgrammerS204503 {
	String code;

	public String toString() {
		return super.toString() + " | Code: " + this.code;
	}

	public JavaProgrammerS204503(String _code) {
		this.code = _code;
	}
}

// s204503
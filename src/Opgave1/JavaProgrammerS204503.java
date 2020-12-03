package Opgave1;

public class JavaProgrammer extends Programmer {
	String code;

	public String toString() {
		return super.toString() + " | Code: " + this.code;
	}

	public JavaProgrammer(String _code) {
		this.code = _code;
	}
}

// s204503
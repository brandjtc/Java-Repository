
public class passmain {

	public static void main(String[] args) {
		Password pass1 = new Password("iu1^&911FF");
		Password pass2 = new Password("fiabfiu&232hfb!");
		System.out.println("Password 1 is valid: " +pass1.validatePassword());
		System.out.println("Password 2 is valid: " +pass2.validatePassword());

	}

}

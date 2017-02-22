import java.io.PrintStream;

public class NegativeNumberException extends Exception {
 String message;
	public static void main(String[] args) {
		
	}

	public NegativeNumberException() {
		super();
		System.out.println("Age Can not be negative enter positive number");
	}

	public NegativeNumberException(String message) {
		super(message);
		this.message=message;
	
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	
	}

}

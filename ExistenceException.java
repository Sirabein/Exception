package exception;

public class ExistenceException extends Exception {

	ExistenceException(double i) {
		super("Triangle does not exist! Side length '" + i + "' is to long!");
	}
}

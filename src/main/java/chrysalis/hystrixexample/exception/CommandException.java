package chrysalis.hystrixexample.exception;

public class CommandException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommandException() {
		// TODO Auto-generated constructor stub
	}

	public CommandException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CommandException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public CommandException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CommandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

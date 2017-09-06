package chrysalis.hystrixexample.exception;

public class FallbackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FallbackException() {
		// TODO Auto-generated constructor stub
	}

	public FallbackException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FallbackException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public FallbackException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FallbackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

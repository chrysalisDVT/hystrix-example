package chrysalis.hystrixexample.risk;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;

import chrysalis.hystrixexample.exception.CommandException;
import chrysalis.hystrixexample.exception.FallbackException;

public class HystrixFallbackHandler {

	public HystrixFallbackHandler() {
	}

	/*
	 * I have noticed that the command method should be the first one to be
	 * invoked i.e if we call a() -> b() : a() invokes b() . Here if b() is the
	 * command method and c() is it's fallback 1. If the flow is a()-> b() then
	 * the fallback is not executing at all.
	 * 
	 */
	@SuppressWarnings("unchecked")
	// As no specific exceptions are mentioned in ignoreExceptions then all
	// exceptions from this methods should be thrown as HystrixRuntimeExceptionss
	@HystrixCommand(fallbackMethod = "fall", raiseHystrixExceptions = { HystrixException.RUNTIME_EXCEPTION })
	public <T> T getInfo(boolean fail) {

		if (fail) {
			throw new CommandException("Command failed....falling back");
		} else {

			return (T) "Working on hystrix";
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T fall(boolean fail) {
		/*
		 * What i am expecting is that as the fallback has also failed then we
		 * should get HystrixRuntimeException
		 * 
		 * Reference:
		 * https://cloud.githubusercontent.com/assets/1413873/4875441/0daa6986-
		 * 6297-11e4-987a-f43ad47ed0b2.png
		 */
		System.out.println(">>Fallback<<");
		if (fail) {
			throw new FallbackException("Fallback failed....");
		} else {
			return (T) "Fallback";
		}
	}
}

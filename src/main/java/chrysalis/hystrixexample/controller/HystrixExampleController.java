package chrysalis.hystrixexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import chrysalis.hystrixexample.risk.HystrixFallbackHandler;

/**
 * @author dharmVT
 *
 */
@RequestMapping(value = "/api")
public class HystrixExampleController {
	@Autowired HystrixFallbackHandler hfh;

	@GetMapping(value = "/info")
	public String getAppInfo(@RequestParam(name = "tofail") boolean fail) {
		return hfh.getInfo(fail);
	}


}

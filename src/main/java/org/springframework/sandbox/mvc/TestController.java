package org.springframework.sandbox.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/foo")
	@ResponseBody
	public String handleFoo() {
		return "Hello world";
	}

}

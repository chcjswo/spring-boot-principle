package me.mocadev.springbootprinciple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-25
 **/
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(String name) {
		return "hello~ " + name;
	}
}

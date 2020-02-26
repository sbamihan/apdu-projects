package ph.com.apdu.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}

@RestController
class MainController {

	@GetMapping
	public String welcome() {
		return "Welcome!";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}
	
	@GetMapping("/fuck")
	public String fuck() {
		return "Fuck you!";
	}
}

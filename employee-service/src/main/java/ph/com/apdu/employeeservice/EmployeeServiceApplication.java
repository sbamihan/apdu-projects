package ph.com.apdu.employeeservice;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import ph.com.apdu.employeeservice.model.Employee;
import ph.com.apdu.employeeservice.model.EmployeeRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}

@Component
class SampleDataCLR implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public SampleDataCLR(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		Collection<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Sherwin", "Amihan", "Male", 34, 14.224));
		employees.add(new Employee("Evelyn", "Amihan", "Female", 34, 13.97));
		employees.add(new Employee("Dianna Claire Marie", "Amihan", "Female", 13, 13.208));
		employees.add(new Employee("Elijah Raye Vel", "Amihan", "Male", 10, 12.192));
		employees.add(new Employee("Brandon Boyd", "Amihan", "Male", 9, 12.446));
		employees.add(new Employee("Tabebe", "Stuffed Toy", "Male", 10, 2.54));

		employees.stream().forEach(e -> employeeRepository.save(e));
		employeeRepository.findAll().forEach(System.out::println);
	}
}

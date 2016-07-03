package org.irian.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * @SpringBootApplications is the same as:
 * 	@Configuration - the class represents a configuration class
 * 	@ComponentScan - scan for classes adnotated with @Component
 * 	@EnableAutoConfiguration - create by default missing beans
 */
public class SpringCloudApplication {

	/**
	 * this launches SpringApplicationContext with the configuration class as parameter
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}

package org.irian.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
/**
 * @SpringBootApplications is the same as:
 * 	@Configuration - the class represents a configuration class
 * 	@ComponentScan - scan for classes adnotated with @Component
 * 	@EnableAutoConfiguration - create by default missing beans
 */
public class SpringCloudApplication extends SpringBootServletInitializer {

	/**
	 * this launches SpringApplicationContext with the configuration class as parameter
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}

	/**
	 * This will be called when running as WAR
	 * @param builder
	 * @return
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringCloudApplication.class);
	}
}

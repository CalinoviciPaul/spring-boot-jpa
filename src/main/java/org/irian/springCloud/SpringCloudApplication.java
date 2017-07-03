package org.irian.springCloud;

import org.irian.springCloud.dao.StoreDao;
import org.irian.springCloud.domain.Product;
import org.irian.springCloud.domain.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

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

	@Autowired
	StoreDao storeDao;

	/*@PostConstruct
	public void init(){
		Set<Product> productSet = new HashSet<>();
		productSet.add(new Product("Product1","Brand1",2));
		productSet.add(new Product("Product2","Brand2",3));
		Store store = new Store("Store1","Address1",productSet);
		storeDao.save(store);
	}
*/
}

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.pluralsight"}) //allows scans for auto wiring
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    //this whole file is commented out to show the power of auto wiring

//    @Bean(name="customerService")
//    public CustomerService getCustomerService() {
//        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository()); //this constructor injection
//        CustomerServiceImpl service = new CustomerServiceImpl(); //this is setter injection
//        //service.setCustomerRepository(getCustomerRepository()); //this is setter injection.not needed with autowired however
//        return service;
//    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}

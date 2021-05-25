package amr.Application;

import amr.Domain.Interfaces.IThingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Application {
	ApplicationContext context =  new ClassPathXmlApplicationContext("bean/constructorInitialzation.xml");
	;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public IThingService BThingService(){
		return context.getBean("thingService", IThingService.class);
	}



}

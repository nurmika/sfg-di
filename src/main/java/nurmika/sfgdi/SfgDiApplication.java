package nurmika.sfgdi;

import nurmika.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}

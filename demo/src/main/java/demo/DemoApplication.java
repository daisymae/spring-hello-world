package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        // expected this to fail, but didn't (later version of Spring?) Yep. @Autowired no longer required.
        InjectedByConstructorService constructorService = (InjectedByConstructorService)ctx.getBean("injectedByConstructorService");

        constructorService.getMessage();

        SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
        setterBasedService.getMessage();
//        HelloWorldImpl helloWorld = (HelloWorldImpl) ctx.getBean("helloWorldImpl");
//        helloWorld.sayHello();
    }
}

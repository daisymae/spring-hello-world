package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // will be managed as SpringBean
public class InjectedByConstructorService {
  private HelloWorldService helloWorldService;

  @Autowired // NOTE: not required in later versions of Spring, but doesn't hurt
  public InjectedByConstructorService(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  public void getMessage() {
    helloWorldService.sayHello();
  }
}

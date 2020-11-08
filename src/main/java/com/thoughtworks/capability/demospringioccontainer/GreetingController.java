package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {

    private final ApplicationContext context;

    @Autowired
    public GreetingController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = context.getBean(GreetingService.class);
        return greetingService.sayHi();
    }
}

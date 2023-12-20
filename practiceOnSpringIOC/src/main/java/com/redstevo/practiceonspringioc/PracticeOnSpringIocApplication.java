package com.redstevo.practiceonspringioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PracticeOnSpringIocApplication {

    public static void main(String[] args)
    {
        //SpringApplication.run(PracticeOnSpringIocApplication.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanConfig.xml");

        StudentDisplay studentDisplay = applicationContext.getBean("studentDisplay", StudentDisplay.class);

        studentDisplay.DisplayDetails();
    }

}

package com.singashi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext classPathXMLApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = classPathXMLApplicationContext.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        classPathXMLApplicationContext.close();
    }
}

package com.stackroute.domain;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        // accessing the bean.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.display();
        //it gave an exception of NoUniqueBeanDefinitionException when we created another movie bean autowired byType
        //Unsatisfied Dependency expressed
        Movie movie2 = context.getBean("movie",Movie.class);
        movie2.display();



    }
}

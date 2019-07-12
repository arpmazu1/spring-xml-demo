package com.stackroute.domain;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        // accessing the bean.xml
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = configurableApplicationContext.getBean("bean", BeanLifecycleDemoBean.class);
        //closing down the application
        configurableApplicationContext.registerShutdownHook();



    }
}

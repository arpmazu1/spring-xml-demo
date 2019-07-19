package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {


    //object of actor
    private Actor actor;
    private ApplicationContext context = null;
    private BeanFactory beanFactory;
    //constructor
    public Movie() {

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    //setActor method
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //displaying all the values of actor
    public void display() {
        System.out.println("The name of the actor is " + actor.getName() +
                "\nThe gender of the actor is :" + actor.getGender() +
                "\nThe age of the actor is :" + actor.getAge());
    }

    //ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        System.out.println("ApplicationContextAware implemented");

    }

    //BeanNameAware
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean Name is : " + beanName);

    }

    //BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("BeanFactoryAware implemented");
    }
}

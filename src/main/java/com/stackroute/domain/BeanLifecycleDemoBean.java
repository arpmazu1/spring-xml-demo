package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    //afterPropertiesSet method for InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean implemented");

    }

    //destroy method for DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean implemented");
    }

    //customInit method
    public void customInit()
    {
        System.out.println("customInit called");
    }

    //customDestroy method
    public void customDestroy()
    {
        System.out.println("customDestroy called");
    }
}


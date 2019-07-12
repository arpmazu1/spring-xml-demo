package com.stackroute.domain;

public class Movie {


    //object of actor
    Actor actor;

    public Movie (){

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
    //setActor method
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //displaying all the values of actor
    public void display()
    {
        System.out.println("The name of the actor is "+ actor.getName()+
                "\nThe gender of the actor is :"+actor.getGender()+
                "\nThe age of the actor is :"+actor.getAge());
    }
}

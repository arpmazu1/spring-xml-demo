package com.stackroute.domain;

public class Movie {
    // creating actor object
    Actor actor;

    //setter
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display function
    public void display()
    {
        System.out.println("The name of the actor is "+ actor.getName()+
                "\nThe gender of the actor is :"+actor.getGender()+
                "\nThe age of the actor is :"+actor.getAge());
    }
}

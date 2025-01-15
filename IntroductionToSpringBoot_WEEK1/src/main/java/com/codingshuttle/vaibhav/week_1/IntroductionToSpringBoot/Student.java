package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Student {

    /*
        We are defining our own Bean that is basically Object
        @Component : Stereotype Annotation
        Other we have @Service @Repository @Controller
        Service ,repository all extends Component .
        it's just a nomenclature we are using to separate things
    */
    void sayHello(){
        System.out.println("Hello hum student hain , Kaise hain aap log");
    }
}

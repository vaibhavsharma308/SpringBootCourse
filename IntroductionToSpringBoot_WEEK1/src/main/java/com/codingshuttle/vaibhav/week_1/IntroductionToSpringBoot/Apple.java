package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    void eatApple(){
        System.out.println("Apple Kha rahe hai hum toh !!!");
        return ;
    }

    @PostConstruct
    void constructMethod(){
        System.out.println("Inside post Construct Method");
    }

    @PreDestroy
    void destroyMethod(){
        System.out.println("Inside Destroy Method !!");
    }
}

package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    Student makeStudent(){
        return new Student();
    }
}

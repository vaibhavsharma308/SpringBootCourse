package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;


import org.springframework.stereotype.Component;

@Component
public class DevelopmentDatabase implements  Database{

    @Override
    public String fetchData(){
        return "Fetching data from Development Database";
    }
}

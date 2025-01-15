package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/*
    Using primary Annotation we tell that we need to give preference to this
     We also this using environment or configuration
 */
@Component
@Primary
public class ProductionDatabase implements Database{

    @Override
    public String fetchData(){
        return "Fetching data from Production Database";
    }
}


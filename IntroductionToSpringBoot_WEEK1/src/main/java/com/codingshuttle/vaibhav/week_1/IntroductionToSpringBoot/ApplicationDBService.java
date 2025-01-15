package com.codingshuttle.vaibhav.week_1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ApplicationDBService {

    @Autowired
    Database database;
    public String useDatabase(){
       return database.fetchData();
    }

}

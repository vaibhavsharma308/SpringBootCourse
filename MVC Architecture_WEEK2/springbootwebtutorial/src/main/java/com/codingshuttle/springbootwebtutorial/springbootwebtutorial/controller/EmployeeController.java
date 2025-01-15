package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*This Define Mapping are rest in Nature
ResponseBody convert json to java Object
if we write @Controller we need to write Response Body
*/
@RestController
public class EmployeeController {

    @GetMapping(path="/getMessage")
    public String getMyMessage(){
        return "Secret Message : Wallet Id"; v
    }
}

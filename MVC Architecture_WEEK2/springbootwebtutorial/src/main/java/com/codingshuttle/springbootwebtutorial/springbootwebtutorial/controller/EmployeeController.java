package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controller;


import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dtos.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


/*This Define Mapping are rest in Nature
ResponseBody convert json to java Object
if we write @Controller we need to write Response Body
Getting data from URL
We HAVE
1.Path Variable : data we want inside URL PART
WE MADE IT. DEFINITELY WE NEED IT mandatory we need to define the path Variable

2.Request Param : filtering ,sorting ,Optional Fields

*/
@RestController
public class EmployeeController {

    @GetMapping(path="/getMessage")
    public String getMyMessage(){
        return "Secret Message : Wallet Id";
    }
    @GetMapping("employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable String employeeId){
        return new EmployeeDTO(
                employeeId,                             // employeeId
                "Vaibhav Sharma",                            // employeeName
                "workwithvaibhav@gmail.com",                // email
                22,                                    // age
                LocalDate.of(2020, 5, 15),             // dateOfJoining
                true                                   // isActive
        );
    }
    @GetMapping("/employees")
    public String getAllEmployees(@RequestParam(required = false,defaultValue = "24") String age
    ,@RequestParam(required=false ,defaultValue = "Vaibhav Sharma") String name ){
        String data= "Return Data Will Be :" + age+" "+name;
        return data;

    }
}

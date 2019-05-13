package com.example.Error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AppController {


    @RequestMapping("/")
    public String hello() throws CustomExp{

        try{

            int i=6;
            int j=i/0;

        }catch (Exception e){
            throw new CustomExp("ajay");
        }

        return "no error";

    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String add(@Valid @RequestBody Emp emp){
        return "success";
    }


    /*@ExceptionHandler(CustomExp.class)
    public String cust(){
        return "custError";
    }*/

}

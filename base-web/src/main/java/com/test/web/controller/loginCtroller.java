package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zyc on 2020/7/3.
 */
@Controller
public class loginCtroller {

   @RequestMapping("/login")
   @ResponseBody
   public String login(){
      return "hello,docker1";
   }
}

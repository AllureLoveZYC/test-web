package com.maven.ssm.controller;

import com.maven.ssm.model.Zyc;
import com.maven.ssm.service.ZycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zyc on 2020/7/14.
 */
@Controller
@RequestMapping("/zyc")
public class ZycController {

   @Autowired
   private ZycService zycService;

   // 展示商品信息页面
   @RequestMapping("/getUser")
   public String showItem(Model model) {
      Zyc zyc = zycService.getUserById(70004);
      model.addAttribute("zyc", zyc);
      return "zyc";
   }

}

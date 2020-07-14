package com.ssm.web.controller;

import com.ssm.web.model.Orders;
import com.ssm.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items/")
public class ItemsController {
@Autowired
private OrderService orderService ;
// 展示商品信息页面
@RequestMapping("/showItem")
public String showItem(int id){
   List<Orders> all = orderService.getAll();
   System.out.println(all.size());
   return "viewItem";
}
}
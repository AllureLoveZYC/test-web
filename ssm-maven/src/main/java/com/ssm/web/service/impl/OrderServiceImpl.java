package com.ssm.web.service.impl;

import com.ssm.web.dao.OrderDao;
import com.ssm.web.model.Orders;
import com.ssm.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zyc on 2020/7/10.
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

   @Autowired
   private OrderDao OrderDao;

   @Override
   public List<Orders> getAll() {
      return (List<Orders>) OrderDao.getAll();
   }
}

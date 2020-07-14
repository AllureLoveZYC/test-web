package com.ssm.web.dao;

import com.ssm.web.model.Orders;

import java.util.List;

/**
 * Created by zyc on 2020/7/10.
 */
public interface OrderDao {


     List<Orders> getAll();
}

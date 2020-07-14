package com.maven.ssm.service.impl;

import com.maven.ssm.dao.ZycDao;
import com.maven.ssm.model.Zyc;
import com.maven.ssm.service.ZycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zyc on 2020/7/14.
 */

@Service
@Transactional
public class ZycServiceImpl implements ZycService {

   @Autowired
   private ZycDao zycDao;



   public Zyc getUserById(int id) {
      return zycDao.getUserById(id);
   }
}

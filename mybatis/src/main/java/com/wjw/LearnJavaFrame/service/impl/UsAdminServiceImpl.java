package com.wjw.LearnJavaFrame.service.impl;

import com.wjw.LearnJavaFrame.dao.UmsAdminDao;
import com.wjw.LearnJavaFrame.model.UmsAdmin;
import com.wjw.LearnJavaFrame.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminDao umsAdminDao;

    @Override
    public UmsAdmin getById(Long id) {
        return umsAdminDao.selectByIdSimple(id);
    }

    @Override
    public void insertUser(UmsAdmin umsAdmin) {
        umsAdminDao.insertUser(umsAdmin);
        System.out.println(umsAdmin);
    }
}

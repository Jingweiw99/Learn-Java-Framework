package com.wjw.LearnJavaFrame.service;

import com.wjw.LearnJavaFrame.model.UmsAdmin;

public interface UmsAdminService {
    UmsAdmin getById(Long id);

    void insertUser(UmsAdmin umsAdmin);
}

package com.wjw.LearnJavaFrame.service.impl;

import com.wjw.LearnJavaFrame.mapper.PmsBrandMapper;
import com.wjw.LearnJavaFrame.model.PmsBrand;
import com.wjw.LearnJavaFrame.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public void insertBrand(PmsBrand brand) {
         pmsBrandMapper.insert(brand);
    }
}

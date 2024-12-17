package com.wjw.LearnJavaFrame.controller;

import com.wjw.LearnJavaFrame.common.api.CommonResult;
import com.wjw.LearnJavaFrame.model.PmsBrand;
import com.wjw.LearnJavaFrame.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    PmsBrandService brandService;

    @PostMapping("/save")
    public CommonResult saveBrand(@RequestBody PmsBrand pmsBrand) {
        brandService.insertBrand(pmsBrand);
        return CommonResult.success("插入商品成功");
    }
}

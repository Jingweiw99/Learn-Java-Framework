package com.wjw.LearnJavaFrame.controller;

import com.wjw.LearnJavaFrame.model.UmsAdmin;
import com.wjw.LearnJavaFrame.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ums")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("")
    public UmsAdmin getById(@RequestParam("id") Long id) {
        return umsAdminService.getById(id);
    }

    @PostMapping("")
    public void insertUser(@RequestBody UmsAdmin umsAdmin) {
        umsAdminService.insertUser(umsAdmin);
    }

}

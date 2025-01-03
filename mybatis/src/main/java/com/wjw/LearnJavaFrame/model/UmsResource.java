package com.wjw.LearnJavaFrame.model;

import lombok.Data;

import java.util.Date;

@Data
public class UmsResource {
    private Long id;
    private Date createTime;
    private String name;
    private String url;
    private String description;
    private Long categoryId;
    private UmsResourceCategory resourceCategory;
}

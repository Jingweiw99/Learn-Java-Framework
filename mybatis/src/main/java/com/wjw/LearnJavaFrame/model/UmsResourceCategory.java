package com.wjw.LearnJavaFrame.model;

import java.util.Date;
import java.util.List;

public class UmsResourceCategory {
    private Long id;

    private Date createTime;

    private String name;

    private Integer sort;

    List<UmsResource> resources;
}

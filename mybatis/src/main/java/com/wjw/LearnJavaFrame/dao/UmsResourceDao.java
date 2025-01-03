package com.wjw.LearnJavaFrame.dao;

import com.wjw.LearnJavaFrame.model.UmsResource;

public interface UmsResourceDao {
    /**
     * 根据资源ID获取资源及分类信息
     */
    UmsResource selectResourceWithCategory(Long id);
}

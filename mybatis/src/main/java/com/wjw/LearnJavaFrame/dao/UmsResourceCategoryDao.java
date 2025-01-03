package com.wjw.LearnJavaFrame.dao;

import com.wjw.LearnJavaFrame.model.UmsResourceCategory;

public interface UmsResourceCategoryDao {
    UmsResourceCategory selectCategoryWithResource(Long id);
}

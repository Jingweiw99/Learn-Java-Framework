package com.wjw.LearnJavaFrame.dao;

import com.wjw.LearnJavaFrame.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminDao {
    /**
     * 根据ID查询用户
     */
    UmsAdmin selectByIdSimple(Long id);

    void insertUser(UmsAdmin umsAdmin);
    /**
     * 根据ID修改用户信息
     */
    int updateById(UmsAdmin entity);
    /**
     * 根据ID删除用户
     */
    int deleteById(Long id);

    /**
     * 根据用户名和Email模糊查询用户
     * 不输入查询所有
     */
    List<UmsAdmin> selectByUsernameAndEmailLike(@Param("username") String username, @Param("email") String email);


}

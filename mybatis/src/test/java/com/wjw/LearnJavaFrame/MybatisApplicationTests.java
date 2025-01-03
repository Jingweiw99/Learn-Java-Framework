package com.wjw.LearnJavaFrame;

import com.wjw.LearnJavaFrame.dao.UmsAdminDao;
import com.wjw.LearnJavaFrame.dao.UmsResourceCategoryDao;
import com.wjw.LearnJavaFrame.dao.UmsResourceDao;
import com.wjw.LearnJavaFrame.model.UmsAdmin;
import com.wjw.LearnJavaFrame.model.UmsResource;
import com.wjw.LearnJavaFrame.model.UmsResourceCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    private UmsAdminDao umsAdminDao;
    @Autowired
    private UmsResourceDao umsResourceDao;
    @Autowired
    private UmsResourceCategoryDao umsResourceCategoryDao;

    @Test
    public void test1() {
        // 测试 updateById
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setId(13l);
        umsAdmin.setPassword("123");
        umsAdminDao.updateById(umsAdmin);
    }

    @Test
    public void test2() {
        umsAdminDao.deleteById(13l);
    }

    @Test
    public void test3() {
        List<UmsAdmin> umsAdmins = umsAdminDao.selectByUsernameAndEmailLike("", "");// 这样返回全部
        System.out.println(umsAdmins);
    }

    @Test
    public void test4() {
        List<UmsAdmin> umsAdmins = umsAdminDao.selectByUsernameAndEmailLike("test", "");// 这样返回全部
        System.out.println(umsAdmins);
    }

    @Test
    public void test5() {
        List<UmsAdmin> umsAdmins = umsAdminDao.selectByUsernameAndEmailLike("ceshi", "qq");// 这样返回全部
        System.out.println(umsAdmins);
    }

    @Test
    public void test6() {
        UmsResource umsResource = umsResourceDao.selectResourceWithCategory(5l);
        System.out.println(umsResource);
    }

    @Test
    public void test7() {
        UmsResourceCategory list = umsResourceCategoryDao.selectCategoryWithResource(1l);
        System.out.println(list);
    }
}

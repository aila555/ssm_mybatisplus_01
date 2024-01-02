package com.aila;

import com.aila.dao.UserDao;
import com.aila.pojo.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SsmMybatisplus01ApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
   void testGetAll(){
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    //新增操作
    @Test
    public void save(){
        User user=new User();
        user.setName("红莲魔尊");
        user.setAge(22);
        user.setTel("123456");
        user.setPassword("aila");
        userDao.insert(user);
//        User user1=new User();
//        user.setName("艾米利亚");
//        user.setAge(14);
//        user.setTel("001");
//        user.setPassword("999");
//        userDao.insert(user1);
    }

    @Test
    public void deleteById(){
     userDao.deleteById(3);
    }

    //更新
@Test
    public void update(){
        User user=new User();
        user.setId(1L);
        user.setName("大爱仙尊");
        userDao.updateById(user);
    }

    @Test
    public void getById(){
        User user = userDao.selectById(1);
        System.out.println(user);
    }
    @Test
    public void getByPage(){
        IPage page=new Page(2,2);//current代表页数,size表示每页有多少条数据
         userDao.selectPage(page, null);
        System.out.println("当前页码是:"+page.getCurrent());
        System.out.println("每页显示数:"+page.getSize());
        System.out.println("一共多少页:"+page.getPages());
        System.out.println("一共多少条数据:"+page.getTotal());
        System.out.println("数据:"+page.getRecords());
    }
}

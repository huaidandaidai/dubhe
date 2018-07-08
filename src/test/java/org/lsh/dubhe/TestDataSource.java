package org.lsh.dubhe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Title: test
 * @Description: 数据源测试
 * @Author: lsh
 * @CreateDate: 2018/7/8 11:23
 * @Version: 1.0
 */
@SpringBootTest(classes = DubheApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDataSource {
    @Resource
    private DataSource dataSource;
    @Test
    public void testConnection(){
        System.out.println(this.dataSource);
    }
}

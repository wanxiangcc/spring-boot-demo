package com.boot.demo.manager;

import com.boot.demo.domain.Learn;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnManagerTest {
    @Autowired
    private LearnManager learnManager;

    /**
     * 如果不想造成垃圾数据，可以开启事物功能@Transactional
     * 如果想关闭回滚，只要加上@Rollback(false)注解即可，默认为true
     */
    @Test
    @Transactional
    @Rollback(false)
    public void add() {
        Learn learn = new Learn();
        learn.setTitle("junit test");
        learn.setUrl("http://www.baidu.com");
        learn.setAuthor("test");
        learnManager.add(learn);
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteByIds() {
    }

    @Test
    public void queryLearnById() {
    }

    @Test
    public void queryLearnList() {
        Learn learnResource = learnManager.queryLearnById(1001L);
        Assert.assertThat(learnResource.getAuthor(), is("嘟嘟MD独立博客"));
    }
}
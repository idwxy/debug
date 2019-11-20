package com.idwxy.debug;

import com.idwxy.debug.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemo2 {

    @Autowired
    private TestService testService;

    @Test
    public void sayHelloTest() {
        // sayHello 方法测试
        System.out.println(testService.sayHello("admin"));
    }
}

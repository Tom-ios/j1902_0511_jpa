package com.qj.j1902.jpatest;

import com.qj.j1902.entity.Person;
import com.qj.j1902.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Qxk on 2019/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.j1902.service")
public class JpaTest {
    private PersonRepository repository;
    @Test
    public void test1(){
        List<Person> all = repository.findAll();
        for (Person p:all ) {
            System.out.println(p);

        }
    }
}

package com.qj.j1902.service;

import com.qj.j1902.entity.Person;
import com.qj.j1902.vo.PersonVo;

import java.util.List;

/**
 * Created by Qxk on 2019/6/11.
 */
public interface PersonService {
    public void addPerson(PersonVo personVo);
    public List<Person> findAll();
    public void del(Integer id);
}

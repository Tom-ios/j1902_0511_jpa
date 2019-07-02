package com.qj.j1902.service.impl;

import com.qj.j1902.entity.Person;
import com.qj.j1902.repository.PersonRepository;
import com.qj.j1902.service.PersonService;
import com.qj.j1902.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Qxk on 2019/6/11.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public void addPerson(PersonVo personVo) {
        Person person=new Person();
        person.setId(personVo.getId());
        person.setName(personVo.getName());
        person.setAge(personVo.getAge());

        personRepository.save(person);

    }

    @Override
    public List<Person> findAll() {

        return personRepository.findAll();
    }

    @Override
    public void del(Integer id) {
        personRepository.deleteById(id);
    }
}

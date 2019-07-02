package com.qj.j1902.repository;

import com.qj.j1902.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qxk on 2019/6/11.
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
}

package com.qj.j1902.personcontroller;

import com.qj.j1902.entity.Person;
import com.qj.j1902.service.PersonService;
import com.qj.j1902.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Qxk on 2019/6/11.
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping(value = "/person/add",method = RequestMethod.POST)
    public String add(PersonVo personVo){
        personService.addPerson(personVo);
        return "redirect:/persons";
    }
    @RequestMapping(value = "/persons")
    public String findAll(Model model){
        List<Person> all = personService.findAll();
        model.addAttribute("persons",all);
        return "list";
    }
    @RequestMapping(value = "del",method = RequestMethod.GET)
    public String del(@RequestParam("pid") int id){
        personService.del(id);
        return "redirect:/list";
    }
}

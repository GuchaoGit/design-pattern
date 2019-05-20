package com.guc.pattern.pattern.filter;

import com.guc.pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guc
 * @Date 2019/5/20 14:30
 * @Description 过滤单身
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

package com.guc.pattern.pattern.filter;

import com.guc.pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author guc
 * @Date 2019/5/20 14:28
 * @Description 过滤男人
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

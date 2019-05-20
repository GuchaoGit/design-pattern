package com.guc.pattern.pattern.filter;

import com.guc.pattern.entity.Person;

import java.util.List;

/**
 * @Author guc
 * @Date 2019/5/20 14:42
 * @Description 两个过滤条件都满足
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}

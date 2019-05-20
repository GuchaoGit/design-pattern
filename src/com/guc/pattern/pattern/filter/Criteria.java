package com.guc.pattern.pattern.filter;

import com.guc.pattern.entity.Person;

import java.util.List;

/**
 * 为标准创建一个接口，过滤接口
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}

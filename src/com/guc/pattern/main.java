package com.guc.pattern;

import com.guc.pattern.entity.Circle;
import com.guc.pattern.entity.Person;
import com.guc.pattern.entity.Product;
import com.guc.pattern.generics.Box;
import com.guc.pattern.generics.GenericsUtils;
import com.guc.pattern.inface.IShape;
import com.guc.pattern.pattern.*;
import com.guc.pattern.pattern.decorator.RedShapeDecorator;
import com.guc.pattern.pattern.decorator.ShapeDecorator;
import com.guc.pattern.pattern.filter.AndCriteria;
import com.guc.pattern.pattern.filter.CriteriaMale;
import com.guc.pattern.pattern.filter.CriteriaSingle;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        System.out.println("this is start");

        System.out.println("工厂模式示例：");
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        System.out.println("");
        System.out.println("单例模式示例：");
        SingletonObject.getInstance().showMessage();
        SingletonObject3.getInstance().showMessage();
        SingletonObject2.getInstance().showMessage();

        System.out.println("");
        System.out.println("建造者模式示例：");
        Product apple = new ProductBuilder().setName("苹果").setCategory("水果").setPrice(9.98f).build();
        System.out.println(apple.toString());

        System.out.println("******************************");
        System.out.println("泛型使用示例：");
        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n",
                3, 4, 5, GenericsUtils.maximum( 3, 4, 5 ) );
        Box<Integer> intBox = new Box<>(6);
        Box<String> strBox = new Box<>("字符串泛型");
        System.out.printf("整型值为%d\n",intBox.get());
        System.out.printf("字符串值为%s\n",strBox.get());

        List<String> name = new ArrayList<String>();
        name.add("helloworld");
        GenericsUtils.getData(name);

        System.out.println("");
        System.out.println("*******************************");
        System.out.println("过滤器模式：");
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
        CriteriaMale male = new CriteriaMale();
        CriteriaSingle single = new CriteriaSingle();
        AndCriteria singleMale = new AndCriteria(male,single);
        System.out.println("男士：");
        printPersons(male.meetCriteria(persons));
        System.out.println("单身：");
        printPersons(single.meetCriteria(persons));
        System.out.println("单身男士：");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("*******************************");
        System.out.println("装饰者模式：");
        IShape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}

package com.github.gongfuboy.lambda.demo.group;

import com.github.gongfuboy.lambda.demo.pojo.Person;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * grouping lambda use case
 *
 * Created by ZhouLiMing on 2019/5/31.
 */
public class GroupLambda {


    /**
     * groupingBy demo
     */
    public static void groupingBy() {

        List<Person> personList = Arrays.asList(new Person(18, "Jack"), new Person(19, "Tom"),
                new Person(18, "Jack"));
        System.out.println(personList);
        Map<Pair, List<Person>> groupedMap =
                personList.stream().collect(Collectors.groupingBy(person -> Pair.of(person.getAge(), person.getName())));
        System.out.println(groupedMap);
    }

    public static void main(String[] args) {
        groupingBy();
    }

}

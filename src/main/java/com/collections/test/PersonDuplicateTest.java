package com.collections.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Test Class that identifies duplicates between single person and married person collection
 * and removes the duplicates.
 */
public class PersonDuplicateTest {

    /**
     * Main Method that will be used for removing duplicates.
     *
     * @param args arguments
     */
    public static void main(String[] args) {

        /* List of Single person Initialization */
        final List<SinglePerson> personList = new ArrayList<>();
        personList.add(new SinglePerson("John", "Smith", 22));
        personList.add(new SinglePerson("Jane", "Smith", 34));
        personList.add(new SinglePerson("Jonah", "Smith", 12));
        personList.add(new SinglePerson("Jonah", "Smith", 12));

        /* List of MarriedPerson person Initialization */
        final List<MarriedPerson> marriedPersonList = new ArrayList<>();
        marriedPersonList.add(new MarriedPerson("John", "Smith", 22, "Mary"));
        marriedPersonList.add(new MarriedPerson("Jane", "Smith", 34, "John"));
        marriedPersonList.add(new MarriedPerson("Jane", "Smith", 34, "John"));

        /* Adding in the insertion order and removing duplicates */
        final Set allPersonUniqueSet = new LinkedHashSet(personList);
        allPersonUniqueSet.addAll(marriedPersonList);
        allPersonUniqueSet.forEach(System.out::println);


    }
}

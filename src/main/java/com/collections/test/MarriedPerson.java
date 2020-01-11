package com.collections.test;

import java.util.Objects;

/**
 * <code>MarriedPerson</code> Immutable Class which represents person who is married.
 */
public final class MarriedPerson {

    /**
     * Field Parameter for firstName.
     */
    private final String firstName;
    /**
     * Field Parameter for lastName.
     */
    private final String lastName;
    /**
     * Field Parameter for age.
     */
    private final int age;
    /**
     * Field Parameter for spouse name.
     */
    private final String spouse;

    /**
     * Constructor which will be used for intializing the object values.
     *
     * @param firstName first name
     * @param lastName  last name
     * @param age       age
     * @param spouse    spouse name
     */
    public MarriedPerson(String firstName, String lastName, int age, String spouse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.spouse = spouse;
    }

    /**
     * Method that returns a toString representation.
     *
     * @return toString value
     */
    @Override
    public String toString() {
        return firstName + "," + lastName + "," + age + " " + "(Married)";
    }


    /**
     * Method that returns the first name.
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Method that returns the age.
     * @return age.
     */
    public int getAge() {
        return age;
    }


    /**
     * Method that returns the spouse name.
     * @return spouse.
     */
    public String getSpouse() {
        return spouse;
    }


    /**
     * Returns hashcode based on property values.
     * @return hashcode value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, spouse);
    }

    /**
     * Method overriding equals that will be used for comparing same objects.
     * @param obj object value
     * @return true or false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MarriedPerson person = (MarriedPerson) obj;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) && Objects.equals(spouse, person.spouse);
    }
}

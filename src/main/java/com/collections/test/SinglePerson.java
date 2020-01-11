package com.collections.test;

import java.util.Objects;

/**
 * <code>SinglePerson</code> Immutable Class which represents person who is single and unmarried.
 */
public final class SinglePerson {

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
     * Constructor that will be used for initializing object values.
     *
     * @param firstName first name
     * @param lastName  last name
     * @param age       age
     */
    public SinglePerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    /**
     * Method that gets the first name.
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Method that gets the last name.
     *
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Method that returns the age.
     *
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Method overriding equals that will be used for comparing same objects.
     *
     * @param o object value
     * @return true or false
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinglePerson person = (SinglePerson) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    /**
     * Returns hashcode based on property values.
     *
     * @return hashcode value
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }


    /**
     * Method that returns a toString representation.
     *
     * @return toString value
     */
    @Override
    public String toString() {
        return firstName + "," + lastName + "," + age + " " + "(Single)";
    }

}

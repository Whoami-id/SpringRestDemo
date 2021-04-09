
package com.luv2code.springdemo.entity;

public class Student {

    private String firsName;
    private String lastName;

    public Student(final String firsName, final String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public Student() {
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(final String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

}

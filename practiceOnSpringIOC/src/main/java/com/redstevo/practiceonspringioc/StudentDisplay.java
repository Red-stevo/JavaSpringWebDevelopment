package com.redstevo.practiceonspringioc;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDisplay {

    /*Here I am going to use the autowire annotation.
    * Annotation config can be archived in several ways
    *   1. Autowire by type.
    *   2. Autowire by name.
    *   3.Constructor autowiring.
    *   .
    *   .
    * */

    //Here I am going to archive autowiring by use a constructor to inject object
    // dependencies to the studentDisplay object.


    Student student = new Student();
    @Autowired
    public StudentDisplay(Student student) {
        this.student = student;
    }

    public void DisplayDetails()
    {
        System.out.println(student.getfName() + " " + student.getsName());
        System.out.println(student.getRegNo()+ " " +student.getAge());
    }
}

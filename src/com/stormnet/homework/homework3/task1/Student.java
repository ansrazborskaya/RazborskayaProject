package com.stormnet.homework.homework3.task1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private Date dateOfBirthday;
    private int course;

    public Student(String name, String surname, Date dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        for (Student student : students) {

            if (student.getCourse() == course) {

                System.out.println("Student: " + student.getName() + " " + student.getSurname() + " " + "\n" + "Date of birth: " + formatter.format(student.getDateOfBirthday()));
            }
        }
    }
}

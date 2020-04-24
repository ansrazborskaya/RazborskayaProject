package com.stormnet.homework.homework3.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Start {

    public static void main(String[] args) throws ParseException {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Fedor", "Ivanov", new SimpleDateFormat("dd/MM/yyyy").parse("19/05/2001"), 4));
        students.add(new Student("Hanna", "Petrova", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1991"), 5));
        students.add(new Student("Alex", "Alexandrov", new SimpleDateFormat("dd/MM/yyyy").parse("15/02/2001"), 4));
        students.add(new Student("Nik", "Nikonov", new SimpleDateFormat("dd/MM/yyyy").parse("17/01/2000"), 4));

        Student.printStudents(students, 4);

    }
}

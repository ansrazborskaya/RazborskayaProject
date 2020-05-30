package com.stormnet.homework.homework8.task1;

public class Employee {

    private String surname, name, patronymic, position, department, workExperience;

    public Employee(String surname, String name, String patronymic, String position, String department, String workExperience) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.department = department;
        this.workExperience = workExperience;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getWorkExperience() {
        return workExperience;
    }
}

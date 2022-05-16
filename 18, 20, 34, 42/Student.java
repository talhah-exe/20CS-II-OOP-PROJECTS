package com.halfcell.blank;

public class Student {

    private int id;
    private String rollNumber;
    private String name;
    private String surname;
    private int age;
    private String department;
    private String cgpa;

    public Student() {
    }

    public Student(int id, String rollNumber, String name, String surname, int age, String department, String cgpa) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return this.id + "," + this.rollNumber + ","+ this.name + "," + this.surname + "," + this.age + "," + this.department + "," + this.cgpa;
    }
}

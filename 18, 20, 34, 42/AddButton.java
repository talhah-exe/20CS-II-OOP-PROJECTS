package com.halfcell.blank;

public class AddButton extends Button {

    private Students students;

    public AddButton(String text, Students students) {
        super(text);
        this.students = students;
    }

    public void addStudent(Table table, String id, String rollNumber, String name, String surname, String age, String department, String cgpa) {

        Student student = new Student(Integer.parseInt(id), rollNumber, name, surname, Integer.parseInt(age), department, cgpa);

        int index = this.students.getStudents().size();
        for (int i = this.students.getStudents().size() - 1; i >= 0; i--)
        {
            if (Integer.parseInt(id) > students.getStudents().get(i).getId()) {
                break;
            }
            index--;
        }

        table.insertRow(index, id, rollNumber, name, surname, age, department, cgpa);
        this.students.addStudent(index, student);
    }
}

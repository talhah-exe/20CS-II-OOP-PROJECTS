package com.halfcell.blank;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JPanel implements ActionListener {

    private int width;
    private int height;
    private int fieldContainerHeight;
    private int buttonContainerHeight;
    private Students students;
    private Table table;
    private JPanel fieldContainer;
    private JPanel buttonContainer;
    private JLabel id;
    private JTextField idText;
    private JLabel rollNumber;
    private JTextField rollNumberText;
    private JLabel name;
    private JTextField nameText;
    private JLabel surname;
    private JTextField surnameText;
    private JLabel age;
    private JTextField ageText;
    private JLabel department;
    private JTextField departmentText;
    private JLabel cgpa;
    private JTextField cgpaText;
    private AddButton addButton;
    private EditButton editButton;
    private SaveButton saveButton;
    private DeleteButton deleteButton;

    public Form(int width, int height, Students students, Table table) {
        this.width = width / 3;
        this.height = height;
        this.fieldContainerHeight = 300;
        this.buttonContainerHeight = 25;
        this.setPreferredSize(new Dimension(this.width, this.height));

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);

        this.students = students;
        this.table = table;

        this.fieldContainer = new JPanel();
        this.fieldContainer.setLayout(new GridLayout(9, 2, 0, 5));
        this.fieldContainer.setPreferredSize(new Dimension(this.width - 10, this.fieldContainerHeight));
        this.fieldContainer.setBackground(Color.darkGray);
        this.buttonContainer = new JPanel();
        this.buttonContainer.setLayout(new GridLayout(1, 4, 10, 0));
        this.buttonContainer.setPreferredSize(new Dimension(this.width - 10, this.buttonContainerHeight));
        this.buttonContainer.setBackground(Color.darkGray);

        this.id = new JLabel("ID");
        id.setFont(font);
        this.id.setForeground(Color.LIGHT_GRAY);
        this.idText = new JTextField();
        this.idText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
        this.setUpIdTextField();

        this.rollNumber = new JLabel("Roll Number");
        rollNumber.setFont(font);
        this.rollNumber.setForeground(Color.LIGHT_GRAY);
        this.rollNumberText = new JTextField();
        this.rollNumberText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.name = new JLabel("Name");
        name.setFont(font);
        this.name.setForeground(Color.LIGHT_GRAY);
        this.nameText = new JTextField();
        this.nameText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.surname = new JLabel("Surname");
        surname.setFont(font);
        this.surname.setForeground(Color.LIGHT_GRAY);
        this.surnameText = new JTextField();
        this.surnameText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.age = new JLabel("Age");
        age.setFont(font);
        this.age.setForeground(Color.LIGHT_GRAY);
        this.ageText = new JTextField();
        this.ageText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.department = new JLabel("Department");
        department.setFont(font);
        this.department.setForeground(Color.LIGHT_GRAY);
        this.departmentText = new JTextField();
        this.departmentText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.cgpa = new JLabel("CGPA");
        cgpa.setFont(font);
        this.cgpa.setForeground(Color.LIGHT_GRAY);
        this.cgpaText = new JTextField();
        this.cgpaText.setBorder(BorderFactory.createLineBorder(Color.gray, 5));

        this.addButton = new AddButton("Add", this.students);
        this.addButton.setBackground(Color.lightGray);
        this.addButton.addActionListener(this);

        this.editButton = new EditButton("Edit");
        this.editButton.setBackground(Color.lightGray);
        this.editButton.addActionListener(this);

        this.saveButton = new SaveButton("Save");
        this.saveButton.setBackground(Color.lightGray);
        this.saveButton.addActionListener(this);

        this.deleteButton = new DeleteButton("Delete");
        this.deleteButton.setBackground(Color.lightGray);
        this.deleteButton.addActionListener(this);

        this.fieldContainer.add(this.id);
        this.fieldContainer.add(this.idText);
        this.fieldContainer.add(this.rollNumber);
        this.fieldContainer.add(this.rollNumberText);
        this.fieldContainer.add(this.name);
        this.fieldContainer.add(this.nameText);
        this.fieldContainer.add(this.surname);
        this.fieldContainer.add(this.surnameText);
        this.fieldContainer.add(this.age);
        this.fieldContainer.add(this.ageText);
        this.fieldContainer.add(this.department);
        this.fieldContainer.add(this.departmentText);
        this.fieldContainer.add(this.cgpa);
        this.fieldContainer.add(this.cgpaText);

        this.add(this.fieldContainer);

        this.buttonContainer.add(this.addButton, BorderLayout.CENTER);
        this.buttonContainer.add(this.editButton);
        this.buttonContainer.add(this.saveButton);
        this.buttonContainer.add(this.deleteButton);
        this.add(this.buttonContainer);
    }

    private void setUpIdTextField() {

        if (this.students.getStudents().size() > 0) {
            this.idText.setText(Integer.toString(this.students.getStudents().get(this.students.getStudents().size() - 1).getId() + 1));
        }
        else {
            this.idText.setText("1");
        }
        this.idText.setCaretPosition(this.idText.getText().length());
    }

    private boolean validateForm(String id, String rollNumber, String name, String surname, String age, String department, String cpga) {

        boolean isValid = true;

        if (id.trim().equals("") || id.trim().equals(" ") || !this.isNumber(id)) {
            isValid = false;
        }

        if(rollNumber.trim().equals("") || rollNumber.trim().equals(" ")) {
            isValid = false;
        }

        if (name.trim().equals("") || name.trim().equals(" ")) {
            isValid = false;
        }
        if (surname.trim().equals("") || surname.trim().equals(" ")) {
            isValid = false;
        }

        if (age.trim().equals("") || age.trim().equals(" ") || !this.isNumber(age)) {
            isValid = false;
        }

        if (department.trim().equals("") || department.trim().equals(" ")) {
            isValid = false;
        }

        if (cpga.trim().equals("") || cpga.trim().equals(" ")) {
            isValid = false;
        }

        return isValid;
    }

    private boolean isNumber(String input) {
        // Checks if the passed input is a number to validate id and age

        try {
            Integer.parseInt(input);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    private boolean checkIdExists(int id) {
        // Checks if another student already has the given id number to maintain unique id numbers for each student

        for (Student student : this.students.getStudents()) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private void emptyForm() {
        // Empties the form to make form more user-friendly

        this.idText.setText("");
        this.rollNumberText.setText("");
        this.nameText.setText("");
        this.surnameText.setText("");
        this.ageText.setText("");
        this.departmentText.setText("");
        this.cgpaText.setText("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.addButton) {
            String id = this.idText.getText();
            String rollNumber = this.rollNumberText.getText();
            String name = this.nameText.getText();
            String surname = this.surnameText.getText();
            String age = this.ageText.getText();
            String department = this.departmentText.getText();
            String cgpa = this.cgpaText.getText();

            boolean formIsValid = this.validateForm(id, rollNumber, name, surname, age, department, cgpa);

            if (formIsValid) {
                boolean idExists = this.checkIdExists(Integer.parseInt(id));

                if (!idExists) {
                    this.addButton.addStudent(this.table, id, rollNumber, name, surname, age, department, cgpa);
                    this.emptyForm();
                    this.setUpIdTextField();
                    JOptionPane.showMessageDialog(null, "Student Added Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "ID Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Form Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == this.saveButton) {
            this.saveButton.saveData(this.students);
        }
        if (e.getSource() == this.editButton) {
            this.editButton.edit(this.table.getTable(), this.students, this.idText, this.rollNumberText, this.nameText, this.surnameText, this.ageText, this.departmentText, this.cgpaText);
        }
        if (e.getSource() == this.deleteButton) {
            this.deleteButton.delete(this.table.getTable(), this.students);
            this.setUpIdTextField();
        }
    }
}

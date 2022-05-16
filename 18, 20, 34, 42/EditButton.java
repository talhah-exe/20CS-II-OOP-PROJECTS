package com.halfcell.blank;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EditButton extends Button {

    public EditButton(String text) {
        super(text);
    }

    public void edit(JTable table, Students students, JTextField id, JTextField rollNumber, JTextField name, JTextField surname, JTextField age, JTextField department, JTextField cgpa) {
        int row = table.getSelectedRow();
        if (row > -1) {
            Object[] data = students.getData()[row];
            students.getStudents().remove(row);
            ((DefaultTableModel)table.getModel()).removeRow(row);

            id.setText("");
            rollNumber.setText("");
            name.setText("");
            surname.setText("");
            age.setText("");
            department.setText("");
            cgpa.setText("");

            id.setText((String) data[0]);
            rollNumber.setText((String) data[1]);
            name.setText((String) data[2]);
            surname.setText((String) data[3]);
            age.setText((String) data[4]);
            department.setText((String) data[5]);
            cgpa.setText((String) data[6]);
        }
    }
}

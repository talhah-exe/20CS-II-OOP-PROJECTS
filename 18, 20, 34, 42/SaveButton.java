package com.halfcell.blank;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SaveButton extends Button {

    public SaveButton(String text) {
        super(text);
    }

    public void saveData(Students students) {
        File file = new File("Student Record.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student student : students.getStudents()) {
                bw.write(student.toString());
                bw.newLine();
            }
            bw.close();
            JOptionPane.showMessageDialog(null, "Data Saved Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Saving File", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

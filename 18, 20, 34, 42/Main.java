package com.halfcell.blank;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Students students = new Students();

        MyFrame frame = new MyFrame();
        int width = frame.getWidth();
        int height = frame.getHeight();

        JPanel panel = new JPanel();
        Table table = new Table(width, height, students);
        Form form = new Form(width, height, students, table);

        panel.add(form, BorderLayout.WEST);
        panel.add(table, BorderLayout.EAST);
        table.setBackground(Color.darkGray);
        form.setBackground(Color.darkGray);
        panel.setBackground(Color.darkGray);
        frame.add(panel);
        frame.setVisible(true);
    }
}

package com.halfcell.blank;

import javax.swing.*;

public class MyFrame extends JFrame {

    private int width;
    private int height;
    private String title;

    public MyFrame() {

        this.width = 1000;
        this.height = 500;
        this.title = "Student Management System";

        this.setSize(this.width, this.height);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle(this.title);
    }
}

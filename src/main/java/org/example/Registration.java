package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class Registration extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel name;
    private JLabel grade;
    private JLabel uniLabel;
    private JTextField tname;
    private JTextField tgrade;
    private JTextArea tout;

    private JComboBox university;
    private JButton sub;
    private JButton reset;
    private ArrayList<University> universities = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Registration(String title, ArrayList<University> universities, ArrayList<Student> students) {
        this.title = new JLabel(title);
        this.universities = universities;
        this.students = students;
        configureFrame();
        addContents();
        this.setVisible(true);
    }

    public void configureFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        this.setBounds(300, 90, 900, 600);
    }

    public void addContents() {
        // Label
        c = getContentPane();
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        // Text Forms
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        grade = new JLabel("Grade");
        grade.setFont(new Font("Arial", Font.PLAIN, 20));
        grade.setSize(100, 20);
        grade.setLocation(100, 150);
        c.add(grade);

        tgrade = new JTextField();
        tgrade.setFont(new Font("Arial", Font.PLAIN, 15));
        tgrade.setSize(190, 20);
        tgrade.setLocation(200, 150);
        c.add(tgrade);

        // ComboBox
        uniLabel = new JLabel("University");
        uniLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        uniLabel.setSize(100, 20);
        uniLabel.setLocation(100, 200);
        c.add(uniLabel);

        String universitiesArr[] = universities.stream().map((uni) -> uni.getName()).collect(Collectors.toList()).toArray(new String[0]);
        university = new JComboBox(universitiesArr);
        university.setFont(new Font("Arial", Font.PLAIN, 15));
        university.setSize(200, 20);
        university.setLocation(200, 200);
        c.add(university);

        // Buttons
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(sub)) {
            int uniIndex = university.getSelectedIndex();
            University uniInput = universities.get(uniIndex);
            String nameInput = (String) tname.getText();
            String gradeInput = (String) tname.getText();
            String uniqueID = UUID.randomUUID().toString();

            Student newStudent = new Student(uniqueID, nameInput, gradeInput, uniInput);
            System.out.println("A new student registered");
            students.add(newStudent);
            tout.setText(newStudent.toString());
            tout.setEditable(false);

        } else if (e.getSource().equals(reset)) {
            String empty = "";
            tname.setText(empty);
            tgrade.setText(empty);

        }
    }
}

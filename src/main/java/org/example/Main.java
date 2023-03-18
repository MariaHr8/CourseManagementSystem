package org.example;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<University> universities = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        universities.add(new LancasterUniversity("1", "Lancaster"));
        universities.add(new University("2", "Manchester City"));
        universities.add(new University("3", "Birmingham City"));
        JFrame frame = new Registration("Registration", universities, students);


    }
}
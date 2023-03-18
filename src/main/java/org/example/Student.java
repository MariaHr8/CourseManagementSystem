package org.example;

public class Student {
    private String id, name, grade;
    private University university;

    public Student(){}
    public Student(String id, String name, String grade, University university) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.university = university;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{\n" +
                "id='" + id + '\'' +
                ",\n name='" + name + '\'' +
                ",\n grade='" + grade + '\'' +
                ",\n university=" + university.getName() +
                "\n}";
    }
}

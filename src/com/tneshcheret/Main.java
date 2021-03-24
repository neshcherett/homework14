package com.tneshcheret;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> javaStudents = new ArrayList<>();
        Student neshcheret = new Student("Neshcheret", "Tetiana", "01.01.2000", "032165498");
        Student surguchov = new Student("Surguchov", "Vladislav", "01.01.2000", "0369852147");
        Student pashkov = new Student("Pashkov", "Dmytro");
        Student zborovskiy = new Student("Zborovskiy", "Artem");
        javaStudents.add(surguchov);
        javaStudents.add(pashkov);
        javaStudents.add(neshcheret);

        Group javaGroup = new Group("Introduction Java", "28.01.2021", 16, 2, javaStudents);
        System.out.println(javaGroup.getGroupName());
        System.out.println(javaGroup.getLastLessonDate());
        javaGroup.printStudentList();
        javaGroup.addStudent(zborovskiy);
        javaGroup.printStudentList();
        System.out.println(javaGroup.checkSurname("Ivanov"));
        System.out.println(javaGroup.checkSurname("Neshcheret"));
        javaGroup.deleteStudent("Neshcheret");
        javaGroup.printStudentList();
        javaGroup.deleteStudent(2);
        javaGroup.printStudentList();
    }
}

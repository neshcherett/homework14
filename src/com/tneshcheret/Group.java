package com.tneshcheret;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Group {
/*- название курса
- дата старта занятий
- суммарное количество занятий
- количество занятий в неделю
- список учащихся типа Student у которого есть фамилия, имя, дата рождения и контакты.*/

    private final String courseName;
    private final String startDate;
    private final int numberLessons;
    private final ArrayList<Student> studentArrayList;
    private final int numberLessonsPerWeek;

    public Group(String courseName, String startDate, int numberLessons, int numberLessonsPerWeek, ArrayList<Student> studentArrayList) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.numberLessons = numberLessons;
        this.numberLessonsPerWeek = numberLessonsPerWeek;
        this.studentArrayList = studentArrayList;
    }

    //- метод который выдает название группы на основе даты старта и названия курса
    public String getGroupName() {
        return courseName + " " + startDate;
    }

    //- метод который выдает дату последнего занятия
    public LocalDate getLastLessonDate() {
        if (startDate != null) {
            long numberWeeks = numberLessons / numberLessonsPerWeek;
            String[] startDateArr = this.startDate.split("\\.");
            int yearStart = Integer.parseInt(startDateArr[2].trim());
            int monthStart = Integer.parseInt(startDateArr[1].trim());
            int dayStart = Integer.parseInt(startDateArr[0].trim());
            LocalDate startLocalDateTime = LocalDate.of(yearStart, monthStart, dayStart);
            return startLocalDateTime.plusWeeks(numberWeeks);
        }
        return null;
    }

    //- печатает список студентов по порядку в формате 1. И. Иванов...
    public void printStudentList() {
        ArrayList<String> listShortName = new ArrayList<>();
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            String studentName = student.getName();
            char firstNameLetter = studentName.charAt(0);
            String studentSurname = student.getSurname();
            String builderShortName = (i + 1) + ". " + studentSurname.trim() + " " + firstNameLetter + ".";
            listShortName.add(builderShortName);
        }
        Collections.sort(listShortName);
        System.out.println(listShortName);
    }

    //- добавить студента
    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    //- узнать если ли студент с такой фамилией в группе
    public boolean checkSurname(String surname) {
        for (Student student : studentArrayList) {
            String studentSurname = student.getSurname();
            if (studentSurname.equals(surname)) {
                return true;
            }
        }
        return false;
    }

    //- удалить студента по фамилии или по номеру
    public void deleteStudent(String surname) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            String studentSurname = student.getSurname();
            if (studentSurname.equals(surname)) {
                studentArrayList.remove(i);
                return;
            }
        }
    }

    //- удалить студента по фамилии или по номеру
    public void deleteStudent(int number) {
        studentArrayList.remove(number - 1);
    }
}

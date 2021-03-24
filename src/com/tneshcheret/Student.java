package com.tneshcheret;

public class Student {
    // список учащихся типа Student у которого есть фамилия, имя, дата рождения и контакты.
    private final String surname;
    private final String name;
    private String dateBirth;
    private String contacts;

    public Student(String surname, String name, String dateBirth, String contacts) {
        this.surname = surname;
        this.name = name;
        this.dateBirth = dateBirth;
        this.contacts = contacts;
    }

    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", contacts='" + contacts + '\'' +
                '}';
    }
}

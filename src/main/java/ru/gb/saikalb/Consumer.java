package ru.gb.saikalb;

public class Consumer {
    public Consumer() {
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private Gender gender;

    // Геттер для свойства "пол"
    public Gender getGender() {
        return gender;
    }

    // Сеттер для свойства "пол"
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

class Employee {
    public Employee() {
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private Gender gender;

    // Геттер для свойства "пол"
    public Gender getGender() {
        return gender;
    }

    // Сеттер для свойства "пол"
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
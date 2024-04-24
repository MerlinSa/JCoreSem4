package ru.gb.saikalb;

import java.time.LocalDate;

import static ru.gb.saikalb.Employee1.congratulateEmployees;

/**
 * @author <a href="mailto:"
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Создание объекта Customer
        Consumer customer = new Consumer();
        // Установка значения пола
        customer.setGender(Consumer.Gender.FEMALE);
        // Вывод значения пола
        System.out.println("Customer gender: " + customer.getGender());

        // Создание объекта Employee
        Employee employee = new Employee();
        // Установка значения пола
        employee.setGender(Employee.Gender.MALE);
        // Вывод значения пола
        System.out.println("Employee gender: " + employee.getGender());

        System.out.println("~~~~~~~~~~~~Task2");
        // Создаем массив сотрудников
        Employee1[] employees = {
                new Employee1("Иван", LocalDate.of(1980, 5, 15), true),
                new Employee1("Мария", LocalDate.of(1985, 3, 8), false),
                new Employee1("Петр", LocalDate.of(1990, 10, 25), true),
                new Employee1("Анна", LocalDate.of(1982, 1, 3), false)
        };

        // Поздравляем всех сотрудников
        congratulateEmployees(employees, LocalDate.now());
    }
}





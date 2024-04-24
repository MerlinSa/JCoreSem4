package ru.gb.saikalb;
import java.time.LocalDate;

/**
 *  Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
 * написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом,
 * женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
 */

enum Holiday {
    NO_HOLIDAY,
    NEW_YEAR,
    WOMENS_DAY,
    MENS_DAY
}

class Employee1 {
    private String name;
    private LocalDate birthDate;
    private boolean isMale;

    public Employee1(String name, LocalDate birthDate, boolean isMale) {
        this.name = name;
        this.birthDate = birthDate;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isMale() {
        return isMale;
    }


    public static void congratulateEmployees(Employee1[] employees, LocalDate currentDate) {
        Holiday holiday = getHoliday(currentDate);

        for (Employee1 employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                    break;
                case WOMENS_DAY:
                    if (!employee.isMale()) {
                        System.out.println("С 8 Марта, " + employee.getName() + "!");
                    }
                    break;
                case MENS_DAY:
                    if (employee.isMale()) {
                        System.out.println("С Днем Защитника Отечества, " + employee.getName() + "!");
                    }
                    break;
                default:
                    System.out.println("Поздравлений сегодня нет для " + employee.getName());
            }
        }
    }

    public static Holiday getHoliday(LocalDate date) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        if (day == 1 && month == 1) {
            return Holiday.NEW_YEAR;
        } else if (day == 8 && month == 3) {
            return Holiday.WOMENS_DAY;
        } else if (day == 23 && month == 2) {
            return Holiday.MENS_DAY;
        } else {
            return Holiday.NO_HOLIDAY;
        }
    }
}


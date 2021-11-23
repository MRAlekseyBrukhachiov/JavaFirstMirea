package ru.mirea.task19;
import java.lang.Exception;
public class DateOfBirthException {
    private int day;
    private int month;
    private int year;

    public DateOfBirthException(int day, int month, int year) throws Exception {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //количество дней в месяцах
        if (year % 4 == 0) //если год високосный
            days[1] = 29;
        if (day > 31 || day < 1 || day > days[month-1])
            throw new Exception("Ошибка при вводе дня");
        if (month > 12 || month < 1)
            throw new Exception("Ошибка при вводе месяца");
        if (year > 2021 || year < 1921)
            throw new Exception("Ошибка при вводе года");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String day = ""+this.day, month = ""+this.month;
        if (this.day < 10)
            day = "0" + this.day;
        if (this.month < 10)
            month = "0" + this.month;
        return day+"."+month+"."+year;
    }
}

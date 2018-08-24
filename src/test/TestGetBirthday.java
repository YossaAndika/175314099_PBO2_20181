/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class TestGetBirthday {
    public static void main(String[] args) {
        GregorianCalendar birthdate = new GregorianCalendar(1974, 1, 12);
    GregorianCalendar today = new GregorianCalendar(); // Today's date
    GregorianCalendar birthday = new GregorianCalendar(today.get(YEAR), birthdate.get(MONTH),
        birthdate.get(DATE));
    int age = today.get(today.YEAR) - birthdate.get(YEAR);
    String[] weekdays = new DateFormatSymbols().getWeekdays(); // Get day names
    System.out.println("You were born on a " + weekdays[birthdate.get(DAY_OF_WEEK)]);
    System.out.println("This year you " + (birthday.after(today) ? " will be " : "are ") + age
        + " years old.");
    System.out.println("In " + today.get(YEAR) + " your birthday "
        + (today.before(birthday) ? "will be" : "was") + " on a "
        + weekdays[birthday.get(DAY_OF_WEEK)] + ".");
    }
}

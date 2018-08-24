/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.SimpleDateFormat;
import static java.util.Calendar.YEAR;
import java.util.Date;

/**
 *
 * @author admin
 */
public class TestDate1 {

    public static void main(String[] args) {
        Date date = new Date(110, 7, 24);
        Date today = new Date();
        SimpleDateFormat ft
                = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        // display time and date using toString()
        System.out.println(ft.format(today));
        int age = today.getYear() - date.getYear();
        System.out.println("age = " + age);
    }

}

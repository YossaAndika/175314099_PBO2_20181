/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class TestDate {
    public static void main(String[] args) {
        // Instantiate a Date object
      Date date = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("yyyyMMdd");
      // display time and date using toString()
      System.out.println(ft.format(date));
    }
   
}

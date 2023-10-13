package com.demo;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DemoClass {
  @Test
  void testMethod() {
    String date = "28.10.2023";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate parseFormat = LocalDate.parse(date, formatter);

    Assertions.assertEquals(DayOfWeek.SATURDAY, parseFormat.getDayOfWeek());
  }
}



// command+ N вызывает метод Generate, позволяет быстро создать класс
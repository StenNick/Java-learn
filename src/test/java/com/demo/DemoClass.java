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
    System.out.println(parseFormat);
    Assertions.assertEquals(DayOfWeek.SATURDAY, parseFormat.getDayOfWeek());
    // изменения в мастере! Добавили еще что то новое в мастер
    // а тут изменения в новой ветке, ветка - some branch


  }

  @Test
  void myTest() {
    String hello = "Hello!";
    String world = "World";
    String fullWord = hello + " " + world;
    System.out.println(fullWord);
  }
}



// command+ N вызывает метод Generate, позволяет быстро создать класс
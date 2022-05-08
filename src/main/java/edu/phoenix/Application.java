package edu.phoenix;

import java.util.List;

public class Application {
  public static void main(String[] args) {
    List<Client> clientList = initializeList();

    checkClient(clientList);
  }

  private static void checkClient(List<Client> list) {
    /*
    Реализуйте этот метод с использованием Stream API

    Нужно вывести в консоль список клиентов, которые могут торговать акциями в нашем приложении.

    Условия:
     - возраст клиента должен быть от 18 до 60 лет включительно
     - имя клиента нужно вывести в нормальном виде - заглавная буква, остальные - строчные
     */
  }


  // Этот метод наполняет массив клиентами и возвращает его в метод main
  private static List<Client> initializeList() {
    return List.of(
        Client.builder().name("сАня").age(33).build(),
        Client.builder().name("серёга").age(17).build(),
        Client.builder().name("тарАс").age(15).build(),
        Client.builder().name("МАКС").age(5).build(),
        Client.builder().name("ГЕНА").age(63).build(),
        Client.builder().name("Миша").age(21).build(),
        Client.builder().name("осип").age(72).build(),
        Client.builder().name("АнтоН").age(23).build(),
        Client.builder().name("Данил").age(12).build(),
        Client.builder().name("ЖОра").age(7).build()
        );
  }

}

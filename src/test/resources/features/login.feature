Feature: Логин

  @Login
  Scenario: Успешный логин юзера
    Given Пользователь запускает браузер
    When Пользователь открывает домашнюю страницу foodnow
    And Пользователь кликает на Иконку авторизации
    And Пользователь нажимает на link Login
    And Пользователь вводит валидные данные
    And Пользователь нажимает на button Login
    Then Пользователь проверяет отображение сообщения об успешном логине
    And Пользователь закрывает браузер

    @InvalidPassword
    Scenario Outline: Неуспешный логин юзера
      Given Пользователь запускает браузер
      When Пользователь открывает домашнюю страницу foodnow
      And Пользователь кликает на Иконку авторизации
      And Пользователь нажимает на link Login
      And Пользователь вводит валидный email и невалидный password
        | email   | password   |
        | <email> | <password> |
      And Пользователь нажимает на button Login
      Then Пользователь проверяет отображение сообщения об неуспешном логине
      And Пользователь закрывает браузер
      Examples:
        | email             | password   |
        | addproduct@gmail.com | Password11 |
        | addproduct@gmail.com | password@1 |
        | addproduct@gmail.com | password1  |
        | addproduct@gmail.com | Password@  |
Feature: Регистрация

  @Registration
  Scenario: Успешная регистрация юзера
    Given Пользователь запускает браузер
    When Пользователь открывает домашнюю страницу foodnow
    And Пользователь кликает на Иконку авторизации
    And Пользователь нажимает на link Registration
    And Пользователь вводит full valid data
    And Пользователь нажимает на button Registration
    Then Пользователь переходит на страницу Логин
    #And Пользователь закрывает браузер
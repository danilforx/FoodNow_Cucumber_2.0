Feature: Домашняя страница


  @OpenFoodNow
Scenario: Проверить, что на домашней отображается заголовок.
Given Пользователь запускает браузер
  When Пользователь открывает домашнюю страницу foodnow
  Then Проверить, что заголовок домашней страницы отображается
  And Пользователь закрывает браузер
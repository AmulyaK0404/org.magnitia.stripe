Feature: create multiple customers for multiple users

  Scenario Outline: 
    Given open "<bn>" browser
    And launch site using "https://dashboard.stripe.com/login"
    When do login using "<uid>" and "<pwd>" 
    Then customers tab should be displayed
    When click on Customers
    When add customers and verify
      | name   | email               | description |
      | Amulya | amulya.pb@gmail.com | how are you |
      | Amulya | amulya.pb@gmail.com | how are you |
      | Amulya | amulya.pb@gmail.com | how are you |
    When do logout
    Then login page should be redisplayed
    When close site

    Examples: 
      | bn     | uid                      | pwd               |
      | chrome | amulya.pb@gmail.com      | amulyathegreat123 |
      | chrome | amulyak1992@yahoo.com    | amulyathegreat123 |
      | chrome | amulyagmai9204@gmail.com | amulyathegreat123 |

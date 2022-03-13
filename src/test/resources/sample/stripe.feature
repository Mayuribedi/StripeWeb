Feature: Create Customer

  Scenario Outline: 
    Given open "<bn>" Browser
    And launch site using "https://dashboard.stripe.com/login"
    When do login using "<uid>" and "<pwd>" credentials
    Then customer tab should be displayed
    When add cutomers
      | name  | email                | description |
      | Neha  | neha@gmail.com       | study       |
      | Swati | swatigupta@gmail.com | Wishes      |
    Then closed site

    Examples: 
      | bn     | uid                      | pwd           |
      | Chrome | mayya.rosh1111@gmail.com | abdulkalam123 |
      | Chrome | sahumayuri@gmail.com     | abdulkalam123 |

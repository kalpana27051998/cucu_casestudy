
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario Outline: Title of your scenario outline
    Given Login as Admin
    And click add new product
    Then select category 
    And select sub-category 
    And Enter product name "<name>"
    And Enter price "<price>"
    And Enter Quantity "<quantity>"
		And Enter brand 
		And give description 
    Then click submit
    Examples: 
      | name   |  |price| |quantity|
      | Laptop |  |100  | |2       |   
      | Mobile |  |50   | |5       |   
      

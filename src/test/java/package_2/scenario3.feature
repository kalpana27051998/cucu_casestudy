
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Add new prod
    Given login as admin
    And click Add to new product
    And select category as "Electronics"
    And select sub-category as "Head Phone"
    And Enter product name as "Jabra 11"
    And Enter price as "300"
    And Enter Quantity as "10"
    And Enter brand as "Jabra"
    And give description as "Head Phone suitable for office"
    Then submit
   

  
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Concessionnaire
Feature: F002
  En tant que client je veux qu un concessionaire puisse acheter et vendre plusieurs bateau

  @achatConcession
  Scenario Outline: Acheter plusieurs bateau
    Given Deux bateau <bateau1> et <bateau2>
    And Ils ont un prix de <prix1> et <prix2>
    When Le concessionnaire achete les bateaux
    Then Les bateaux sont achetés
    
    Examples: 
      | bateau1  | bateau2 | prix1  | prix2 |
      | Saphir   | BlackP  | 5000   | 10000 |
      | Pie      | Thon    | 300    | 200   |

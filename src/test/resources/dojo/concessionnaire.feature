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
  Scenario Outline: Acheter plusieurs bateaux
    Given Deux bateaux <bateau1> et <bateau2>
    And Ils ont un prix de <prix1> et <prix2>
    When Le concessionnaire achete les bateaux
    Then Les bateaux sont achetés
    
    Examples: 
      | bateau1  | bateau2 | prix1  | prix2 |
      | Saphir   | BlackP  | 5000   | 10000 |
      | Pie      | Thon    | 300    | 200   |
      
  @venteClient
  Scenario Outline: Vendre un bateau a un client
    Given Le concessionnaire a deux bateaux <bateau1> et <bateau2>
    And Ils ont respectivement un prix de <prix1> et <prix2>
    When Un marin de <age> ans avec <portefeuille>€ achete
    Then Un bateau est acheté
    
    Examples: 
      | bateau1  | bateau2 | prix1  | prix2 | age | portefeuille |
      | Saphir   | BlackP  | 5000   | 10000 | 23  | 15000        |
      | Pie      | Thon    | 3000   | 2000  | 15  | 5000         |

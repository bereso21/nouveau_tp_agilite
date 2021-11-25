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
@Marin
Feature: F001
  En tant que client je veux que Romeo puisse acheter un bateau

  @achatOk
  Scenario Outline: La marin a assez d argent 
    Given Romeo a <age> ans et <portefeuille>€. Il veut acheter un bateau 
    When Il y a un bateau nommé <nom> vendu au prix de <prix>€
    Then Romeo achete le bateau
    
    Examples: 
      | age  | portefeuille | nom        | prix  |
      | 23   | 8000         | Saphir     | 5000  |
      | 73   | 15000        | Blackpearl | 10000 |
   
  @achatNOk
  Scenario Outline: La marin n a pas assez d argent 
    Given Romeo a <age> ans et <portefeuille>€. Il veut acheter un nouveau bateau 
    And Il y a un nouveau bateau nommé <nom> vendu au prix de <prix>€
    When Romeo veut acheter le bateau mais n a pas assez
    Then L achat est refusé
    
    Examples: 
      | age  | portefeuille | nom        | prix  |
      | 23   | 3000         | Saphir     | 5000  |
      | 73   | 5000         | Blackpearl | 10000 |     
        
 
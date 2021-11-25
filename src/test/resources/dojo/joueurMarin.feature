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
@JoueurMarin
Feature: F004
  En tant que client je veux qu une personne puisse acheter un bateau

  @Particulier
  Scenario Outline: Une personne achète a un particulier
    Given On a une personne 
    When Elle a achete un bateau <nomBateau>
    Then Elle devient un marin propiétaire
    
    Examples: 
      | <nomBateau> |
      | Cannoe      |


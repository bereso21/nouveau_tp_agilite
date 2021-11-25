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
@Sponsor
Feature: F003
  Je veux qu un marin puisse soutenir un club en achetant un bateau chez un concessinnaire sponsor

  @sponsorise
  Scenario Outline: un concessionnaire sponsorise un club
    Given On a un concessionnaire <nomCons>
    And Un club <nomClub>
    When Le concessionnaire le souhait
    Then Il sponsorise le club et le club devient sponsorise
    
    Examples: 
      | <nomCons>  | <nomClub> |
      | Boatental  | PSG       |

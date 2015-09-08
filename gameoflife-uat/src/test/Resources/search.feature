

  Feature: Search functionality

    @Runme
  Scenario Outline: Search functionality works correctly
    Given I am on the Telfort start page
    When I type <keyword> in the search box
    Then The search result page<page> is shown


    Examples:
    | keyword | page |
    | Combi | Telfort, Persoonlijk, Zoeken, Combi |
    | Voordeel | Telfort, Persoonlijk, Zoeken, Voordeel |
    | Combi Voordeel | Telfort, Persoonlijk, Zoeken, Combi Voordeel |
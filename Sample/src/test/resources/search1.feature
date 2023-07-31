Feature:Searching product in Amazon

  Scenario Outline:
    Given the user launches the amazon url
    Then the user searches the "<keyword>" in search bar
    Then the user selects the Apple Iphone option


   Examples:
    |keyword|
    |iphone |

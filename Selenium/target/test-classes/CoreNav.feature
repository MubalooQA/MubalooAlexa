Feature:  Core Navigation


  Scenario Outline: <ScenarioID>:  <Region> user can access option  to navigate to another room from the <room> screen

    Given "<Region>" user selects to view the "<room>" scene
    When the miniature dolls house is clicked
    Then the House image overlay appears
    And user can Select another room

    Examples:
      |ScenarioID|Region|room|
      |TH-69-2.1|UK|Living Room|
      |TH-69-2.2|UK|Kitchen    |
      |TH-69-2.3|UK|Bedroom    |


  Scenario Outline: <ScenarioID>:  "<room>" previews shown on mouse over dolls house

    Given I am a "<Region>" user who has accesses the Advert
    When the Mouse is placed over the "<room>" section of the House
    Then the "<room>" preview information is displayed

    Examples:
      |ScenarioID|Region|room|
      |TH-59-1.2|UK|Living Room|
      |TH-59-1.3|UK|Kitchen    |
      |TH-59-1.1|UK|Bedroom    |


  Scenario Outline: <ScenarioID>:  user selects to view the <room> from the Banner/overlay (House image)

    Given "<Region>" user selects to view the "<room>" scene
    When the "<room>" Screen loads
    Then the "<room>" screen is displayed

  Examples:
    |ScenarioID|Region|room|
    |TH-60-1.1|UK|Living Room|
    |TH-60-1.2|UK|Kitchen    |
    |TH-60-1.3|UK|Bedroom    |



  Scenario Outline: <ScenarioID>:  "<Reqion>" user has option to navigate to other room

    Given "<Region>" user selects to view the "<room>" scene
    When the "<room>" Screen loads
    Then the miniature dolls house is displayed

    Examples:
      |ScenarioID|Region|room|
      |TH-69-1.1|UK|Living Room|
      |TH-69-1.1|UK|Kitchen    |
      |TH-69-1.1|UK|Bedroom    |




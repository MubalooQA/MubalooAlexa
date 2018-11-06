Feature:  Microphone scripts



  Scenario Outline: <ScenarioID>: <Region> user is shown the Microphone enablement information
    Given "<Region>" user selects to view the "<room>" scene
    When the "<room>" Screen loads
    Then  user is informed that the microphone is required via a inline modal dialog

    Examples:
      |ScenarioID|Region|room|
      |TH-32-1.1|UK|Living Room|
      |TH-32-1.1|UK|Kitchen    |
      |TTH-32-1.1|UK|Bedroom    |


  Scenario Outline: <ScenarioID>: <Region> user is shown the Short Microphone Disclaimer information
    Given "<Region>" user selects to view the "<room>" scene
    When the "<room>" Screen loads
    Then user is shown the Short disclaimer text via the inline modal dialog


    Examples:
      |ScenarioID|Region|room|
      |TH-32-1.2|UK|Living Room|
      |TH-32-1.2|UK|Kitchen    |
      |TTH-32-1.2|UK|Bedroom    |


  Scenario Outline: <ScenarioID>: <Region> user has option to read more information
    Given "<Region>" user selects to view the "<room>" scene
    When the "<room>" Screen loads
    Then user can see there is a "Read more…" Link in the modal dialog

    Examples:
      |ScenarioID|Region|room|
      |TH-32-1.3|UK|Living Room|
      |TH-32-1.3|UK|Kitchen    |
      |TTH-32-1.3|UK|Bedroom    |


Scenario Outline: <ScenarioID>: <Region> User can see more information on the enablement information and disclaimer


  Given "<Region>" user selects to view the "<room>" scene
    And the microphone and disclaimer modal is displayed
    When the "Read more…" link is selected
    Then the modal dialogue is expanded to display more Disclaimer information
    And the 'We care about your privacy' section is also shown

    Examples:
      |ScenarioID|Region|room|
      |TH-32-1.4|UK|Living Room|
      |TH-32-1.4|UK|Kitchen    |
      |TTH-32-1.4|UK|Bedroom    |

  Scenario Outline: <ScenarioID>: <Region> User can close the Disclaimer dialog


    Given "<Region>" user selects to view the "<room>" scene
    And the microphone and disclaimer modal is displayed
    When the Close 'X' link is selected
    Then the modal closes

    Examples:
      |ScenarioID|Region|room|
      |TH-32-1.5|UK|Living Room|
      |TH-32-1.5|UK|Kitchen    |
      |TTH-32-5 |UK|Bedroom    |
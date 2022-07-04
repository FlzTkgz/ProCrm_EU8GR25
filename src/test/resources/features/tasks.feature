Feature: SCRUM-575 - Tasks Feature.

  As a user I should be able to see All Tasks, Ongoing Tasks and Only HR user should be able to create a new task and edit tasks.
  Accounts are : HR, Helpdesk, Marketing.

  Scenario: HR user should be able to see the All Tasks.
    Given HR user is on Home Page.
    When HR user click on Tasks module.
    Then HR user click All Tab button on My Tasks Page.
    Then HR user should be able to display All Tasks.

  Scenario: Helpdesk user should be able to see the All Tasks.
    Given Helpdesk user is on Home Page.
    When Helpdesk user click on Tasks module.
    Then Helpdesk user click All Tab button on My Tasks Page.
    Then Helpdesk user should be able to display All Tasks.

  Scenario: Marketing user should be able to see the All Tasks.
    Given Marketing user is on Home Page.
    When Marketing user click on Tasks module.
    Then Marketing user click All Tab button on My Tasks Page.
    Then Marketing user should be able to display All Tasks.

  Scenario: HR user should be able to see Ongoing Tasks.
    Given HR user is on Home Page.
    When HR user click on Tasks module.
    And HR user click Ongoing Tab button on My Tasks Page.
    Then HR user should be able to see Ongoing Tasks.

  Scenario: Helpdesk user should be able to see Ongoing Tasks.
    Given Helpdesk user is on Home Page.
    When Helpdesk user click on Tasks module.
    And Helpdesk user click Ongoing Tab button on My Tasks Page.
    Then Helpdesk user should be able to see Ongoing Tasks.

  Scenario: Marketing user should be able to see Ongoing Tasks.
    Given Marketing user is on Home Page.
    When Marketing user click on Tasks module.
    And Marketing user click Ongoing Tab button on My Tasks Page.
    Then Marketing user should be able to see Ongoing Tasks.

    Scenario: HR user should be able to create a new task.
      Given HR user is on My Tasks Page.
      When HR user clicks New Task button.
      And HR user fills in "Task Name" which is mandatory field with "Test" .
      And HR user clicks "Add Tasks" button to create a new task.
      Then HR user should be able to display new task created.

  @negativeScenario
  Scenario: Helpdesk user CAN NOT BE ABLE TO create a new task.
    Given Helpdesk user is on My Tasks Page.
    When Helpdesk user clicks New Task button.
    And Helpdesk user fills in "Task Name" which is mandatory field with "Test" .
    And Helpdesk user clicks "Add Tasks" button to create a new task.
    Then Helpdesk user CAN NOT BE ABLE TO display new task created.

  @negativeScenario
  Scenario: Marketing user CAN NOT BE ABLE TO create a new task.
    Given Marketing user is on My Tasks Page.
    When Marketing user clicks New Task button.
    And Marketing user fills in "Task Name" which is mandatory field with "Test" .
    And Marketing user clicks "Add Tasks" button to create a new task.
    Then Marketing user CAN NOT BE ABLE TO display new task created.

  Scenario: HR user should be able to edit task.
    Given HR user is on My Tasks Page.
    When HR user clicks on the last created task .
    And HR user clicks "Edit" button.
    And HR user edits the Task Name as "Test 1" and clicks "Save Changes".
    And HR user clicks "Close" button to be able to see "My Tasks" Page.
    Then HR user should be able to see the saved changes.

  @negativeScenario
  Scenario: Helpdesk user CAN NOT BE ABLE TO edit task.
    Given Helpdesk user is on My Tasks Page.
    When Helpdesk user clicks on the last created task .
    And Helpdesk user clicks "Edit" button.
    Then Helpdesk user CAN NOT BE ABLE TO edit task.

  @negativeScenario
  Scenario: Marketing user CAN NOT BE ABLE TO edit task.
    Given Marketing user is on My Tasks Page.
    When Marketing user clicks on the last created task .
    And Marketing user clicks "Edit" button.
    Then Marketing user CAN NOT BE ABLE TO edit task.


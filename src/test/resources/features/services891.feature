
Feature: SCRUM-891 Services functionality

  As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.

@1
  Scenario: Helpdesk User can display Event Calendar
  Given "helpdesk" user is on homepage
  When user clicks on the services tab
  Then user clicks on Meeting Room Booking page
  Then user clicks on calender view
  And user verifies that Event Calender is displayed

@2
  Scenario: Helpdesk user can uncheck "East Meeting Room" under Calender section and is redirected to New Event page
    Given "helpdesk" user is on homepage
    When user clicks on the services tab
    Then user clicks on Meeting Room Booking page
    Then user clicks on calender view
  When user clicks on ticked box
  Then user sees the East Meeting Room is unchecked
  When user clicks on Book meeting room
  And user is redirected to New Event page


@3
  Scenario: Marketing user can suggest new ideas
  Given "marketing" user is on homepage
    When user clicks on the services tab
  Given user clicks on ideas page
  When user clicks on new idea button
  Then user types my_test_idea for title, my_test_description_of_idea as description and holidays as category
  Then user clicks on suggest new ideas button
 # And user verifies that new suggestion is displayed
#2. In the 4th AC, new idea should have title as "MY_TEST_IDEA", description as "MY_TEST_DESCRIPTION_OF_IDEA"  and category as "Holidays".

@4
  Scenario: Marketing user can dislike the idea
  Given "marketing" user is on homepage
    When user clicks on the services tab
    Given user clicks on ideas page
  When user clicks on like button
  Then rating is displayed
  When user clicks on unlike button
    And negative rating number is displayed


 # 3. You may pick 1-2 idea(s) randomly among the already created ideas, for 5th-6th ACs.
@5
Scenario: Marketing User can sort the ideas by date added and rating
  Given "marketing" user is on homepage
  When user clicks on the services tab
  Given user clicks on ideas page
  When user clicks on date added
  Then ideas are displayed by date added
  When user clicks on rating button
  Then ideas are displayed by rating

  @6
Scenario: HR User can print the lists by clicking "Print" button under Lists page of Services menu.
  Given "hr" user is on homepage
  When user clicks on the services tab
  When user clicks on lists page
  When user clicks on print button



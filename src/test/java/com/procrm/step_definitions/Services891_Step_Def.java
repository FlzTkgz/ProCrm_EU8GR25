package com.procrm.step_definitions;

import com.procrm.pages.Services891_Page;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Services891_Step_Def {

    Services891_Page services891_page = new Services891_Page();



    @When("user clicks on the services tab")
    public void clicks_on_the_services_tab() {
        BrowserUtilities.clickWithJS(services891_page.serviceTab);
        //services891_page.serviceTab.click();
        BrowserUtilities.sleep(5);
    }

   @Then("user clicks on Meeting Room Booking page")
    public void clicks_on_meeting_room_booking_page() {
        services891_page.meetingRoomMeeting.click();
        BrowserUtilities.sleep(5);
    }

    @Then("user clicks on calender view")
    public void clicks_on_calender_view() {
        services891_page.calendarView.click();
        BrowserUtilities.sleep(5);
    }

    @Then("user verifies that Event Calender is displayed")
    public void verifies_that_event_calender_is_displayed() {
        //services891_page.eventCalenderDisplayed.getText().equals("Event Calendar");
        Assert.assertTrue(services891_page.eventCalenderDisplayed.isDisplayed());
    }


    @Given("user is on Meeting Room booking page")
    public void is_on_meeting_room_page() {
     Assert.assertTrue(services891_page.meetingRoomBookingPage.isDisplayed());
    }

    @When("user clicks on ticked box")
    public void clicks_on_tick_box() {
     services891_page.tickedBox.click();
    }

    @Then("user sees the East Meeting Room is unchecked")
    public void unchecks_the_east_meeting_room() {
     Assert.assertTrue(services891_page.tickedBoxUnchecked.isDisplayed());
    }


    @When("user clicks on Book meeting room")
    public void clicks_on_book_meeting_room() {
     services891_page.bookingMeetingRoom.click();
     BrowserUtilities.sleep(3);
    }

    @Then("user is redirected to New Event page")
    public void is_redirected_to_new_event_page() {
     Assert.assertTrue(services891_page.newEventisDisplayed.isDisplayed());
    }



    @Given("user clicks on ideas page")
    public void is_on_ideas_page() {
    services891_page.ideasButton.click();
    BrowserUtilities.sleep(3);

    }
    @When("user clicks on new idea button")
    public void clicks_on_new_idea_button() {
     services891_page.newIdeaButton.click();
     BrowserUtilities.sleep(3);

    }
    @Then("user types my_test_idea for title, my_test_description_of_idea as description and holidays as category")
    public void types_suggestions() {
     services891_page.titleOfSuggestion.click();
     services891_page.titleOfSuggestion.sendKeys("my_test_idea");
     BrowserUtilities.sleep(3);
     services891_page.testDescription.click();
     BrowserUtilities.sleep(3);
     services891_page.testDescription.sendKeys("my_test_description_of_idea");
     BrowserUtilities.sleep(3);
     services891_page.selectCategory.click();
     services891_page.selectHolidays.click();
     BrowserUtilities.sleep(3);

    }

    @Then("user clicks on suggest new ideas button")
    public void clicks_on_suggest_new_ideas_button() {
     services891_page.suggestNewIdeaButton.click();
     BrowserUtilities.sleep(3);


    }
    /*@And("user verifies that new suggestion is displayed")
    public void verifies_that_new_suggestion_is_displayed() {
    Assert.assertTrue(services891_page.title.equals("my_test_idea"));

    }

     */

    @When("user clicks on like button")
    public void clicks_on_like_button() {
    BrowserUtilities.clickWithJS(services891_page.likeButton);
        //services891_page.likeButton.click();
    BrowserUtilities.sleep(3);

    }
    @Then("rating is displayed")
    public void rating_is_displayed() {
     Assert.assertTrue(services891_page.likeButtonRating.isDisplayed());
     BrowserUtilities.sleep(3);

    }
    @When("user clicks on unlike button")
    public void clicks_on_unlike_button() {
     services891_page.unlikeButton.click();
     BrowserUtilities.sleep(3);
    }

    @Then("negative rating number is displayed")
    public void negative_rating_number_is_displayed() {
     Assert.assertTrue(services891_page.unlikeButtonRating.isDisplayed());
     BrowserUtilities.sleep(3);
    }

    @When("user clicks on date added")
    public void clicks_on_date_added() {
     services891_page.dateAddedButton.click();
     BrowserUtilities.sleep(3);
    }

    @Then("ideas are displayed by date added")
    public void ideasAreDisplayedByDateAdded() {
     Assert.assertTrue(services891_page.dateAddedButton.isDisplayed());
    }


     @When("user clicks on rating button")
     public void userClicksOnRatingButton() {
     services891_page.sortByRating.click();
     BrowserUtilities.sleep(3);
 }

     @Then("ideas are displayed by rating")
     public void ideasAreDisplayedByRating() {
     Assert.assertTrue(services891_page.sortByRating.isDisplayed());
     }


     @Given("user clicks on lists page")
    public void is_on_lists_page(){
     services891_page.listButton.click();
     BrowserUtilities.sleep(3);
    }

    @When("user clicks on print button")
    public void clicks_on_print_button() {
     services891_page.printButton.click();
     BrowserUtilities.sleep(3);
    }


}


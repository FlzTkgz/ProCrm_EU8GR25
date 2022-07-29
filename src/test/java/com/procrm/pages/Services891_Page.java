package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services891_Page {

    public Services891_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Services']/span")
    public WebElement serviceTab;

    @FindBy(xpath = "(//span[@class = 'main-buttons-item-text-title'])[1]")
    public WebElement meetingRoomMeeting;

    @FindBy(xpath = "//a[@href='/services/res_c.php']")
    public WebElement calendarView;

    @FindBy(xpath = "(//*[. = 'Event Calendar'])[2]")
    public WebElement eventCalenderDisplayed;


    @FindBy(xpath = "(//td[@class = 'bxec-checkbox'])[2]")
    public WebElement tickedBox;

    @FindBy(xpath ="//span[@class ='pagetitle-item']")
    public WebElement meetingRoomBookingPage;

    @FindBy(xpath = "//td[@class ='bxec-checkbox-off']")
    public WebElement tickedBoxUnchecked;

    @FindBy(xpath = "//a[@class ='bx-reserve-meeting-link']")
    public WebElement bookingMeetingRoom;

    @FindBy(xpath= "//span[@class ='calendar-head-area-title-name']")
    public WebElement newEventisDisplayed;

    @FindBy(xpath = "(//span[@class ='main-buttons-item-text-title'])[2]")
    public WebElement ideasButton;

    @FindBy(xpath = "(//span[@class ='bx-context-button-text'])[1]")
    public WebElement newIdeaButton;

    @FindBy(xpath = "//input[@name ='POST_TITLE']")
    public WebElement titleOfSuggestion;

    @FindBy(xpath = "//textarea[@class ='bxhtmled-textarea']")
    public WebElement testDescription;

    @FindBy(xpath = "//select[@name = 'UF_CATEGORY_CODE']")
    public WebElement selectCategory;

    @FindBy(xpath ="//option[@value ='OUR_EVENTS']")
    public WebElement selectHolidays;

    @FindBy(xpath= "//span[@class='t']")
    public WebElement suggestNewIdeaButton;

    @FindBy(xpath ="//a[@href='/services/idea/749/']")
    public WebElement title;

    @FindBy(xpath = "//*[@title ='Like']")
    public WebElement likeButton;

    @FindBy(xpath = "(//*[@title ='Votes - 1 (1 ayes and 0 noes)'])[1]")
    public WebElement likeButtonRating;

    @FindBy(xpath = "(//*[@title = 'Unlike'])[1]")
    public WebElement unlikeButton;

    @FindBy(xpath = "(//span[@class ='rating-vote-result rating-vote-result-minus'])[1]")
    public WebElement unlikeButtonRating;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div[4]/div/div/div[1]/a")
    public WebElement dateAddedButton;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div[4]/div/div/div[2]/a")
    public WebElement sortByRating;

    @FindBy(xpath = "(//span[@class= 'main-buttons-item-text-title'])[3]")
    public WebElement listButton;

    @FindBy(xpath = "(//span[@class= 'footer-link'])[2]")
    public WebElement printButton;
}

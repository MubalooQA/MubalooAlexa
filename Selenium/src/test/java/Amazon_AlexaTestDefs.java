import Helpers.MobileEmulationHelpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Helpers.DriverHelpers;
import Helpers.LanguageHelpers;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Keys;


public class Amazon_AlexaTestDefs {


    String regionCode = "";
    String lURL = "";
    String Device = "";
    String sRoom = "";
    String CurrentRoom = "";

    @Given("^I am a \"([^\"]*)\" user who has accesses the Advert$")
    public void iAmAUserWhoHasAccessesTheAdvert(String arg0) throws Throwable {
        OpenAdvert(arg0, "");

    }

    @Given("^I am a \"([^\"]*)\" user who has accesses the Advert using a \"([^\"]*)\"$")
    public void OpenAdvert(String arg0, String arg1) throws Throwable {

        Device = arg1;

        switch (arg0) {
            case "German":
                regionCode = "de-DE";
                break;
            case "UK":
                regionCode = "en-GB";
                break;
            default:
                regionCode = "en-GB";
                break;

        }

        lURL = LanguageHelpers.getUrlFromJSONFile(regionCode);

        DriverHelpers.setWebDriverLanguage(regionCode);

        DriverHelpers.launchSiteURL(lURL, Device);

        DriverHelpers.getDriver().get(lURL);


        Assert.assertTrue(DriverHelpers.checkForElementCSS(".amzn2913-dolls-house"));

    }


    @Then("^the \"([^\"]*)\" preview information is displayed$")
    public void thePreviewInformationIsDisplayed(String arg0) throws Throwable {

        String sProductValue = "";
        String sButtonText = "";
        String sUtterance1 = "";
        String sUtterance2 = "";
        String sUtterance3 = "";
        String Copy = "";
        String onPage = "";
        CurrentRoom = arg0;


        // Check there is a text holder
        if (DriverHelpers.checkForElementCSS(sRoom + " .amzn2913-dolls-house-overlay-copy-sub-heading")) {
            //Set the copy to check against

            switch (CurrentRoom) {
                case "Living Room":
                    sProductValue = "TryEcho";
                    sButtonText = "dollsHouseLRbutton";
                    sUtterance1 = "dollsHouseLRUtter1";
                    sUtterance2 = "dollsHouseLRUtter2";
                    sUtterance3 = "dollsHouseLRUtter3";
                    break;

                case "Kitchen":
                    sProductValue = "TryEchoShow";
                    sButtonText = "dollsHouseKbutton";
                    sUtterance1 = "dollsHouseKUtter1";
                    sUtterance2 = "dollsHouseKUtter2";
                    sUtterance3 = "dollsHouseKUtter3";
                    break;
                case "Bedroom":
                    sProductValue = "TryEchoShow";
                    sButtonText = "dollsHouseBRbutton";
                    sUtterance1 = "dollsHouseBRUtter1";
                    sUtterance2 = "dollsHouseBRUtter2";
                    sUtterance3 = "dollsHouseBRUtter3";
                    break;
                default:
                    Assert.fail("no such room as: " + arg0);
                    break;
            }

            //Validate Bedroom extra copy assets
            if (CurrentRoom.equals("Bedroom")) {
                Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "BRTrytitle");

                onPage = DriverHelpers.getTextfromElementCSS(sRoom + " .amzn2913-dolls-house-overlay-branding .amzn2913-lang-text");

                DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Hover - Expected: \"" + Copy + "\" ; Found : " + onPage);

                DriverHelpers.softAssertTrueWithMessage(true, DriverHelpers.getBgImagefromDivCSS(sRoom + " .amzn2913-dolls-house-overlay-branding-product"));
            }
            else{
                DriverHelpers.softAssertTrueWithMessage(true, DriverHelpers.getBgImagefromDivCSS(sRoom + " .amzn2913-dolls-house-overlay-copy-product-icon"));
            }
             //Validate the common copy
                Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DollshouseCommon1");
                onPage = DriverHelpers.getTextfromElementCSS(sRoom + " .amzn2913-dolls-house-overlay-copy-prompt .amzn2913-lang-text");

                DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Hover - Expected: \"" + Copy + "\" ; Found : " + onPage);


                Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DollshouseCommon2");
                onPage = DriverHelpers.getTextfromElementCSS(sRoom + " .amzn2913-dolls-house-overlay-copy-description > div:nth-child(4) > span");

                DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Hover - Expected: \"" + Copy + "\" ; Found : " + onPage);



            // validate room specific info pane utterances

            Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, sUtterance1);
            onPage = DriverHelpers.getTextfromElementCSS(sRoom + " li:nth-child(1) > span");

            DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Utterance - Expected: \"" + Copy + "\" ; Found : " + onPage);

            Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, sUtterance2);
            onPage = DriverHelpers.getTextfromElementCSS(sRoom + " li:nth-child(2) > span");

            DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Utterance - Expected: \"" + Copy + "\" ; Found : " + onPage);

            Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, sUtterance3);
            onPage = DriverHelpers.getTextfromElementCSS(sRoom + " li:nth-child(3) > span");

            DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Utterance - Expected: \"" + Copy + "\" ; Found : " + onPage);


            // Validate the Try device string
            Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, sProductValue);
            onPage = DriverHelpers.getTextfromElementCSS(sRoom + " .amzn2913-dolls-house-overlay-copy-sub-heading .amzn2913-lang-text");

            DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Hover - Expected: \"" + Copy + "\" ; Found : " + onPage);


            //Validate the room specific Button text for the "go to..." room
            Copy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, sButtonText);
            onPage = DriverHelpers.getTextfromElementCSS(sRoom + " .amzn2913-lozenge-medium .amzn2913-lang-text");

            DriverHelpers.softAssertTrueWithMessage(onPage.equals(Copy), "\"" + CurrentRoom + "\" Hover button - Expected: \"" + Copy + "\" ; Found : \"" + onPage + "\"");


        }
    }


    @When("^the Go to \"([^\"]*)\" button  is selected$")
    public void theGoToButtonIsSelected(String arg0) throws Throwable {
        //Check for the Button to open the room
        try {
            Assert.assertTrue(DriverHelpers.checkForElementCSS(sRoom + " .amzn2913-lozenge-medium"));
        } catch (AssertionError a) {
            System.out.println(a.toString());
            Assert.fail("Could not find Go To Button for: \"" + CurrentRoom + "\" : " + a.toString());
        }

        //String ButtonTextCopy = "Got to" + CurrentRoom;
        // String ButtonCopy = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "dollsHouseLRbutton")

        try {
            DriverHelpers.clickOnElementCSS(sRoom + " .amzn2913-lozenge-medium");
        } catch (Exception e) {
            Assert.fail("Could not click the Go To Button for: \"" + CurrentRoom + "\" : " + e.toString());
        }

    }


    @Then("^the \"([^\"]*)\" screen is displayed$")
    public void theScreenIsDisplayed(String arg0) throws Throwable {

       Thread.sleep(1500);

        setInRoomCSSSelector(arg0);

       // Check correct room container is loaded
        Assert.assertTrue(DriverHelpers.checkForElementCSS(".amzn2913-room-container" + sRoom));
       // Check sidebar has loaded
        Assert.assertTrue(DriverHelpers.checkForElementCSS(".amzn2913-room-sidebar " + sRoom));

    }


    @When("^the Mouse is placed over the \"([^\"]*)\" section of the House$")
    @And("^the Mouse is over the \"([^\"]*)\" section of the House$")
    public void theMouseIsPlacedOverTheSectionOfTheHouse(String arg0) throws Throwable {

        setDollshouseRoomCSSselector(arg0);


        DriverHelpers.hoverOverElementCSS(sRoom);

        Thread.sleep(2000);
    }


    @When("^the \"([^\"]*)\" Screen loads$")
    public void theScreenLoads(String arg0) throws Throwable {

        try {
            DriverHelpers.waitForElementWithTimeoutCSS(sRoom, 1500);
        } catch (Exception e) {
            Assert.fail("could not identify room  background f or - " + arg0 + " Failing test assuming room didn't load - " + e);
        }

        try {
            DriverHelpers.waitForElementWithTimeoutCSS(".amzn2913-room-sidebar", 1500);
        } catch (Exception e) {
            Assert.fail("could not find Sidebar for room - " + arg0 + " Failing test assuming room didn't load: " + e);
        }

    }


    @When("^\"([^\"]*)\" user selects to view the \"([^\"]*)\" scene$")
    @Given("^\"([^\"]*)\" user has selected to view the \"([^\"]*)\" screen$")
    public void userHasSelectedToViewTheScreen(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        iAmAUserWhoHasAccessesTheAdvert(arg0);
        theMouseIsPlacedOverTheSectionOfTheHouse(arg1);
        theGoToButtonIsSelected(arg0);

        Thread.sleep(2500);
    }


    @When("^the \"([^\"]*)\" section is selected$")
    public void theSectionIsSelected(String arg0) throws Throwable {


        setDollshouseRoomCSSselector(arg0);
        DriverHelpers.waitForElementWithTimeoutCSS(sRoom,5000);

        try {
            //DriverHelpers.clickOnElementXPATH("//*[@id=\"amzn2913-injected-content\"]/div/div/div/div[2]/div/div[3]/div");

            //DriverHelpers.hoverOverElementAndClickCSS(sRoom);
            MobileEmulationHelpers.movetoElementandTapCSS(sRoom);
            //DriverHelpers.clickOnElementCSS(sRoom);
            //Thread.sleep(1000);
            //DriverHelpers.clickOnElementCSS(sRoom);

        }catch (Exception e){
            Assert.fail("Unable to click on Dolls house section :" + CurrentRoom + ":\n" + e);
        }
///#amzn2913-injected-content > div > div > div > div.amzn2913-modal-dolls-house-container > div > div.amzn2913-dolls-house-room.amzn2913-dolls-house-room-bedroom
    }

    private void setDollshouseRoomCSSselector(String Room) {
        CurrentRoom = Room;
        switch (CurrentRoom) {
            case "Living Room":
                sRoom = ".amzn2913-dolls-house-room-living-room";
                break;
            case "Kitchen":
                sRoom = ".amzn2913-dolls-house-room-kitchen";
                break;
            case "Bedroom":
                sRoom = ".amzn2913-dolls-house-room-bedroom";
                break;
            default:
                Assert.fail("No Such Room as: " + Room);
                break;


        }
    }

    private void setInRoomCSSSelector(String Room) {

        CurrentRoom = Room;


        switch (Room) {
            case "Living Room":
                sRoom = ".amzn2913-living-room";
                break;
            case "Kitchen":
                sRoom = ".amzn2913-kitchen";
                break;
            case "Bedroom":
                sRoom = ".amzn2913-bedroom";
                break;
            default:
                Assert.fail(sRoom + " does not exist");
                break;
        }
    }

    @And("^the the pop-up asks the user to allow / Don't allow access to the Mircophone$")
    public void theThePopUpAsksTheUserToAllowDonTAllowAccesToTheMircophone() throws Throwable {



    }

    @Then("^user is shown a pop-up$")
    public void userIsShownAPopUp() throws Throwable {



        theScreenLoads(CurrentRoom);
        Assert.assertTrue("Did not detect POP UP for Microphone permissions", DriverHelpers.checkPopUpAppears());

    }

    @Given("^microphone permissions have not yet been set$")
    public void microphonePermissionsHaveNotYetBeenSet() throws Throwable {
        DriverHelpers.allowChromeMicAccess("Allow", "https://s3-eu-west-1.amazonaws.com");

    }


    @Then("^the miniature dolls house is displayed$")
    public void theMiniatureDollsHouseIsDisplayed() throws Throwable {
        Assert.assertTrue("Corner Dolls house not Appearing", DriverHelpers.checkForElementCSS(".amzn2913-corner-house"));
    }

    @When("^the miniature dolls house is clicked$")
    public void theMiniatureDollsHouseIsClicked() throws Throwable {
        Thread.sleep(1500);

        if(DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed()){
            try{
                DriverHelpers.clickOnElementCSS(".amzn2913-disclaimer .amzn2913-close-btn-icon");
            }catch(Exception e){
                DriverHelpers.softAssertTrueWithMessage(false, "Could not close the disclaimer modal \n \n " + e);
            }
        }


        try{
            DriverHelpers.clickOnElementCSS(".amzn2913-corner-house");
        }catch(Exception e){
            DriverHelpers.softAssertTrueWithMessage(false, "Could not click Corner Dolls House \n \n " + e);
        }
    }

    @Then("^the House image overlay appears$")
    public void theHouseImageOverlayAppears() throws Throwable {
        Thread.sleep(500);
        Assert.assertTrue("Corner Dolls house not Appearing", DriverHelpers.findElementbyCSS(".amzn2913-modal .amzn2913-dolls-house").isDisplayed());
}

    @And("^user can Select another room$")
    public void userCanSelectAnotherRoom() throws Throwable {


        switch (CurrentRoom){
            case "Living Room":

                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-room-bedroom").isDisplayed(), "Bedroom Dolls House Pane did not appear on screen");

                theMouseIsPlacedOverTheSectionOfTheHouse("Bedroom");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-bedroom").isDisplayed(), "Hover over bedroom preview info");

                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-room-kitchen").isDisplayed(), "Kitchen Dolls House Pane  did not appear on screen");

                theMouseIsPlacedOverTheSectionOfTheHouse("Kitchen");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-kitchen").isDisplayed(), "Hover over Kitchen preview info");
                break;
            case "Kitchen":
                theMouseIsPlacedOverTheSectionOfTheHouse("Bedroom");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-bedroom").isDisplayed(), "Hover over bedroom preview info");

                theMouseIsPlacedOverTheSectionOfTheHouse("Living Room");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-living-room").isDisplayed(), "Hover over Living room  preview info");
                break;
            case "Bedroom":
                theMouseIsPlacedOverTheSectionOfTheHouse("Living Room");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-living-room").isDisplayed(), "Hover over Living Room preview info");

                theMouseIsPlacedOverTheSectionOfTheHouse("Kitchen");
                DriverHelpers.softAssertTrueWithMessage(DriverHelpers.findElementbyCSS(".amzn2913-dolls-house-overlay-kitchen").isDisplayed(), "Hover over Kitchen  preview info");
                break;
            default:
                Assert.fail(CurrentRoom + " Is not a recognised room");
                break;
        }


    }

    @Then("^user is informed that the microphone is required via a inline modal dialog$")
    public void userIsInformedThatTheMicrophoneIsRequiredViaAInlineModalDialog() throws Throwable {
     try {
         DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
     }catch (Exception e){
         Assert.fail("Could not find expected Disclaimer Modal");
     }

     String micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "MicEnablementHeader");
     String micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer-row .amzn2913-disclaimer-heading");
     DriverHelpers.softAssertTrueWithMessage(micCopyExpected.equals(micCopyActual), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);

     micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "MicEnablementText");
     micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer-row .amzn2913-disclaimer-text");
     DriverHelpers.softAssertTrueWithMessage(micCopyExpected.equals(micCopyActual), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);

    }

    @Then("^user is shown the Short disclaimer text via the inline modal dialog$")
    public void userIsShownTheShortDisclaimerTextViaTheInlineModalDialog() throws Throwable {

        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        }catch (Exception e){
            Assert.fail("Could not find expected Disclaimer Modal");
        }

        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer-row.amzn2913-is-minimised").isDisplayed();
        }catch (Exception e){
            Assert.fail("Could not find expected shortened Disclaimer section");
        }

        String micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DisclaimerHeader");
        String micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer-row.amzn2913-is-minimised .amzn2913-disclaimer-heading");
        DriverHelpers.softAssertTrueWithMessage(micCopyExpected.equals(micCopyActual), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);


        micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DisclaimerTextShort");
        micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer-row.amzn2913-is-minimised .amzn2913-disclaimer-text .amzn2913-lang-text");
        DriverHelpers.softAssertTrueWithMessage(micCopyActual.contains(micCopyExpected), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);

    }

    @Then("^user can see there is a \"([^\"]*)\" Link in the modal dialog$")
    public void userCanSeeThereIsALinkInTheModalDialog(String arg0) throws Throwable {
        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        } catch (Exception e) {
            Assert.fail("Could not find expected Disclaimer Modal");
        }

        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer-row.amzn2913-is-minimised").isDisplayed();
        } catch (Exception e) {
            Assert.fail("Could not find expected shortened Disclaimer section");
        }

        Assert.assertTrue("Failed to locate \"Read More...\" Button" , DriverHelpers.findElementbyCSS(".amzn2913-disclaimer-read-more-btn ").isDisplayed());

        String micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DisclaimerbuttonText");
        String micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer-read-more-btn .amzn2913-lang-text");
        DriverHelpers.softAssertTrueWithMessage(micCopyActual.equals(micCopyExpected), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);


    }


    @Then("^the modal dialogue is expanded to display more Disclaimer information$")
    public void theModalDialogueIsExpandedToDisplayMoreDisclaimerInforMation() throws Throwable {


        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        } catch (Exception e) {
            Assert.fail("Could not find expected Disclaimer Modal");
        }

        Assert.assertTrue("Disclaimer Modal failed to expand", DriverHelpers.verifyElementAbsent(".amzn2913-disclaimer-row.amzn2913-is-minimised"));
        Assert.assertTrue("Disclaimer 'Read more...' Button failed to disappear", DriverHelpers.verifyElementAbsent(".amzn2913-disclaimer-read-more-btn"));


        String micCopyExpected = LanguageHelpers.getCopyTextFromJSONFile(regionCode, "DisclaimerTextFull");
        String micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer > div > div:nth-child(2) .amzn2913-disclaimer-text .amzn2913-lang-text");
        DriverHelpers.softAssertTrueWithMessage(micCopyExpected.equals(micCopyActual), "Expected: " + micCopyExpected + " Got: " + micCopyActual);
//
    }

    @And("^the 'We care about your privacy' section is also shown$")
    public void theWeCareAboutYourPrivacySectionIsAlsoShown() throws Throwable {

        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        } catch (Exception e) {
            Assert.fail("Could not find expected Disclaimer Modal");
        }

        String micCopyExpected =  LanguageHelpers.getCopyTextFromJSONFile(regionCode, "PrivacyHeader");
        String micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer > div > div:nth-child(3) .amzn2913-disclaimer-heading .amzn2913-lang-text");
        DriverHelpers.softAssertTrueWithMessage(micCopyActual.equals(micCopyExpected), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);

        micCopyExpected =  LanguageHelpers.getCopyTextFromJSONFile(regionCode, "PrivacyText");
        micCopyActual = DriverHelpers.getTextfromElementCSS(".amzn2913-disclaimer > div > div:nth-child(3) .amzn2913-disclaimer-text .amzn2913-lang-text");
        DriverHelpers.softAssertTrueWithMessage(micCopyActual.equals(micCopyExpected), "Expected: " + micCopyExpected + " Got: "+ micCopyActual);


    }


    @And("^the microphone and disclaimer modal is displayed$")
    public void theMicrophoneAndDisclaimerModalIsDisplayed() throws Throwable {

        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        }catch (Exception e){
            Assert.fail("Could not find expected Disclaimer Modal");
        }
    }

    @When("^the \"([^\"]*)\" link is selected$")
    public void theLinkIsSelected(String arg0) throws Throwable {
        try {
            DriverHelpers.findElementbyCSS(".amzn2913-disclaimer").isDisplayed();
        } catch (Exception e) {
            Assert.fail("Could not find expected Disclaimer Modal");
        }

        try {
            DriverHelpers.clickOnElementCSS(".amzn2913-disclaimer-read-more-btn");
        } catch (Exception e) {
            Assert.fail("Failed to click 'Read more..' Button \n\n" + e);

        }
    }

    @When("^the Close 'X' link is selected$")
    public void theCloseXLinkIsSelected() throws Throwable {

        try{
            DriverHelpers.clickOnElementCSS(".amzn2913-disclaimer .amzn2913-close-btn-icon");
        }catch(Exception e){
            Assert.fail("Could not close the disclaimer modal \n \n " + e);
        }
    }

    @Then("^the modal closes$")
    public void theModalCloses() throws Throwable {
        Assert.assertTrue("Disclaimer Dialog did not close as expected", DriverHelpers.verifyElementAbsent(".amzn2913-disclaimer"));
    }
}
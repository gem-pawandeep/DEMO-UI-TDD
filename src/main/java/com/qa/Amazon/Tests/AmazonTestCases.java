package com.qa.Amazon.Tests;

import com.gemini.generic.exception.GemException;
import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemJarDataProvider;
import com.gemini.generic.tdd.GemjarTestngBase;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import com.google.gson.JsonObject;
import com.qa.Amazon.Objects.Amazon_locators;
import com.qa.Amazon.Pages.Amazon;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AmazonTestCases extends GemjarTestngBase {

    @BeforeMethod
    public void start() throws GemException {
        DriverManager.setUpBrowser();
    }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void launchedAmazon(JsonObject inputData) {
        try {
            Amazon.ValidatingUrl();
         } catch (Exception e) {
            GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void loginIncorrectCredentials(JsonObject inputData) throws IOException {
        try {
            Amazon.SignIn(inputData.get("email").getAsString(), inputData.get("pass").getAsString());
          } catch (Exception e) {
            GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void validateInstagramHyperlink(JsonObject inputData) throws IOException {
        try {
            Amazon.validateHyperlink(Amazon_locators.insta_link, "instagram");
        } catch (Exception e) {
            GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void validateLangChangeBangla(JsonObject inputData) throws IOException {
          try {
              Amazon.validateLanguage(inputData.get("Bangla").getAsString());
          } catch (Exception e) {
              GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL,DriverAction.takeSnapShot());
          }
      }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void validationAustralia(JsonObject inputData) throws IOException {
        try {
            Amazon.countryValidation(inputData.get("Country").getAsString(), Amazon_locators.Australia, inputData.get("Name").getAsString());
        } catch (Exception e) {
            GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }

    @Test(dataProvider = "GemJarDataProvider", dataProviderClass = GemJarDataProvider.class)
    public void validateCartAfterNavigating(JsonObject inputData) throws IOException {
        try {
            Amazon.cartValidateAfterNavigate(inputData.get("item").getAsString());
        } catch (Exception e) {
            GemTestReporter.addTestStep("Some Error Occurred", e.toString(), STATUS.FAIL, DriverAction.takeSnapShot());
        }
    }


}

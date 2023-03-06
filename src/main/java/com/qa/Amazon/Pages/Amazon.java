package com.qa.Amazon.Pages;


import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import com.qa.Amazon.Objects.Amazon_locators;
import com.qa.Amazon.Utility.Common_functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;

import static com.gemini.generic.ui.utils.DriverAction.takeSnapShot;

public class Amazon {
    public static void ValidatingUrl() throws IOException {
        STATUS flag;
        String s = "";
        s = DriverAction.getTitle(DriverAction.getCurrentURL());
        if (s.contains("Amazon.in")) {
            GemTestReporter.addTestStep("Validating URL", "Expected: Amazon.in<br>Current: Amazon.in", STATUS.PASS, takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Validating URL", "Expected: Amazon.in<br>Current: " + DriverAction.getTitle(DriverAction.getCurrentURL()), STATUS.FAIL, takeSnapShot());
        }
        flag = DriverAction.minimizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Minimize browser", STATUS.PASS);
        flag = DriverAction.maximizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Maximize browser", STATUS.PASS);
        GemTestReporter.addTestStep("Size of browser", DriverAction.getBrowserSize().toString(), STATUS.PASS);
        DriverAction.setBrowserSize(1200, 644);
        GemTestReporter.addTestStep("Browser Location", DriverAction.getBrowserLocation().toString(), STATUS.PASS);
    }
    public static void SignIn(String email, String pass) throws IOException {
        Common_functions.signInAmazon(email, pass);
    }
    public static void validateHyperlink(By link, String item) throws IOException {
        STATUS flag;
       flag= Common_functions.hyperLinkValidation(link, item);
        if (flag!=STATUS.PASS) {
            return;
        }
        flag = DriverAction.minimizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Minimize browser", STATUS.PASS);
       
        flag = DriverAction.maximizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Maximize browser", STATUS.PASS);
        GemTestReporter.addTestStep("Size of browser", DriverAction.getBrowserSize().toString(), STATUS.PASS);
        DriverAction.setBrowserSize(1200, 644);
       
        DriverAction.setBrowserSize(1200, 644);
       
        GemTestReporter.addTestStep("Browser Location", DriverAction.getBrowserLocation().toString(), STATUS.PASS);
    }
    public static void validateLanguage(String lang) throws IOException {
        STATUS flag;
        flag = DriverAction.click(Amazon_locators.lang_button, "language");
        if (flag!=STATUS.PASS) {
            return;
        }
       
        if (lang.equals("hi")) {
            flag = DriverAction.click(Amazon_locators.hindi, "Hindi");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String hindi = DriverAction.getCurrentURL();
            if (hindi.contains("hi")) {
                GemTestReporter.addTestStep("Validation", "Current page in Hindi Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Hindi Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("ta")) {
            flag = DriverAction.click(Amazon_locators.tamil, "Tamil");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("ta")) {
                GemTestReporter.addTestStep("Validation", "Current page in Tamil Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Tamil Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("te")) {
            flag = DriverAction.click(Amazon_locators.telgu, "Telgu");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("te")) {
                GemTestReporter.addTestStep("Validation", "Current page in Telgu Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Telgu Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("kn")) {
            flag = DriverAction.click(Amazon_locators.Kannda, "Kannada");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("kn")) {
                GemTestReporter.addTestStep("Validation", "Current page in Kannada Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Kannada Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("ml")) {
            flag = DriverAction.click(Amazon_locators.malyalam, "Malyalam");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("ml")) {
                GemTestReporter.addTestStep("Validation", "Current page in Malyalam Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Malyalam Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("bn")) {
            flag = DriverAction.click(Amazon_locators.bangla, "Bangla");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("bn")) {
                GemTestReporter.addTestStep("Validation", "Current page in Bangla Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Bangla Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("mr")) {
            flag = DriverAction.click(Amazon_locators.marathi, "Marathi");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("mr")) {
                GemTestReporter.addTestStep("Validation", "Current page in Marathi Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in Marathi Language", STATUS.FAIL, takeSnapShot());
            }
        } else if (lang.equals("en")) {
            flag = DriverAction.click(Amazon_locators.English, "English");
            if (flag!=STATUS.PASS) {
                return;
            }
            flag = DriverAction.click(Amazon_locators.lang_submit, "Save changes");
            if (flag!=STATUS.PASS) {
                return;
            }
           
            String eng = DriverAction.getCurrentURL();
            if (eng.contains("en")) {
                GemTestReporter.addTestStep("Validation", "Current page in English Language<br>", STATUS.PASS, takeSnapShot());
            } else {
                GemTestReporter.addTestStep("Validation", "Current page Not in English Language", STATUS.FAIL, takeSnapShot());
            }
        }

    }
    public static void countryValidation(String verify, By xpath, String name) throws IOException {
        STATUS flag;
        flag = DriverAction.click(xpath, name);
        if (flag!=STATUS.PASS) {
            return;
        }
       
        String s = DriverAction.getCurrentURL();
        if (s.contains(verify)) {
            GemTestReporter.addTestStep("Validate Country", name, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Validate Country ", name, STATUS.FAIL, takeSnapShot());
            return;
        }
        flag = DriverAction.minimizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Minimize browser", STATUS.PASS);
       
        flag = DriverAction.maximizeBrowser();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("action", "Maximize browser", STATUS.PASS);
        GemTestReporter.addTestStep("Size of browser", DriverAction.getBrowserSize().toString(), STATUS.PASS);
        DriverAction.setBrowserSize(1200, 644);
       
        GemTestReporter.addTestStep("Browser Location", DriverAction.getBrowserLocation().toString(), STATUS.PASS);
    }
    public static void cartValidateAfterNavigate(String item) throws IOException {
        STATUS flag;
        Common_functions.search(item);
        flag = DriverAction.click(Amazon_locators.first_result, "first result");
        if (flag!=STATUS.PASS) {
            return;
        }
        ArrayList<String> newTb = new ArrayList<>(DriverAction.getWindowHandles());
        GemTestReporter.addTestStep("Action", "Switching control to new Tab", STATUS.PASS);
        DriverAction.switchToWindow(newTb.get(1));
        String temp1 = DriverAction.getElementText(Amazon_locators.tittle);
        flag = DriverAction.click(Amazon_locators.addToCart, "Add to cart");
        if (flag!=STATUS.PASS) {
            return;
        }
       
        flag = DriverAction.click(Amazon_locators.cart_icon, "Cart");
        if (flag!=STATUS.PASS) {
            return;
        }
        String temp2 = DriverAction.getElementText(Amazon_locators.cartTitle);
        String a = temp1.substring(0, 30);
        String b = temp2.substring(0, 30);
        String verify = "";
        if (a.equals(b)) {
            GemTestReporter.addTestStep("Validation", temp1 + " added Successfully to Cart", STATUS.PASS, takeSnapShot());
            verify = temp1;
        } else {
            GemTestReporter.addTestStep("Validation", "Unsuccessful to add", STATUS.FAIL, takeSnapShot());
        }
        flag = DriverAction.navigateToUrl("https://www.google.com/");
        if (flag!=STATUS.PASS) {
            return;
        }
        flag = DriverAction.navigateBack();
        if (flag!=STATUS.PASS) {
            return;
        }
        GemTestReporter.addTestStep("Validation", verify + " is present in Cart", STATUS.PASS, takeSnapShot());
        DriverAction.closeCurrentTab();
        DriverAction.switchToWindow(newTb.get(0));
    }

}

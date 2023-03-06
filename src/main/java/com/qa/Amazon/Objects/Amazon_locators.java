package com.qa.Amazon.Objects;

import org.openqa.selenium.By;

public class Amazon_locators {
    public static By sign_in_button = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    public static By user_name_box = By.xpath("//input[@type='email']");
    public static By Continue_button = By.xpath("//input[@type='submit']");
    public static By user_password_box = By.xpath("//input[@type='password']");
    public static By cart_icon = By.xpath("//a[@id='nav-cart']");
    public static By search_Box = By.xpath("//input[@id='twotabsearchtextbox']");
    public static By search_Button = By.xpath("//input[@value='Go']");
    public static By first_result = By.xpath("//*[@data-image-index='1']");
    public static By tittle = By.xpath("//span[@id='productTitle']");
    public static By insta_link = By.xpath("//*[@id='navFooter']//div[3]//li[3]//a");
    public static By lang_button = By.xpath("//span[@class='icp-nav-link-inner']");
    public static By English = By.xpath("//*[@id='icp-language-settings']/div[2]");
    public static By hindi = By.xpath("//*[@id='icp-language-settings']/div[3]");
    public static By tamil = By.xpath("//*[@id='icp-language-settings']/div[4]");
    public static By telgu = By.xpath("//*[@id='icp-language-settings']/div[5]");
    public static By Kannda = By.xpath("//*[@id='icp-language-settings']/div[6]");
    public static By malyalam = By.xpath("//*[@id='icp-language-settings']/div[7]");
    public static By bangla = By.xpath("//*[@id='icp-language-settings']/div[8]");
    public static By marathi = By.xpath("//*[@id='icp-language-settings']/div[9]");
    public static By lang_submit = By.xpath("//input[@aria-labelledby='icp-save-button-announce']");
    public static By addToCart=By.xpath("//input[@id='add-to-cart-button']");
    public static By cartTitle=By.xpath("//span[@class='a-truncate-cut']");
    public static By Australia=By.xpath("//*[@id='navFooter']/div[4]//li[1]");

}



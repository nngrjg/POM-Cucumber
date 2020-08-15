package stepdef;

import base.CommonUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DressesPage;
import pages.HomePage;

import static base.CommonUtil.takeScreenshot;

public class MyStepdefs {
    CommonUtil commonUtil = new CommonUtil();

    @Given("User launches Automation Demo page")
    public void userLaunchesAutomationDemoPage() {
        System.out.println("User launched Automation demo page successfully");
        takeScreenshot("HomePage");
    }


}

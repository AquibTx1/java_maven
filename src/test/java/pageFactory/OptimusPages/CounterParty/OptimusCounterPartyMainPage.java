package pageFactory.OptimusPages.CounterParty;

import org.openqa.selenium.By;

public class OptimusCounterPartyMainPage {
    //Navigation and pages labels
    public static By counterParty_MainTab = By.xpath("//div[@class='optimus_nav']/ul/li/a[contains(text(),'Counterparty')]");
    //Counter Party Home Page
    public static By counterPartyMain_WelcomeText = By.cssSelector("._title_q9zok_1");
    public static By counterPartyMain_HomeLink = By.xpath("//div[@class='ant-breadcrumb _content_link_1r8hv_1']/span[1]/span/a[contains(text(),'Home')]");
    //Counter Party Side Panel
    public static By counterPartyMain_Tasks = By.xpath("//span[@aria-label='profile']//parent::li");
    public static By counterPartyMain_Counterparties = By.xpath("//span[@aria-label='user']//parent::li");
    public static By counterPartyMain_RelatedParties = By.xpath("//span[@aria-label='user-switch']//parent::li");
    public static By relatedParties_ListTab = By.xpath("//div[@class='ant-tabs-nav-list']/div/div[@class='ant-tabs-tab-btn'][contains(text(),'Related Party List')]");
    public static By relatedParties_NewRelatedPartyTab = By.xpath("//div[@class='ant-tabs-nav-list']/div/div[@class='ant-tabs-tab-btn']/span[contains(text(),'New Related Party')]");

    public static By counterPartyMain_Services = By.xpath("//span[@aria-label='solution']//parent::li");

}

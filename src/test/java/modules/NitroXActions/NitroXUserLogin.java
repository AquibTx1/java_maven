package modules.NitroXActions;

import pageFactory.NitroXPages.NitroXLoginPage;
import utilities.KeywordUtil;

import java.util.HashMap;

public class NitroXUserLogin {


/*    public static void login(HashMap<String,String> dataMap) throws Exception
    {
        KeywordUtil.inputText(NitroXLoginPage.username, dataMap.get("Username"), "Enter the username");
        KeywordUtil.delay(3000);
        KeywordUtil.inputText(NitroXLoginPage.password, dataMap.get("Password"), "Enter the password");
        KeywordUtil.delay(2000);
        KeywordUtil.click(NitroXLoginPage.loginbtn, "Click on Sign on Button");
    }*/

    public static void enterusername(HashMap<String,String> dataMap)
    {
        KeywordUtil.inputText(NitroXLoginPage.username, dataMap.get("Username"), "Enter the username");

    }

    public static void enterpassword(HashMap<String,String> dataMap)
    {
        KeywordUtil.inputText(NitroXLoginPage.password, dataMap.get("Password"), "Enter the password");
    }

    public static void clickloginbtn()
    {

        KeywordUtil.click(NitroXLoginPage.loginbtn, "Click on Submit Button");
    }

}

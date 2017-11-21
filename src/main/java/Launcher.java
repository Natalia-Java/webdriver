import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {
    public static void main (string[] args) {

        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

/*task 1*/
        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("webinar.test@gmail.com");

        WebElement fieldPassw = driver.findElement(By.id("passwd"));
        fieldPassw.sendKeys("webinar.test@gmail.com");

        WebElement buttonLog = driver.findElement(By.name("submitLogin"));
        buttonLog.click();

        Thread.sleep(1000);

        WebElement buttonEmpl = driver.findElement(By.id("employee_infos"));
        buttonEmpl.click();

        WebElement buttonLogout = driver.findElement(By.id("header_logout"));
        buttonLogout.click();

/*task 2*/
        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("webinar.test@gmail.com");

        WebElement fieldPassw = driver.findElement(By.id("passwd"));
        fieldPassw.sendKeys("webinar.test@gmail.com");

        WebElement buttonLog = driver.findElement(By.name("submitLogin"));
        buttonLog.click();

        Thread.sleep(1000);

        WebElement buttonOrders = driver.findElement(By.id("subtab-AdminParentOrders"));
        System.out.println(buttonOrders.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminOrders&token=7ead7bce03989a6d951ba373a5ea1b19");
        driver.navigate().refresh();

        WebElement buttonCatalog = driver.findElement(By.id("subtab-AdminCatalog"));
        buttonCatalog.click();
        System.out.println(buttonCatalog.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php/product/catalog?_token=MhJ7XvFbFABuafSSy00maC02AstAP5-_OJxVHpO_UIQ");
        driver.navigate().refresh();

        WebElement buttonCustomer = driver.findElement(By.id("subtab-ParentCustomer"));
        buttonCustomer.click();
        System.out.println(buttonCustomer.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCustomers&token=b56060bd9f0cb797ff4dcde04c01cfc4");
        driver.navigate().refresh();

        WebElement buttonSupport = driver.findElement(By.id("subtab-ParentCustomerThreads"));
        buttonSupport.click();
        System.out.println(buttonSupport.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCustomerThreads&token=b72b285f411234bc7ba612bcc0bb27534");
        driver.navigate().refresh();

        WebElement buttonStat = driver.findElement(By.id("subtab-AdminStats"));
        buttonStat.click();
        System.out.println(buttonStat.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCustomerThreads&token=b72b285f411234bc7ba612bcc0bb2753");
        driver.navigate().refresh();

        WebElement buttonModules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        buttonModules.click();
        System.out.println(buttonModules.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCustomerThreads&token=b72b285f411234bc7ba612bcc0bb2753");
        driver.navigate().refresh();

        WebElement buttonDesign = driver.findElement(By.id("subtab-AdminParentThemes"));
        buttonDesign.click();
        System.out.println(buttonDesign.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminThemes&token=603e494fd3ebb9ddaf660d330d0b1859");
        driver.navigate().refresh();

        WebElement buttonShip = driver.findElement(By.id("subtab-AdminParentShipping"));
        buttonShip.click();
        System.out.println(buttonShip.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminCarriers&token=156307263942398a6142e9fc48162c14");
        driver.navigate().refresh();

        WebElement buttonPay = driver.findElement(By.id("subtab-AdminParentPayment"));
        buttonPay.click();
        System.out.println(buttonPay.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminPayment&token=bfe6ad64854386c873494fd39be0b4e8");
        driver.navigate().refresh();

        WebElement buttonInter = driver.findElement(By.id("subtab-AdminInternational"));
        buttonInter.click();
        System.out.println(buttonInter.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLocalization&token=98abda437ca18e031a65c5800f71531f");
        driver.navigate().refresh();

        WebElement buttonGeneral = driver.findElement(By.id("subtab-ShopParameters"));
        buttonGeneral.click();
        System.out.println(buttonGeneral.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminPreferences&token=eab3b5465b8b5e57e1970c30fa6177a2");
        driver.navigate().refresh();

        WebElement buttonConf = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        buttonConf.click();
        System.out.println(buttonConf.getText());
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminInformation&token=d73629422b5336ea7b345e4457769bcd");
        driver.navigate().refresh();






    }
public static WebDriver initChromeDriver (){
    System.setProperty("webdriver.chrome.driver", System.getProperty("User.dir") + "/drivers/chromedriver.exe" );
    return new ChromeDriver();

}
}

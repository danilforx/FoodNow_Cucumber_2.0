package foodnow.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BaseHelper {


    public static WebDriver driver;
    public JavascriptExecutor js;

    public WebDriverWait wait;
    Logger logger = LoggerFactory.getLogger(BaseHelper.class);


    public BaseHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    protected void typeScrollWithJS(WebElement element, String text, int y) {
        if (text != null) {
            clickWitJS(element, 0, y);
            element.clear();
            element.sendKeys(text);
        }
    }

    protected void clickWitJS(WebElement element, int x, int y) {
        // js.executeScript("window.scrollBy(100,200)");
        // x - сколько пикселей прокрутить по горизонтали
        // y - сколько пикселей прокрутить по вертикали
        //  js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        //js.executeScript("window.scrollBy({},{})",x,y);
        click(element);
    }

    protected void click(WebElement element) {
        scrollToElement(element);
        element.click();

    }

    protected void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    protected boolean isElementPresent(By locator) {
        // logger.info("Проверка есть ли элемент [" + locator + "] на странице");
        return driver.findElements(locator).size() > 0;
    }


    protected boolean isAlertPresent() { // Проверка наличия алерта
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        try {
            logger.warn("Alert has text: [" + alert.getText() + "]");
            alert.accept();
            return true;
        } catch (Exception ignore) {
            return false;
        }
    }

    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds); // Adding a pause of 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void scrollToElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void scrollTo(int y) {
        js.executeScript("window.scrollBy(" + 0 + "," + y + ")");
    }

    public void scrollWithPageDown(int count, int delay){
        try {
            Robot robot = new Robot();
            for(int i = 0; i < count; i++){
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                robot.delay(delay);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}

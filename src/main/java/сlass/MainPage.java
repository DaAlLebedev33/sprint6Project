package сlass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    // Локаторы элементов главной страницы:
    // Кнопка «Заказать» вверху страницы
    private By aboveToOrderButton = By.xpath("//button[@class='Button_Button__ra12g']");

    // Кнопка «Заказать" после заголовка "Как это работает"
    private By belowToOrderButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button[contains(text(), 'Заказать')]");

    // Кнопка внутри окна куки
    private By cookieButton = By.xpath("//button[contains(text(), 'да все привыкли')]");

    // Элементы выпадающего списка «Вопросы о важном»:

    // Вопрос 1 - Сколько это стоит? И как оплатить?
    private By question1 = By.id("accordion__heading-0");
    private By response1 = By.id("accordion__panel-0");

    // Вопрос 2 - Хочу сразу несколько самокатов! Так можно?
    private By question2 = By.id("accordion__heading-1");
    private By response2 = By.id("accordion__panel-1");

    // Вопрос 3 - Как рассчитывается время аренды?
    private By question3 = By.id("accordion__heading-2");
    private By response3 = By.id("accordion__panel-2");

    // Вопрос 4 - Можно ли заказать самокат прямо на сегодня?
    private By question4 = By.id("accordion__heading-3");
    private By response4 = By.id("accordion__panel-3");

    // Вопрос 5 - Можно ли продлить заказ или вернуть самокат раньше?
    private By question5 = By.id("accordion__heading-4");
    private By response5 = By.id("accordion__panel-4");

    // Вопрос 6 - Вы привозите зарядку вместе с самокатом?
    private By question6 = By.id("accordion__heading-5");
    private By response6 = By.id("accordion__panel-5");

    // Вопрос 7 - Можно ли отменить заказ?
    private By question7 = By.id("accordion__heading-6");
    private By response7 = By.id("accordion__panel-6");

    // Вопрос 8 - Я живу за МКАДом, привезёте?
    private By question8 = By.id("accordion__heading-7");
    private By response8 = By.id("accordion__panel-7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickCookieButton() {
        driver.findElement(cookieButton).click();
        return this;
    }

    public MainPage clickOrderDown() {
        scrollToOrderDown();
        driver.findElement(belowToOrderButton).click();
        return this;
    }

    public void clickAboveToOrderButton() {
        driver.findElement(aboveToOrderButton).click();
    }

    public void scrollToOrderDown() {
        WebElement orderDownElement = driver.findElement(belowToOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", orderDownElement);
    }

    public void clickQuestion1() {
        driver.findElement(question1).click();
    }

    public String getResponse1() {
        return driver.findElement(response1).getText();
    }

    public void clickQuestion2() {
        driver.findElement(question2).click();
    }

    public String getResponse2() {
        return driver.findElement(response2).getText();
    }

    public void clickQuestion3() {
        driver.findElement(question3).click();
    }

    public String getResponse3() {
        return driver.findElement(response3).getText();
    }

    public void clickQuestion4() {
        driver.findElement(question4).click();
    }

    public String getResponse4() {
        return driver.findElement(response4).getText();
    }

    public void clickQuestion5() {
        driver.findElement(question5).click();
    }

    public String getResponse5() {
        return driver.findElement(response5).getText();
    }

    public void clickQuestion6() {
        driver.findElement(question6).click();
    }

    public String getResponse6() {
        return driver.findElement(response6).getText();
    }

    public void clickQuestion7() {
        driver.findElement(question7).click();
    }

    public String getResponse7() {
        return driver.findElement(response7).getText();
    }

    public void clickQuestion8() {
        driver.findElement(question8).click();
    }

    public String getResponse8() {
        return driver.findElement(response8).getText();
    }
}
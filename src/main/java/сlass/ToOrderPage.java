package сlass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToOrderPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Поле "Имя"
    private By nameInput = By.xpath("//input[@placeholder='* Имя']");

    // Поле "Фамилия"
    private By surnameInput = By.xpath("//input[@placeholder='* Фамилия']");

    // Поле "Адрес"
    private By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

    // Поле "Станция метро"
    private By metroInput = By.xpath("//input[@placeholder='* Станция метро']");

    // Поле "Телефон"
    private By phoneInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Кнопка "Далее"
    private By nextButton = By.xpath(".//button[contains(text(), 'Далее')]");

    // Поле "Дата доставки"
    private By dateInput = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    // Поле "Срок аренды"
    private By rentalPeriod = By.className("Dropdown-root");

    // Срок аренды

    // Сутки
    private By rentalPeriodOneDay = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");

    // Двое суток
    private By rentalPeriodTwoDays = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");

    // Трое суток
    private By rentalPeriodThreeDays = By.xpath("//div[@class='Dropdown-menu']//div[text()='Трое суток']");

    // Четверо суток
    private By rentalPeriodFourDays = By.xpath("//div[@class='Dropdown-menu']//div[text()='Четверо суток']");

    // Пять суток
    private By rentalPeriodFiveDays = By.xpath("//div[@class='Dropdown-menu']//div[text()='Пятеро суток']");

    // Шесть суток
    private By rentalPeriodSixDays = By.xpath("//div[@class='Dropdown-menu']//div[text()='Шестеро суток']");

    // Семь суток
    private By rentalPeriodSevenDays = By.xpath("//div[@class='Dropdown-menu']//div[text()='Семеро суток']");


    // Чекбоксы для выбора цвета самоката
    private By colorBlack = By.id("black");
    private By colorGrey = By.id("grey");

    // Поле "Комментарий"
    private By commentInput = By.xpath("//input[@placeholder='Комментарий для курьера']");

    // Кнопка "Заказать"
    private By toOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // Кнопка подтверждения "Да"
    private By yesButton = By.xpath(".//button[contains(text(), 'Да')]");

    // Сообщение об успешном создании заказа
    private By successMessage = By.xpath("//div[contains(@class, 'Order_ModalHeader') and text()='Заказ оформлен']");

    // Окно подтверждения оформления заказа
    private By windowMassage = By.xpath("//div[contains(@class, 'Order_ModalHeader__3FDaJ') and text()='Хотите оформить заказ?']");

    public ToOrderPage clickYesButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(yesButton));
        driver.findElement(yesButton).click();
        return this;
    }

    public ToOrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fillName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void fillSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);
    }

    public void fillAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }

    public void selectMetro(String metro) {
        driver.findElement(metroInput).sendKeys(metro);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='" + metro + "']"))).click();
    }

    public void fillPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }

    public void fillDate(String date) {
        driver.findElement(dateInput).sendKeys(date);
        driver.findElement(dateInput).sendKeys("\n");
    }

    public void selectRentalPeriodOneDay() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodOneDay)).click();
    }

    public void selectRentalPeriodTwoDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodTwoDays)).click();
    }

    public void selectRentalPeriodThreeDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodThreeDays)).click();
    }

    public void selectRentalPeriodFourDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodFourDays)).click();
    }

    public void selectRentalPeriodFiveDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodFiveDays)).click();
    }

    public void selectRentalPeriodSixDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodSixDays)).click();
    }

    public void selectRentalPeriodSevenDays() {
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriod)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rentalPeriodSevenDays)).click();
    }

    public void selectRentalPeriodByKey(String key) {
        switch (key) {
            case "oneDay":
                selectRentalPeriodOneDay();
                break;
            case "twoDays":
                selectRentalPeriodTwoDays();
                break;
            case "threeDays":
                selectRentalPeriodThreeDays();
                break;
            case "fourDays":
                selectRentalPeriodFourDays();
                break;
            case "fiveDays":
                selectRentalPeriodFiveDays();
                break;
            case "sixDays":
                selectRentalPeriodSixDays();
                break;
            case "sevenDays":
                selectRentalPeriodSevenDays();
                break;
            default:
                selectRentalPeriodOneDay();
                break;
        }
    }

    public void selectColor(String color) {
        if (color.equals("black")) {
            driver.findElement(colorBlack).click();
        } else if (color.equals("grey")) {
            driver.findElement(colorGrey).click();
        }
    }

    public void fillComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }

    public void clickOrder() {
        driver.findElement(toOrderButton).click();
    }

    public void confirmOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();
    }

    public boolean isOrderSuccess() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }

    public boolean isWindowCheck() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(windowMassage));
        return true;
    }
}
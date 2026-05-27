import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import сlass.BasicMethods;
import сlass.MainPage;
import сlass.ToOrderPage;

public class ToOrderTest {

    @ParameterizedTest
    @CsvSource({
            "Егор, Иванов, ул. Ленина 1, Сокольники, 89961234341, 01.05.2026, oneDay, black, Привет!",
            "Анна, Иванова, ул. Ленина 2, Комсомольская, 89977654765, 02.05.2026, twoDays, grey, Ждёмс"
    })
    public void positiveToOrderChrome(String name, String surname, String address,
                                      String metro, String phone, String date, String rentalPeriod,
                                      String color, String comment) {

        BasicMethods basicMethods = new BasicMethods();
        basicMethods.setUp("Chrome");

        MainPage mainPage = new MainPage(basicMethods.driver);
        ToOrderPage toOrderPage = new ToOrderPage(basicMethods.driver);

        mainPage.clickCookieButton();
        mainPage.clickAboveToOrderButton();



        toOrderPage.fillName(name);
        toOrderPage.fillSurname(surname);
        toOrderPage.fillAddress(address);
        toOrderPage.selectMetro(metro);
        toOrderPage.fillPhone(phone);
        toOrderPage.clickNext();

        toOrderPage.fillDate(date);
        toOrderPage.selectRentalPeriodByKey(rentalPeriod);
        toOrderPage.selectColor(color);
        toOrderPage.fillComment(comment);
        toOrderPage.clickOrder();
        toOrderPage.confirmOrder();

        toOrderPage.clickYesButton();

        Assertions.assertTrue(toOrderPage.isWindowCheck(), "Заказ не был оформлен успешно в Chrome");

        basicMethods.tearDown();
    }

    @ParameterizedTest
    @CsvSource({
            "Илья, Петров, ул. Лакина 1, Сокольники, 89911234765, 01.05.2026, oneDay, black, Привет!",
            "Ольга, Иванова, ул. Собакина 2, Комсомольская, 89917654123, 02.05.2026, twoDays, grey, ПОБЫСТРЕЕ"
    })
    public void positiveToOrderFirefox(String name, String surname, String address,
                                       String metro, String phone, String date, String rentalPeriod,
                                       String color, String comment) {

        BasicMethods basicMethods = new BasicMethods();
        basicMethods.setUp("Firefox");

        MainPage mainPage = new MainPage(basicMethods.driver);
        ToOrderPage toOrderPage = new ToOrderPage(basicMethods.driver);

        mainPage.clickCookieButton();
        mainPage.clickOrderDown();


        toOrderPage.fillName(name);
        toOrderPage.fillSurname(surname);
        toOrderPage.fillAddress(address);
        toOrderPage.selectMetro(metro);
        toOrderPage.fillPhone(phone);
        toOrderPage.clickNext();

        toOrderPage.fillDate(date);
        toOrderPage.selectRentalPeriodByKey(rentalPeriod);
        toOrderPage.selectColor(color);
        toOrderPage.fillComment(comment);
        toOrderPage.clickOrder();
        toOrderPage.confirmOrder();

        Assertions.assertTrue(toOrderPage.isOrderSuccess(), "Заказ был оформлен успешно в Firefox");

        basicMethods.tearDown();
    }
}
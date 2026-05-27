import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import сlass.BasicMethods;
import сlass.MainPage;

public class DropdownTests {
    private MainPage mainPage;
    private BasicMethods basicMethods;

    @BeforeEach
    public void init() {
        basicMethods = new BasicMethods();
        basicMethods.setUp("Chrome");
        mainPage = new MainPage(basicMethods.driver);
        mainPage.clickCookieButton();
    }

    @ParameterizedTest
    @CsvSource({
            "1, Сколько это стоит? И как оплатить?",
            "2, Хочу сразу несколько самокатов! Так можно?",
            "3, Как рассчитывается время аренды?",
            "4, Можно ли заказать самокат прямо на сегодня?",
            "5, Можно ли продлить заказ или вернуть самокат раньше?",
            "6, Вы привозите зарядку вместе с самокатом?",
            "7, Можно ли отменить заказ?",
            "8, Я живу за МКАДом, привезёте?"
    })
    public void checkAccordionText(int questionNumber, String expectedQuestion) {
        switch (questionNumber) {
            case 1:
                mainPage.clickQuestion1();
                Assertions.assertFalse(mainPage.getResponse1().isEmpty(), "Ответ на вопрос 1 пустой");
                break;
            case 2:
                mainPage.clickQuestion2();
                Assertions.assertFalse(mainPage.getResponse2().isEmpty(), "Ответ на вопрос 2 пустой");
                break;
            case 3:
                mainPage.clickQuestion3();
                Assertions.assertFalse(mainPage.getResponse3().isEmpty(), "Ответ на вопрос 3 пустой");
                break;
            case 4:
                mainPage.clickQuestion4();
                Assertions.assertFalse(mainPage.getResponse4().isEmpty(), "Ответ на вопрос 4 пустой");
                break;
            case 5:
                mainPage.clickQuestion5();
                Assertions.assertFalse(mainPage.getResponse5().isEmpty(), "Ответ на вопрос 5 пустой");
                break;
            case 6:
                mainPage.clickQuestion6();
                Assertions.assertFalse(mainPage.getResponse6().isEmpty(), "Ответ на вопрос 6 пустой");
                break;
            case 7:
                mainPage.clickQuestion7();
                Assertions.assertFalse(mainPage.getResponse7().isEmpty(), "Ответ на вопрос 7 пустой");
                break;
            case 8:
                mainPage.clickQuestion8();
                Assertions.assertFalse(mainPage.getResponse8().isEmpty(), "Ответ на вопрос 8 пустой");
                break;
            default:
                Assertions.fail("Неверный номер вопроса: " + questionNumber);
        }
    }
}

package tests;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    void GoogleTestSearch() {
        open("https://www.google.com/");
        $("[name=q]").val("Selenide").pressEnter();
        $("#center_col").shouldHave(text("Selenide is a framework for test automation powered by Selenium WebDriver"));
    }
}
package github;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverForSolutions {

    SelenideElement title = $(".h1-mktg.mb-3");

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
    }
    @Test
    void searchJUnit5CodeTest() {
        open("/selenide/selenide");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        title.shouldHave(text("Build like the best"));
    }
}

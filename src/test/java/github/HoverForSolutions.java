package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverForSolutions {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void searchJUnit5CodeTest() {

        open("/selenide/selenide");


        // Подвести курсор
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(visible);


        //$("a#wiki-tab").click();
        //$("#wiki-pages-filter").setValue("SoftAssertions");
        //$(byText("SoftAssertions")).click();
        //$("div#wiki-content").shouldHave(text("2. Using JUnit4 just describe rule inside test class:"));
    }



}

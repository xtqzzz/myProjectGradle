package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }
    @Test
    void searchJUnit5CodeTest() {
        open("/drag_and_drop");
        // option 1:
        $("#column-a").dragAndDropTo($("#column-b"));
        // option 2: actions().moveToElement($(byText("A"))).clickAndHold().moveByOffset(250, 0).release().perform();
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }
}

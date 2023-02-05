package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchJUnit5CodeTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");


        actions().moveToElement($(byText("A"))).clickAndHold().moveByOffset(250, 0).release().perform();
        $("#column-b").shouldHave(text("A"));



    }


}

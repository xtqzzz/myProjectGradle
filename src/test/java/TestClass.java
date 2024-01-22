import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestClass {
    @Test
    public void test() {
        open("https://web.telegram.org/a/");
    }
}

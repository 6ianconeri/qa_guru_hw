package lessonThree;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest implements PracticeFormPage, PracticeSubmittingfForm {
    private final String URL = "/automation-practice-form";
    private final String path = "src\\test\\resources\\1212.png";
    private final String shortFilePath = "1212.png";
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void successTest() {
        open(URL);

        PracticeFormPage.fillAllFields("Kirill",
                "Patlay", "abc@mail.com", "1234567890", "September",
                "2005", "18", "English", path, "Kazan", "NCR", "Delhi");

        PracticeSubmittingfForm.checkAllFields("Kirill",
                "Patlay", "abc@mail.com", "Male", "1234567890",
                "September", "2005", "18", "English", "Sports", shortFilePath, "Kazan", "NCR", "Delhi");

        PracticeSubmittingfForm.checkSubmittingText();
    }

}

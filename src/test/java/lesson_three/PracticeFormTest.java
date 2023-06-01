package lesson_three;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    PracticeSubmittingfForm practiceSubmittingfForm = new PracticeSubmittingfForm();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
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

        practiceFormPage.fillAllFields("Kirill",
                "Patlay", "abc@mail.com", "1234567890", "September",
                "2005", "18", "English", path, "Kazan", "NCR", "Delhi");

        practiceSubmittingfForm.checkAllFields("Kirill",
                "Patlay", "abc@mail.com", "Male", "1234567890",
                "September", "2005", "18", "English", "Sports", shortFilePath, "Kazan", "NCR", "Delhi");

        practiceSubmittingfForm.checkSubmittingText();
    }

}

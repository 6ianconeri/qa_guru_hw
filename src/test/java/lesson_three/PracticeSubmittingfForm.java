package lesson_three;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeSubmittingfForm {

    SelenideElement studentName = $(".table-responsive").$(byText("Student Name")).parent();
    SelenideElement studentEmail = $(".table-responsive").$(byText("Student Email")).parent();
    SelenideElement studentGender = $(".table-responsive").$(byText("Gender")).parent();
    SelenideElement studentMobileNumber = $(".table-responsive").$(byText("Mobile")).parent();
    SelenideElement studentBirthDay = $(".table-responsive").$(byText("Date of Birth")).parent();
    SelenideElement studentSubjects = $(".table-responsive").$(byText("Subjects")).parent();
    SelenideElement studentHobbies = $(".table-responsive").$(byText("Hobbies")).parent();
    SelenideElement studentPicture = $(".table-responsive").$(byText("Picture")).parent();
    SelenideElement studentAddress = $(".table-responsive").$(byText("Address")).parent();
    SelenideElement studentStateAndCity = $(".table-responsive").$(byText("State and City")).parent();
    SelenideElement submittingText = $(byText("Thanks for submitting the form"));

     void checkAllFields(String firstName, String lastName, String email, String gender,
                        String mobileNumber, String month, String year,
                        String day, String subject, String hobbie, String shortFilePath, String currentAddress,
                        String state, String city) {
        studentName.shouldHave(text(firstName + " " + lastName));
        studentEmail.shouldHave(text(email));
        studentGender.shouldHave(text(gender));
        studentMobileNumber.shouldHave(text(mobileNumber));
        studentBirthDay.shouldHave(text(day + " " + month+","+year));
        studentSubjects.shouldHave(text(subject));
        studentHobbies.shouldHave(text(hobbie));
        studentPicture.shouldHave(text(shortFilePath));
        studentAddress.shouldHave(text(currentAddress));
        studentStateAndCity.shouldHave(text(state + " " + city));
    }

     void checkSubmittingText() {
        submittingText.shouldBe(visible);
    }

}

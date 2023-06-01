package lesson_three;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PracticeFormPage {
    SelenideElement firstNameInput = $("#firstName").as("Инпут для ввода имени");
    SelenideElement lastNameInput = $("#lastName").as("Инпут для ввода фамилии");
    SelenideElement emailInput = $("#userEmail").as("Инпут для ввода емейла");
    SelenideElement maleRadioButton = $("#genterWrapper").$(byText("Male")).as("Радиобаттон для выбора мужского рода");
    SelenideElement mobileInput = $("#userNumber").as("Инпут для ввода номера телефона");
    SelenideElement birthDateField = $("#dateOfBirth-wrapper").$("#dateOfBirthInput").as("Выпадающий список дня рождения");
    SelenideElement monthSelectButton = $(".react-datepicker__month-select").as("Кнопка выбора месяца");
    ElementsCollection monthList = $$(".react-datepicker__month-select option ").as("Список месяцев");
    SelenideElement yearSelectButton = $(".react-datepicker__year-select").as("Кнопка выбора года");
    ElementsCollection yearList = $$(".react-datepicker__year-select option").as("Список годов");
    ElementsCollection dayList = $$(".react-datepicker__week div").as("Список дней");
    SelenideElement subjectsInput = $("#subjectsInput").as("Выпадающий список предметов");
    ElementsCollection subjectsList = $$(".subjects-auto-complete__menu").as("Список предметов");
    SelenideElement sportCheckbox = $("#hobbiesWrapper").$(byText("Sports")).as("Чекбокс для выбора хобби 'Спорт'");
    SelenideElement pictureUploadButton = $("#uploadPicture").as("Кнопка для загрузки картинки");
    SelenideElement currentAddressField = $("#currentAddress").as("Поле нынешнего адресса");
    SelenideElement stateContainer = $("#state").as("Выпадающий список выбора штата");
    SelenideElement cityContainer = $("#city").as("Выпадающий список выбора города");
    SelenideElement submitButton = $("#submit").as("Кнопка 'Сабмит'");

     void fillAllFields(String firstName, String lastName, String email,
                                          String mobileNumber, String month, String year,
                                          String day, String subject, String filePath, String currentAddress,
                                          String state, String city) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        maleRadioButton.click();
        mobileInput.setValue(mobileNumber);
        birthDateField.click();
        monthSelectButton.click();
        monthList.findBy(text(month)).click();
        yearSelectButton.click();
        yearList.findBy(text(year)).click();
        dayList.findBy(text(day)).click();
        subjectsInput.setValue(subject);
        subjectsList.findBy(text(subject)).click();
        sportCheckbox.click();
        pictureUploadButton.uploadFile(new File(filePath));
        currentAddressField.setValue(currentAddress);
        stateContainer.click();
        stateContainer.$(byText(state)).click();
        cityContainer.click();
        cityContainer.$(byText(city)).click();
        submitButton.click();
    }

}

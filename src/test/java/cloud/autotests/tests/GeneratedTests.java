package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("VTBTests")
    void generatedTest() {
        step("package blin.tests;", () -> {
            step("// todo: just add selenium action");
        });

        step("import com.codeborne.pdftest.PDF;", () -> {
            step("// todo: just add selenium action");
        });

        step("import org.junit.jupiter.api.Assertions;", () -> {
            step("// todo: just add selenium action");
        });

        step("import org.junit.jupiter.api.DisplayName;", () -> {
            step("// todo: just add selenium action");
        });

        step("import org.junit.jupiter.api.Test;", () -> {
            step("// todo: just add selenium action");
        });

        step("import org.openqa.selenium.By;", () -> {
            step("// todo: just add selenium action");
        });

        step("import java.io.File;", () -> {
            step("// todo: just add selenium action");
        });

        step("import java.io.IOException;", () -> {
            step("// todo: just add selenium action");
        });

        step("import static com.codeborne.selenide.Condition.text;", () -> {
            step("// todo: just add selenium action");
        });

        step("import static com.codeborne.selenide.Selenide.*;", () -> {
            step("// todo: just add selenium action");
        });

        step("import static io.qameta.allure.Allure.step;", () -> {
            step("// todo: just add selenium action");
        });

        step("public class TestsVTB extends TestBase {", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("@DisplayName(\"Открываем страницы ВТБ и проверяем контент\")", () -> {
            step("// todo: just add selenium action");
        });

        step("public void testsForVTBOpenPagesAndCheckedContent() {", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Открываем главную страницу ВТБ\", () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(URL);", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Проверяем, что шапка содержит элемент\" + checkedElement1, () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".header-bottom-menu\").shouldHave(text(checkedElement1));", () -> {
            step("// todo: just add selenium action");
        });

        step("});", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Переходим на вкладку `Крупный бизнес` и проверяем содержимое вкладки\" + nameObject1, () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("$$(\".link__text.text.color-white.size-small-medium.weight-medium\").find(text(\"Крупный бизнес\")).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".tab-panel__image\").scrollTo();", () -> {
            step("// todo: just add selenium action");
        });

        step("$$(\".tab-panel__row li\").find(text(nameObject1)).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Проверяем вкладку на содержание текста \" + checkedText1, () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".tab-panel__wrap\").shouldHave(text(checkedText1));", () -> {
            step("// todo: just add selenium action");
        });

        step("});", () -> {
            step("// todo: just add selenium action");
        });

        step("});", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Проверяем содержимое вкладки\" + nameObject2, () -> {", () -> {
            step("// todo: just add selenium action");
        });
    }
}
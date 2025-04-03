package com.saucedemo

import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.*
import org.junit.jupiter.api.Test

class SauceDemoTest {

    @Test
    fun `user can log in successfully`() {
        open("https://www.saucedemo.com/")
        element("#user-name").setValue("standard_user")
        element("#password").setValue("secret_sauce")
        element("#login-button").click()
        element(".title").shouldHave(text("Products"))
    }
}
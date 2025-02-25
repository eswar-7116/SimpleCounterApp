package com.eswar.simplecounter

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun testCounter() {
        rule.setContent {
            App(MainViewModel())
        }

        rule.onNodeWithText("0").assertExists()
        rule.onNodeWithText("Increment").performClick()
        rule.onNodeWithText("1").assertExists()

        rule.onNodeWithText("Decrement").performClick()
        rule.onNodeWithText("0").assertExists()

        rule.onNodeWithText("Increment").performClick()
        rule.onNodeWithText("Reset").performClick()
        rule.onNodeWithText("0").assertExists()
    }
}
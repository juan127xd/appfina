
package com.example.myapp1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareTexts() {
        onView(withId(R.id.Text1)).perform(typeText("text"))
        onView(withId(R.id.text22)).perform(typeText("TEXT"))
        onView(withId(R.id.buttonComparar)).perform(click())
        onView(withId(R.id.textViewResult)).check(matches(withText("Los textos son iguales")))
    }
}

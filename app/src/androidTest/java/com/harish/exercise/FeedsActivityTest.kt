package com.harish.exercise


import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.harish.exercise.feeds.FeedsActivity
import org.hamcrest.CoreMatchers.*
import org.hamcrest.Matcher
import org.hamcrest.Matchers.hasEntry
import org.junit.Rule
import org.junit.Test

class FeedsActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<FeedsActivity>(FeedsActivity::class.java)

    @Test
    fun TestJsonList() {
        onData(allOf(`is`(instanceOf(FeedsActivity::class.java)), hasEntry(equalTo("rows"),
            `is`("title: Beavers")))).perform(click())
    }

    @Test
    fun TestClick() {
        onData(withItemContent("title: Beavers"))
            .onChildView(withId(R.id.layout_item))
            .perform(click())
    }

    fun withItemContent(expectedText: String): Matcher<Object> {
        checkNotNull(expectedText)
        return withItemContent(equalTo(expectedText).toString())
    }
}
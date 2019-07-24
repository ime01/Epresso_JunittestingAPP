package com.example.flowz.epresso_junittestingapp;

import android.support.test.rule.ActivityTestRule;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onView;


public class ALC_2ND_MEETUP_UNIT_TESTING_APP {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void checkForText(){
        onView(withText("Hello World!")).check(matches(isDisplayed()));
        onView(withId(R.id.male)).check(matches(isChecked()));
        onView(withId(R.id.female)).check(matches(isNotChecked()));
    }
    @Test

    public void mathsTest(){
        int addy = 12;
        Maths maths = new Maths();
        int sam = maths.MathsClass(6,6);
        Assert.assertEquals(sam,addy);
    }


}

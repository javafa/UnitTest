package com.kodonho.android.unittest;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    //MainActivity activity;

    @Before
    public void init(){
        testRule.launchActivity(new Intent());
        //activity = testRule.getActivity();
    }

    @Test
    public void testCase1(){
        onView(withId(R.id.textView))
        .check(matches( withText("Hello World!") ));
    }

    @Test
    public void testCase2(){
        // 버튼에 클릭액션 주기
        onView(withId(R.id.button))
                .perform(click());

        onView(withId(R.id.textView))
                .check(matches( withText("clicked!") ));
    }

    @After
    public void report(){

    }
}

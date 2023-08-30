package com.example.app.practica.alex_app_compare;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testInputNumbers() {
        // Ingresar números en los EditText
        Espresso.onView(ViewMatchers.withId(R.id.editText1))
                .perform(ViewActions.typeText("5"), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.editText2))
                .perform(ViewActions.typeText("8"), ViewActions.closeSoftKeyboard());

        // Verificar que los números se ingresaron correctamente
        Espresso.onView(withId(R.id.editText1)).check(matches(withText("5")));
        Espresso.onView(withId(R.id.editText2)).check(matches(withText("8")));
    }
}

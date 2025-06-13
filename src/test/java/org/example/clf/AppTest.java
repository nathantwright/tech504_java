package org.example.clf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    @Test
    @DisplayName("My first test")
    void firstTest(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("getGreeting, when given 5, returns good morning")
    void getGreeting_5_goodMorning(){
        int time = 5;
        String expected = "Good morning!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given 18, returns good afternoon")
    void getGreeting_18_goodAfternoon(){
        int time = 18;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given 21, returns good evening")
    void getGreeting_21_goodEvening(){
        int time = 21;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given 2, returns good evening")
    void getGreeting_2_goodEvening(){
        int time = 2;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 18})
    @DisplayName("getGreeting, when given a time from 13 to 18, returns good afternoon")
    public void getGreeting_GivenATimeFrom13To18_ReturnsGoodAfternoon(int time)
    {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 21"
    })
    @DisplayName("getGreeting, when given a time, returns an appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String greeting, int time)
    {
        Assertions.assertEquals(greeting, App.getGreeting(time));
    }
}

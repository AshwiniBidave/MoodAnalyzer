package com.MoodAnalyzer;

import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
 public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {

     MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" I am in Sad mood");
     String mood = moodAnalyzer.AnalyseMood();
     Assert.assertThat(mood, CoreMatchers.is("SAD"));
 }
    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws Exception {

      MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Any mood");
      String mood = moodAnalyzer.AnalyseMood();
      Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

   


}

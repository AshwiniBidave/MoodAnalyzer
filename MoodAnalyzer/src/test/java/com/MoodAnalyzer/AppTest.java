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
 public void givenMessage_WhenSad_ShouldReturnSad() throws Exception
    {

     MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" I am in Sad mood");
     String mood = moodAnalyzer.AnalyseMood();
     Assert.assertThat(mood, CoreMatchers.is("SAD"));
   
   }
    @Test
    public void givenMessage_WhenAny_ShouldReturnHappy() throws Exception
    {

      MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Any mood");
      String mood = moodAnalyzer.AnalyseMood();
      Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    
    }
    @Test
    public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() 
    {
       MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
       try 
      {
        moodAnalyzer.AnalyseMood();
     
      } 
       catch (MoodAnalyzerException e)
      {
         Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL_MESSAGE, e.type);
      }

   }
    @Test
    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException()
    {
      MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
      try 
     {
      moodAnalyzer.AnalyseMood();
     } 
      catch (MoodAnalyzerException e) 
      {
    	Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY_MESSAGE, e.type);
      }
    }
  }


   




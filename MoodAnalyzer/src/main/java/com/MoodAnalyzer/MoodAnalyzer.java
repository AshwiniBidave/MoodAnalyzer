package com.moodanalyzer;

public class MoodAnalyzer {
	private String message;
    public MoodAnalyzer(String message)
    {
        this.message = message;
    }
    public MoodAnalyzer()
    {
    }
    public String AnalyseMood() throws MoodAnalyzerException
    {
        try {
        
        	if (message.length()==0)
            {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY_MESSAGE, "Mood should not be empty");
            }
           if (this.message.contains("Sad"))
            {
                return "SAD";
            }
            else if (this.message.contains("Happy"))
            {
                return "HAPPY";
            }
            else if (this.message.contains("Any"))
            {
                return "HAPPY";
            }
            else
            {
                return "Happy";
            }
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL_MESSAGE, "Message should not be null");
        }
    }
}

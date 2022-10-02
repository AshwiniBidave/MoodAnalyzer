package com.MoodAnalyzer;

public class MoodAnalyzerException extends RuntimeException {

	enum ExceptionType {
		EMPTY_MESSAGE, NULL_MESSAGE
    }

    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {

        super(message);
        this.type = type;
    }


}

package com.bridgelabz.MoodAnalyzerTest;

public class MoodAnalyzerException extends Exception {
	
	enum EnumType
	{
		EMPTY_STRING , NULL_STRING ;
	}
	EnumType enumType;
	public MoodAnalyzerException(EnumType enumType, String message)
	{
		super(message);
		this.enumType = enumType;
	}

}

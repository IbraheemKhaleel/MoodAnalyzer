package com.bridgelabz.MoodAnalyzerTest;

import com.bridgelabz.MoodAnalyzerTest.MoodAnalyzerException.EnumType;

public class MoodAnalyzer
{
	private String message;
	
	public MoodAnalyzer(String message) 
	{
		this.message = message ;
	}

	public String analyseMethod() throws MoodAnalyzerException
	{ 
		try
		{
			if(message.length() == 0 )
			{
				throw new MoodAnalyzerException(EnumType.EMPTY_STRING, "Empty message is entered. Please provide valid input");
			} 
			else if (message.contains("sad"))
			{
				return "sad" ;
			}
			else 
			{
				return "happy" ;
			}
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalyzerException(EnumType.NULL_STRING , "It is a null input. Please input proper value ");
		}
	}
}

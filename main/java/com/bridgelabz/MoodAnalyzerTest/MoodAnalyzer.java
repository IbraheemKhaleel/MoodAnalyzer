package com.bridgelabz.MoodAnalyzerTest;

public class MoodAnalyzer
{
	public String analyseMethod(String message) throws Exception
	{ 
		try {
		if(message.contains("sad"))
			return "sad";
		} catch(NullPointerException e)
		{
			throw new MoodAnalyzerException("Please provide proper message ");
		}
		return "happy";
	}
}

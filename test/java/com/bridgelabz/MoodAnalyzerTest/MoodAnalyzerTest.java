package com.bridgelabz.MoodAnalyzerTest;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{
	@Test
	public void Welcome()
	{
		System.out.println(" Welcome to mood analyzer ");
	}
	@Test
	public void givenHappyMessgae_WhenAnalyse_ShouldReturnHappyMood() throws Exception
	{
		MoodAnalyzer moodAnalyser =  new MoodAnalyzer(" i am in any mood ");
		String mood = moodAnalyser.analyseMethod();
		Assert.assertEquals("happy", mood);
	}
	@Test
	public void givenSadMessage_WhenAnalyse_ShouldReturnSadMood() throws Exception
	{
		MoodAnalyzer moodAnalyser =  new MoodAnalyzer(" i am in sad mood ");
		String mood = moodAnalyser.analyseMethod();
		Assert.assertEquals("sad", mood);
	}
	@Test
	public void givenNullMood_WhenAnalyse_ShouldThrowAnalyzeMoodException()
	{
		try 
		{
			MoodAnalyzer moodAnalyser =  new MoodAnalyzer(null);
			moodAnalyser.analyseMethod();
		}  
		catch (MoodAnalyzerException e ) 
		{
			Assert.assertEquals(MoodAnalyzerException.EnumType.NULL_STRING, e.enumType);
		}
	}
	@Test
	public void givenEmptyMessage_WhenAnalyse_ShouldThrowAnalyzeMoodException()
	{
		try
		{
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
			moodAnalyzer.analyseMethod();
		}
		catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.EnumType.EMPTY_STRING , e.enumType);
		}
	}

}
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
		MoodAnalyzer moodAnalyser =  new MoodAnalyzer();
		String mood = moodAnalyser.analyseMethod(" i am in any mood ");
		Assert.assertEquals("happy", mood);
	}
	@Test
	public void givenSadMessgae_WhenAnalyse_ShouldReturnSadMood() throws Exception
	{
		MoodAnalyzer moodAnalyser =  new MoodAnalyzer();
		String mood = moodAnalyser.analyseMethod(" i am in sad mood ");
		Assert.assertEquals("sad", mood);
	}
	@Test
	public void givenNullMood_WhenAnalyse_ShouldThrowAnalyzeMoodException()  throws Exception
	{
		try 
		{
			MoodAnalyzer moodAnalyser =  new MoodAnalyzer();
			moodAnalyser.analyseMethod(null);
		}  
		catch (MoodAnalyzerException e ) 
		{
			Assert.assertEquals("Please provide proper message ", e.getMessage());
		}
	}

}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MoodAnalyzerTest;

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


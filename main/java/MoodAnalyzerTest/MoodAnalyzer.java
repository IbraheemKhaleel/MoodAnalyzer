/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MoodAnalyzerTest;

public class MoodAnalyzer 
{
	public String analyseMethod(String mood)
	{ 
		try {
		if(mood.contains("sad"))
			return "sad";
		} catch(NullPointerException e)
		{
			return "happy" ;
		}
		return "happy";
	}
}


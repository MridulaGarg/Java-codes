import java.io.Serializable;

public class Questionnaire implements Serializable
{
	private String ques;
	private boolean ans;
	
	public Questionnaire(String q, boolean a)
	{
		ques = q;
		ans = a;
	}
	
	public String getQues()
	{
		return ques;
	}
	
	public boolean getAns()
	{
		return ans; 
	}
}
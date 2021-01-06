package BlackBoxTestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.UtilityClass;

public class VerifyLengthClass extends UtilityClass{
	
	public UtilityClass uc = new UtilityClass();
	
	@Test
	public void VerifyLengthofLonestWord()
	{
		String expected_word = "jumped";
		String actual_word = uc.findLongestWordLenght("The cow jumped over the moon.");
		Assert.assertEquals(actual_word, expected_word);
		
		System.out.println("*******************");
		System.out.println("Expected Word : " + expected_word);
		System.out.println("Actual Word : " + actual_word);
		System.out.println("*******************");
		
	}

}

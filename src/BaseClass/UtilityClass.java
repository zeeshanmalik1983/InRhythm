package BaseClass;

public class UtilityClass {
	
	public String findLongestWordLenght(String str)
	{
		String longestWord = "";
		int length = 0;
		String word = "";
		String[] words = new String[100];   
		
		str = str + " "; //Add Space in Last Word to get it from String
		
		for(int i = 0; i < str.length(); i++){  
			
	          //Split the string into words  
			
	          if(str.charAt(i) != ' '){    
	            
	        	  word = word + str.charAt(i);    
	          }    
	          else
	          {
	        	//Add word to array words    
	              words[length] = word;    
	              //Increment length    
	              length++;    
	              //Make word an empty string    
	              word = "";    
	          }
	          
	          longestWord=words[0];
	          
	          for(int k = 0; k < length; k++){    
	                  
	              //If length of large is less than any word present in the string    
	              //Store value of word into large    
	              if(longestWord.length() < words[k].length())    
	            	  longestWord = words[k];    
	          }    
	          
	           
		}
		System.out.println("********Requested Output as Per Assessment********");
		
		System.out.println("Largest word: " + longestWord); 
        System.out.println("Length of Largest word: " + longestWord.length());
           
        return longestWord;
	}
	
}

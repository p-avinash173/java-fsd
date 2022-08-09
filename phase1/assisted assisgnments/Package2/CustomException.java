package Package2;

 class CustomException1 extends Exception {
	 public CustomException1 (String str)  
	    {  
	          super(str);  
	    }  
	}  
	    
	public class CustomException 
	{   
	    static void validate (int age) throws CustomException1{    
	       if(age < 18){  
	    	   throw new CustomException1("age is not valid to vote");    
	       }  
	          else {   
	           System.out.println("age is valid to vote");   
	           }   
	        }    
	    
	       public static void main(String args[])  
	       {  
	           try  
	           {  
	             
	               validate(13);  
	           }  
	           catch (CustomException1 ex)  
	           {  
	               
	               System.out.println("Exception occured: " + ex);  
	           }     
	       }

}

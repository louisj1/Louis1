

public class Catch {
	
	public static void doCatchDemo1(){
		      int miles1, miles2;
		      try {
		        /*This block of statement can throw an exception 
		          */		         
		         miles1 = 0;
		        
		         miles2 = 1500 / miles1;
		         System.out.println(miles2);
		         
		      }
		      catch (ArithmeticException e) { 
		         /* This block will only execute if any Arithmetic exception occurs in try block
		          
		         System.out.println("I cannot divide  by zero");
		      }
		      catch (Exception e) {
		         /* This  Exception handler will handle
		          * all the exceptions. This will execute if the exception is not handled by previous catch blocks.*/
		           
		         System.out.println("Exception occurred");
		      }
		      System.out.println("I'm out of try-catch block.");
		   }
	
}
		
		


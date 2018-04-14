import java.text.SimpleDateFormat;
import java.util.Date;

class Psi { 
	static //Lambda 
	
	Date date = new Date();
	
	interface Sayable{  
	    String say(String message);  
	}  
	  
	public static void doPsiDemo(){  
		  
	      
	        // passing multiple statements in lambda expression  
	        Sayable person = (message)-> {  
	            String msg1 = "Today is ";  
	            String msg3 = " Let's Fly";
	            String msg2 = msg1 + date + message + msg3;   
	            return msg2;  
	        };  
	            System.out.println(person.say(" Time is  precious."));
	            
	            new SimpleDateFormat("yyyy/MM/dd. HH:mm:ss");
	             
	    }  

}
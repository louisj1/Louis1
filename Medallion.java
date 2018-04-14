class Medallion {

	public static void doMedallionDemo() {
		// TODO Auto-generated method stub
	 
		}  
	  
		class Silver extends Medallion{  
			int getMedallionStatus(){return 45000;} 

		}  
	  
		class Gold extends Medallion{  
			int getMedallionStatus(){return 60000;}  
	}  
		class Diamond extends Medallion{  
			int getMedallionStatus(){return 150000;}  
		}  
	  
		class Test2{  
			public void main(String args[]){  
				Silver s=new Silver();  
				Gold g=new Gold();  
				Diamond d=new Diamond();  
				System.out.println("To reach Silver Status, you need to earn: "+s.getMedallionStatus());  
				System.out.println("To reach Gold Status, "+g.getMedallionStatus());  
				System.out.println("To reach Diamond Status, "+d.getMedallionStatus()); 
				System.out.println("MQM = Medallion Qualification Miles");
			}  
		  }

}

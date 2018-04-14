public class MyNewAircraft {
  // Jacques Louis
   public static void main(String[] args) {
    System.out.println("Welcome to Fort Lauderdale Airport");

    Aircraft aircraft = new Aircraft();
  

    aircraft.setMake("Delta Airlines");
    aircraft.setPilot("Jacques");
    aircraft.setSpeed(350);
    aircraft.setFuelCount(36000);
    
    

    System.out.println("Thank you for choosing " + aircraft.getMake());
    System.out.println("Your pilot for today is " + aircraft.getPilot());
    System.out.println("We are cruising at: " + aircraft.getSpeed());
    System.out.println("Amount of gallons fuel we used over 10 hrs flight is: " + aircraft.getFuelCount());
    Strings.doStringDemo();
    Strings2.doStringDemo();
    Array.doArrayDemo();
    Plane.doPlaneDemo();
    Psi.doPsiDemo();
    Catch.doCatchDemo1();
    Medallion.doMedallionDemo();
    
  }
}
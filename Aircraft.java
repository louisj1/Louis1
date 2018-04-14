class Aircraft {

  // Jacques Louis
  
  private String make;
  private double speed;
  private String pilot;
  private int FuelCount;
  
  
  
  public Aircraft(String m, double s, String pt, double atltitude, int fc) {

    this.make = m;
    this.speed = (int) s;
    this.pilot = pt;
    this.FuelCount = fc;
  
  }

  public Aircraft() {
    
  }

  public void setMake(String m) {
    this.make = m;
  }

  public double getSpeed() {
    return speed;
  }

  public String getMake() {

    return this.make;
  }

  public void setSpeed(int s) {
    this.speed = s;
  }

  public String getPilot() {
    return pilot;
  }

  public void setPilot(String pilot) {
    this.pilot = pilot;
  }
  
  public void setSpeed(double s) {
    this.speed = s;

  }

  public int getFuelCount() {
    return FuelCount;
  }

  public void setFuelCount(int fc) {
    this.FuelCount = fc;
  }

}
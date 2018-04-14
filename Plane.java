class Plane{
//polymorphism
    public void fly(){

    System.out.println("That plane can move!!");
    }

	public static void doPlaneDemo() {
		// TODO Auto-generated method stub
		Plane vh=new DeltaSkyteam();

	    vh.fly();   

	    vh=new Plane();

	    vh.fly();    

	}
}

class DeltaSkyteam extends Plane{

    public void fly(){

    System.out.println("That plane will fly!!");

    }

}



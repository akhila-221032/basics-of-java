class Vehicle{
	  String colour;
	  int seats;
	  String brand;

Vehicle(String colour,int seats,String brand){
	this.colour=colour;
	this.seats=seats;
	this.brand=brand;
}
void details(){
	System.out.println("colour="+ colour);
	System.out.println("seats="+ seats);
	System.out.println("brand="+ brand);
	}
}
 class Twowheeler extends Vehicle{
Twowheeler(String colour,int seats,String brand){
	super(colour,seats,brand);
}
void details(){
super.details();
}
}
class Fourwheeler extends Vehicle{
Fourwheeler(String colour,int seats,String brand){
	super(colour,seats,brand);
}
void details(){
super.details();
}
}
   
class Lab4{
	public static void main(String[] args){
	Twowheeler bike=new Twowheeler("red",3,"honda");
	Twowheeler cycle=new Twowheeler("yellow",1,"honda");
	bike.details();
	cycle.details();
	Fourwheeler car=new Fourwheeler("green",7,"maruthi");
	
	car.details();
}
}
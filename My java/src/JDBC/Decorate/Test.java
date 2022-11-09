package JDBC.Decorate;

public class Test {
// Decorator pattern allows a user to add new functionality to an object without 
	// alerting its structure
	//

	public static void main(String[] args) {
		//RoadBike bike= new  RoadBike("hero");
		Bike bike =  new AlarmDecorate( new RoadBike("Hero"));
		bike.showDetails();

	}

}
